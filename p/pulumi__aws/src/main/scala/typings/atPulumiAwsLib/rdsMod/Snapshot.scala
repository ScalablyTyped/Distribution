package typings
package atPulumiAwsLib.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/rds", "Snapshot")
@js.native
class Snapshot protected ()
  extends atPulumiAwsLib.rdsSnapshotMod.Snapshot {
  /**
    * Create a Snapshot resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.rdsSnapshotMod.SnapshotArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.rdsSnapshotMod.SnapshotArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/rds", "Snapshot")
@js.native
object Snapshot extends js.Object {
  /**
    * Get an existing Snapshot resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.rdsSnapshotMod.Snapshot = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.rdsSnapshotMod.SnapshotState
  ): atPulumiAwsLib.rdsSnapshotMod.Snapshot = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.rdsSnapshotMod.SnapshotState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.rdsSnapshotMod.Snapshot = js.native
  /**
    * Returns true if the given object is an instance of Snapshot.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/snapshot.Snapshot */ scala.Boolean = js.native
}

