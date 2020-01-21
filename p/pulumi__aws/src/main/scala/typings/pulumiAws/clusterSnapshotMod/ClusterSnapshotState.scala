package typings.pulumiAws.clusterSnapshotMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterSnapshotState extends js.Object {
  /**
    * List of EC2 Availability Zones that instances in the DocDB cluster snapshot can be restored in.
    */
  val availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The DocDB Cluster Identifier from which to take the snapshot.
    */
  val dbClusterIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) for the DocDB Cluster Snapshot.
    */
  val dbClusterSnapshotArn: js.UndefOr[Input[String]] = js.native
  /**
    * The Identifier for the snapshot.
    */
  val dbClusterSnapshotIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the name of the database engine.
    */
  val engine: js.UndefOr[Input[String]] = js.native
  /**
    * Version of the database engine for this DocDB cluster snapshot.
    */
  val engineVersion: js.UndefOr[Input[String]] = js.native
  /**
    * If storageEncrypted is true, the AWS KMS key identifier for the encrypted DocDB cluster snapshot.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.native
  /**
    * Port that the DocDB cluster was listening on at the time of the snapshot.
    */
  val port: js.UndefOr[Input[Double]] = js.native
  val snapshotType: js.UndefOr[Input[String]] = js.native
  val sourceDbClusterSnapshotArn: js.UndefOr[Input[String]] = js.native
  /**
    * The status of this DocDB Cluster Snapshot.
    */
  val status: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies whether the DocDB cluster snapshot is encrypted.
    */
  val storageEncrypted: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The VPC ID associated with the DocDB cluster snapshot.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}

object ClusterSnapshotState {
  @scala.inline
  def apply(
    availabilityZones: Input[js.Array[Input[String]]] = null,
    dbClusterIdentifier: Input[String] = null,
    dbClusterSnapshotArn: Input[String] = null,
    dbClusterSnapshotIdentifier: Input[String] = null,
    engine: Input[String] = null,
    engineVersion: Input[String] = null,
    kmsKeyId: Input[String] = null,
    port: Input[Double] = null,
    snapshotType: Input[String] = null,
    sourceDbClusterSnapshotArn: Input[String] = null,
    status: Input[String] = null,
    storageEncrypted: Input[Boolean] = null,
    vpcId: Input[String] = null
  ): ClusterSnapshotState = {
    val __obj = js.Dynamic.literal()
    if (availabilityZones != null) __obj.updateDynamic("availabilityZones")(availabilityZones.asInstanceOf[js.Any])
    if (dbClusterIdentifier != null) __obj.updateDynamic("dbClusterIdentifier")(dbClusterIdentifier.asInstanceOf[js.Any])
    if (dbClusterSnapshotArn != null) __obj.updateDynamic("dbClusterSnapshotArn")(dbClusterSnapshotArn.asInstanceOf[js.Any])
    if (dbClusterSnapshotIdentifier != null) __obj.updateDynamic("dbClusterSnapshotIdentifier")(dbClusterSnapshotIdentifier.asInstanceOf[js.Any])
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (engineVersion != null) __obj.updateDynamic("engineVersion")(engineVersion.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (snapshotType != null) __obj.updateDynamic("snapshotType")(snapshotType.asInstanceOf[js.Any])
    if (sourceDbClusterSnapshotArn != null) __obj.updateDynamic("sourceDbClusterSnapshotArn")(sourceDbClusterSnapshotArn.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (storageEncrypted != null) __obj.updateDynamic("storageEncrypted")(storageEncrypted.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterSnapshotState]
  }
}

