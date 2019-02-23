package typings
package atPulumiAwsLib.rdsClusterSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/rds/clusterSnapshot", "ClusterSnapshot")
@js.native
class ClusterSnapshot protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
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
  val allocatedStorage: atPulumiPulumiLib.atPulumiPulumiMod.Output[scala.Double] = js.native
  /**
    * List of EC2 Availability Zones that instances in the DB cluster snapshot can be restored in.
    */
  val availabilityZones: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * The DB Cluster Identifier from which to take the snapshot.
    */
  val dbClusterIdentifier: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the DB Cluster Snapshot.
    */
  val dbClusterSnapshotArn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The Identifier for the snapshot.
    */
  val dbClusterSnapshotIdentifier: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Specifies the name of the database engine.
    */
  val engine: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Version of the database engine for this DB cluster snapshot.
    */
  val engineVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * If storage_encrypted is true, the AWS KMS key identifier for the encrypted DB cluster snapshot.
    */
  val kmsKeyId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * License model information for the restored DB cluster.
    */
  val licenseModel: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Port that the DB cluster was listening on at the time of the snapshot.
    */
  val port: atPulumiPulumiLib.atPulumiPulumiMod.Output[scala.Double] = js.native
  val snapshotType: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  val sourceDbClusterSnapshotArn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The status of this DB Cluster Snapshot.
    */
  val status: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Specifies whether the DB cluster snapshot is encrypted.
    */
  val storageEncrypted: atPulumiPulumiLib.atPulumiPulumiMod.Output[scala.Boolean] = js.native
  /**
    * The VPC ID associated with the DB cluster snapshot.
    */
  val vpcId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/rds/clusterSnapshot", "ClusterSnapshot")
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.rdsClusterSnapshotMod.ClusterSnapshot = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.rdsClusterSnapshotMod.ClusterSnapshotState
  ): atPulumiAwsLib.rdsClusterSnapshotMod.ClusterSnapshot = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.rdsClusterSnapshotMod.ClusterSnapshotState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.rdsClusterSnapshotMod.ClusterSnapshot = js.native
}

