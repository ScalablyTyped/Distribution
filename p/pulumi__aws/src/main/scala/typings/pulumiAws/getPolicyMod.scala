package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPolicyMod {
  
  @JSImport("@pulumi/aws/iam/getPolicy", "getPolicy")
  @js.native
  def getPolicy(args: GetPolicyArgs): js.Promise[GetPolicyResult] = js.native
  @JSImport("@pulumi/aws/iam/getPolicy", "getPolicy")
  @js.native
  def getPolicy(args: GetPolicyArgs, opts: InvokeOptions): js.Promise[GetPolicyResult] = js.native
  
  @js.native
  trait GetPolicyArgs extends StObject {
    
    /**
      * ARN of the IAM policy.
      */
    val arn: String = js.native
  }
  object GetPolicyArgs {
    
    @scala.inline
    def apply(arn: String): GetPolicyArgs = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPolicyArgs]
    }
    
    @scala.inline
    implicit class GetPolicyArgsMutableBuilder[Self <: GetPolicyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetPolicyResult extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) specifying the policy.
      */
    val arn: String = js.native
    
    /**
      * The description of the policy.
      */
    val description: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The name of the IAM policy.
      */
    val name: String = js.native
    
    /**
      * The path to the policy.
      */
    val path: String = js.native
    
    /**
      * The policy document of the policy.
      */
    val policy: String = js.native
  }
  object GetPolicyResult {
    
    @scala.inline
    def apply(arn: String, description: String, id: String, name: String, path: String, policy: String): GetPolicyResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPolicyResult]
    }
    
    @scala.inline
    implicit class GetPolicyResultMutableBuilder[Self <: GetPolicyResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    }
  }
}
