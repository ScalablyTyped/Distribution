package typings
package atPulumiAwsLib.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/redshift", "SnapshotCopyGrant")
@js.native
class SnapshotCopyGrant protected ()
  extends atPulumiAwsLib.redshiftSnapshotCopyGrantMod.SnapshotCopyGrant {
  /**
    * Create a SnapshotCopyGrant resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.redshiftSnapshotCopyGrantMod.SnapshotCopyGrantArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.redshiftSnapshotCopyGrantMod.SnapshotCopyGrantArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.redshiftSnapshotCopyGrantMod.SnapshotCopyGrant = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.redshiftSnapshotCopyGrantMod.SnapshotCopyGrantState
  ): atPulumiAwsLib.redshiftSnapshotCopyGrantMod.SnapshotCopyGrant = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.redshiftSnapshotCopyGrantMod.SnapshotCopyGrantState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.redshiftSnapshotCopyGrantMod.SnapshotCopyGrant = js.native
}

