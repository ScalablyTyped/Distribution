package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPolicyMod {
  
  @JSImport("@pulumi/aws/iam/getPolicy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPolicy(args: GetPolicyArgs): js.Promise[GetPolicyResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPolicy")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetPolicyResult]]
  inline def getPolicy(args: GetPolicyArgs, opts: InvokeOptions): js.Promise[GetPolicyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolicy")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetPolicyResult]]
  
  trait GetPolicyArgs extends StObject {
    
    /**
      * ARN of the IAM policy.
      */
    val arn: String
  }
  object GetPolicyArgs {
    
    inline def apply(arn: String): GetPolicyArgs = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPolicyArgs]
    }
    
    extension [Self <: GetPolicyArgs](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetPolicyResult extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) specifying the policy.
      */
    val arn: String
    
    /**
      * The description of the policy.
      */
    val description: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The name of the IAM policy.
      */
    val name: String
    
    /**
      * The path to the policy.
      */
    val path: String
    
    /**
      * The policy document of the policy.
      */
    val policy: String
  }
  object GetPolicyResult {
    
    inline def apply(arn: String, description: String, id: String, name: String, path: String, policy: String): GetPolicyResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPolicyResult]
    }
    
    extension [Self <: GetPolicyResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    }
  }
}
