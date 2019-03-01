package typings
package atPulumiAwsLib.rdsGetSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSnapshotResult extends js.Object {
  /**
    * Specifies the allocated storage size in gigabytes (GB).
    */
  val allocatedStorage: scala.Double
  /**
    * Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
    */
  val availabilityZone: java.lang.String
  /**
    * The Amazon Resource Name (ARN) for the DB snapshot.
    */
  val dbSnapshotArn: java.lang.String
  /**
    * Specifies whether the DB snapshot is encrypted.
    */
  val encrypted: scala.Boolean
  /**
    * Specifies the name of the database engine.
    */
  val engine: java.lang.String
  /**
    * Specifies the version of the database engine.
    */
  val engineVersion: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
    */
  val iops: scala.Double
  /**
    * The ARN for the KMS encryption key.
    */
  val kmsKeyId: java.lang.String
  /**
    * License model information for the restored DB instance.
    */
  val licenseModel: java.lang.String
  /**
    * Provides the option group name for the DB snapshot.
    */
  val optionGroupName: java.lang.String
  val port: scala.Double
  /**
    * Provides the time when the snapshot was taken, in Universal Coordinated Time (UTC).
    */
  val snapshotCreateTime: java.lang.String
  /**
    * The DB snapshot Arn that the DB snapshot was copied from. It only has value in case of cross customer or cross region copy.
    */
  val sourceDbSnapshotIdentifier: java.lang.String
  /**
    * The region that the DB snapshot was created in or copied from.
    */
  val sourceRegion: java.lang.String
  /**
    * Specifies the status of this DB snapshot.
    */
  val status: java.lang.String
  /**
    * Specifies the storage type associated with DB snapshot.
    */
  val storageType: java.lang.String
  /**
    * Specifies the ID of the VPC associated with the DB snapshot.
    */
  val vpcId: java.lang.String
}

object GetSnapshotResult {
  @scala.inline
  def apply(
    allocatedStorage: scala.Double,
    availabilityZone: java.lang.String,
    dbSnapshotArn: java.lang.String,
    encrypted: scala.Boolean,
    engine: java.lang.String,
    engineVersion: java.lang.String,
    id: java.lang.String,
    iops: scala.Double,
    kmsKeyId: java.lang.String,
    licenseModel: java.lang.String,
    optionGroupName: java.lang.String,
    port: scala.Double,
    snapshotCreateTime: java.lang.String,
    sourceDbSnapshotIdentifier: java.lang.String,
    sourceRegion: java.lang.String,
    status: java.lang.String,
    storageType: java.lang.String,
    vpcId: java.lang.String
  ): GetSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allocatedStorage")(allocatedStorage)
    __obj.updateDynamic("availabilityZone")(availabilityZone)
    __obj.updateDynamic("dbSnapshotArn")(dbSnapshotArn)
    __obj.updateDynamic("encrypted")(encrypted)
    __obj.updateDynamic("engine")(engine)
    __obj.updateDynamic("engineVersion")(engineVersion)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("iops")(iops)
    __obj.updateDynamic("kmsKeyId")(kmsKeyId)
    __obj.updateDynamic("licenseModel")(licenseModel)
    __obj.updateDynamic("optionGroupName")(optionGroupName)
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("snapshotCreateTime")(snapshotCreateTime)
    __obj.updateDynamic("sourceDbSnapshotIdentifier")(sourceDbSnapshotIdentifier)
    __obj.updateDynamic("sourceRegion")(sourceRegion)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("storageType")(storageType)
    __obj.updateDynamic("vpcId")(vpcId)
    __obj.asInstanceOf[GetSnapshotResult]
  }
}

