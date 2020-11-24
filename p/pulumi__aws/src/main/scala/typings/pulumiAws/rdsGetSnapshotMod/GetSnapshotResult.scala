package typings.pulumiAws.rdsGetSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * The provider-assigned unique ID for this managed resource.
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
    vpcId: String
  ): GetSnapshotResult = {
    val __obj = js.Dynamic.literal(allocatedStorage = allocatedStorage.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], dbSnapshotArn = dbSnapshotArn.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], iops = iops.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], licenseModel = licenseModel.asInstanceOf[js.Any], optionGroupName = optionGroupName.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], snapshotCreateTime = snapshotCreateTime.asInstanceOf[js.Any], sourceDbSnapshotIdentifier = sourceDbSnapshotIdentifier.asInstanceOf[js.Any], sourceRegion = sourceRegion.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], storageType = storageType.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSnapshotResult]
  }
  
  @scala.inline
  implicit class GetSnapshotResultOps[Self <: GetSnapshotResult] (val x: Self) extends AnyVal {
    
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
    def setAllocatedStorage(value: Double): Self = this.set("allocatedStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbSnapshotArn(value: String): Self = this.set("dbSnapshotArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncrypted(value: Boolean): Self = this.set("encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngine(value: String): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("engineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIops(value: Double): Self = this.set("iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseModel(value: String): Self = this.set("licenseModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionGroupName(value: String): Self = this.set("optionGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotCreateTime(value: String): Self = this.set("snapshotCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDbSnapshotIdentifier(value: String): Self = this.set("sourceDbSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRegion(value: String): Self = this.set("sourceRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageType(value: String): Self = this.set("storageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcId(value: String): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbInstanceIdentifier(value: String): Self = this.set("dbInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbInstanceIdentifier: Self = this.set("dbInstanceIdentifier", js.undefined)
    
    @scala.inline
    def setDbSnapshotIdentifier(value: String): Self = this.set("dbSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbSnapshotIdentifier: Self = this.set("dbSnapshotIdentifier", js.undefined)
    
    @scala.inline
    def setIncludePublic(value: Boolean): Self = this.set("includePublic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludePublic: Self = this.set("includePublic", js.undefined)
    
    @scala.inline
    def setIncludeShared(value: Boolean): Self = this.set("includeShared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeShared: Self = this.set("includeShared", js.undefined)
    
    @scala.inline
    def setMostRecent(value: Boolean): Self = this.set("mostRecent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMostRecent: Self = this.set("mostRecent", js.undefined)
    
    @scala.inline
    def setSnapshotType(value: String): Self = this.set("snapshotType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotType: Self = this.set("snapshotType", js.undefined)
  }
}
