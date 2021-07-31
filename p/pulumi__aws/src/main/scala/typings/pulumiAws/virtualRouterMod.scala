package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.appmesh.VirtualRouterSpec
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object virtualRouterMod {
  
  @JSImport("@pulumi/aws/appmesh/virtualRouter", "VirtualRouter")
  @js.native
  class VirtualRouter protected () extends CustomResource {
    /**
      * Create a VirtualRouter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VirtualRouterArgs) = this()
    def this(name: String, args: VirtualRouterArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the virtual router.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The creation date of the virtual router.
      */
    val createdDate: Output_[String] = js.native
    
    /**
      * The last update date of the virtual router.
      */
    val lastUpdatedDate: Output_[String] = js.native
    
    /**
      * The name of the service mesh in which to create the virtual router. Must be between 1 and 255 characters in length.
      */
    val meshName: Output_[String] = js.native
    
    /**
      * The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
      */
    val meshOwner: Output_[String] = js.native
    
    /**
      * The name to use for the virtual router. Must be between 1 and 255 characters in length.
      */
    val name: Output_[String] = js.native
    
    /**
      * The resource owner's AWS account ID.
      */
    val resourceOwner: Output_[String] = js.native
    
    /**
      * The virtual router specification to apply.
      */
    val spec: Output_[VirtualRouterSpec] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object VirtualRouter {
    
    @JSImport("@pulumi/aws/appmesh/virtualRouter", "VirtualRouter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing VirtualRouter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): VirtualRouter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[VirtualRouter]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): VirtualRouter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VirtualRouter]
    @scala.inline
    def get(name: String, id: Input[ID], state: VirtualRouterState): VirtualRouter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[VirtualRouter]
    @scala.inline
    def get(name: String, id: Input[ID], state: VirtualRouterState, opts: CustomResourceOptions): VirtualRouter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VirtualRouter]
    
    /**
      * Returns true if the given object is an instance of VirtualRouter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/virtualRouter.VirtualRouter */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/appmesh/virtualRouter.VirtualRouter */ Boolean]
  }
  
  trait VirtualRouterArgs extends StObject {
    
    /**
      * The name of the service mesh in which to create the virtual router. Must be between 1 and 255 characters in length.
      */
    val meshName: Input[String]
    
    /**
      * The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
      */
    val meshOwner: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name to use for the virtual router. Must be between 1 and 255 characters in length.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The virtual router specification to apply.
      */
    val spec: Input[typings.pulumiAws.inputMod.appmesh.VirtualRouterSpec]
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object VirtualRouterArgs {
    
    @scala.inline
    def apply(meshName: Input[String], spec: Input[typings.pulumiAws.inputMod.appmesh.VirtualRouterSpec]): VirtualRouterArgs = {
      val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualRouterArgs]
    }
    
    @scala.inline
    implicit class VirtualRouterArgsMutableBuilder[Self <: VirtualRouterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMeshName(value: Input[String]): Self = StObject.set(x, "meshName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeshOwner(value: Input[String]): Self = StObject.set(x, "meshOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeshOwnerUndefined: Self = StObject.set(x, "meshOwner", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSpec(value: Input[typings.pulumiAws.inputMod.appmesh.VirtualRouterSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait VirtualRouterState extends StObject {
    
    /**
      * The ARN of the virtual router.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The creation date of the virtual router.
      */
    val createdDate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The last update date of the virtual router.
      */
    val lastUpdatedDate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the service mesh in which to create the virtual router. Must be between 1 and 255 characters in length.
      */
    val meshName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
      */
    val meshOwner: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name to use for the virtual router. Must be between 1 and 255 characters in length.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The resource owner's AWS account ID.
      */
    val resourceOwner: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The virtual router specification to apply.
      */
    val spec: js.UndefOr[Input[typings.pulumiAws.inputMod.appmesh.VirtualRouterSpec]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object VirtualRouterState {
    
    @scala.inline
    def apply(): VirtualRouterState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VirtualRouterState]
    }
    
    @scala.inline
    implicit class VirtualRouterStateMutableBuilder[Self <: VirtualRouterState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCreatedDate(value: Input[String]): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
      
      @scala.inline
      def setLastUpdatedDate(value: Input[String]): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUpdatedDateUndefined: Self = StObject.set(x, "lastUpdatedDate", js.undefined)
      
      @scala.inline
      def setMeshName(value: Input[String]): Self = StObject.set(x, "meshName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeshNameUndefined: Self = StObject.set(x, "meshName", js.undefined)
      
      @scala.inline
      def setMeshOwner(value: Input[String]): Self = StObject.set(x, "meshOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeshOwnerUndefined: Self = StObject.set(x, "meshOwner", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setResourceOwner(value: Input[String]): Self = StObject.set(x, "resourceOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceOwnerUndefined: Self = StObject.set(x, "resourceOwner", js.undefined)
      
      @scala.inline
      def setSpec(value: Input[typings.pulumiAws.inputMod.appmesh.VirtualRouterSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
