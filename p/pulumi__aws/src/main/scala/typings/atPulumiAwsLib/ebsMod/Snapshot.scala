package typings
package atPulumiAwsLib.ebsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ebs", "Snapshot")
@js.native
class Snapshot protected ()
  extends atPulumiAwsLib.ebsSnapshotMod.Snapshot {
  /**
    * Create a Snapshot resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.ebsSnapshotMod.SnapshotArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.ebsSnapshotMod.SnapshotArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ebs", "Snapshot")
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ebsSnapshotMod.Snapshot = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ebsSnapshotMod.SnapshotState
  ): atPulumiAwsLib.ebsSnapshotMod.Snapshot = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ebsSnapshotMod.SnapshotState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ebsSnapshotMod.Snapshot = js.native
}

