package typings.pulumiAws.neptuneGetOrderableDbInstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOrderableDbInstanceResult extends js.Object {
  
  /**
    * Availability zones where the instance is available.
    */
  val availabilityZones: js.Array[String] = js.native
  
  val engine: js.UndefOr[String] = js.native
  
  val engineVersion: String = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  val instanceClass: String = js.native
  
  val licenseModel: js.UndefOr[String] = js.native
  
  /**
    * Maximum total provisioned IOPS for a DB instance.
    */
  val maxIopsPerDbInstance: Double = js.native
  
  /**
    * Maximum provisioned IOPS per GiB for a DB instance.
    */
  val maxIopsPerGib: Double = js.native
  
  /**
    * Maximum storage size for a DB instance.
    */
  val maxStorageSize: Double = js.native
  
  /**
    * Minimum total provisioned IOPS for a DB instance.
    */
  val minIopsPerDbInstance: Double = js.native
  
  /**
    * Minimum provisioned IOPS per GiB for a DB instance.
    */
  val minIopsPerGib: Double = js.native
  
  /**
    * Minimum storage size for a DB instance.
    */
  val minStorageSize: Double = js.native
  
  /**
    * Whether a DB instance is Multi-AZ capable.
    */
  val multiAzCapable: Boolean = js.native
  
  val preferredInstanceClasses: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Whether a DB instance can have a read replica.
    */
  val readReplicaCapable: Boolean = js.native
  
  /**
    * The storage type for a DB instance.
    */
  val storageType: String = js.native
  
  /**
    * Whether a DB instance supports Enhanced Monitoring at intervals from 1 to 60 seconds.
    */
  val supportsEnhancedMonitoring: Boolean = js.native
  
  /**
    * Whether a DB instance supports IAM database authentication.
    */
  val supportsIamDatabaseAuthentication: Boolean = js.native
  
  /**
    * Whether a DB instance supports provisioned IOPS.
    */
  val supportsIops: Boolean = js.native
  
  /**
    * Whether a DB instance supports Performance Insights.
    */
  val supportsPerformanceInsights: Boolean = js.native
  
  /**
    * Whether a DB instance supports encrypted storage.
    */
  val supportsStorageEncryption: Boolean = js.native
  
  val vpc: Boolean = js.native
}
object GetOrderableDbInstanceResult {
  
  @scala.inline
  def apply(
    availabilityZones: js.Array[String],
    engineVersion: String,
    id: String,
    instanceClass: String,
    maxIopsPerDbInstance: Double,
    maxIopsPerGib: Double,
    maxStorageSize: Double,
    minIopsPerDbInstance: Double,
    minIopsPerGib: Double,
    minStorageSize: Double,
    multiAzCapable: Boolean,
    readReplicaCapable: Boolean,
    storageType: String,
    supportsEnhancedMonitoring: Boolean,
    supportsIamDatabaseAuthentication: Boolean,
    supportsIops: Boolean,
    supportsPerformanceInsights: Boolean,
    supportsStorageEncryption: Boolean,
    vpc: Boolean
  ): GetOrderableDbInstanceResult = {
    val __obj = js.Dynamic.literal(availabilityZones = availabilityZones.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instanceClass = instanceClass.asInstanceOf[js.Any], maxIopsPerDbInstance = maxIopsPerDbInstance.asInstanceOf[js.Any], maxIopsPerGib = maxIopsPerGib.asInstanceOf[js.Any], maxStorageSize = maxStorageSize.asInstanceOf[js.Any], minIopsPerDbInstance = minIopsPerDbInstance.asInstanceOf[js.Any], minIopsPerGib = minIopsPerGib.asInstanceOf[js.Any], minStorageSize = minStorageSize.asInstanceOf[js.Any], multiAzCapable = multiAzCapable.asInstanceOf[js.Any], readReplicaCapable = readReplicaCapable.asInstanceOf[js.Any], storageType = storageType.asInstanceOf[js.Any], supportsEnhancedMonitoring = supportsEnhancedMonitoring.asInstanceOf[js.Any], supportsIamDatabaseAuthentication = supportsIamDatabaseAuthentication.asInstanceOf[js.Any], supportsIops = supportsIops.asInstanceOf[js.Any], supportsPerformanceInsights = supportsPerformanceInsights.asInstanceOf[js.Any], supportsStorageEncryption = supportsStorageEncryption.asInstanceOf[js.Any], vpc = vpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOrderableDbInstanceResult]
  }
  
  @scala.inline
  implicit class GetOrderableDbInstanceResultOps[Self <: GetOrderableDbInstanceResult] (val x: Self) extends AnyVal {
    
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
    def setAvailabilityZonesVarargs(value: String*): Self = this.set("availabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setAvailabilityZones(value: js.Array[String]): Self = this.set("availabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("engineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceClass(value: String): Self = this.set("instanceClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxIopsPerDbInstance(value: Double): Self = this.set("maxIopsPerDbInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxIopsPerGib(value: Double): Self = this.set("maxIopsPerGib", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxStorageSize(value: Double): Self = this.set("maxStorageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinIopsPerDbInstance(value: Double): Self = this.set("minIopsPerDbInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinIopsPerGib(value: Double): Self = this.set("minIopsPerGib", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinStorageSize(value: Double): Self = this.set("minStorageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiAzCapable(value: Boolean): Self = this.set("multiAzCapable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadReplicaCapable(value: Boolean): Self = this.set("readReplicaCapable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageType(value: String): Self = this.set("storageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsEnhancedMonitoring(value: Boolean): Self = this.set("supportsEnhancedMonitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsIamDatabaseAuthentication(value: Boolean): Self = this.set("supportsIamDatabaseAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsIops(value: Boolean): Self = this.set("supportsIops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsPerformanceInsights(value: Boolean): Self = this.set("supportsPerformanceInsights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsStorageEncryption(value: Boolean): Self = this.set("supportsStorageEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpc(value: Boolean): Self = this.set("vpc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngine(value: String): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("engine", js.undefined)
    
    @scala.inline
    def setLicenseModel(value: String): Self = this.set("licenseModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseModel: Self = this.set("licenseModel", js.undefined)
    
    @scala.inline
    def setPreferredInstanceClassesVarargs(value: String*): Self = this.set("preferredInstanceClasses", js.Array(value :_*))
    
    @scala.inline
    def setPreferredInstanceClasses(value: js.Array[String]): Self = this.set("preferredInstanceClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredInstanceClasses: Self = this.set("preferredInstanceClasses", js.undefined)
  }
}
