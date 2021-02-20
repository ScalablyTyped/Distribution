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

object resourceAssociationMod {
  
  @JSImport("@pulumi/aws/ram/resourceAssociation", "ResourceAssociation")
  @js.native
  class ResourceAssociation protected () extends CustomResource {
    /**
      * Create a ResourceAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResourceAssociationArgs) = this()
    def this(name: String, args: ResourceAssociationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of the resource to associate with the RAM Resource Share.
      */
    val resourceArn: Output_[String] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the RAM Resource Share.
      */
    val resourceShareArn: Output_[String] = js.native
  }
  /* static members */
  object ResourceAssociation {
    
    /**
      * Get an existing ResourceAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ram/resourceAssociation", "ResourceAssociation.get")
    @js.native
    def get(name: String, id: Input[ID]): ResourceAssociation = js.native
    @JSImport("@pulumi/aws/ram/resourceAssociation", "ResourceAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ResourceAssociation = js.native
    @JSImport("@pulumi/aws/ram/resourceAssociation", "ResourceAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResourceAssociationState): ResourceAssociation = js.native
    @JSImport("@pulumi/aws/ram/resourceAssociation", "ResourceAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResourceAssociationState, opts: CustomResourceOptions): ResourceAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of ResourceAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ram/resourceAssociation", "ResourceAssociation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ram/resourceAssociation.ResourceAssociation */ Boolean = js.native
  }
  
  @js.native
  trait ResourceAssociationArgs extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the resource to associate with the RAM Resource Share.
      */
    val resourceArn: Input[String] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the RAM Resource Share.
      */
    val resourceShareArn: Input[String] = js.native
  }
  object ResourceAssociationArgs {
    
    @scala.inline
    def apply(resourceArn: Input[String], resourceShareArn: Input[String]): ResourceAssociationArgs = {
      val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], resourceShareArn = resourceShareArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceAssociationArgs]
    }
    
    @scala.inline
    implicit class ResourceAssociationArgsMutableBuilder[Self <: ResourceAssociationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceShareArn(value: Input[String]): Self = StObject.set(x, "resourceShareArn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResourceAssociationState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the resource to associate with the RAM Resource Share.
      */
    val resourceArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the RAM Resource Share.
      */
    val resourceShareArn: js.UndefOr[Input[String]] = js.native
  }
  object ResourceAssociationState {
    
    @scala.inline
    def apply(): ResourceAssociationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceAssociationState]
    }
    
    @scala.inline
    implicit class ResourceAssociationStateMutableBuilder[Self <: ResourceAssociationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceArnUndefined: Self = StObject.set(x, "resourceArn", js.undefined)
      
      @scala.inline
      def setResourceShareArn(value: Input[String]): Self = StObject.set(x, "resourceShareArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceShareArnUndefined: Self = StObject.set(x, "resourceShareArn", js.undefined)
    }
  }
}
