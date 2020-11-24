package typings.pulumiAws.rdsGetOrderableDbInstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOrderableDbInstanceArgs extends js.Object {
  
  /**
    * Availability zone group.
    */
  val availabilityZoneGroup: js.UndefOr[String] = js.native
  
  /**
    * DB engine. Engine values include `aurora`, `aurora-mysql`, `aurora-postgresql`, `docdb`, `mariadb`, `mysql`, `neptune`, `oracle-ee`, `oracle-se`, `oracle-se1`, `oracle-se2`, `postgres`, `sqlserver-ee`, `sqlserver-ex`, `sqlserver-se`, and `sqlserver-web`.
    */
  val engine: String = js.native
  
  /**
    * Version of the DB engine. If none is provided, the AWS-defined default version will be used.
    */
  val engineVersion: js.UndefOr[String] = js.native
  
  /**
    * DB instance class. Examples of classes are `db.m3.2xlarge`, `db.t2.small`, and `db.m3.medium`.
    */
  val instanceClass: js.UndefOr[String] = js.native
  
  /**
    * License model. Examples of license models are `general-public-license`, `bring-your-own-license`, and `amazon-license`.
    */
  val licenseModel: js.UndefOr[String] = js.native
  
  /**
    * Ordered list of preferred RDS DB instance engine versions. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned.
    */
  val preferredEngineVersions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Ordered list of preferred RDS DB instance classes. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned.
    */
  val preferredInstanceClasses: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Storage types. Examples of storage types are `standard`, `io1`, `gp2`, and `aurora`.
    */
  val storageType: js.UndefOr[String] = js.native
  
  /**
    * Enable this to ensure a DB instance supports Enhanced Monitoring at intervals from 1 to 60 seconds.
    */
  val supportsEnhancedMonitoring: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable this to ensure a DB instance supports Aurora global databases with a specific combination of other DB engine attributes.
    */
  val supportsGlobalDatabases: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable this to ensure a DB instance supports IAM database authentication.
    */
  val supportsIamDatabaseAuthentication: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable this to ensure a DB instance supports provisioned IOPS.
    */
  val supportsIops: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable this to ensure a DB instance supports Kerberos Authentication.
    */
  val supportsKerberosAuthentication: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable this to ensure a DB instance supports Performance Insights.
    */
  val supportsPerformanceInsights: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable this to ensure Amazon RDS can automatically scale storage for DB instances that use the specified DB instance class.
    */
  val supportsStorageAutoscaling: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable this to ensure a DB instance supports encrypted storage.
    */
  val supportsStorageEncryption: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean that indicates whether to show only VPC or non-VPC offerings.
    */
  val vpc: js.UndefOr[Boolean] = js.native
}
object GetOrderableDbInstanceArgs {
  
  @scala.inline
  def apply(engine: String): GetOrderableDbInstanceArgs = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOrderableDbInstanceArgs]
  }
  
  @scala.inline
  implicit class GetOrderableDbInstanceArgsOps[Self <: GetOrderableDbInstanceArgs] (val x: Self) extends AnyVal {
    
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
    def setEngine(value: String): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneGroup(value: String): Self = this.set("availabilityZoneGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZoneGroup: Self = this.set("availabilityZoneGroup", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("engineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineVersion: Self = this.set("engineVersion", js.undefined)
    
    @scala.inline
    def setInstanceClass(value: String): Self = this.set("instanceClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceClass: Self = this.set("instanceClass", js.undefined)
    
    @scala.inline
    def setLicenseModel(value: String): Self = this.set("licenseModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseModel: Self = this.set("licenseModel", js.undefined)
    
    @scala.inline
    def setPreferredEngineVersionsVarargs(value: String*): Self = this.set("preferredEngineVersions", js.Array(value :_*))
    
    @scala.inline
    def setPreferredEngineVersions(value: js.Array[String]): Self = this.set("preferredEngineVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredEngineVersions: Self = this.set("preferredEngineVersions", js.undefined)
    
    @scala.inline
    def setPreferredInstanceClassesVarargs(value: String*): Self = this.set("preferredInstanceClasses", js.Array(value :_*))
    
    @scala.inline
    def setPreferredInstanceClasses(value: js.Array[String]): Self = this.set("preferredInstanceClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredInstanceClasses: Self = this.set("preferredInstanceClasses", js.undefined)
    
    @scala.inline
    def setStorageType(value: String): Self = this.set("storageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageType: Self = this.set("storageType", js.undefined)
    
    @scala.inline
    def setSupportsEnhancedMonitoring(value: Boolean): Self = this.set("supportsEnhancedMonitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsEnhancedMonitoring: Self = this.set("supportsEnhancedMonitoring", js.undefined)
    
    @scala.inline
    def setSupportsGlobalDatabases(value: Boolean): Self = this.set("supportsGlobalDatabases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsGlobalDatabases: Self = this.set("supportsGlobalDatabases", js.undefined)
    
    @scala.inline
    def setSupportsIamDatabaseAuthentication(value: Boolean): Self = this.set("supportsIamDatabaseAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsIamDatabaseAuthentication: Self = this.set("supportsIamDatabaseAuthentication", js.undefined)
    
    @scala.inline
    def setSupportsIops(value: Boolean): Self = this.set("supportsIops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsIops: Self = this.set("supportsIops", js.undefined)
    
    @scala.inline
    def setSupportsKerberosAuthentication(value: Boolean): Self = this.set("supportsKerberosAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsKerberosAuthentication: Self = this.set("supportsKerberosAuthentication", js.undefined)
    
    @scala.inline
    def setSupportsPerformanceInsights(value: Boolean): Self = this.set("supportsPerformanceInsights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsPerformanceInsights: Self = this.set("supportsPerformanceInsights", js.undefined)
    
    @scala.inline
    def setSupportsStorageAutoscaling(value: Boolean): Self = this.set("supportsStorageAutoscaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsStorageAutoscaling: Self = this.set("supportsStorageAutoscaling", js.undefined)
    
    @scala.inline
    def setSupportsStorageEncryption(value: Boolean): Self = this.set("supportsStorageEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsStorageEncryption: Self = this.set("supportsStorageEncryption", js.undefined)
    
    @scala.inline
    def setVpc(value: Boolean): Self = this.set("vpc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpc: Self = this.set("vpc", js.undefined)
  }
}
