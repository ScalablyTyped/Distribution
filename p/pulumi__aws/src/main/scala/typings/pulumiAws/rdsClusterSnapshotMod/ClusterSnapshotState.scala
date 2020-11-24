package typings.pulumiAws.rdsClusterSnapshotMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterSnapshotState extends js.Object {
  
  /**
    * Specifies the allocated storage size in gigabytes (GB).
    */
  val allocatedStorage: js.UndefOr[Input[Double]] = js.native
  
  /**
    * List of EC2 Availability Zones that instances in the DB cluster snapshot can be restored in.
    */
  val availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The DB Cluster Identifier from which to take the snapshot.
    */
  val dbClusterIdentifier: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the DB Cluster Snapshot.
    */
  val dbClusterSnapshotArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Identifier for the snapshot.
    */
  val dbClusterSnapshotIdentifier: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies the name of the database engine.
    */
  val engine: js.UndefOr[Input[String]] = js.native
  
  /**
    * Version of the database engine for this DB cluster snapshot.
    */
  val engineVersion: js.UndefOr[Input[String]] = js.native
  
  /**
    * If storageEncrypted is true, the AWS KMS key identifier for the encrypted DB cluster snapshot.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.native
  
  /**
    * License model information for the restored DB cluster.
    */
  val licenseModel: js.UndefOr[Input[String]] = js.native
  
  /**
    * Port that the DB cluster was listening on at the time of the snapshot.
    */
  val port: js.UndefOr[Input[Double]] = js.native
  
  val snapshotType: js.UndefOr[Input[String]] = js.native
  
  val sourceDbClusterSnapshotArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The status of this DB Cluster Snapshot.
    */
  val status: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies whether the DB cluster snapshot is encrypted.
    */
  val storageEncrypted: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * A map of tags to assign to the DB cluster.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The VPC ID associated with the DB cluster snapshot.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}
object ClusterSnapshotState {
  
  @scala.inline
  def apply(): ClusterSnapshotState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterSnapshotState]
  }
  
  @scala.inline
  implicit class ClusterSnapshotStateOps[Self <: ClusterSnapshotState] (val x: Self) extends AnyVal {
    
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
    def setAvailabilityZonesVarargs(value: Input[String]*): Self = this.set("availabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setAvailabilityZones(value: Input[js.Array[Input[String]]]): Self = this.set("availabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("availabilityZones", js.undefined)
    
    @scala.inline
    def setDbClusterIdentifier(value: Input[String]): Self = this.set("dbClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbClusterIdentifier: Self = this.set("dbClusterIdentifier", js.undefined)
    
    @scala.inline
    def setDbClusterSnapshotArn(value: Input[String]): Self = this.set("dbClusterSnapshotArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbClusterSnapshotArn: Self = this.set("dbClusterSnapshotArn", js.undefined)
    
    @scala.inline
    def setDbClusterSnapshotIdentifier(value: Input[String]): Self = this.set("dbClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbClusterSnapshotIdentifier: Self = this.set("dbClusterSnapshotIdentifier", js.undefined)
    
    @scala.inline
    def setEngine(value: Input[String]): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: Input[String]): Self = this.set("engineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineVersion: Self = this.set("engineVersion", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: Input[String]): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("kmsKeyId", js.undefined)
    
    @scala.inline
    def setLicenseModel(value: Input[String]): Self = this.set("licenseModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseModel: Self = this.set("licenseModel", js.undefined)
    
    @scala.inline
    def setPort(value: Input[Double]): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setSnapshotType(value: Input[String]): Self = this.set("snapshotType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotType: Self = this.set("snapshotType", js.undefined)
    
    @scala.inline
    def setSourceDbClusterSnapshotArn(value: Input[String]): Self = this.set("sourceDbClusterSnapshotArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceDbClusterSnapshotArn: Self = this.set("sourceDbClusterSnapshotArn", js.undefined)
    
    @scala.inline
    def setStatus(value: Input[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStorageEncrypted(value: Input[Boolean]): Self = this.set("storageEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageEncrypted: Self = this.set("storageEncrypted", js.undefined)
    
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
