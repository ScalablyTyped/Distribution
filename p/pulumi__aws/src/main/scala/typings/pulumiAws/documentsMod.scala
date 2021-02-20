package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.pulumiAwsStrings.Allow
import typings.pulumiAws.pulumiAwsStrings.Deny
import typings.pulumiAws.pulumiAwsStrings.`2008-10-17`
import typings.pulumiAws.pulumiAwsStrings.`2012-10-17`
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentsMod {
  
  @JSImport("@pulumi/aws/iam/documents", "assumeRolePolicyForPrincipal")
  @js.native
  def assumeRolePolicyForPrincipal(principal: Principal): PolicyDocument = js.native
  
  @js.native
  trait AWSPrincipal extends Principal {
    
    var AWS: Input[js.Array[Input[String]] | String] = js.native
  }
  object AWSPrincipal {
    
    @scala.inline
    def apply(AWS: Input[js.Array[Input[String]] | String]): AWSPrincipal = {
      val __obj = js.Dynamic.literal(AWS = AWS.asInstanceOf[js.Any])
      __obj.asInstanceOf[AWSPrincipal]
    }
    
    @scala.inline
    implicit class AWSPrincipalMutableBuilder[Self <: AWSPrincipal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAWS(value: Input[js.Array[Input[String]] | String]): Self = StObject.set(x, "AWS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAWSVarargs(value: Input[String]*): Self = StObject.set(x, "AWS", js.Array(value :_*))
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
  
  @js.native
  trait FederatedPrincipal extends Principal {
    
    var Federated: Input[js.Array[Input[String]] | String] = js.native
  }
  object FederatedPrincipal {
    
    @scala.inline
    def apply(Federated: Input[js.Array[Input[String]] | String]): FederatedPrincipal = {
      val __obj = js.Dynamic.literal(Federated = Federated.asInstanceOf[js.Any])
      __obj.asInstanceOf[FederatedPrincipal]
    }
    
    @scala.inline
    implicit class FederatedPrincipalMutableBuilder[Self <: FederatedPrincipal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFederated(value: Input[js.Array[Input[String]] | String]): Self = StObject.set(x, "Federated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFederatedVarargs(value: Input[String]*): Self = StObject.set(x, "Federated", js.Array(value :_*))
    }
  }
  
  @js.native
  trait PolicyDocument extends StObject {
    
    /**
      * An optional document ID.
      */
    var Id: js.UndefOr[Input[String]] = js.native
    
    /**
      * One or more policy statements, describing the effect, principal, action, resource, and condition.
      */
    var Statement: Input[js.Array[Input[PolicyStatement]]] = js.native
    
    /**
      * The version of the policy language that you want to use. As a best practice, use the latest `2012-10-17` version.
      */
    var Version: Input[`2008-10-17` | `2012-10-17`] = js.native
  }
  object PolicyDocument {
    
    @scala.inline
    def apply(Statement: Input[js.Array[Input[PolicyStatement]]], Version: Input[`2008-10-17` | `2012-10-17`]): PolicyDocument = {
      val __obj = js.Dynamic.literal(Statement = Statement.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyDocument]
    }
    
    @scala.inline
    implicit class PolicyDocumentMutableBuilder[Self <: PolicyDocument] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Input[String]): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      @scala.inline
      def setStatement(value: Input[js.Array[Input[PolicyStatement]]]): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatementVarargs(value: Input[PolicyStatement]*): Self = StObject.set(x, "Statement", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: Input[`2008-10-17` | `2012-10-17`]): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PolicyStatement extends StObject {
    
    /**
      * Include a list of actions that the policy allows or denies. Required (either Action or NotAction)
      * Reference: https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_action.html
      */
    var Action: js.UndefOr[Input[js.Array[Input[String]] | String]] = js.native
    
    /**
      * Specify the circumstances under which the policy grants permission.
      */
    var Condition: js.UndefOr[Input[Conditions]] = js.native
    
    /**
      * Indicate whether the policy allows or denies access.
      */
    var Effect: Input[Allow | Deny] = js.native
    
    /**
      * Include a list of actions that are not covered by this policy. Required (either Action or NotAction)
      * Reference: https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_notaction.html
      */
    var NotAction: js.UndefOr[Input[js.Array[Input[String]] | String]] = js.native
    
    /**
      * Indicate the account, user, role, or federated user to which this policy does not apply.
      */
    var NotPrincipal: js.UndefOr[Input[Principal]] = js.native
    
    /**
      * A list of resources that are specifically excluded by this policy.
      */
    var NotResource: js.UndefOr[Input[js.Array[Input[String]] | String]] = js.native
    
    /**
      * Indicate the account, user, role, or federated user to which you would like to allow or deny access. If you are
      * creating a policy to attach to a user or role, you cannot include this element. The principal is implied as that
      * user or role.
      */
    var Principal: js.UndefOr[Input[typings.pulumiAws.documentsMod.Principal]] = js.native
    
    /**
      * A list of resources to which the actions apply.
      */
    var Resource: js.UndefOr[Input[js.Array[Input[String]] | String]] = js.native
    
    /**
      * An optional statement ID to differentiate between your statements.
      */
    var Sid: js.UndefOr[Input[String]] = js.native
  }
  object PolicyStatement {
    
    @scala.inline
    def apply(Effect: Input[Allow | Deny]): PolicyStatement = {
      val __obj = js.Dynamic.literal(Effect = Effect.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyStatement]
    }
    
    @scala.inline
    implicit class PolicyStatementMutableBuilder[Self <: PolicyStatement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: Input[js.Array[Input[String]] | String]): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
      
      @scala.inline
      def setActionVarargs(value: Input[String]*): Self = StObject.set(x, "Action", js.Array(value :_*))
      
      @scala.inline
      def setCondition(value: Input[Conditions]): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionUndefined: Self = StObject.set(x, "Condition", js.undefined)
      
      @scala.inline
      def setEffect(value: Input[Allow | Deny]): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotAction(value: Input[js.Array[Input[String]] | String]): Self = StObject.set(x, "NotAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotActionUndefined: Self = StObject.set(x, "NotAction", js.undefined)
      
      @scala.inline
      def setNotActionVarargs(value: Input[String]*): Self = StObject.set(x, "NotAction", js.Array(value :_*))
      
      @scala.inline
      def setNotPrincipal(value: Input[Principal]): Self = StObject.set(x, "NotPrincipal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotPrincipalUndefined: Self = StObject.set(x, "NotPrincipal", js.undefined)
      
      @scala.inline
      def setNotResource(value: Input[js.Array[Input[String]] | String]): Self = StObject.set(x, "NotResource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotResourceUndefined: Self = StObject.set(x, "NotResource", js.undefined)
      
      @scala.inline
      def setNotResourceVarargs(value: Input[String]*): Self = StObject.set(x, "NotResource", js.Array(value :_*))
      
      @scala.inline
      def setPrincipal(value: Input[Principal]): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrincipalUndefined: Self = StObject.set(x, "Principal", js.undefined)
      
      @scala.inline
      def setResource(value: Input[js.Array[Input[String]] | String]): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "Resource", js.undefined)
      
      @scala.inline
      def setResourceVarargs(value: Input[String]*): Self = StObject.set(x, "Resource", js.Array(value :_*))
      
      @scala.inline
      def setSid(value: Input[String]): Self = StObject.set(x, "Sid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSidUndefined: Self = StObject.set(x, "Sid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pulumiAws.pulumiAwsStrings.Asterisk
    - typings.pulumiAws.documentsMod.AWSPrincipal
    - typings.pulumiAws.documentsMod.ServicePrincipal
    - typings.pulumiAws.documentsMod.FederatedPrincipal
  */
  trait Principal extends StObject
  
  @js.native
  trait ServicePrincipal extends Principal {
    
    var Service: Input[js.Array[Input[String]] | String] = js.native
  }
  object ServicePrincipal {
    
    @scala.inline
    def apply(Service: Input[js.Array[Input[String]] | String]): ServicePrincipal = {
      val __obj = js.Dynamic.literal(Service = Service.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServicePrincipal]
    }
    
    @scala.inline
    implicit class ServicePrincipalMutableBuilder[Self <: ServicePrincipal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setService(value: Input[js.Array[Input[String]] | String]): Self = StObject.set(x, "Service", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceVarargs(value: Input[String]*): Self = StObject.set(x, "Service", js.Array(value :_*))
    }
  }
}
