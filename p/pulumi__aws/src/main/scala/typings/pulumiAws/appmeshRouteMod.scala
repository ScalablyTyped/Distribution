package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.appmesh.RouteSpec
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appmeshRouteMod {
  
  @JSImport("@pulumi/aws/appmesh/route", "Route")
  @js.native
  class Route protected () extends CustomResource {
    /**
      * Create a Route resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RouteArgs) = this()
    def this(name: String, args: RouteArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the route.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The creation date of the route.
      */
    val createdDate: Output_[String] = js.native
    
    /**
      * The last update date of the route.
      */
    val lastUpdatedDate: Output_[String] = js.native
    
    /**
      * The name of the service mesh in which to create the route. Must be between 1 and 255 characters in length.
      */
    val meshName: Output_[String] = js.native
    
    /**
      * The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
      */
    val meshOwner: Output_[String] = js.native
    
    /**
      * The name to use for the route. Must be between 1 and 255 characters in length.
      */
    val name: Output_[String] = js.native
    
    /**
      * The resource owner's AWS account ID.
      */
    val resourceOwner: Output_[String] = js.native
    
    /**
      * The route specification to apply.
      */
    val spec: Output_[RouteSpec] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The name of the virtual router in which to create the route. Must be between 1 and 255 characters in length.
      */
    val virtualRouterName: Output_[String] = js.native
  }
  /* static members */
  object Route {
    
    @JSImport("@pulumi/aws/appmesh/route", "Route")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Route resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Route]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Route]
    inline def get(name: String, id: Input[ID], state: RouteState): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Route]
    inline def get(name: String, id: Input[ID], state: RouteState, opts: CustomResourceOptions): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Route]
    
    /**
      * Returns true if the given object is an instance of Route.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/route.Route */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/appmesh/route.Route */ Boolean]
  }
  
  trait RouteArgs extends StObject {
    
    /**
      * The name of the service mesh in which to create the route. Must be between 1 and 255 characters in length.
      */
    val meshName: Input[String]
    
    /**
      * The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
      */
    val meshOwner: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name to use for the route. Must be between 1 and 255 characters in length.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The route specification to apply.
      */
    val spec: Input[typings.pulumiAws.inputMod.appmesh.RouteSpec]
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The name of the virtual router in which to create the route. Must be between 1 and 255 characters in length.
      */
    val virtualRouterName: Input[String]
  }
  object RouteArgs {
    
    inline def apply(
      meshName: Input[String],
      spec: Input[typings.pulumiAws.inputMod.appmesh.RouteSpec],
      virtualRouterName: Input[String]
    ): RouteArgs = {
      val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], virtualRouterName = virtualRouterName.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteArgs]
    }
    
    extension [Self <: RouteArgs](x: Self) {
      
      inline def setMeshName(value: Input[String]): Self = StObject.set(x, "meshName", value.asInstanceOf[js.Any])
      
      inline def setMeshOwner(value: Input[String]): Self = StObject.set(x, "meshOwner", value.asInstanceOf[js.Any])
      
      inline def setMeshOwnerUndefined: Self = StObject.set(x, "meshOwner", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSpec(value: Input[typings.pulumiAws.inputMod.appmesh.RouteSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVirtualRouterName(value: Input[String]): Self = StObject.set(x, "virtualRouterName", value.asInstanceOf[js.Any])
    }
  }
  
  trait RouteState extends StObject {
    
    /**
      * The ARN of the route.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The creation date of the route.
      */
    val createdDate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The last update date of the route.
      */
    val lastUpdatedDate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the service mesh in which to create the route. Must be between 1 and 255 characters in length.
      */
    val meshName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
      */
    val meshOwner: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name to use for the route. Must be between 1 and 255 characters in length.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The resource owner's AWS account ID.
      */
    val resourceOwner: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The route specification to apply.
      */
    val spec: js.UndefOr[Input[typings.pulumiAws.inputMod.appmesh.RouteSpec]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The name of the virtual router in which to create the route. Must be between 1 and 255 characters in length.
      */
    val virtualRouterName: js.UndefOr[Input[String]] = js.undefined
  }
  object RouteState {
    
    inline def apply(): RouteState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteState]
    }
    
    extension [Self <: RouteState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setCreatedDate(value: Input[String]): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
      
      inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
      
      inline def setLastUpdatedDate(value: Input[String]): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
      
      inline def setLastUpdatedDateUndefined: Self = StObject.set(x, "lastUpdatedDate", js.undefined)
      
      inline def setMeshName(value: Input[String]): Self = StObject.set(x, "meshName", value.asInstanceOf[js.Any])
      
      inline def setMeshNameUndefined: Self = StObject.set(x, "meshName", js.undefined)
      
      inline def setMeshOwner(value: Input[String]): Self = StObject.set(x, "meshOwner", value.asInstanceOf[js.Any])
      
      inline def setMeshOwnerUndefined: Self = StObject.set(x, "meshOwner", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setResourceOwner(value: Input[String]): Self = StObject.set(x, "resourceOwner", value.asInstanceOf[js.Any])
      
      inline def setResourceOwnerUndefined: Self = StObject.set(x, "resourceOwner", js.undefined)
      
      inline def setSpec(value: Input[typings.pulumiAws.inputMod.appmesh.RouteSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVirtualRouterName(value: Input[String]): Self = StObject.set(x, "virtualRouterName", value.asInstanceOf[js.Any])
      
      inline def setVirtualRouterNameUndefined: Self = StObject.set(x, "virtualRouterName", js.undefined)
    }
  }
}
