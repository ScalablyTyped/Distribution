package typings.atPulumiAws.redshiftMod

import typings.atPulumiAws.redshiftSnapshotCopyGrantMod.SnapshotCopyGrantArgs
import typings.atPulumiAws.redshiftSnapshotCopyGrantMod.SnapshotCopyGrantState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/redshift", "SnapshotCopyGrant")
@js.native
class SnapshotCopyGrant protected ()
  extends typings.atPulumiAws.redshiftSnapshotCopyGrantMod.SnapshotCopyGrant {
  /**
    * Create a SnapshotCopyGrant resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SnapshotCopyGrantArgs) = this()
  def this(name: String, args: SnapshotCopyGrantArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/redshift", "SnapshotCopyGrant")
@js.native
object SnapshotCopyGrant extends js.Object {
  /**
    * Get an existing SnapshotCopyGrant resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.redshiftSnapshotCopyGrantMod.SnapshotCopyGrant = js.native
  def get(name: String, id: Input[ID], state: SnapshotCopyGrantState): typings.atPulumiAws.redshiftSnapshotCopyGrantMod.SnapshotCopyGrant = js.native
  def get(name: String, id: Input[ID], state: SnapshotCopyGrantState, opts: CustomResourceOptions): typings.atPulumiAws.redshiftSnapshotCopyGrantMod.SnapshotCopyGrant = js.native
  /**
    * Returns true if the given object is an instance of SnapshotCopyGrant.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/snapshotCopyGrant.SnapshotCopyGrant */ Boolean = js.native
}

