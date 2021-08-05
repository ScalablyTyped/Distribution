package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@pulumi/aws/apigateway/restApiPolicy", "RestApiPolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RestApiPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): RestApiPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[RestApiPolicy]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): RestApiPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RestApiPolicy]
    inline def get(name: String, id: Input[ID], state: RestApiPolicyState): RestApiPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[RestApiPolicy]
    inline def get(name: String, id: Input[ID], state: RestApiPolicyState, opts: CustomResourceOptions): RestApiPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RestApiPolicy]
    
    /**
      * Returns true if the given object is an instance of RestApiPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/restApiPolicy.RestApiPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigateway/restApiPolicy.RestApiPolicy */ Boolean]
  }
  
  trait RestApiPolicyArgs extends StObject {
    
    val policy: Input[String]
    
    /**
      * The ID of the REST API.
      */
    val restApiId: Input[String]
  }
  object RestApiPolicyArgs {
    
    inline def apply(policy: Input[String], restApiId: Input[String]): RestApiPolicyArgs = {
      val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestApiPolicyArgs]
    }
    
    extension [Self <: RestApiPolicyArgs](x: Self) {
      
      inline def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setRestApiId(value: Input[String]): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    }
  }
  
  trait RestApiPolicyState extends StObject {
    
    val policy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the REST API.
      */
    val restApiId: js.UndefOr[Input[String]] = js.undefined
  }
  object RestApiPolicyState {
    
    inline def apply(): RestApiPolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RestApiPolicyState]
    }
    
    extension [Self <: RestApiPolicyState](x: Self) {
      
      inline def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      inline def setRestApiId(value: Input[String]): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
      
      inline def setRestApiIdUndefined: Self = StObject.set(x, "restApiId", js.undefined)
    }
  }
}
