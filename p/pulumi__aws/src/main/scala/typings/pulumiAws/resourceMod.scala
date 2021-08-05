package typings.pulumiAws

import typings.pulumiAws.apigatewayMod.RestApi
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourceMod {
  
  @JSImport("@pulumi/aws/apigateway/resource", "Resource")
  @js.native
  class Resource protected () extends CustomResource {
    /**
      * Create a Resource resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResourceArgs) = this()
    def this(name: String, args: ResourceArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ID of the parent API resource
      */
    val parentId: Output_[String] = js.native
    
    /**
      * The complete path for this API resource, including all parent paths.
      */
    val path: Output_[String] = js.native
    
    /**
      * The last path segment of this API resource.
      */
    val pathPart: Output_[String] = js.native
    
    /**
      * The ID of the associated REST API
      */
    val restApi: Output_[String] = js.native
  }
  /* static members */
  object Resource {
    
    @JSImport("@pulumi/aws/apigateway/resource", "Resource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Resource resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Resource = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Resource]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Resource = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Resource]
    inline def get(name: String, id: Input[ID], state: ResourceState): Resource = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Resource]
    inline def get(name: String, id: Input[ID], state: ResourceState, opts: CustomResourceOptions): Resource = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Resource]
    
    /**
      * Returns true if the given object is an instance of Resource.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/resource.Resource */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigateway/resource.Resource */ Boolean]
  }
  
  trait ResourceArgs extends StObject {
    
    /**
      * The ID of the parent API resource
      */
    val parentId: Input[String]
    
    /**
      * The last path segment of this API resource.
      */
    val pathPart: Input[String]
    
    /**
      * The ID of the associated REST API
      */
    val restApi: Input[String | RestApi]
  }
  object ResourceArgs {
    
    inline def apply(parentId: Input[String], pathPart: Input[String], restApi: Input[String | RestApi]): ResourceArgs = {
      val __obj = js.Dynamic.literal(parentId = parentId.asInstanceOf[js.Any], pathPart = pathPart.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceArgs]
    }
    
    extension [Self <: ResourceArgs](x: Self) {
      
      inline def setParentId(value: Input[String]): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setPathPart(value: Input[String]): Self = StObject.set(x, "pathPart", value.asInstanceOf[js.Any])
      
      inline def setRestApi(value: Input[String | RestApi]): Self = StObject.set(x, "restApi", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceState extends StObject {
    
    /**
      * The ID of the parent API resource
      */
    val parentId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The complete path for this API resource, including all parent paths.
      */
    val path: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The last path segment of this API resource.
      */
    val pathPart: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the associated REST API
      */
    val restApi: js.UndefOr[Input[String | RestApi]] = js.undefined
  }
  object ResourceState {
    
    inline def apply(): ResourceState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceState]
    }
    
    extension [Self <: ResourceState](x: Self) {
      
      inline def setParentId(value: Input[String]): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathPart(value: Input[String]): Self = StObject.set(x, "pathPart", value.asInstanceOf[js.Any])
      
      inline def setPathPartUndefined: Self = StObject.set(x, "pathPart", js.undefined)
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setRestApi(value: Input[String | RestApi]): Self = StObject.set(x, "restApi", value.asInstanceOf[js.Any])
      
      inline def setRestApiUndefined: Self = StObject.set(x, "restApi", js.undefined)
    }
  }
}
