package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rdsGetOrderableDbInstanceMod {
  
  @JSImport("@pulumi/aws/rds/getOrderableDbInstance", "getOrderableDbInstance")
  @js.native
  def getOrderableDbInstance(args: GetOrderableDbInstanceArgs): js.Promise[GetOrderableDbInstanceResult] = js.native
  @JSImport("@pulumi/aws/rds/getOrderableDbInstance", "getOrderableDbInstance")
  @js.native
  def getOrderableDbInstance(args: GetOrderableDbInstanceArgs, opts: InvokeOptions): js.Promise[GetOrderableDbInstanceResult] = js.native
  
  @js.native
  trait GetOrderableDbInstanceArgs extends StObject {
    
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
    implicit class GetOrderableDbInstanceArgsMutableBuilder[Self <: GetOrderableDbInstanceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailabilityZoneGroup(value: String): Self = StObject.set(x, "availabilityZoneGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneGroupUndefined: Self = StObject.set(x, "availabilityZoneGroup", js.undefined)
      
      @scala.inline
      def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineVersion(value: String): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
      
      @scala.inline
      def setInstanceClass(value: String): Self = StObject.set(x, "instanceClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceClassUndefined: Self = StObject.set(x, "instanceClass", js.undefined)
      
      @scala.inline
      def setLicenseModel(value: String): Self = StObject.set(x, "licenseModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseModelUndefined: Self = StObject.set(x, "licenseModel", js.undefined)
      
      @scala.inline
      def setPreferredEngineVersions(value: js.Array[String]): Self = StObject.set(x, "preferredEngineVersions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredEngineVersionsUndefined: Self = StObject.set(x, "preferredEngineVersions", js.undefined)
      
      @scala.inline
      def setPreferredEngineVersionsVarargs(value: String*): Self = StObject.set(x, "preferredEngineVersions", js.Array(value :_*))
      
      @scala.inline
      def setPreferredInstanceClasses(value: js.Array[String]): Self = StObject.set(x, "preferredInstanceClasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredInstanceClassesUndefined: Self = StObject.set(x, "preferredInstanceClasses", js.undefined)
      
      @scala.inline
      def setPreferredInstanceClassesVarargs(value: String*): Self = StObject.set(x, "preferredInstanceClasses", js.Array(value :_*))
      
      @scala.inline
      def setStorageType(value: String): Self = StObject.set(x, "storageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageTypeUndefined: Self = StObject.set(x, "storageType", js.undefined)
      
      @scala.inline
      def setSupportsEnhancedMonitoring(value: Boolean): Self = StObject.set(x, "supportsEnhancedMonitoring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsEnhancedMonitoringUndefined: Self = StObject.set(x, "supportsEnhancedMonitoring", js.undefined)
      
      @scala.inline
      def setSupportsGlobalDatabases(value: Boolean): Self = StObject.set(x, "supportsGlobalDatabases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsGlobalDatabasesUndefined: Self = StObject.set(x, "supportsGlobalDatabases", js.undefined)
      
      @scala.inline
      def setSupportsIamDatabaseAuthentication(value: Boolean): Self = StObject.set(x, "supportsIamDatabaseAuthentication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsIamDatabaseAuthenticationUndefined: Self = StObject.set(x, "supportsIamDatabaseAuthentication", js.undefined)
      
      @scala.inline
      def setSupportsIops(value: Boolean): Self = StObject.set(x, "supportsIops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsIopsUndefined: Self = StObject.set(x, "supportsIops", js.undefined)
      
      @scala.inline
      def setSupportsKerberosAuthentication(value: Boolean): Self = StObject.set(x, "supportsKerberosAuthentication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsKerberosAuthenticationUndefined: Self = StObject.set(x, "supportsKerberosAuthentication", js.undefined)
      
      @scala.inline
      def setSupportsPerformanceInsights(value: Boolean): Self = StObject.set(x, "supportsPerformanceInsights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsPerformanceInsightsUndefined: Self = StObject.set(x, "supportsPerformanceInsights", js.undefined)
      
      @scala.inline
      def setSupportsStorageAutoscaling(value: Boolean): Self = StObject.set(x, "supportsStorageAutoscaling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsStorageAutoscalingUndefined: Self = StObject.set(x, "supportsStorageAutoscaling", js.undefined)
      
      @scala.inline
      def setSupportsStorageEncryption(value: Boolean): Self = StObject.set(x, "supportsStorageEncryption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsStorageEncryptionUndefined: Self = StObject.set(x, "supportsStorageEncryption", js.undefined)
      
      @scala.inline
      def setVpc(value: Boolean): Self = StObject.set(x, "vpc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcUndefined: Self = StObject.set(x, "vpc", js.undefined)
    }
  }
  
  @js.native
  trait GetOrderableDbInstanceResult extends StObject {
    
    val availabilityZoneGroup: String = js.native
    
    /**
      * Availability zones where the instance is available.
      */
    val availabilityZones: js.Array[String] = js.native
    
    val engine: String = js.native
    
    val engineVersion: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val instanceClass: String = js.native
    
    val licenseModel: String = js.native
    
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
    
    /**
      * Whether a DB instance supports RDS on Outposts.
      */
    val outpostCapable: Boolean = js.native
    
    val preferredEngineVersions: js.UndefOr[js.Array[String]] = js.native
    
    val preferredInstanceClasses: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Whether a DB instance can have a read replica.
      */
    val readReplicaCapable: Boolean = js.native
    
    val storageType: String = js.native
    
    /**
      * A list of the supported DB engine modes.
      */
    val supportedEngineModes: js.Array[String] = js.native
    
    val supportsEnhancedMonitoring: Boolean = js.native
    
    val supportsGlobalDatabases: Boolean = js.native
    
    val supportsIamDatabaseAuthentication: Boolean = js.native
    
    val supportsIops: Boolean = js.native
    
    val supportsKerberosAuthentication: Boolean = js.native
    
    val supportsPerformanceInsights: Boolean = js.native
    
    val supportsStorageAutoscaling: Boolean = js.native
    
    val supportsStorageEncryption: Boolean = js.native
    
    val vpc: Boolean = js.native
  }
  object GetOrderableDbInstanceResult {
    
    @scala.inline
    def apply(
      availabilityZoneGroup: String,
      availabilityZones: js.Array[String],
      engine: String,
      engineVersion: String,
      id: String,
      instanceClass: String,
      licenseModel: String,
      maxIopsPerDbInstance: Double,
      maxIopsPerGib: Double,
      maxStorageSize: Double,
      minIopsPerDbInstance: Double,
      minIopsPerGib: Double,
      minStorageSize: Double,
      multiAzCapable: Boolean,
      outpostCapable: Boolean,
      readReplicaCapable: Boolean,
      storageType: String,
      supportedEngineModes: js.Array[String],
      supportsEnhancedMonitoring: Boolean,
      supportsGlobalDatabases: Boolean,
      supportsIamDatabaseAuthentication: Boolean,
      supportsIops: Boolean,
      supportsKerberosAuthentication: Boolean,
      supportsPerformanceInsights: Boolean,
      supportsStorageAutoscaling: Boolean,
      supportsStorageEncryption: Boolean,
      vpc: Boolean
    ): GetOrderableDbInstanceResult = {
      val __obj = js.Dynamic.literal(availabilityZoneGroup = availabilityZoneGroup.asInstanceOf[js.Any], availabilityZones = availabilityZones.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instanceClass = instanceClass.asInstanceOf[js.Any], licenseModel = licenseModel.asInstanceOf[js.Any], maxIopsPerDbInstance = maxIopsPerDbInstance.asInstanceOf[js.Any], maxIopsPerGib = maxIopsPerGib.asInstanceOf[js.Any], maxStorageSize = maxStorageSize.asInstanceOf[js.Any], minIopsPerDbInstance = minIopsPerDbInstance.asInstanceOf[js.Any], minIopsPerGib = minIopsPerGib.asInstanceOf[js.Any], minStorageSize = minStorageSize.asInstanceOf[js.Any], multiAzCapable = multiAzCapable.asInstanceOf[js.Any], outpostCapable = outpostCapable.asInstanceOf[js.Any], readReplicaCapable = readReplicaCapable.asInstanceOf[js.Any], storageType = storageType.asInstanceOf[js.Any], supportedEngineModes = supportedEngineModes.asInstanceOf[js.Any], supportsEnhancedMonitoring = supportsEnhancedMonitoring.asInstanceOf[js.Any], supportsGlobalDatabases = supportsGlobalDatabases.asInstanceOf[js.Any], supportsIamDatabaseAuthentication = supportsIamDatabaseAuthentication.asInstanceOf[js.Any], supportsIops = supportsIops.asInstanceOf[js.Any], supportsKerberosAuthentication = supportsKerberosAuthentication.asInstanceOf[js.Any], supportsPerformanceInsights = supportsPerformanceInsights.asInstanceOf[js.Any], supportsStorageAutoscaling = supportsStorageAutoscaling.asInstanceOf[js.Any], supportsStorageEncryption = supportsStorageEncryption.asInstanceOf[js.Any], vpc = vpc.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOrderableDbInstanceResult]
    }
    
    @scala.inline
    implicit class GetOrderableDbInstanceResultMutableBuilder[Self <: GetOrderableDbInstanceResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailabilityZoneGroup(value: String): Self = StObject.set(x, "availabilityZoneGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZones(value: js.Array[String]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
      
      @scala.inline
      def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineVersion(value: String): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceClass(value: String): Self = StObject.set(x, "instanceClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseModel(value: String): Self = StObject.set(x, "licenseModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxIopsPerDbInstance(value: Double): Self = StObject.set(x, "maxIopsPerDbInstance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxIopsPerGib(value: Double): Self = StObject.set(x, "maxIopsPerGib", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxStorageSize(value: Double): Self = StObject.set(x, "maxStorageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinIopsPerDbInstance(value: Double): Self = StObject.set(x, "minIopsPerDbInstance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinIopsPerGib(value: Double): Self = StObject.set(x, "minIopsPerGib", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinStorageSize(value: Double): Self = StObject.set(x, "minStorageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiAzCapable(value: Boolean): Self = StObject.set(x, "multiAzCapable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutpostCapable(value: Boolean): Self = StObject.set(x, "outpostCapable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredEngineVersions(value: js.Array[String]): Self = StObject.set(x, "preferredEngineVersions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredEngineVersionsUndefined: Self = StObject.set(x, "preferredEngineVersions", js.undefined)
      
      @scala.inline
      def setPreferredEngineVersionsVarargs(value: String*): Self = StObject.set(x, "preferredEngineVersions", js.Array(value :_*))
      
      @scala.inline
      def setPreferredInstanceClasses(value: js.Array[String]): Self = StObject.set(x, "preferredInstanceClasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredInstanceClassesUndefined: Self = StObject.set(x, "preferredInstanceClasses", js.undefined)
      
      @scala.inline
      def setPreferredInstanceClassesVarargs(value: String*): Self = StObject.set(x, "preferredInstanceClasses", js.Array(value :_*))
      
      @scala.inline
      def setReadReplicaCapable(value: Boolean): Self = StObject.set(x, "readReplicaCapable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageType(value: String): Self = StObject.set(x, "storageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedEngineModes(value: js.Array[String]): Self = StObject.set(x, "supportedEngineModes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedEngineModesVarargs(value: String*): Self = StObject.set(x, "supportedEngineModes", js.Array(value :_*))
      
      @scala.inline
      def setSupportsEnhancedMonitoring(value: Boolean): Self = StObject.set(x, "supportsEnhancedMonitoring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsGlobalDatabases(value: Boolean): Self = StObject.set(x, "supportsGlobalDatabases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsIamDatabaseAuthentication(value: Boolean): Self = StObject.set(x, "supportsIamDatabaseAuthentication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsIops(value: Boolean): Self = StObject.set(x, "supportsIops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsKerberosAuthentication(value: Boolean): Self = StObject.set(x, "supportsKerberosAuthentication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsPerformanceInsights(value: Boolean): Self = StObject.set(x, "supportsPerformanceInsights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsStorageAutoscaling(value: Boolean): Self = StObject.set(x, "supportsStorageAutoscaling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsStorageEncryption(value: Boolean): Self = StObject.set(x, "supportsStorageEncryption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpc(value: Boolean): Self = StObject.set(x, "vpc", value.asInstanceOf[js.Any])
    }
  }
}
