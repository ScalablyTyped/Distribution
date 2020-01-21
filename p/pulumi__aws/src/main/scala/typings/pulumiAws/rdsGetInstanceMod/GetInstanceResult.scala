package typings.pulumiAws.rdsGetInstanceMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * id is the provider-assigned unique ID for this managed resource.
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
  val tags: StringDictionary[js.Any] = js.native
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
    tags: StringDictionary[js.Any],
    timezone: String,
    vpcSecurityGroups: js.Array[String]
  ): GetInstanceResult = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], allocatedStorage = allocatedStorage.asInstanceOf[js.Any], autoMinorVersionUpgrade = autoMinorVersionUpgrade.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], backupRetentionPeriod = backupRetentionPeriod.asInstanceOf[js.Any], caCertIdentifier = caCertIdentifier.asInstanceOf[js.Any], dbClusterIdentifier = dbClusterIdentifier.asInstanceOf[js.Any], dbInstanceArn = dbInstanceArn.asInstanceOf[js.Any], dbInstanceClass = dbInstanceClass.asInstanceOf[js.Any], dbInstanceIdentifier = dbInstanceIdentifier.asInstanceOf[js.Any], dbInstancePort = dbInstancePort.asInstanceOf[js.Any], dbName = dbName.asInstanceOf[js.Any], dbParameterGroups = dbParameterGroups.asInstanceOf[js.Any], dbSecurityGroups = dbSecurityGroups.asInstanceOf[js.Any], dbSubnetGroup = dbSubnetGroup.asInstanceOf[js.Any], enabledCloudwatchLogsExports = enabledCloudwatchLogsExports.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], hostedZoneId = hostedZoneId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], iops = iops.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], licenseModel = licenseModel.asInstanceOf[js.Any], masterUsername = masterUsername.asInstanceOf[js.Any], monitoringInterval = monitoringInterval.asInstanceOf[js.Any], monitoringRoleArn = monitoringRoleArn.asInstanceOf[js.Any], multiAz = multiAz.asInstanceOf[js.Any], optionGroupMemberships = optionGroupMemberships.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], preferredBackupWindow = preferredBackupWindow.asInstanceOf[js.Any], preferredMaintenanceWindow = preferredMaintenanceWindow.asInstanceOf[js.Any], publiclyAccessible = publiclyAccessible.asInstanceOf[js.Any], replicateSourceDb = replicateSourceDb.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], storageEncrypted = storageEncrypted.asInstanceOf[js.Any], storageType = storageType.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any], vpcSecurityGroups = vpcSecurityGroups.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetInstanceResult]
  }
}

