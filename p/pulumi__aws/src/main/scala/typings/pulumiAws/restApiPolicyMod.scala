package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object restApiPolicyMod {
  
  @JSImport("@pulumi/aws/apigateway/restApiPolicy", "RestApiPolicy")
  @js.native
  class RestApiPolicy protected () extends CustomResource {
    /**
      * Create a RestApiPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RestApiPolicyArgs) = this()
    def this(name: String, args: RestApiPolicyArgs, opts: CustomResourceOptions) = this()
    
    val policy: Output_[String] = js.native
    
    /**
      * The ID of the REST API.
      */
    val restApiId: Output_[String] = js.native
  }
  /* static members */
  object RestApiPolicy {
    
    /**
      * Get an existing RestApiPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/apigateway/restApiPolicy", "RestApiPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): RestApiPolicy = js.native
    @JSImport("@pulumi/aws/apigateway/restApiPolicy", "RestApiPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): RestApiPolicy = js.native
    @JSImport("@pulumi/aws/apigateway/restApiPolicy", "RestApiPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: RestApiPolicyState): RestApiPolicy = js.native
    @JSImport("@pulumi/aws/apigateway/restApiPolicy", "RestApiPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: RestApiPolicyState, opts: CustomResourceOptions): RestApiPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of RestApiPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/apigateway/restApiPolicy", "RestApiPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/restApiPolicy.RestApiPolicy */ Boolean = js.native
  }
  
  @js.native
  trait RestApiPolicyArgs extends StObject {
    
    val policy: Input[String] = js.native
    
    /**
      * The ID of the REST API.
      */
    val restApiId: Input[String] = js.native
  }
  object RestApiPolicyArgs {
    
    @scala.inline
    def apply(policy: Input[String], restApiId: Input[String]): RestApiPolicyArgs = {
      val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestApiPolicyArgs]
    }
    
    @scala.inline
    implicit class RestApiPolicyArgsMutableBuilder[Self <: RestApiPolicyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestApiId(value: Input[String]): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RestApiPolicyState extends StObject {
    
    val policy: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the REST API.
      */
    val restApiId: js.UndefOr[Input[String]] = js.native
  }
  object RestApiPolicyState {
    
    @scala.inline
    def apply(): RestApiPolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RestApiPolicyState]
    }
    
    @scala.inline
    implicit class RestApiPolicyStateMutableBuilder[Self <: RestApiPolicyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      @scala.inline
      def setRestApiId(value: Input[String]): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestApiIdUndefined: Self = StObject.set(x, "restApiId", js.undefined)
    }
  }
}
