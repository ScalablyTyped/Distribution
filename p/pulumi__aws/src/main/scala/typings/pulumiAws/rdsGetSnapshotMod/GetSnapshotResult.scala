package typings.pulumiAws.rdsGetSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSnapshotResult extends js.Object {
  /**
    * Specifies the allocated storage size in gigabytes (GB).
    */
  val allocatedStorage: Double = js.native
  /**
    * Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
    */
  val availabilityZone: String = js.native
  val dbInstanceIdentifier: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the DB snapshot.
    */
  val dbSnapshotArn: String = js.native
  val dbSnapshotIdentifier: js.UndefOr[String] = js.native
  /**
    * Specifies whether the DB snapshot is encrypted.
    */
  val encrypted: Boolean = js.native
  /**
    * Specifies the name of the database engine.
    */
  val engine: String = js.native
  /**
    * Specifies the version of the database engine.
    */
  val engineVersion: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val includePublic: js.UndefOr[Boolean] = js.native
  val includeShared: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
    */
  val iops: Double = js.native
  /**
    * The ARN for the KMS encryption key.
    */
  val kmsKeyId: String = js.native
  /**
    * License model information for the restored DB instance.
    */
  val licenseModel: String = js.native
  val mostRecent: js.UndefOr[Boolean] = js.native
  /**
    * Provides the option group name for the DB snapshot.
    */
  val optionGroupName: String = js.native
  val port: Double = js.native
  /**
    * Provides the time when the snapshot was taken, in Universal Coordinated Time (UTC).
    */
  val snapshotCreateTime: String = js.native
  val snapshotType: js.UndefOr[String] = js.native
  /**
    * The DB snapshot Arn that the DB snapshot was copied from. It only has value in case of cross customer or cross region copy.
    */
  val sourceDbSnapshotIdentifier: String = js.native
  /**
    * The region that the DB snapshot was created in or copied from.
    */
  val sourceRegion: String = js.native
  /**
    * Specifies the status of this DB snapshot.
    */
  val status: String = js.native
  /**
    * Specifies the storage type associated with DB snapshot.
    */
  val storageType: String = js.native
  /**
    * Specifies the ID of the VPC associated with the DB snapshot.
    */
  val vpcId: String = js.native
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
    val __obj = js.Dynamic.literal(allocatedStorage = allocatedStorage.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], dbSnapshotArn = dbSnapshotArn.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], iops = iops.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], licenseModel = licenseModel.asInstanceOf[js.Any], optionGroupName = optionGroupName.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], snapshotCreateTime = snapshotCreateTime.asInstanceOf[js.Any], sourceDbSnapshotIdentifier = sourceDbSnapshotIdentifier.asInstanceOf[js.Any], sourceRegion = sourceRegion.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], storageType = storageType.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    if (dbInstanceIdentifier != null) __obj.updateDynamic("dbInstanceIdentifier")(dbInstanceIdentifier.asInstanceOf[js.Any])
    if (dbSnapshotIdentifier != null) __obj.updateDynamic("dbSnapshotIdentifier")(dbSnapshotIdentifier.asInstanceOf[js.Any])
    if (!js.isUndefined(includePublic)) __obj.updateDynamic("includePublic")(includePublic.asInstanceOf[js.Any])
    if (!js.isUndefined(includeShared)) __obj.updateDynamic("includeShared")(includeShared.asInstanceOf[js.Any])
    if (!js.isUndefined(mostRecent)) __obj.updateDynamic("mostRecent")(mostRecent.asInstanceOf[js.Any])
    if (snapshotType != null) __obj.updateDynamic("snapshotType")(snapshotType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSnapshotResult]
  }
}

