package typings.pulumiAws.rdsSnapshotMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotState extends js.Object {
  /**
    * Specifies the allocated storage size in gigabytes (GB).
    */
  val allocatedStorage: js.UndefOr[Input[Double]] = js.native
  /**
    * Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.native
  /**
    * The DB Instance Identifier from which to take the snapshot.
    */
  val dbInstanceIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) for the DB snapshot.
    */
  val dbSnapshotArn: js.UndefOr[Input[String]] = js.native
  /**
    * The Identifier for the snapshot.
    */
  val dbSnapshotIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies whether the DB snapshot is encrypted.
    */
  val encrypted: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specifies the name of the database engine.
    */
  val engine: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the version of the database engine.
    */
  val engineVersion: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
    */
  val iops: js.UndefOr[Input[Double]] = js.native
  /**
    * The ARN for the KMS encryption key.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.native
  /**
    * License model information for the restored DB instance.
    */
  val licenseModel: js.UndefOr[Input[String]] = js.native
  /**
    * Provides the option group name for the DB snapshot.
    */
  val optionGroupName: js.UndefOr[Input[String]] = js.native
  val port: js.UndefOr[Input[Double]] = js.native
  val snapshotType: js.UndefOr[Input[String]] = js.native
  /**
    * The DB snapshot Arn that the DB snapshot was copied from. It only has value in case of cross customer or cross region copy.
    */
  val sourceDbSnapshotIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * The region that the DB snapshot was created in or copied from.
    */
  val sourceRegion: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the status of this DB snapshot.
    */
  val status: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the storage type associated with DB snapshot.
    */
  val storageType: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Specifies the storage type associated with DB snapshot.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}

object SnapshotState {
  @scala.inline
  def apply(): SnapshotState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotState]
  }
  @scala.inline
  implicit class SnapshotStateOps[Self <: SnapshotState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllocatedStorage(value: Input[Double]): Self = this.set("allocatedStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllocatedStorage: Self = this.set("allocatedStorage", js.undefined)
    @scala.inline
    def setAvailabilityZone(value: Input[String]): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("availabilityZone", js.undefined)
    @scala.inline
    def setDbInstanceIdentifier(value: Input[String]): Self = this.set("dbInstanceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDbInstanceIdentifier: Self = this.set("dbInstanceIdentifier", js.undefined)
    @scala.inline
    def setDbSnapshotArn(value: Input[String]): Self = this.set("dbSnapshotArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDbSnapshotArn: Self = this.set("dbSnapshotArn", js.undefined)
    @scala.inline
    def setDbSnapshotIdentifier(value: Input[String]): Self = this.set("dbSnapshotIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDbSnapshotIdentifier: Self = this.set("dbSnapshotIdentifier", js.undefined)
    @scala.inline
    def setEncrypted(value: Input[Boolean]): Self = this.set("encrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncrypted: Self = this.set("encrypted", js.undefined)
    @scala.inline
    def setEngine(value: Input[String]): Self = this.set("engine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngine: Self = this.set("engine", js.undefined)
    @scala.inline
    def setEngineVersion(value: Input[String]): Self = this.set("engineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineVersion: Self = this.set("engineVersion", js.undefined)
    @scala.inline
    def setIops(value: Input[Double]): Self = this.set("iops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIops: Self = this.set("iops", js.undefined)
    @scala.inline
    def setKmsKeyId(value: Input[String]): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("kmsKeyId", js.undefined)
    @scala.inline
    def setLicenseModel(value: Input[String]): Self = this.set("licenseModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenseModel: Self = this.set("licenseModel", js.undefined)
    @scala.inline
    def setOptionGroupName(value: Input[String]): Self = this.set("optionGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionGroupName: Self = this.set("optionGroupName", js.undefined)
    @scala.inline
    def setPort(value: Input[Double]): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setSnapshotType(value: Input[String]): Self = this.set("snapshotType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotType: Self = this.set("snapshotType", js.undefined)
    @scala.inline
    def setSourceDbSnapshotIdentifier(value: Input[String]): Self = this.set("sourceDbSnapshotIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceDbSnapshotIdentifier: Self = this.set("sourceDbSnapshotIdentifier", js.undefined)
    @scala.inline
    def setSourceRegion(value: Input[String]): Self = this.set("sourceRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceRegion: Self = this.set("sourceRegion", js.undefined)
    @scala.inline
    def setStatus(value: Input[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStorageType(value: Input[String]): Self = this.set("storageType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageType: Self = this.set("storageType", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("vpcId", js.undefined)
  }
  
}

