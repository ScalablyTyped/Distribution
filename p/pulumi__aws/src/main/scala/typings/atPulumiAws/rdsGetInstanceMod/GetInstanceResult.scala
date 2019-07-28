package typings.atPulumiAws.rdsGetInstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceResult extends js.Object {
  /**
    * The hostname of the RDS instance. See also `endpoint` and `port`.
    */
  val address: String
  /**
    * Specifies the allocated storage size specified in gigabytes.
    */
  val allocatedStorage: Double
  /**
    * Indicates that minor version patches are applied automatically.
    */
  val autoMinorVersionUpgrade: Boolean
  /**
    * Specifies the name of the Availability Zone the DB instance is located in.
    */
  val availabilityZone: String
  /**
    * Specifies the number of days for which automatic DB snapshots are retained.
    */
  val backupRetentionPeriod: Double
  /**
    * Specifies the identifier of the CA certificate for the DB instance.
    */
  val caCertIdentifier: String
  /**
    * If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance is a member of.
    */
  val dbClusterIdentifier: String
  /**
    * The Amazon Resource Name (ARN) for the DB instance.
    */
  val dbInstanceArn: String
  /**
    * Contains the name of the compute and memory capacity class of the DB instance.
    */
  val dbInstanceClass: String
  val dbInstanceIdentifier: String
  /**
    * Specifies the port that the DB instance listens on.
    */
  val dbInstancePort: Double
  /**
    * Contains the name of the initial database of this instance that was provided at create time, if one was specified when the DB instance was created. This same name is returned for the life of the DB instance.
    */
  val dbName: String
  /**
    * Provides the list of DB parameter groups applied to this DB instance.
    */
  val dbParameterGroups: js.Array[String]
  /**
    * Provides List of DB security groups associated to this DB instance.
    */
  val dbSecurityGroups: js.Array[String]
  /**
    * Specifies the name of the subnet group associated with the DB instance.
    */
  val dbSubnetGroup: String
  /**
    * List of log types to export to cloudwatch.
    */
  val enabledCloudwatchLogsExports: js.Array[String]
  /**
    * The connection endpoint in `address:port` format.
    */
  val endpoint: String
  /**
    * Provides the name of the database engine to be used for this DB instance.
    */
  val engine: String
  /**
    * Indicates the database engine version.
    */
  val engineVersion: String
  /**
    * The canonical hosted zone ID of the DB instance (to be used in a Route 53 Alias record).
    */
  val hostedZoneId: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * Specifies the Provisioned IOPS (I/O operations per second) value.
    */
  val iops: Double
  /**
    * If StorageEncrypted is true, the KMS key identifier for the encrypted DB instance.
    */
  val kmsKeyId: String
  /**
    * License model information for this DB instance.
    */
  val licenseModel: String
  /**
    * Contains the master username for the DB instance.
    */
  val masterUsername: String
  /**
    * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance.
    */
  val monitoringInterval: Double
  /**
    * The ARN for the IAM role that permits RDS to send Enhanced Monitoring metrics to CloudWatch Logs.
    */
  val monitoringRoleArn: String
  /**
    * Specifies if the DB instance is a Multi-AZ deployment.
    */
  val multiAz: Boolean
  /**
    * Provides the list of option group memberships for this DB instance.
    */
  val optionGroupMemberships: js.Array[String]
  /**
    * The database port.
    */
  val port: Double
  /**
    * Specifies the daily time range during which automated backups are created.
    */
  val preferredBackupWindow: String
  /**
    * Specifies the weekly time range during which system maintenance can occur in UTC.
    */
  val preferredMaintenanceWindow: String
  /**
    * Specifies the accessibility options for the DB instance.
    */
  val publiclyAccessible: Boolean
  /**
    * The identifier of the source DB that this is a replica of.
    */
  val replicateSourceDb: String
  /**
    * The RDS Resource ID of this instance.
    */
  val resourceId: String
  /**
    * Specifies whether the DB instance is encrypted.
    */
  val storageEncrypted: Boolean
  /**
    * Specifies the storage type associated with DB instance.
    */
  val storageType: String
  /**
    * The time zone of the DB instance.
    */
  val timezone: String
  /**
    * Provides a list of VPC security group elements that the DB instance belongs to.
    */
  val vpcSecurityGroups: js.Array[String]
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
    timezone: String,
    vpcSecurityGroups: js.Array[String]
  ): GetInstanceResult = {
    val __obj = js.Dynamic.literal(address = address, allocatedStorage = allocatedStorage, autoMinorVersionUpgrade = autoMinorVersionUpgrade, availabilityZone = availabilityZone, backupRetentionPeriod = backupRetentionPeriod, caCertIdentifier = caCertIdentifier, dbClusterIdentifier = dbClusterIdentifier, dbInstanceArn = dbInstanceArn, dbInstanceClass = dbInstanceClass, dbInstanceIdentifier = dbInstanceIdentifier, dbInstancePort = dbInstancePort, dbName = dbName, dbParameterGroups = dbParameterGroups, dbSecurityGroups = dbSecurityGroups, dbSubnetGroup = dbSubnetGroup, enabledCloudwatchLogsExports = enabledCloudwatchLogsExports, endpoint = endpoint, engine = engine, engineVersion = engineVersion, hostedZoneId = hostedZoneId, id = id, iops = iops, kmsKeyId = kmsKeyId, licenseModel = licenseModel, masterUsername = masterUsername, monitoringInterval = monitoringInterval, monitoringRoleArn = monitoringRoleArn, multiAz = multiAz, optionGroupMemberships = optionGroupMemberships, port = port, preferredBackupWindow = preferredBackupWindow, preferredMaintenanceWindow = preferredMaintenanceWindow, publiclyAccessible = publiclyAccessible, replicateSourceDb = replicateSourceDb, resourceId = resourceId, storageEncrypted = storageEncrypted, storageType = storageType, timezone = timezone, vpcSecurityGroups = vpcSecurityGroups)
  
    __obj.asInstanceOf[GetInstanceResult]
  }
}

