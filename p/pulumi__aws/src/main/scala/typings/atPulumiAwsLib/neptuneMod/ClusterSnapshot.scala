package typings
package atPulumiAwsLib.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/neptune", "ClusterSnapshot")
@js.native
class ClusterSnapshot protected ()
  extends atPulumiAwsLib.neptuneClusterSnapshotMod.ClusterSnapshot {
  /**
    * Create a ClusterSnapshot resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.neptuneClusterSnapshotMod.ClusterSnapshotArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.neptuneClusterSnapshotMod.ClusterSnapshotArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/neptune", "ClusterSnapshot")
@js.native
object ClusterSnapshot extends js.Object {
  /**
    * Get an existing ClusterSnapshot resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.neptuneClusterSnapshotMod.ClusterSnapshot = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.neptuneClusterSnapshotMod.ClusterSnapshotState
  ): atPulumiAwsLib.neptuneClusterSnapshotMod.ClusterSnapshot = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.neptuneClusterSnapshotMod.ClusterSnapshotState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.neptuneClusterSnapshotMod.ClusterSnapshot = js.native
  /**
    * Returns true if the given object is an instance of ClusterSnapshot.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/neptune/clusterSnapshot.ClusterSnapshot */ scala.Boolean = js.native
}

