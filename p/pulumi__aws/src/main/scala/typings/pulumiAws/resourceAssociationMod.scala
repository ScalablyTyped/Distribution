package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@pulumi/aws/ram/resourceAssociation", "ResourceAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ResourceAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): ResourceAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ResourceAssociation]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ResourceAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ResourceAssociation]
    inline def get(name: String, id: Input[ID], state: ResourceAssociationState): ResourceAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ResourceAssociation]
    inline def get(name: String, id: Input[ID], state: ResourceAssociationState, opts: CustomResourceOptions): ResourceAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ResourceAssociation]
    
    /**
      * Returns true if the given object is an instance of ResourceAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ram/resourceAssociation.ResourceAssociation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ram/resourceAssociation.ResourceAssociation */ Boolean]
  }
  
  trait ResourceAssociationArgs extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the resource to associate with the RAM Resource Share.
      */
    val resourceArn: Input[String]
    
    /**
      * Amazon Resource Name (ARN) of the RAM Resource Share.
      */
    val resourceShareArn: Input[String]
  }
  object ResourceAssociationArgs {
    
    inline def apply(resourceArn: Input[String], resourceShareArn: Input[String]): ResourceAssociationArgs = {
      val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], resourceShareArn = resourceShareArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceAssociationArgs]
    }
    
    extension [Self <: ResourceAssociationArgs](x: Self) {
      
      inline def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
      
      inline def setResourceShareArn(value: Input[String]): Self = StObject.set(x, "resourceShareArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceAssociationState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the resource to associate with the RAM Resource Share.
      */
    val resourceArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of the RAM Resource Share.
      */
    val resourceShareArn: js.UndefOr[Input[String]] = js.undefined
  }
  object ResourceAssociationState {
    
    inline def apply(): ResourceAssociationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceAssociationState]
    }
    
    extension [Self <: ResourceAssociationState](x: Self) {
      
      inline def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
      
      inline def setResourceArnUndefined: Self = StObject.set(x, "resourceArn", js.undefined)
      
      inline def setResourceShareArn(value: Input[String]): Self = StObject.set(x, "resourceShareArn", value.asInstanceOf[js.Any])
      
      inline def setResourceShareArnUndefined: Self = StObject.set(x, "resourceShareArn", js.undefined)
    }
  }
}
