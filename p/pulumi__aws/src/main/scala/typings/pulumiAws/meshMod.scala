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
import scala.scalajs.js.`|`
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
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
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
    
    /**
      * Get an existing Mesh resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/appmesh/mesh", "Mesh.get")
    @js.native
    def get(name: String, id: Input[ID]): Mesh = js.native
    @JSImport("@pulumi/aws/appmesh/mesh", "Mesh.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Mesh = js.native
    @JSImport("@pulumi/aws/appmesh/mesh", "Mesh.get")
    @js.native
    def get(name: String, id: Input[ID], state: MeshState): Mesh = js.native
    @JSImport("@pulumi/aws/appmesh/mesh", "Mesh.get")
    @js.native
    def get(name: String, id: Input[ID], state: MeshState, opts: CustomResourceOptions): Mesh = js.native
    
    /**
      * Returns true if the given object is an instance of Mesh.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/appmesh/mesh", "Mesh.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/mesh.Mesh */ Boolean = js.native
  }
  
  @js.native
  trait MeshArgs extends StObject {
    
    /**
      * The name to use for the service mesh. Must be between 1 and 255 characters in length.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The service mesh specification to apply.
      */
    val spec: js.UndefOr[Input[typings.pulumiAws.inputMod.appmesh.MeshSpec]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object MeshArgs {
    
    @scala.inline
    def apply(): MeshArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MeshArgs]
    }
    
    @scala.inline
    implicit class MeshArgsMutableBuilder[Self <: MeshArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSpec(value: Input[typings.pulumiAws.inputMod.appmesh.MeshSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait MeshState extends StObject {
    
    /**
      * The ARN of the service mesh.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The creation date of the service mesh.
      */
    val createdDate: js.UndefOr[Input[String]] = js.native
    
    /**
      * The last update date of the service mesh.
      */
    val lastUpdatedDate: js.UndefOr[Input[String]] = js.native
    
    /**
      * The AWS account ID of the service mesh's owner.
      */
    val meshOwner: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name to use for the service mesh. Must be between 1 and 255 characters in length.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The resource owner's AWS account ID.
      */
    val resourceOwner: js.UndefOr[Input[String]] = js.native
    
    /**
      * The service mesh specification to apply.
      */
    val spec: js.UndefOr[Input[typings.pulumiAws.inputMod.appmesh.MeshSpec]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object MeshState {
    
    @scala.inline
    def apply(): MeshState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MeshState]
    }
    
    @scala.inline
    implicit class MeshStateMutableBuilder[Self <: MeshState] (val x: Self) extends AnyVal {
      
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
      def setSpec(value: Input[typings.pulumiAws.inputMod.appmesh.MeshSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
