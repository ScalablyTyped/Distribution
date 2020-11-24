package typings.pulumiAws.rdsGetInstanceMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInstanceResult extends js.Object {
  
  /**
    * The hostname of the RDS instance. See also `endpoint` and `port`.
    */
  val address: String = js.native
  
  /**
    * Specifies the allocated storage size specified in gigabytes.
    */
  val allocatedStorage: Double = js.native
  
  /**
    * Indicates that minor version patches are applied automatically.
    */
  val autoMinorVersionUpgrade: Boolean = js.native
  
  /**
    * Specifies the name of the Availability Zone the DB instance is located in.
    */
  val availabilityZone: String = js.native
  
  /**
    * Specifies the number of days for which automatic DB snapshots are retained.
    */
  val backupRetentionPeriod: Double = js.native
  
  /**
    * Specifies the identifier of the CA certificate for the DB instance.
    */
  val caCertIdentifier: String = js.native
  
  /**
    * If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance is a member of.
    */
  val dbClusterIdentifier: String = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the DB instance.
    */
  val dbInstanceArn: String = js.native
  
  /**
    * Contains the name of the compute and memory capacity class of the DB instance.
    */
  val dbInstanceClass: String = js.native
  
  val dbInstanceIdentifier: String = js.native
  
  /**
    * Specifies the port that the DB instance listens on.
    */
  val dbInstancePort: Double = js.native
  
  /**
    * Contains the name of the initial database of this instance that was provided at create time, if one was specified when the DB instance was created. This same name is returned for the life of the DB instance.
    */
  val dbName: String = js.native
  
  /**
    * Provides the list of DB parameter groups applied to this DB instance.
    */
  val dbParameterGroups: js.Array[String] = js.native
  
  /**
    * Provides List of DB security groups associated to this DB instance.
    */
  val dbSecurityGroups: js.Array[String] = js.native
  
  /**
    * Specifies the name of the subnet group associated with the DB instance.
    */
  val dbSubnetGroup: String = js.native
  
  /**
    * List of log types to export to cloudwatch.
    */
  val enabledCloudwatchLogsExports: js.Array[String] = js.native
  
  /**
    * The connection endpoint in `address:port` format.
    */
  val endpoint: String = js.native
  
  /**
    * Provides the name of the database engine to be used for this DB instance.
    */
  val engine: String = js.native
  
  /**
    * Indicates the database engine version.
    */
  val engineVersion: String = js.native
  
  /**
    * The canonical hosted zone ID of the DB instance (to be used in a Route 53 Alias record).
    */
  val hostedZoneId: String = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  /**
    * Specifies the Provisioned IOPS (I/O operations per second) value.
    */
  val iops: Double = js.native
  
  /**
    * If StorageEncrypted is true, the KMS key identifier for the encrypted DB instance.
    */
  val kmsKeyId: String = js.native
  
  /**
    * License model information for this DB instance.
    */
  val licenseModel: String = js.native
  
  /**
    * Contains the master username for the DB instance.
    */
  val masterUsername: String = js.native
  
  /**
    * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance.
    */
  val monitoringInterval: Double = js.native
  
  /**
    * The ARN for the IAM role that permits RDS to send Enhanced Monitoring metrics to CloudWatch Logs.
    */
  val monitoringRoleArn: String = js.native
  
  /**
    * Specifies if the DB instance is a Multi-AZ deployment.
    */
  val multiAz: Boolean = js.native
  
  /**
    * Provides the list of option group memberships for this DB instance.
    */
  val optionGroupMemberships: js.Array[String] = js.native
  
  /**
    * The database port.
    */
  val port: Double = js.native
  
  /**
    * Specifies the daily time range during which automated backups are created.
    */
  val preferredBackupWindow: String = js.native
  
  /**
    * Specifies the weekly time range during which system maintenance can occur in UTC.
    */
  val preferredMaintenanceWindow: String = js.native
  
  /**
    * Specifies the accessibility options for the DB instance.
    */
  val publiclyAccessible: Boolean = js.native
  
  /**
    * The identifier of the source DB that this is a replica of.
    */
  val replicateSourceDb: String = js.native
  
  /**
    * The RDS Resource ID of this instance.
    */
  val resourceId: String = js.native
  
  /**
    * Specifies whether the DB instance is encrypted.
    */
  val storageEncrypted: Boolean = js.native
  
  /**
    * Specifies the storage type associated with DB instance.
    */
  val storageType: String = js.native
  
  val tags: StringDictionary[String] = js.native
  
  /**
    * The time zone of the DB instance.
    */
  val timezone: String = js.native
  
  /**
    * Provides a list of VPC security group elements that the DB instance belongs to.
    */
  val vpcSecurityGroups: js.Array[String] = js.native
}
object GetInstanceResult {
  
  @scala.inline
  def apply(
    address: String,
    allocatedStorage: Double,
    autoMinorVersionUpgrade: Boolean,
    availabilityZone: String,
    backupRetentionPeriod: Double,
    caCertIdentifier: String,
    dbClusterIdentifier: String,
    dbInstanceArn: String,
    dbInstanceClass: String,
    dbInstanceIdentifier: String,
    dbInstancePort: Double,
    dbName: String,
    dbParameterGroups: js.Array[String],
    dbSecurityGroups: js.Array[String],
    dbSubnetGroup: String,
    enabledCloudwatchLogsExports: js.Array[String],
    endpoint: String,
    engine: String,
    engineVersion: String,
    hostedZoneId: String,
    id: String,
    iops: Double,
    kmsKeyId: String,
    licenseModel: String,
    masterUsername: String,
    monitoringInterval: Double,
    monitoringRoleArn: String,
    multiAz: Boolean,
    optionGroupMemberships: js.Array[String],
    port: Double,
    preferredBackupWindow: String,
    preferredMaintenanceWindow: String,
    publiclyAccessible: Boolean,
    replicateSourceDb: String,
    resourceId: String,
    storageEncrypted: Boolean,
    storageType: String,
    tags: StringDictionary[String],
    timezone: String,
    vpcSecurityGroups: js.Array[String]
  ): GetInstanceResult = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], allocatedStorage = allocatedStorage.asInstanceOf[js.Any], autoMinorVersionUpgrade = autoMinorVersionUpgrade.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], backupRetentionPeriod = backupRetentionPeriod.asInstanceOf[js.Any], caCertIdentifier = caCertIdentifier.asInstanceOf[js.Any], dbClusterIdentifier = dbClusterIdentifier.asInstanceOf[js.Any], dbInstanceArn = dbInstanceArn.asInstanceOf[js.Any], dbInstanceClass = dbInstanceClass.asInstanceOf[js.Any], dbInstanceIdentifier = dbInstanceIdentifier.asInstanceOf[js.Any], dbInstancePort = dbInstancePort.asInstanceOf[js.Any], dbName = dbName.asInstanceOf[js.Any], dbParameterGroups = dbParameterGroups.asInstanceOf[js.Any], dbSecurityGroups = dbSecurityGroups.asInstanceOf[js.Any], dbSubnetGroup = dbSubnetGroup.asInstanceOf[js.Any], enabledCloudwatchLogsExports = enabledCloudwatchLogsExports.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], hostedZoneId = hostedZoneId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], iops = iops.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], licenseModel = licenseModel.asInstanceOf[js.Any], masterUsername = masterUsername.asInstanceOf[js.Any], monitoringInterval = monitoringInterval.asInstanceOf[js.Any], monitoringRoleArn = monitoringRoleArn.asInstanceOf[js.Any], multiAz = multiAz.asInstanceOf[js.Any], optionGroupMemberships = optionGroupMemberships.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], preferredBackupWindow = preferredBackupWindow.asInstanceOf[js.Any], preferredMaintenanceWindow = preferredMaintenanceWindow.asInstanceOf[js.Any], publiclyAccessible = publiclyAccessible.asInstanceOf[js.Any], replicateSourceDb = replicateSourceDb.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], storageEncrypted = storageEncrypted.asInstanceOf[js.Any], storageType = storageType.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any], vpcSecurityGroups = vpcSecurityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceResult]
  }
  
  @scala.inline
  implicit class GetInstanceResultOps[Self <: GetInstanceResult] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocatedStorage(value: Double): Self = this.set("allocatedStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMinorVersionUpgrade(value: Boolean): Self = this.set("autoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupRetentionPeriod(value: Double): Self = this.set("backupRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaCertIdentifier(value: String): Self = this.set("caCertIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbClusterIdentifier(value: String): Self = this.set("dbClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbInstanceArn(value: String): Self = this.set("dbInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbInstanceClass(value: String): Self = this.set("dbInstanceClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbInstanceIdentifier(value: String): Self = this.set("dbInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbInstancePort(value: Double): Self = this.set("dbInstancePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbName(value: String): Self = this.set("dbName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbParameterGroupsVarargs(value: String*): Self = this.set("dbParameterGroups", js.Array(value :_*))
    
    @scala.inline
    def setDbParameterGroups(value: js.Array[String]): Self = this.set("dbParameterGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbSecurityGroupsVarargs(value: String*): Self = this.set("dbSecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setDbSecurityGroups(value: js.Array[String]): Self = this.set("dbSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbSubnetGroup(value: String): Self = this.set("dbSubnetGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledCloudwatchLogsExportsVarargs(value: String*): Self = this.set("enabledCloudwatchLogsExports", js.Array(value :_*))
    
    @scala.inline
    def setEnabledCloudwatchLogsExports(value: js.Array[String]): Self = this.set("enabledCloudwatchLogsExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngine(value: String): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("engineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedZoneId(value: String): Self = this.set("hostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIops(value: Double): Self = this.set("iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseModel(value: String): Self = this.set("licenseModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterUsername(value: String): Self = this.set("masterUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringInterval(value: Double): Self = this.set("monitoringInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringRoleArn(value: String): Self = this.set("monitoringRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiAz(value: Boolean): Self = this.set("multiAz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionGroupMembershipsVarargs(value: String*): Self = this.set("optionGroupMemberships", js.Array(value :_*))
    
    @scala.inline
    def setOptionGroupMemberships(value: js.Array[String]): Self = this.set("optionGroupMemberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredBackupWindow(value: String): Self = this.set("preferredBackupWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredMaintenanceWindow(value: String): Self = this.set("preferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubliclyAccessible(value: Boolean): Self = this.set("publiclyAccessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicateSourceDb(value: String): Self = this.set("replicateSourceDb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: String): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageEncrypted(value: Boolean): Self = this.set("storageEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageType(value: String): Self = this.set("storageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcSecurityGroupsVarargs(value: String*): Self = this.set("vpcSecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setVpcSecurityGroups(value: js.Array[String]): Self = this.set("vpcSecurityGroups", value.asInstanceOf[js.Any])
  }
}
