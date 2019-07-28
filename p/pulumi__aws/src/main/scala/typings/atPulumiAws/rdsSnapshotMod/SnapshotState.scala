package typings.atPulumiAws.rdsSnapshotMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotState extends js.Object {
  /**
    * Specifies the allocated storage size in gigabytes (GB).
    */
  val allocatedStorage: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.undefined
  /**
    * The DB Instance Identifier from which to take the snapshot.
    */
  val dbInstanceIdentifier: js.UndefOr[Input[String]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the DB snapshot.
    */
  val dbSnapshotArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The Identifier for the snapshot.
    */
  val dbSnapshotIdentifier: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies whether the DB snapshot is encrypted.
    */
  val encrypted: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Specifies the name of the database engine.
    */
  val engine: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies the version of the database engine.
    */
  val engineVersion: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
    */
  val iops: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The ARN for the KMS encryption key.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.undefined
  /**
    * License model information for the restored DB instance.
    */
  val licenseModel: js.UndefOr[Input[String]] = js.undefined
  /**
    * Provides the option group name for the DB snapshot.
    */
  val optionGroupName: js.UndefOr[Input[String]] = js.undefined
  val port: js.UndefOr[Input[Double]] = js.undefined
  val snapshotType: js.UndefOr[Input[String]] = js.undefined
  /**
    * The DB snapshot Arn that the DB snapshot was copied from. It only has value in case of cross customer or cross region copy.
    */
  val sourceDbSnapshotIdentifier: js.UndefOr[Input[String]] = js.undefined
  /**
    * The region that the DB snapshot was created in or copied from.
    */
  val sourceRegion: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies the status of this DB snapshot.
    */
  val status: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies the storage type associated with DB snapshot.
    */
  val storageType: js.UndefOr[Input[String]] = js.undefined
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * Specifies the storage type associated with DB snapshot.
    */
  val vpcId: js.UndefOr[Input[String]] = js.undefined
}

object SnapshotState {
  @scala.inline
  def apply(
    allocatedStorage: Input[Double] = null,
    availabilityZone: Input[String] = null,
    dbInstanceIdentifier: Input[String] = null,
    dbSnapshotArn: Input[String] = null,
    dbSnapshotIdentifier: Input[String] = null,
    encrypted: Input[Boolean] = null,
    engine: Input[String] = null,
    engineVersion: Input[String] = null,
    iops: Input[Double] = null,
    kmsKeyId: Input[String] = null,
    licenseModel: Input[String] = null,
    optionGroupName: Input[String] = null,
    port: Input[Double] = null,
    snapshotType: Input[String] = null,
    sourceDbSnapshotIdentifier: Input[String] = null,
    sourceRegion: Input[String] = null,
    status: Input[String] = null,
    storageType: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    vpcId: Input[String] = null
  ): SnapshotState = {
    val __obj = js.Dynamic.literal()
    if (allocatedStorage != null) __obj.updateDynamic("allocatedStorage")(allocatedStorage.asInstanceOf[js.Any])
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (dbInstanceIdentifier != null) __obj.updateDynamic("dbInstanceIdentifier")(dbInstanceIdentifier.asInstanceOf[js.Any])
    if (dbSnapshotArn != null) __obj.updateDynamic("dbSnapshotArn")(dbSnapshotArn.asInstanceOf[js.Any])
    if (dbSnapshotIdentifier != null) __obj.updateDynamic("dbSnapshotIdentifier")(dbSnapshotIdentifier.asInstanceOf[js.Any])
    if (encrypted != null) __obj.updateDynamic("encrypted")(encrypted.asInstanceOf[js.Any])
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (engineVersion != null) __obj.updateDynamic("engineVersion")(engineVersion.asInstanceOf[js.Any])
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (licenseModel != null) __obj.updateDynamic("licenseModel")(licenseModel.asInstanceOf[js.Any])
    if (optionGroupName != null) __obj.updateDynamic("optionGroupName")(optionGroupName.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (snapshotType != null) __obj.updateDynamic("snapshotType")(snapshotType.asInstanceOf[js.Any])
    if (sourceDbSnapshotIdentifier != null) __obj.updateDynamic("sourceDbSnapshotIdentifier")(sourceDbSnapshotIdentifier.asInstanceOf[js.Any])
    if (sourceRegion != null) __obj.updateDynamic("sourceRegion")(sourceRegion.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (storageType != null) __obj.updateDynamic("storageType")(storageType.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotState]
  }
}

