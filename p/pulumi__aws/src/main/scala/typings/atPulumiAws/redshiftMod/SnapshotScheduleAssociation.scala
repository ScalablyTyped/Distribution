package typings.atPulumiAws.redshiftMod

import typings.atPulumiAws.redshiftSnapshotScheduleAssociationMod.SnapshotScheduleAssociationArgs
import typings.atPulumiAws.redshiftSnapshotScheduleAssociationMod.SnapshotScheduleAssociationState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/redshift", "SnapshotScheduleAssociation")
@js.native
class SnapshotScheduleAssociation protected ()
  extends typings.atPulumiAws.redshiftSnapshotScheduleAssociationMod.SnapshotScheduleAssociation {
  /**
    * Create a SnapshotScheduleAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SnapshotScheduleAssociationArgs) = this()
  def this(name: String, args: SnapshotScheduleAssociationArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/redshift", "SnapshotScheduleAssociation")
@js.native
object SnapshotScheduleAssociation extends js.Object {
  /**
    * Get an existing SnapshotScheduleAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.redshiftSnapshotScheduleAssociationMod.SnapshotScheduleAssociation = js.native
  def get(name: String, id: Input[ID], state: SnapshotScheduleAssociationState): typings.atPulumiAws.redshiftSnapshotScheduleAssociationMod.SnapshotScheduleAssociation = js.native
  def get(name: String, id: Input[ID], state: SnapshotScheduleAssociationState, opts: CustomResourceOptions): typings.atPulumiAws.redshiftSnapshotScheduleAssociationMod.SnapshotScheduleAssociation = js.native
  /**
    * Returns true if the given object is an instance of SnapshotScheduleAssociation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/snapshotScheduleAssociation.SnapshotScheduleAssociation */ Boolean = js.native
}

