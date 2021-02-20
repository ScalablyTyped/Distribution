package typings.pulumiAws

import typings.pulumiAws.apigatewayMod.RestApi
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    /**
      * Get an existing Resource resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/apigateway/resource", "Resource.get")
    @js.native
    def get(name: String, id: Input[ID]): Resource = js.native
    @JSImport("@pulumi/aws/apigateway/resource", "Resource.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Resource = js.native
    @JSImport("@pulumi/aws/apigateway/resource", "Resource.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResourceState): Resource = js.native
    @JSImport("@pulumi/aws/apigateway/resource", "Resource.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResourceState, opts: CustomResourceOptions): Resource = js.native
    
    /**
      * Returns true if the given object is an instance of Resource.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/apigateway/resource", "Resource.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/resource.Resource */ Boolean = js.native
  }
  
  @js.native
  trait ResourceArgs extends StObject {
    
    /**
      * The ID of the parent API resource
      */
    val parentId: Input[String] = js.native
    
    /**
      * The last path segment of this API resource.
      */
    val pathPart: Input[String] = js.native
    
    /**
      * The ID of the associated REST API
      */
    val restApi: Input[String | RestApi] = js.native
  }
  object ResourceArgs {
    
    @scala.inline
    def apply(parentId: Input[String], pathPart: Input[String], restApi: Input[String | RestApi]): ResourceArgs = {
      val __obj = js.Dynamic.literal(parentId = parentId.asInstanceOf[js.Any], pathPart = pathPart.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceArgs]
    }
    
    @scala.inline
    implicit class ResourceArgsMutableBuilder[Self <: ResourceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParentId(value: Input[String]): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathPart(value: Input[String]): Self = StObject.set(x, "pathPart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestApi(value: Input[String | RestApi]): Self = StObject.set(x, "restApi", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResourceState extends StObject {
    
    /**
      * The ID of the parent API resource
      */
    val parentId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The complete path for this API resource, including all parent paths.
      */
    val path: js.UndefOr[Input[String]] = js.native
    
    /**
      * The last path segment of this API resource.
      */
    val pathPart: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the associated REST API
      */
    val restApi: js.UndefOr[Input[String | RestApi]] = js.native
  }
  object ResourceState {
    
    @scala.inline
    def apply(): ResourceState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceState]
    }
    
    @scala.inline
    implicit class ResourceStateMutableBuilder[Self <: ResourceState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParentId(value: Input[String]): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      @scala.inline
      def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathPart(value: Input[String]): Self = StObject.set(x, "pathPart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathPartUndefined: Self = StObject.set(x, "pathPart", js.undefined)
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setRestApi(value: Input[String | RestApi]): Self = StObject.set(x, "restApi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestApiUndefined: Self = StObject.set(x, "restApi", js.undefined)
    }
  }
}
