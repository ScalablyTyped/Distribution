package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.pulumiAwsStrings.Allow
import typings.pulumiAws.pulumiAwsStrings.Deny
import typings.pulumiAws.pulumiAwsStrings.`2008-10-17`
import typings.pulumiAws.pulumiAwsStrings.`2012-10-17`
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentsMod {
  
  @JSImport("@pulumi/aws/iam/documents", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assumeRolePolicyForPrincipal(principal: Principal): PolicyDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("assumeRolePolicyForPrincipal")(principal.asInstanceOf[js.Any]).asInstanceOf[PolicyDocument]
  
  trait AWSPrincipal
    extends StObject
       with Principal {
    
    var AWS: Input[js.Array[Input[String]] | String]
  }
  object AWSPrincipal {
    
    inline def apply(AWS: Input[js.Array[Input[String]] | String]): AWSPrincipal = {
      val __obj = js.Dynamic.literal(AWS = AWS.asInstanceOf[js.Any])
      __obj.asInstanceOf[AWSPrincipal]
    }
    
    extension [Self <: AWSPrincipal](x: Self) {
      
      inline def setAWS(value: Input[js.Array[Input[String]] | String]): Self = StObject.set(x, "AWS", value.asInstanceOf[js.Any])
      
      inline def setAWSVarargs(value: Input[String]*): Self = StObject.set(x, "AWS", js.Array(value :_*))
    }
  }
  
  type ConditionArguments = /**
    * Examples:
    *  - `{ "aws:MultiFactorAuthPresent": "true" }`
    *  - `{ "aws:SourceIp": [ "203.0.113.0/24", "2001:DB8:1234:5678::/64" ]}`
    */
  StringDictionary[Input[js.Array[Input[String]] | String]]
  
  type Conditions = /**
    *
    * A map of condition operators and their arguments. Condition operators are the "verbs" of conditions and specify
    * the type of comparison that IAM performs. The condition operators are grouped into the following categorties:
    *
    *     - String
    *     - Numeric
    *     - Date and time
    *     - Boolean
    *     - Binary
    *     - IP address
    *     - Amazon Resource (ARN) (available for some services)
    *     - ...IfExists (checks if the key value exists as part of another check)
    *     - Null check (checks if the key value exists as a standalone check)
    *
    * For details on all of the available operators and their arguments, please refer to the AWS documentation:
    * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition_operators.html.
    */
  StringDictionary[ConditionArguments]
  
  trait FederatedPrincipal
    extends StObject
       with Principal {
    
    var Federated: Input[js.Array[Input[String]] | String]
  }
  object FederatedPrincipal {
    
    inline def apply(Federated: Input[js.Array[Input[String]] | String]): FederatedPrincipal = {
      val __obj = js.Dynamic.literal(Federated = Federated.asInstanceOf[js.Any])
      __obj.asInstanceOf[FederatedPrincipal]
    }
    
    extension [Self <: FederatedPrincipal](x: Self) {
      
      inline def setFederated(value: Input[js.Array[Input[String]] | String]): Self = StObject.set(x, "Federated", value.asInstanceOf[js.Any])
      
      inline def setFederatedVarargs(value: Input[String]*): Self = StObject.set(x, "Federated", js.Array(value :_*))
    }
  }
  
  trait PolicyDocument extends StObject {
    
    /**
      * An optional document ID.
      */
    var Id: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * One or more policy statements, describing the effect, principal, action, resource, and condition.
      */
    var Statement: Input[js.Array[Input[PolicyStatement]]]
    
    /**
      * The version of the policy language that you want to use. As a best practice, use the latest `2012-10-17` version.
      */
    var Version: Input[`2008-10-17` | `2012-10-17`]
  }
  object PolicyDocument {
    
    inline def apply(Statement: Input[js.Array[Input[PolicyStatement]]], Version: Input[`2008-10-17` | `2012-10-17`]): PolicyDocument = {
      val __obj = js.Dynamic.literal(Statement = Statement.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyDocument]
    }
    
    extension [Self <: PolicyDocument](x: Self) {
      
      inline def setId(value: Input[String]): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      inline def setStatement(value: Input[js.Array[Input[PolicyStatement]]]): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
      
      inline def setStatementVarargs(value: Input[PolicyStatement]*): Self = StObject.set(x, "Statement", js.Array(value :_*))
      
      inline def setVersion(value: Input[`2008-10-17` | `2012-10-17`]): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    }
  }
  
  trait PolicyStatement extends StObject {
    
    /**
      * Include a list of actions that the policy allows or denies. Required (either Action or NotAction)
      * Reference: https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_action.html
      */
    var Action: js.UndefOr[Input[js.Array[Input[String]] | String]] = js.undefined
    
    /**
      * Specify the circumstances under which the policy grants permission.
      */
    var Condition: js.UndefOr[Input[Conditions]] = js.undefined
    
    /**
      * Indicate whether the policy allows or denies access.
      */
    var Effect: Input[Allow | Deny]
    
    /**
      * Include a list of actions that are not covered by this policy. Required (either Action or NotAction)
      * Reference: https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_notaction.html
      */
    var NotAction: js.UndefOr[Input[js.Array[Input[String]] | String]] = js.undefined
    
    /**
      * Indicate the account, user, role, or federated user to which this policy does not apply.
      */
    var NotPrincipal: js.UndefOr[Input[Principal]] = js.undefined
    
    /**
      * A list of resources that are specifically excluded by this policy.
      */
    var NotResource: js.UndefOr[Input[js.Array[Input[String]] | String]] = js.undefined
    
    /**
      * Indicate the account, user, role, or federated user to which you would like to allow or deny access. If you are
      * creating a policy to attach to a user or role, you cannot include this element. The principal is implied as that
      * user or role.
      */
    var Principal: js.UndefOr[Input[typings.pulumiAws.documentsMod.Principal]] = js.undefined
    
    /**
      * A list of resources to which the actions apply.
      */
    var Resource: js.UndefOr[Input[js.Array[Input[String]] | String]] = js.undefined
    
    /**
      * An optional statement ID to differentiate between your statements.
      */
    var Sid: js.UndefOr[Input[String]] = js.undefined
  }
  object PolicyStatement {
    
    inline def apply(Effect: Input[Allow | Deny]): PolicyStatement = {
      val __obj = js.Dynamic.literal(Effect = Effect.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyStatement]
    }
    
    extension [Self <: PolicyStatement](x: Self) {
      
      inline def setAction(value: Input[js.Array[Input[String]] | String]): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
      
      inline def setActionVarargs(value: Input[String]*): Self = StObject.set(x, "Action", js.Array(value :_*))
      
      inline def setCondition(value: Input[Conditions]): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
      
      inline def setConditionUndefined: Self = StObject.set(x, "Condition", js.undefined)
      
      inline def setEffect(value: Input[Allow | Deny]): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
      
      inline def setNotAction(value: Input[js.Array[Input[String]] | String]): Self = StObject.set(x, "NotAction", value.asInstanceOf[js.Any])
      
      inline def setNotActionUndefined: Self = StObject.set(x, "NotAction", js.undefined)
      
      inline def setNotActionVarargs(value: Input[String]*): Self = StObject.set(x, "NotAction", js.Array(value :_*))
      
      inline def setNotPrincipal(value: Input[Principal]): Self = StObject.set(x, "NotPrincipal", value.asInstanceOf[js.Any])
      
      inline def setNotPrincipalUndefined: Self = StObject.set(x, "NotPrincipal", js.undefined)
      
      inline def setNotResource(value: Input[js.Array[Input[String]] | String]): Self = StObject.set(x, "NotResource", value.asInstanceOf[js.Any])
      
      inline def setNotResourceUndefined: Self = StObject.set(x, "NotResource", js.undefined)
      
      inline def setNotResourceVarargs(value: Input[String]*): Self = StObject.set(x, "NotResource", js.Array(value :_*))
      
      inline def setPrincipal(value: Input[Principal]): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
      
      inline def setPrincipalUndefined: Self = StObject.set(x, "Principal", js.undefined)
      
      inline def setResource(value: Input[js.Array[Input[String]] | String]): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "Resource", js.undefined)
      
      inline def setResourceVarargs(value: Input[String]*): Self = StObject.set(x, "Resource", js.Array(value :_*))
      
      inline def setSid(value: Input[String]): Self = StObject.set(x, "Sid", value.asInstanceOf[js.Any])
      
      inline def setSidUndefined: Self = StObject.set(x, "Sid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pulumiAws.pulumiAwsStrings.Asterisk
    - typings.pulumiAws.documentsMod.AWSPrincipal
    - typings.pulumiAws.documentsMod.ServicePrincipal
    - typings.pulumiAws.documentsMod.FederatedPrincipal
  */
  trait Principal extends StObject
  
  trait ServicePrincipal
    extends StObject
       with Principal {
    
    var Service: Input[js.Array[Input[String]] | String]
  }
  object ServicePrincipal {
    
    inline def apply(Service: Input[js.Array[Input[String]] | String]): ServicePrincipal = {
      val __obj = js.Dynamic.literal(Service = Service.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServicePrincipal]
    }
    
    extension [Self <: ServicePrincipal](x: Self) {
      
      inline def setService(value: Input[js.Array[Input[String]] | String]): Self = StObject.set(x, "Service", value.asInstanceOf[js.Any])
      
      inline def setServiceVarargs(value: Input[String]*): Self = StObject.set(x, "Service", js.Array(value :_*))
    }
  }
}
