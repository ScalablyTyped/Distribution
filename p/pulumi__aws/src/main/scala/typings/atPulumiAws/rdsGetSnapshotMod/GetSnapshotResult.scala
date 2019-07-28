package typings.atPulumiAws.rdsGetSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSnapshotResult extends js.Object {
  /**
    * Specifies the allocated storage size in gigabytes (GB).
    */
  val allocatedStorage: Double
  /**
    * Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
    */
  val availabilityZone: String
  val dbInstanceIdentifier: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the DB snapshot.
    */
  val dbSnapshotArn: String
  val dbSnapshotIdentifier: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether the DB snapshot is encrypted.
    */
  val encrypted: Boolean
  /**
    * Specifies the name of the database engine.
    */
  val engine: String
  /**
    * Specifies the version of the database engine.
    */
  val engineVersion: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val includePublic: js.UndefOr[Boolean] = js.undefined
  val includeShared: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
    */
  val iops: Double
  /**
    * The ARN for the KMS encryption key.
    */
  val kmsKeyId: String
  /**
    * License model information for the restored DB instance.
    */
  val licenseModel: String
  val mostRecent: js.UndefOr[Boolean] = js.undefined
  /**
    * Provides the option group name for the DB snapshot.
    */
  val optionGroupName: String
  val port: Double
  /**
    * Provides the time when the snapshot was taken, in Universal Coordinated Time (UTC).
    */
  val snapshotCreateTime: String
  val snapshotType: js.UndefOr[String] = js.undefined
  /**
    * The DB snapshot Arn that the DB snapshot was copied from. It only has value in case of cross customer or cross region copy.
    */
  val sourceDbSnapshotIdentifier: String
  /**
    * The region that the DB snapshot was created in or copied from.
    */
  val sourceRegion: String
  /**
    * Specifies the status of this DB snapshot.
    */
  val status: String
  /**
    * Specifies the storage type associated with DB snapshot.
    */
  val storageType: String
  /**
    * Specifies the ID of the VPC associated with the DB snapshot.
    */
  val vpcId: String
}

object GetSnapshotResult {
  @scala.inline
  def apply(
    allocatedStorage: Double,
    availabilityZone: String,
    dbSnapshotArn: String,
    encrypted: Boolean,
    engine: String,
    engineVersion: String,
    id: String,
    iops: Double,
    kmsKeyId: String,
    licenseModel: String,
    optionGroupName: String,
    port: Double,
    snapshotCreateTime: String,
    sourceDbSnapshotIdentifier: String,
    sourceRegion: String,
    status: String,
    storageType: String,
    vpcId: String,
    dbInstanceIdentifier: String = null,
    dbSnapshotIdentifier: String = null,
    includePublic: js.UndefOr[Boolean] = js.undefined,
    includeShared: js.UndefOr[Boolean] = js.undefined,
    mostRecent: js.UndefOr[Boolean] = js.undefined,
    snapshotType: String = null
  ): GetSnapshotResult = {
    val __obj = js.Dynamic.literal(allocatedStorage = allocatedStorage, availabilityZone = availabilityZone, dbSnapshotArn = dbSnapshotArn, encrypted = encrypted, engine = engine, engineVersion = engineVersion, id = id, iops = iops, kmsKeyId = kmsKeyId, licenseModel = licenseModel, optionGroupName = optionGroupName, port = port, snapshotCreateTime = snapshotCreateTime, sourceDbSnapshotIdentifier = sourceDbSnapshotIdentifier, sourceRegion = sourceRegion, status = status, storageType = storageType, vpcId = vpcId)
    if (dbInstanceIdentifier != null) __obj.updateDynamic("dbInstanceIdentifier")(dbInstanceIdentifier)
    if (dbSnapshotIdentifier != null) __obj.updateDynamic("dbSnapshotIdentifier")(dbSnapshotIdentifier)
    if (!js.isUndefined(includePublic)) __obj.updateDynamic("includePublic")(includePublic)
    if (!js.isUndefined(includeShared)) __obj.updateDynamic("includeShared")(includeShared)
    if (!js.isUndefined(mostRecent)) __obj.updateDynamic("mostRecent")(mostRecent)
    if (snapshotType != null) __obj.updateDynamic("snapshotType")(snapshotType)
    __obj.asInstanceOf[GetSnapshotResult]
  }
}

