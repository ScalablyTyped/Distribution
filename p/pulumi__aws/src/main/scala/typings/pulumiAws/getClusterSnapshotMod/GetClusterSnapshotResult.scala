package typings.pulumiAws.getClusterSnapshotMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetClusterSnapshotResult extends js.Object {
  
  /**
    * Specifies the allocated storage size in gigabytes (GB).
    */
  val allocatedStorage: Double = js.native
  
  /**
    * List of EC2 Availability Zones that instances in the DB cluster snapshot can be restored in.
    */
  val availabilityZones: js.Array[String] = js.native
  
  /**
    * Specifies the DB cluster identifier of the DB cluster that this DB cluster snapshot was created from.
    */
  val dbClusterIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the DB Cluster Snapshot.
    */
  val dbClusterSnapshotArn: String = js.native
  
  val dbClusterSnapshotIdentifier: js.UndefOr[String] = js.native
  
  /**
    * Specifies the name of the database engine.
    */
  val engine: String = js.native
  
  /**
    * Version of the database engine for this DB cluster snapshot.
    */
  val engineVersion: String = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  val includePublic: js.UndefOr[Boolean] = js.native
  
  val includeShared: js.UndefOr[Boolean] = js.native
  
  /**
    * If storageEncrypted is true, the AWS KMS key identifier for the encrypted DB cluster snapshot.
    */
  val kmsKeyId: String = js.native
  
  /**
    * License model information for the restored DB cluster.
    */
  val licenseModel: String = js.native
  
  val mostRecent: js.UndefOr[Boolean] = js.native
  
  /**
    * Port that the DB cluster was listening on at the time of the snapshot.
    */
  val port: Double = js.native
  
  /**
    * Time when the snapshot was taken, in Universal Coordinated Time (UTC).
    */
  val snapshotCreateTime: String = js.native
  
  val snapshotType: js.UndefOr[String] = js.native
  
  val sourceDbClusterSnapshotArn: String = js.native
  
  /**
    * The status of this DB Cluster Snapshot.
    */
  val status: String = js.native
  
  /**
    * Specifies whether the DB cluster snapshot is encrypted.
    */
  val storageEncrypted: Boolean = js.native
  
  /**
    * A map of tags for the resource.
    */
  val tags: StringDictionary[String] = js.native
  
  /**
    * The VPC ID associated with the DB cluster snapshot.
    */
  val vpcId: String = js.native
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
    tags: StringDictionary[String],
    vpcId: String
  ): GetClusterSnapshotResult = {
    val __obj = js.Dynamic.literal(allocatedStorage = allocatedStorage.asInstanceOf[js.Any], availabilityZones = availabilityZones.asInstanceOf[js.Any], dbClusterSnapshotArn = dbClusterSnapshotArn.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], licenseModel = licenseModel.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], snapshotCreateTime = snapshotCreateTime.asInstanceOf[js.Any], sourceDbClusterSnapshotArn = sourceDbClusterSnapshotArn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], storageEncrypted = storageEncrypted.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterSnapshotResult]
  }
  
  @scala.inline
  implicit class GetClusterSnapshotResultOps[Self <: GetClusterSnapshotResult] (val x: Self) extends AnyVal {
    
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
    def setAvailabilityZonesVarargs(value: String*): Self = this.set("availabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setAvailabilityZones(value: js.Array[String]): Self = this.set("availabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbClusterSnapshotArn(value: String): Self = this.set("dbClusterSnapshotArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngine(value: String): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("engineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseModel(value: String): Self = this.set("licenseModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotCreateTime(value: String): Self = this.set("snapshotCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDbClusterSnapshotArn(value: String): Self = this.set("sourceDbClusterSnapshotArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageEncrypted(value: Boolean): Self = this.set("storageEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcId(value: String): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbClusterIdentifier(value: String): Self = this.set("dbClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbClusterIdentifier: Self = this.set("dbClusterIdentifier", js.undefined)
    
    @scala.inline
    def setDbClusterSnapshotIdentifier(value: String): Self = this.set("dbClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbClusterSnapshotIdentifier: Self = this.set("dbClusterSnapshotIdentifier", js.undefined)
    
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
