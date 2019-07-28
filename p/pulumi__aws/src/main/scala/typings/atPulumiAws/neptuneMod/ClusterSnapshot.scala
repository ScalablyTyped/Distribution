package typings.atPulumiAws.neptuneMod

import typings.atPulumiAws.neptuneClusterSnapshotMod.ClusterSnapshotArgs
import typings.atPulumiAws.neptuneClusterSnapshotMod.ClusterSnapshotState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/neptune", "ClusterSnapshot")
@js.native
class ClusterSnapshot protected ()
  extends typings.atPulumiAws.neptuneClusterSnapshotMod.ClusterSnapshot {
  /**
    * Create a ClusterSnapshot resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ClusterSnapshotArgs) = this()
  def this(name: String, args: ClusterSnapshotArgs, opts: CustomResourceOptions) = this()
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.neptuneClusterSnapshotMod.ClusterSnapshot = js.native
  def get(name: String, id: Input[ID], state: ClusterSnapshotState): typings.atPulumiAws.neptuneClusterSnapshotMod.ClusterSnapshot = js.native
  def get(name: String, id: Input[ID], state: ClusterSnapshotState, opts: CustomResourceOptions): typings.atPulumiAws.neptuneClusterSnapshotMod.ClusterSnapshot = js.native
  /**
    * Returns true if the given object is an instance of ClusterSnapshot.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/neptune/clusterSnapshot.ClusterSnapshot */ Boolean = js.native
}

