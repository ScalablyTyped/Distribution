package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rdsGetOrderableDbInstanceMod {
  
  @JSImport("@pulumi/aws/rds/getOrderableDbInstance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOrderableDbInstance(args: GetOrderableDbInstanceArgs): js.Promise[GetOrderableDbInstanceResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrderableDbInstance")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetOrderableDbInstanceResult]]
  inline def getOrderableDbInstance(args: GetOrderableDbInstanceArgs, opts: InvokeOptions): js.Promise[GetOrderableDbInstanceResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOrderableDbInstance")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetOrderableDbInstanceResult]]
  
  trait GetOrderableDbInstanceArgs extends StObject {
    
    /**
      * Availability zone group.
      */
    val availabilityZoneGroup: js.UndefOr[String] = js.undefined
    
    /**
      * DB engine. Engine values include `aurora`, `aurora-mysql`, `aurora-postgresql`, `docdb`, `mariadb`, `mysql`, `neptune`, `oracle-ee`, `oracle-se`, `oracle-se1`, `oracle-se2`, `postgres`, `sqlserver-ee`, `sqlserver-ex`, `sqlserver-se`, and `sqlserver-web`.
      */
    val engine: String
    
    /**
      * Version of the DB engine. If none is provided, the AWS-defined default version will be used.
      */
    val engineVersion: js.UndefOr[String] = js.undefined
    
    /**
      * DB instance class. Examples of classes are `db.m3.2xlarge`, `db.t2.small`, and `db.m3.medium`.
      */
    val instanceClass: js.UndefOr[String] = js.undefined
    
    /**
      * License model. Examples of license models are `general-public-license`, `bring-your-own-license`, and `amazon-license`.
      */
    val licenseModel: js.UndefOr[String] = js.undefined
    
    /**
      * Ordered list of preferred RDS DB instance engine versions. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned.
      */
    val preferredEngineVersions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Ordered list of preferred RDS DB instance classes. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned.
      */
    val preferredInstanceClasses: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Storage types. Examples of storage types are `standard`, `io1`, `gp2`, and `aurora`.
      */
    val storageType: js.UndefOr[String] = js.undefined
    
    /**
      * Enable this to ensure a DB instance supports Enhanced Monitoring at intervals from 1 to 60 seconds.
      */
    val supportsEnhancedMonitoring: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable this to ensure a DB instance supports Aurora global databases with a specific combination of other DB engine attributes.
      */
    val supportsGlobalDatabases: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable this to ensure a DB instance supports IAM database authentication.
      */
    val supportsIamDatabaseAuthentication: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable this to ensure a DB instance supports provisioned IOPS.
      */
    val supportsIops: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable this to ensure a DB instance supports Kerberos Authentication.
      */
    val supportsKerberosAuthentication: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable this to ensure a DB instance supports Performance Insights.
      */
    val supportsPerformanceInsights: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable this to ensure Amazon RDS can automatically scale storage for DB instances that use the specified DB instance class.
      */
    val supportsStorageAutoscaling: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable this to ensure a DB instance supports encrypted storage.
      */
    val supportsStorageEncryption: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean that indicates whether to show only VPC or non-VPC offerings.
      */
    val vpc: js.UndefOr[Boolean] = js.undefined
  }
  object GetOrderableDbInstanceArgs {
    
    inline def apply(engine: String): GetOrderableDbInstanceArgs = {
      val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOrderableDbInstanceArgs]
    }
    
    extension [Self <: GetOrderableDbInstanceArgs](x: Self) {
      
      inline def setAvailabilityZoneGroup(value: String): Self = StObject.set(x, "availabilityZoneGroup", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZoneGroupUndefined: Self = StObject.set(x, "availabilityZoneGroup", js.undefined)
      
      inline def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setEngineVersion(value: String): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      inline def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
      
      inline def setInstanceClass(value: String): Self = StObject.set(x, "instanceClass", value.asInstanceOf[js.Any])
      
      inline def setInstanceClassUndefined: Self = StObject.set(x, "instanceClass", js.undefined)
      
      inline def setLicenseModel(value: String): Self = StObject.set(x, "licenseModel", value.asInstanceOf[js.Any])
      
      inline def setLicenseModelUndefined: Self = StObject.set(x, "licenseModel", js.undefined)
      
      inline def setPreferredEngineVersions(value: js.Array[String]): Self = StObject.set(x, "preferredEngineVersions", value.asInstanceOf[js.Any])
      
      inline def setPreferredEngineVersionsUndefined: Self = StObject.set(x, "preferredEngineVersions", js.undefined)
      
      inline def setPreferredEngineVersionsVarargs(value: String*): Self = StObject.set(x, "preferredEngineVersions", js.Array(value :_*))
      
      inline def setPreferredInstanceClasses(value: js.Array[String]): Self = StObject.set(x, "preferredInstanceClasses", value.asInstanceOf[js.Any])
      
      inline def setPreferredInstanceClassesUndefined: Self = StObject.set(x, "preferredInstanceClasses", js.undefined)
      
      inline def setPreferredInstanceClassesVarargs(value: String*): Self = StObject.set(x, "preferredInstanceClasses", js.Array(value :_*))
      
      inline def setStorageType(value: String): Self = StObject.set(x, "storageType", value.asInstanceOf[js.Any])
      
      inline def setStorageTypeUndefined: Self = StObject.set(x, "storageType", js.undefined)
      
      inline def setSupportsEnhancedMonitoring(value: Boolean): Self = StObject.set(x, "supportsEnhancedMonitoring", value.asInstanceOf[js.Any])
      
      inline def setSupportsEnhancedMonitoringUndefined: Self = StObject.set(x, "supportsEnhancedMonitoring", js.undefined)
      
      inline def setSupportsGlobalDatabases(value: Boolean): Self = StObject.set(x, "supportsGlobalDatabases", value.asInstanceOf[js.Any])
      
      inline def setSupportsGlobalDatabasesUndefined: Self = StObject.set(x, "supportsGlobalDatabases", js.undefined)
      
      inline def setSupportsIamDatabaseAuthentication(value: Boolean): Self = StObject.set(x, "supportsIamDatabaseAuthentication", value.asInstanceOf[js.Any])
      
      inline def setSupportsIamDatabaseAuthenticationUndefined: Self = StObject.set(x, "supportsIamDatabaseAuthentication", js.undefined)
      
      inline def setSupportsIops(value: Boolean): Self = StObject.set(x, "supportsIops", value.asInstanceOf[js.Any])
      
      inline def setSupportsIopsUndefined: Self = StObject.set(x, "supportsIops", js.undefined)
      
      inline def setSupportsKerberosAuthentication(value: Boolean): Self = StObject.set(x, "supportsKerberosAuthentication", value.asInstanceOf[js.Any])
      
      inline def setSupportsKerberosAuthenticationUndefined: Self = StObject.set(x, "supportsKerberosAuthentication", js.undefined)
      
      inline def setSupportsPerformanceInsights(value: Boolean): Self = StObject.set(x, "supportsPerformanceInsights", value.asInstanceOf[js.Any])
      
      inline def setSupportsPerformanceInsightsUndefined: Self = StObject.set(x, "supportsPerformanceInsights", js.undefined)
      
      inline def setSupportsStorageAutoscaling(value: Boolean): Self = StObject.set(x, "supportsStorageAutoscaling", value.asInstanceOf[js.Any])
      
      inline def setSupportsStorageAutoscalingUndefined: Self = StObject.set(x, "supportsStorageAutoscaling", js.undefined)
      
      inline def setSupportsStorageEncryption(value: Boolean): Self = StObject.set(x, "supportsStorageEncryption", value.asInstanceOf[js.Any])
      
      inline def setSupportsStorageEncryptionUndefined: Self = StObject.set(x, "supportsStorageEncryption", js.undefined)
      
      inline def setVpc(value: Boolean): Self = StObject.set(x, "vpc", value.asInstanceOf[js.Any])
      
      inline def setVpcUndefined: Self = StObject.set(x, "vpc", js.undefined)
    }
  }
  
  trait GetOrderableDbInstanceResult extends StObject {
    
    val availabilityZoneGroup: String
    
    /**
      * Availability zones where the instance is available.
      */
    val availabilityZones: js.Array[String]
    
    val engine: String
    
    val engineVersion: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val instanceClass: String
    
    val licenseModel: String
    
    /**
      * Maximum total provisioned IOPS for a DB instance.
      */
    val maxIopsPerDbInstance: Double
    
    /**
      * Maximum provisioned IOPS per GiB for a DB instance.
      */
    val maxIopsPerGib: Double
    
    /**
      * Maximum storage size for a DB instance.
      */
    val maxStorageSize: Double
    
    /**
      * Minimum total provisioned IOPS for a DB instance.
      */
    val minIopsPerDbInstance: Double
    
    /**
      * Minimum provisioned IOPS per GiB for a DB instance.
      */
    val minIopsPerGib: Double
    
    /**
      * Minimum storage size for a DB instance.
      */
    val minStorageSize: Double
    
    /**
      * Whether a DB instance is Multi-AZ capable.
      */
    val multiAzCapable: Boolean
    
    /**
      * Whether a DB instance supports RDS on Outposts.
      */
    val outpostCapable: Boolean
    
    val preferredEngineVersions: js.UndefOr[js.Array[String]] = js.undefined
    
    val preferredInstanceClasses: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Whether a DB instance can have a read replica.
      */
    val readReplicaCapable: Boolean
    
    val storageType: String
    
    /**
      * A list of the supported DB engine modes.
      */
    val supportedEngineModes: js.Array[String]
    
    val supportsEnhancedMonitoring: Boolean
    
    val supportsGlobalDatabases: Boolean
    
    val supportsIamDatabaseAuthentication: Boolean
    
    val supportsIops: Boolean
    
    val supportsKerberosAuthentication: Boolean
    
    val supportsPerformanceInsights: Boolean
    
    val supportsStorageAutoscaling: Boolean
    
    val supportsStorageEncryption: Boolean
    
    val vpc: Boolean
  }
  object GetOrderableDbInstanceResult {
    
    inline def apply(
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
    
    extension [Self <: GetOrderableDbInstanceResult](x: Self) {
      
      inline def setAvailabilityZoneGroup(value: String): Self = StObject.set(x, "availabilityZoneGroup", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZones(value: js.Array[String]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
      
      inline def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setEngineVersion(value: String): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInstanceClass(value: String): Self = StObject.set(x, "instanceClass", value.asInstanceOf[js.Any])
      
      inline def setLicenseModel(value: String): Self = StObject.set(x, "licenseModel", value.asInstanceOf[js.Any])
      
      inline def setMaxIopsPerDbInstance(value: Double): Self = StObject.set(x, "maxIopsPerDbInstance", value.asInstanceOf[js.Any])
      
      inline def setMaxIopsPerGib(value: Double): Self = StObject.set(x, "maxIopsPerGib", value.asInstanceOf[js.Any])
      
      inline def setMaxStorageSize(value: Double): Self = StObject.set(x, "maxStorageSize", value.asInstanceOf[js.Any])
      
      inline def setMinIopsPerDbInstance(value: Double): Self = StObject.set(x, "minIopsPerDbInstance", value.asInstanceOf[js.Any])
      
      inline def setMinIopsPerGib(value: Double): Self = StObject.set(x, "minIopsPerGib", value.asInstanceOf[js.Any])
      
      inline def setMinStorageSize(value: Double): Self = StObject.set(x, "minStorageSize", value.asInstanceOf[js.Any])
      
      inline def setMultiAzCapable(value: Boolean): Self = StObject.set(x, "multiAzCapable", value.asInstanceOf[js.Any])
      
      inline def setOutpostCapable(value: Boolean): Self = StObject.set(x, "outpostCapable", value.asInstanceOf[js.Any])
      
      inline def setPreferredEngineVersions(value: js.Array[String]): Self = StObject.set(x, "preferredEngineVersions", value.asInstanceOf[js.Any])
      
      inline def setPreferredEngineVersionsUndefined: Self = StObject.set(x, "preferredEngineVersions", js.undefined)
      
      inline def setPreferredEngineVersionsVarargs(value: String*): Self = StObject.set(x, "preferredEngineVersions", js.Array(value :_*))
      
      inline def setPreferredInstanceClasses(value: js.Array[String]): Self = StObject.set(x, "preferredInstanceClasses", value.asInstanceOf[js.Any])
      
      inline def setPreferredInstanceClassesUndefined: Self = StObject.set(x, "preferredInstanceClasses", js.undefined)
      
      inline def setPreferredInstanceClassesVarargs(value: String*): Self = StObject.set(x, "preferredInstanceClasses", js.Array(value :_*))
      
      inline def setReadReplicaCapable(value: Boolean): Self = StObject.set(x, "readReplicaCapable", value.asInstanceOf[js.Any])
      
      inline def setStorageType(value: String): Self = StObject.set(x, "storageType", value.asInstanceOf[js.Any])
      
      inline def setSupportedEngineModes(value: js.Array[String]): Self = StObject.set(x, "supportedEngineModes", value.asInstanceOf[js.Any])
      
      inline def setSupportedEngineModesVarargs(value: String*): Self = StObject.set(x, "supportedEngineModes", js.Array(value :_*))
      
      inline def setSupportsEnhancedMonitoring(value: Boolean): Self = StObject.set(x, "supportsEnhancedMonitoring", value.asInstanceOf[js.Any])
      
      inline def setSupportsGlobalDatabases(value: Boolean): Self = StObject.set(x, "supportsGlobalDatabases", value.asInstanceOf[js.Any])
      
      inline def setSupportsIamDatabaseAuthentication(value: Boolean): Self = StObject.set(x, "supportsIamDatabaseAuthentication", value.asInstanceOf[js.Any])
      
      inline def setSupportsIops(value: Boolean): Self = StObject.set(x, "supportsIops", value.asInstanceOf[js.Any])
      
      inline def setSupportsKerberosAuthentication(value: Boolean): Self = StObject.set(x, "supportsKerberosAuthentication", value.asInstanceOf[js.Any])
      
      inline def setSupportsPerformanceInsights(value: Boolean): Self = StObject.set(x, "supportsPerformanceInsights", value.asInstanceOf[js.Any])
      
      inline def setSupportsStorageAutoscaling(value: Boolean): Self = StObject.set(x, "supportsStorageAutoscaling", value.asInstanceOf[js.Any])
      
      inline def setSupportsStorageEncryption(value: Boolean): Self = StObject.set(x, "supportsStorageEncryption", value.asInstanceOf[js.Any])
      
      inline def setVpc(value: Boolean): Self = StObject.set(x, "vpc", value.asInstanceOf[js.Any])
    }
  }
}
