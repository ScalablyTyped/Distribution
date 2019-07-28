package typings.atPulumiAws.ramMod

import typings.atPulumiAws.ramResourceAssociationMod.ResourceAssociationArgs
import typings.atPulumiAws.ramResourceAssociationMod.ResourceAssociationState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ram", "ResourceAssociation")
@js.native
class ResourceAssociation protected ()
  extends typings.atPulumiAws.ramResourceAssociationMod.ResourceAssociation {
  /**
    * Create a ResourceAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ResourceAssociationArgs) = this()
  def this(name: String, args: ResourceAssociationArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ram", "ResourceAssociation")
@js.native
object ResourceAssociation extends js.Object {
  /**
    * Get an existing ResourceAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.ramResourceAssociationMod.ResourceAssociation = js.native
  def get(name: String, id: Input[ID], state: ResourceAssociationState): typings.atPulumiAws.ramResourceAssociationMod.ResourceAssociation = js.native
  def get(name: String, id: Input[ID], state: ResourceAssociationState, opts: CustomResourceOptions): typings.atPulumiAws.ramResourceAssociationMod.ResourceAssociation = js.native
  /**
    * Returns true if the given object is an instance of ResourceAssociation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ram/resourceAssociation.ResourceAssociation */ Boolean = js.native
}

