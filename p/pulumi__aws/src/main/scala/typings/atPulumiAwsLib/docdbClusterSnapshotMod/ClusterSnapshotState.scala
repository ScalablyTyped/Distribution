package typings
package atPulumiAwsLib.docdbClusterSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterSnapshotState extends js.Object {
  /**
    * List of EC2 Availability Zones that instances in the DocDB cluster snapshot can be restored in.
    */
  val availabilityZones: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The DocDB Cluster Identifier from which to take the snapshot.
    */
  val dbClusterIdentifier: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the DocDB Cluster Snapshot.
    */
  val dbClusterSnapshotArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The Identifier for the snapshot.
    */
  val dbClusterSnapshotIdentifier: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies the name of the database engine.
    */
  val engine: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Version of the database engine for this DocDB cluster snapshot.
    */
  val engineVersion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * If storage_encrypted is true, the AWS KMS key identifier for the encrypted DocDB cluster snapshot.
    */
  val kmsKeyId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Port that the DocDB cluster was listening on at the time of the snapshot.
    */
  val port: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  val snapshotType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val sourceDbClusterSnapshotArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The status of this DocDB Cluster Snapshot.
    */
  val status: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies whether the DocDB cluster snapshot is encrypted.
    */
  val storageEncrypted: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The VPC ID associated with the DocDB cluster snapshot.
    */
  val vpcId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object ClusterSnapshotState {
  @scala.inline
  def apply(
    availabilityZones: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    dbClusterIdentifier: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    dbClusterSnapshotArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    dbClusterSnapshotIdentifier: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    engine: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    engineVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    kmsKeyId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    port: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    snapshotType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    sourceDbClusterSnapshotArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    status: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    storageEncrypted: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    vpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
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

