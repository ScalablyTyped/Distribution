package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.appmesh.MeshSpec
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshMod {
  
  @JSImport("@pulumi/aws/appmesh/mesh", "Mesh")
  @js.native
  class Mesh protected () extends CustomResource {
    /**
      * Create a Mesh resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: MeshArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: MeshArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the service mesh.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The creation date of the service mesh.
      */
    val createdDate: Output_[String] = js.native
    
    /**
      * The last update date of the service mesh.
      */
    val lastUpdatedDate: Output_[String] = js.native
    
    /**
      * The AWS account ID of the service mesh's owner.
      */
    val meshOwner: Output_[String] = js.native
    
    /**
      * The name to use for the service mesh. Must be between 1 and 255 characters in length.
      */
    val name: Output_[String] = js.native
    
    /**
      * The resource owner's AWS account ID.
      */
    val resourceOwner: Output_[String] = js.native
    
    /**
      * The service mesh specification to apply.
      */
    val spec: Output_[js.UndefOr[MeshSpec]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Mesh {
    
    @JSImport("@pulumi/aws/appmesh/mesh", "Mesh")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Mesh resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def get(name: String, id: Input[ID], state: MeshState): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def get(name: String, id: Input[ID], state: MeshState, opts: CustomResourceOptions): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    
    /**
      * Returns true if the given object is an instance of Mesh.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/mesh.Mesh */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/appmesh/mesh.Mesh */ Boolean]
  }
  
  trait MeshArgs extends StObject {
    
    /**
      * The name to use for the service mesh. Must be between 1 and 255 characters in length.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The service mesh specification to apply.
      */
    val spec: js.UndefOr[Input[typings.pulumiAws.inputMod.appmesh.MeshSpec]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object MeshArgs {
    
    inline def apply(): MeshArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MeshArgs]
    }
    
    extension [Self <: MeshArgs](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSpec(value: Input[typings.pulumiAws.inputMod.appmesh.MeshSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait MeshState extends StObject {
    
    /**
      * The ARN of the service mesh.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The creation date of the service mesh.
      */
    val createdDate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The last update date of the service mesh.
      */
    val lastUpdatedDate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The AWS account ID of the service mesh's owner.
      */
    val meshOwner: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name to use for the service mesh. Must be between 1 and 255 characters in length.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The resource owner's AWS account ID.
      */
    val resourceOwner: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The service mesh specification to apply.
      */
    val spec: js.UndefOr[Input[typings.pulumiAws.inputMod.appmesh.MeshSpec]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object MeshState {
    
    inline def apply(): MeshState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MeshState]
    }
    
    extension [Self <: MeshState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setCreatedDate(value: Input[String]): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
      
      inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
      
      inline def setLastUpdatedDate(value: Input[String]): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
      
      inline def setLastUpdatedDateUndefined: Self = StObject.set(x, "lastUpdatedDate", js.undefined)
      
      inline def setMeshOwner(value: Input[String]): Self = StObject.set(x, "meshOwner", value.asInstanceOf[js.Any])
      
      inline def setMeshOwnerUndefined: Self = StObject.set(x, "meshOwner", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setResourceOwner(value: Input[String]): Self = StObject.set(x, "resourceOwner", value.asInstanceOf[js.Any])
      
      inline def setResourceOwnerUndefined: Self = StObject.set(x, "resourceOwner", js.undefined)
      
      inline def setSpec(value: Input[typings.pulumiAws.inputMod.appmesh.MeshSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
