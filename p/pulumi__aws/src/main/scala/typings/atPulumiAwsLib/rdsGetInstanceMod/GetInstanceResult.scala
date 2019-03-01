package typings
package atPulumiAwsLib.rdsGetInstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceResult extends js.Object {
  /**
    * The hostname of the RDS instance. See also `endpoint` and `port`.
    */
  val address: java.lang.String
  /**
    * Specifies the allocated storage size specified in gigabytes.
    */
  val allocatedStorage: scala.Double
  /**
    * Indicates that minor version patches are applied automatically.
    */
  val autoMinorVersionUpgrade: scala.Boolean
  /**
    * Specifies the name of the Availability Zone the DB instance is located in.
    */
  val availabilityZone: java.lang.String
  /**
    * Specifies the number of days for which automatic DB snapshots are retained.
    */
  val backupRetentionPeriod: scala.Double
  /**
    * Specifies the identifier of the CA certificate for the DB instance.
    */
  val caCertIdentifier: java.lang.String
  /**
    * If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance is a member of.
    */
  val dbClusterIdentifier: java.lang.String
  /**
    * The Amazon Resource Name (ARN) for the DB instance.
    */
  val dbInstanceArn: java.lang.String
  /**
    * Contains the name of the compute and memory capacity class of the DB instance.
    */
  val dbInstanceClass: java.lang.String
  /**
    * Specifies the port that the DB instance listens on.
    */
  val dbInstancePort: scala.Double
  /**
    * Contains the name of the initial database of this instance that was provided at create time, if one was specified when the DB instance was created. This same name is returned for the life of the DB instance.
    */
  val dbName: java.lang.String
  /**
    * Provides the list of DB parameter groups applied to this DB instance.
    */
  val dbParameterGroups: js.Array[java.lang.String]
  /**
    * Provides List of DB security groups associated to this DB instance.
    */
  val dbSecurityGroups: js.Array[java.lang.String]
  /**
    * Specifies the name of the subnet group associated with the DB instance.
    */
  val dbSubnetGroup: java.lang.String
  /**
    * List of log types to export to cloudwatch.
    */
  val enabledCloudwatchLogsExports: js.Array[java.lang.String]
  /**
    * The connection endpoint in `address:port` format.
    */
  val endpoint: java.lang.String
  /**
    * Provides the name of the database engine to be used for this DB instance.
    */
  val engine: java.lang.String
  /**
    * Indicates the database engine version.
    */
  val engineVersion: java.lang.String
  /**
    * The canonical hosted zone ID of the DB instance (to be used in a Route 53 Alias record).
    */
  val hostedZoneId: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * Specifies the Provisioned IOPS (I/O operations per second) value.
    */
  val iops: scala.Double
  /**
    * If StorageEncrypted is true, the KMS key identifier for the encrypted DB instance.
    */
  val kmsKeyId: java.lang.String
  /**
    * License model information for this DB instance.
    */
  val licenseModel: java.lang.String
  /**
    * Contains the master username for the DB instance.
    */
  val masterUsername: java.lang.String
  /**
    * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance.
    */
  val monitoringInterval: scala.Double
  /**
    * The ARN for the IAM role that permits RDS to send Enhanced Monitoring metrics to CloudWatch Logs.
    */
  val monitoringRoleArn: java.lang.String
  /**
    * Specifies if the DB instance is a Multi-AZ deployment.
    */
  val multiAz: scala.Boolean
  /**
    * Provides the list of option group memberships for this DB instance.
    */
  val optionGroupMemberships: js.Array[java.lang.String]
  /**
    * The database port.
    */
  val port: scala.Double
  /**
    * Specifies the daily time range during which automated backups are created.
    */
  val preferredBackupWindow: java.lang.String
  /**
    * Specifies the weekly time range during which system maintenance can occur in UTC.
    */
  val preferredMaintenanceWindow: java.lang.String
  /**
    * Specifies the accessibility options for the DB instance.
    */
  val publiclyAccessible: scala.Boolean
  /**
    * The identifier of the source DB that this is a replica of.
    */
  val replicateSourceDb: java.lang.String
  /**
    * Specifies whether the DB instance is encrypted.
    */
  val storageEncrypted: scala.Boolean
  /**
    * Specifies the storage type associated with DB instance.
    */
  val storageType: java.lang.String
  /**
    * The time zone of the DB instance.
    */
  val timezone: java.lang.String
  /**
    * Provides a list of VPC security group elements that the DB instance belongs to.
    */
  val vpcSecurityGroups: js.Array[java.lang.String]
}

object GetInstanceResult {
  @scala.inline
  def apply(
    address: java.lang.String,
    allocatedStorage: scala.Double,
    autoMinorVersionUpgrade: scala.Boolean,
    availabilityZone: java.lang.String,
    backupRetentionPeriod: scala.Double,
    caCertIdentifier: java.lang.String,
    dbClusterIdentifier: java.lang.String,
    dbInstanceArn: java.lang.String,
    dbInstanceClass: java.lang.String,
    dbInstancePort: scala.Double,
    dbName: java.lang.String,
    dbParameterGroups: js.Array[java.lang.String],
    dbSecurityGroups: js.Array[java.lang.String],
    dbSubnetGroup: java.lang.String,
    enabledCloudwatchLogsExports: js.Array[java.lang.String],
    endpoint: java.lang.String,
    engine: java.lang.String,
    engineVersion: java.lang.String,
    hostedZoneId: java.lang.String,
    id: java.lang.String,
    iops: scala.Double,
    kmsKeyId: java.lang.String,
    licenseModel: java.lang.String,
    masterUsername: java.lang.String,
    monitoringInterval: scala.Double,
    monitoringRoleArn: java.lang.String,
    multiAz: scala.Boolean,
    optionGroupMemberships: js.Array[java.lang.String],
    port: scala.Double,
    preferredBackupWindow: java.lang.String,
    preferredMaintenanceWindow: java.lang.String,
    publiclyAccessible: scala.Boolean,
    replicateSourceDb: java.lang.String,
    storageEncrypted: scala.Boolean,
    storageType: java.lang.String,
    timezone: java.lang.String,
    vpcSecurityGroups: js.Array[java.lang.String]
  ): GetInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("allocatedStorage")(allocatedStorage)
    __obj.updateDynamic("autoMinorVersionUpgrade")(autoMinorVersionUpgrade)
    __obj.updateDynamic("availabilityZone")(availabilityZone)
    __obj.updateDynamic("backupRetentionPeriod")(backupRetentionPeriod)
    __obj.updateDynamic("caCertIdentifier")(caCertIdentifier)
    __obj.updateDynamic("dbClusterIdentifier")(dbClusterIdentifier)
    __obj.updateDynamic("dbInstanceArn")(dbInstanceArn)
    __obj.updateDynamic("dbInstanceClass")(dbInstanceClass)
    __obj.updateDynamic("dbInstancePort")(dbInstancePort)
    __obj.updateDynamic("dbName")(dbName)
    __obj.updateDynamic("dbParameterGroups")(dbParameterGroups)
    __obj.updateDynamic("dbSecurityGroups")(dbSecurityGroups)
    __obj.updateDynamic("dbSubnetGroup")(dbSubnetGroup)
    __obj.updateDynamic("enabledCloudwatchLogsExports")(enabledCloudwatchLogsExports)
    __obj.updateDynamic("endpoint")(endpoint)
    __obj.updateDynamic("engine")(engine)
    __obj.updateDynamic("engineVersion")(engineVersion)
    __obj.updateDynamic("hostedZoneId")(hostedZoneId)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("iops")(iops)
    __obj.updateDynamic("kmsKeyId")(kmsKeyId)
    __obj.updateDynamic("licenseModel")(licenseModel)
    __obj.updateDynamic("masterUsername")(masterUsername)
    __obj.updateDynamic("monitoringInterval")(monitoringInterval)
    __obj.updateDynamic("monitoringRoleArn")(monitoringRoleArn)
    __obj.updateDynamic("multiAz")(multiAz)
    __obj.updateDynamic("optionGroupMemberships")(optionGroupMemberships)
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("preferredBackupWindow")(preferredBackupWindow)
    __obj.updateDynamic("preferredMaintenanceWindow")(preferredMaintenanceWindow)
    __obj.updateDynamic("publiclyAccessible")(publiclyAccessible)
    __obj.updateDynamic("replicateSourceDb")(replicateSourceDb)
    __obj.updateDynamic("storageEncrypted")(storageEncrypted)
    __obj.updateDynamic("storageType")(storageType)
    __obj.updateDynamic("timezone")(timezone)
    __obj.updateDynamic("vpcSecurityGroups")(vpcSecurityGroups)
    __obj.asInstanceOf[GetInstanceResult]
  }
}

