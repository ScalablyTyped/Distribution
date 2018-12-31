package typings
package atPulumiAwsLib.neptuneClusterSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/neptune/clusterSnapshot", "ClusterSnapshot")
@js.native
class ClusterSnapshot protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a ClusterSnapshot resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ClusterSnapshotArgs) = this()
  def this(name: java.lang.String, args: ClusterSnapshotArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Specifies the allocated storage size in gigabytes (GB).
    */
  val allocatedStorage: atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
  /**
    * List of EC2 Availability Zones that instances in the DB cluster snapshot can be restored in.
    */
  val availabilityZones: atPulumiPulumiLib.pulumiMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * The DB Cluster Identifier from which to take the snapshot.
    */
  val dbClusterIdentifier: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the DB Cluster Snapshot.
    */
  val dbClusterSnapshotArn: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The Identifier for the snapshot.
    */
  val dbClusterSnapshotIdentifier: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Specifies the name of the database engine.
    */
  val engine: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Version of the database engine for this DB cluster snapshot.
    */
  val engineVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * If storage_encrypted is true, the AWS KMS key identifier for the encrypted DB cluster snapshot.
    */
  val kmsKeyId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * License model information for the restored DB cluster.
    */
  val licenseModel: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Port that the DB cluster was listening on at the time of the snapshot.
    */
  val port: atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
  val snapshotType: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  val sourceDbClusterSnapshotArn: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The status of this DB Cluster Snapshot.
    */
  val status: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Specifies whether the DB cluster snapshot is encrypted.
    */
  val storageEncrypted: atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
  /**
    * The VPC ID associated with the DB cluster snapshot.
    */
  val vpcId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
}

@JSImport("@pulumi/aws/neptune/clusterSnapshot", "ClusterSnapshot")
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.neptuneClusterSnapshotMod.ClusterSnapshot = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.neptuneClusterSnapshotMod.ClusterSnapshotState
  ): atPulumiAwsLib.neptuneClusterSnapshotMod.ClusterSnapshot = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.neptuneClusterSnapshotMod.ClusterSnapshotState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.neptuneClusterSnapshotMod.ClusterSnapshot = js.native
}

