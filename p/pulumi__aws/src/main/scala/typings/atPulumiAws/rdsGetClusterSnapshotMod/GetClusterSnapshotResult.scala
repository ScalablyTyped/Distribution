package typings.atPulumiAws.rdsGetClusterSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterSnapshotResult extends js.Object {
  /**
    * Specifies the allocated storage size in gigabytes (GB).
    */
  val allocatedStorage: Double
  /**
    * List of EC2 Availability Zones that instances in the DB cluster snapshot can be restored in.
    */
  val availabilityZones: js.Array[String]
  /**
    * Specifies the DB cluster identifier of the DB cluster that this DB cluster snapshot was created from.
    */
  val dbClusterIdentifier: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the DB Cluster Snapshot.
    */
  val dbClusterSnapshotArn: String
  val dbClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined
  /**
    * Specifies the name of the database engine.
    */
  val engine: String
  /**
    * Version of the database engine for this DB cluster snapshot.
    */
  val engineVersion: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val includePublic: js.UndefOr[Boolean] = js.undefined
  val includeShared: js.UndefOr[Boolean] = js.undefined
  /**
    * If storage_encrypted is true, the AWS KMS key identifier for the encrypted DB cluster snapshot.
    */
  val kmsKeyId: String
  /**
    * License model information for the restored DB cluster.
    */
  val licenseModel: String
  val mostRecent: js.UndefOr[Boolean] = js.undefined
  /**
    * Port that the DB cluster was listening on at the time of the snapshot.
    */
  val port: Double
  /**
    * Time when the snapshot was taken, in Universal Coordinated Time (UTC).
    */
  val snapshotCreateTime: String
  val snapshotType: js.UndefOr[String] = js.undefined
  val sourceDbClusterSnapshotArn: String
  /**
    * The status of this DB Cluster Snapshot.
    */
  val status: String
  /**
    * Specifies whether the DB cluster snapshot is encrypted.
    */
  val storageEncrypted: Boolean
  /**
    * The VPC ID associated with the DB cluster snapshot.
    */
  val vpcId: String
}

object GetClusterSnapshotResult {
  @scala.inline
  def apply(
    allocatedStorage: Double,
    availabilityZones: js.Array[String],
    dbClusterSnapshotArn: String,
    engine: String,
    engineVersion: String,
    id: String,
    kmsKeyId: String,
    licenseModel: String,
    port: Double,
    snapshotCreateTime: String,
    sourceDbClusterSnapshotArn: String,
    status: String,
    storageEncrypted: Boolean,
    vpcId: String,
    dbClusterIdentifier: String = null,
    dbClusterSnapshotIdentifier: String = null,
    includePublic: js.UndefOr[Boolean] = js.undefined,
    includeShared: js.UndefOr[Boolean] = js.undefined,
    mostRecent: js.UndefOr[Boolean] = js.undefined,
    snapshotType: String = null
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

