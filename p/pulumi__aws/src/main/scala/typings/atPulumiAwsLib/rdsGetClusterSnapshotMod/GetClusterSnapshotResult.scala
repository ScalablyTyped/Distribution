package typings
package atPulumiAwsLib.rdsGetClusterSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterSnapshotResult extends js.Object {
  /**
    * Specifies the allocated storage size in gigabytes (GB).
    */
  val allocatedStorage: scala.Double
  /**
    * List of EC2 Availability Zones that instances in the DB cluster snapshot can be restored in.
    */
  val availabilityZones: js.Array[java.lang.String]
  /**
    * Specifies the DB cluster identifier of the DB cluster that this DB cluster snapshot was created from.
    */
  val dbClusterIdentifier: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the DB Cluster Snapshot.
    */
  val dbClusterSnapshotArn: java.lang.String
  val dbClusterSnapshotIdentifier: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies the name of the database engine.
    */
  val engine: java.lang.String
  /**
    * Version of the database engine for this DB cluster snapshot.
    */
  val engineVersion: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val includePublic: js.UndefOr[scala.Boolean] = js.undefined
  val includeShared: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If storage_encrypted is true, the AWS KMS key identifier for the encrypted DB cluster snapshot.
    */
  val kmsKeyId: java.lang.String
  /**
    * License model information for the restored DB cluster.
    */
  val licenseModel: java.lang.String
  val mostRecent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Port that the DB cluster was listening on at the time of the snapshot.
    */
  val port: scala.Double
  /**
    * Time when the snapshot was taken, in Universal Coordinated Time (UTC).
    */
  val snapshotCreateTime: java.lang.String
  val snapshotType: js.UndefOr[java.lang.String] = js.undefined
  val sourceDbClusterSnapshotArn: java.lang.String
  /**
    * The status of this DB Cluster Snapshot.
    */
  val status: java.lang.String
  /**
    * Specifies whether the DB cluster snapshot is encrypted.
    */
  val storageEncrypted: scala.Boolean
  /**
    * The VPC ID associated with the DB cluster snapshot.
    */
  val vpcId: java.lang.String
}

object GetClusterSnapshotResult {
  @scala.inline
  def apply(
    allocatedStorage: scala.Double,
    availabilityZones: js.Array[java.lang.String],
    dbClusterSnapshotArn: java.lang.String,
    engine: java.lang.String,
    engineVersion: java.lang.String,
    id: java.lang.String,
    kmsKeyId: java.lang.String,
    licenseModel: java.lang.String,
    port: scala.Double,
    snapshotCreateTime: java.lang.String,
    sourceDbClusterSnapshotArn: java.lang.String,
    status: java.lang.String,
    storageEncrypted: scala.Boolean,
    vpcId: java.lang.String,
    dbClusterIdentifier: java.lang.String = null,
    dbClusterSnapshotIdentifier: java.lang.String = null,
    includePublic: js.UndefOr[scala.Boolean] = js.undefined,
    includeShared: js.UndefOr[scala.Boolean] = js.undefined,
    mostRecent: js.UndefOr[scala.Boolean] = js.undefined,
    snapshotType: java.lang.String = null
  ): GetClusterSnapshotResult = {
    val __obj = js.Dynamic.literal(allocatedStorage = allocatedStorage, availabilityZones = availabilityZones, dbClusterSnapshotArn = dbClusterSnapshotArn, engine = engine, engineVersion = engineVersion, id = id, kmsKeyId = kmsKeyId, licenseModel = licenseModel, port = port, snapshotCreateTime = snapshotCreateTime, sourceDbClusterSnapshotArn = sourceDbClusterSnapshotArn, status = status, storageEncrypted = storageEncrypted, vpcId = vpcId)
    if (dbClusterIdentifier != null) __obj.updateDynamic("dbClusterIdentifier")(dbClusterIdentifier)
    if (dbClusterSnapshotIdentifier != null) __obj.updateDynamic("dbClusterSnapshotIdentifier")(dbClusterSnapshotIdentifier)
    if (!js.isUndefined(includePublic)) __obj.updateDynamic("includePublic")(includePublic)
    if (!js.isUndefined(includeShared)) __obj.updateDynamic("includeShared")(includeShared)
    if (!js.isUndefined(mostRecent)) __obj.updateDynamic("mostRecent")(mostRecent)
    if (snapshotType != null) __obj.updateDynamic("snapshotType")(snapshotType)
    __obj.asInstanceOf[GetClusterSnapshotResult]
  }
}

