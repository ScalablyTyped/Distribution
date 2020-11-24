package typings.pulumiAws.rdsInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.enumsRdsMod.InstanceType
import typings.pulumiAws.enumsRdsMod.StorageType
import typings.pulumiAws.inputMod.rds.InstanceRestoreToPointInTime
import typings.pulumiAws.inputMod.rds.InstanceS3Import
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceArgs extends js.Object {
  
  /**
    * The allocated storage in gibibytes. If `maxAllocatedStorage` is configured, this argument represents the initial storage allocation and differences from the configuration will be ignored automatically when Storage Autoscaling occurs.
    */
  val allocatedStorage: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Indicates that major version
    * upgrades are allowed. Changing this parameter does not result in an outage and
    * the change is asynchronously applied as soon as possible.
    */
  val allowMajorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Specifies whether any database modifications
    * are applied immediately, or during the next maintenance window. Default is
    * `false`. See [Amazon RDS Documentation for more
    * information.](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html)
    */
  val applyImmediately: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Indicates that minor engine upgrades
    * will be applied automatically to the DB instance during the maintenance window.
    * Defaults to true.
    */
  val autoMinorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The AZ for the RDS instance.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.native
  
  /**
    * The days to retain backups for. Must be
    * between `0` and `35`. Must be greater than `0` if the database is used as a source for a Read Replica. [See Read Replica][1].
    */
  val backupRetentionPeriod: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The daily time range (in UTC) during which
    * automated backups are created if they are enabled. Example: "09:46-10:16". Must
    * not overlap with `maintenanceWindow`.
    */
  val backupWindow: js.UndefOr[Input[String]] = js.native
  
  /**
    * The identifier of the CA certificate for the DB instance.
    */
  val caCertIdentifier: js.UndefOr[Input[String]] = js.native
  
  /**
    * The character set name to use for DB
    * encoding in Oracle and Microsoft SQL instances (collation). This can't be changed. See [Oracle Character Sets
    * Supported in Amazon RDS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.OracleCharacterSets.html)
    * or [Server-Level Collation for Microsoft SQL Server](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.SQLServer.CommonDBATasks.Collation.html) for more information.
    */
  val characterSetName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Copy all Instance `tags` to snapshots. Default is `false`.
    */
  val copyTagsToSnapshot: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Name of `DB subnet group`. DB instance will
    * be created in the VPC associated with the DB subnet group. If unspecified, will
    * be created in the `default` VPC, or in EC2 Classic, if available. When working
    * with read replicas, it should be specified only if the source database
    * specifies an instance in another AWS Region. See [DBSubnetGroupName in API
    * action CreateDBInstanceReadReplica](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstanceReadReplica.html)
    * for additional read replica contraints.
    */
  val dbSubnetGroupName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies whether to remove automated backups immediately after the DB instance is deleted. Default is `true`.
    */
  val deleteAutomatedBackups: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * If the DB instance should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
    */
  val deletionProtection: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The ID of the Directory Service Active Directory domain to create the instance in.
    */
  val domain: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the IAM role to be used when making API calls to the Directory Service.
    */
  val domainIamRoleName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Set of log types to enable for exporting to CloudWatch logs. If omitted, no logs will be exported. Valid values (depending on `engine`). MySQL and MariaDB: `audit`, `error`, `general`, `slowquery`. PostgreSQL: `postgresql`, `upgrade`. MSSQL: `agent` , `error`. Oracle: `alert`, `audit`, `listener`, `trace`.
    */
  val enabledCloudwatchLogsExports: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * (Required unless a `snapshotIdentifier` or `replicateSourceDb`
    * is provided) The database engine to use.  For supported values, see the Engine parameter in [API action CreateDBInstance](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html).
    * Note that for Amazon Aurora instances the engine must match the `DB cluster`'s engine'.
    * For information on the difference between the available Aurora MySQL engines
    * see [Comparison between Aurora MySQL 1 and Aurora MySQL 2](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AuroraMySQL.Updates.20180206.html)
    * in the Amazon RDS User Guide.
    */
  val engine: js.UndefOr[Input[String]] = js.native
  
  /**
    * The engine version to use. If `autoMinorVersionUpgrade`
    * is enabled, you can provide a prefix of the version such as `5.7` (for `5.7.10`) and
    * this attribute will ignore differences in the patch version automatically (e.g. `5.7.17`).
    * For supported values, see the EngineVersion parameter in [API action CreateDBInstance](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html).
    * Note that for Amazon Aurora instances the engine version must match the `DB cluster`'s engine version'.
    */
  val engineVersion: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of your final DB snapshot
    * when this DB instance is deleted. Must be provided if `skipFinalSnapshot` is
    * set to `false`.
    */
  val finalSnapshotIdentifier: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies whether or
    * mappings of AWS Identity and Access Management (IAM) accounts to database
    * accounts is enabled.
    */
  val iamDatabaseAuthenticationEnabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The name of the RDS instance,
    * if omitted, this provider will assign a random, unique identifier.
    */
  val identifier: js.UndefOr[Input[String]] = js.native
  
  /**
    * Creates a unique
    * identifier beginning with the specified prefix. Conflicts with `identifier`.
    */
  val identifierPrefix: js.UndefOr[Input[String]] = js.native
  
  /**
    * The instance type of the RDS instance.
    */
  val instanceClass: Input[String | InstanceType] = js.native
  
  /**
    * The amount of provisioned IOPS. Setting this implies a
    * storageType of "io1".
    */
  val iops: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The ARN for the KMS encryption key. If creating an
    * encrypted replica, set this to the destination KMS ARN.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.native
  
  /**
    * (Optional, but required for some DB engines, i.e. Oracle
    * SE1) License model information for this DB instance.
    */
  val licenseModel: js.UndefOr[Input[String]] = js.native
  
  /**
    * The window to perform maintenance in.
    * Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00". See [RDS
    * Maintenance Window
    * docs](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow)
    * for more information.
    */
  val maintenanceWindow: js.UndefOr[Input[String]] = js.native
  
  /**
    * When configured, the upper limit to which Amazon RDS can automatically scale the storage of the DB instance. Configuring this will automatically ignore differences to `allocatedStorage`. Must be greater than or equal to `allocatedStorage` or `0` to disable Storage Autoscaling.
    */
  val maxAllocatedStorage: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The interval, in seconds, between points
    * when Enhanced Monitoring metrics are collected for the DB instance. To disable
    * collecting Enhanced Monitoring metrics, specify 0. The default is 0. Valid
    * Values: 0, 1, 5, 10, 15, 30, 60.
    */
  val monitoringInterval: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The ARN for the IAM role that permits RDS
    * to send enhanced monitoring metrics to CloudWatch Logs. You can find more
    * information on the [AWS
    * Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html)
    * what IAM permissions are needed to allow Enhanced Monitoring for RDS Instances.
    */
  val monitoringRoleArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies if the RDS instance is multi-AZ
    */
  val multiAz: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The name of the database to create when the DB instance is created. If this parameter is not specified, no database is created in the DB instance. Note that this does not apply for Oracle or SQL Server engines. See the [AWS documentation](http://docs.aws.amazon.com/cli/latest/reference/rds/create-db-instance.html) for more details on what applies for those engines.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Name of the DB option group to associate.
    */
  val optionGroupName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Name of the DB parameter group to
    * associate.
    */
  val parameterGroupName: js.UndefOr[Input[String]] = js.native
  
  /**
    * (Required unless a `snapshotIdentifier` or `replicateSourceDb`
    * is provided) Password for the master DB user. Note that this may show up in
    * logs, and it will be stored in the state file.
    */
  val password: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies whether Performance Insights are enabled. Defaults to false.
    */
  val performanceInsightsEnabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The ARN for the KMS key to encrypt Performance Insights data. When specifying `performanceInsightsKmsKeyId`, `performanceInsightsEnabled` needs to be set to true. Once KMS key is set, it can never be changed.
    */
  val performanceInsightsKmsKeyId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The amount of time in days to retain Performance Insights data. Either 7 (7 days) or 731 (2 years). When specifying `performanceInsightsRetentionPeriod`, `performanceInsightsEnabled` needs to be set to true. Defaults to '7'.
    */
  val performanceInsightsRetentionPeriod: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The port on which the DB accepts connections.
    */
  val port: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Bool to control if instance is publicly
    * accessible. Default is `false`.
    */
  val publiclyAccessible: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Specifies that this resource is a Replicate
    * database, and to use this value as the source database. This correlates to the
    * `identifier` of another Amazon RDS Database to replicate (if replicating within
    * a single region) or ARN of the Amazon RDS Database to replicate (if replicating
    * cross-region). Note that if you are
    * creating a cross-region replica of an encrypted database you will also need to
    * specify a `kmsKeyId`. See [DB Instance Replication][1] and [Working with
    * PostgreSQL and MySQL Read Replicas](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ReadRepl.html)
    * for more information on using Replication.
    */
  val replicateSourceDb: js.UndefOr[Input[String]] = js.native
  
  /**
    * A configuration block for restoring a DB instance to an arbitrary point in time. Requires the `identifier` argument to be set with the name of the new DB instance to be created. See Restore To Point In Time below for details.
    */
  val restoreToPointInTime: js.UndefOr[Input[InstanceRestoreToPointInTime]] = js.native
  
  /**
    * Restore from a Percona Xtrabackup in S3.  See [Importing Data into an Amazon RDS MySQL DB Instance](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/MySQL.Procedural.Importing.html)
    */
  val s3Import: js.UndefOr[Input[InstanceS3Import]] = js.native
  
  /**
    * List of DB Security Groups to
    * associate. Only used for [DB Instances on the _EC2-Classic_
    * Platform](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.html#USER_VPC.FindDefaultVPC).
    */
  val securityGroupNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Determines whether a final DB snapshot is
    * created before the DB instance is deleted. If true is specified, no DBSnapshot
    * is created. If false is specified, a DB snapshot is created before the DB
    * instance is deleted, using the value from `finalSnapshotIdentifier`. Default
    * is `false`.
    */
  val skipFinalSnapshot: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Specifies whether or not to create this
    * database from a snapshot. This correlates to the snapshot ID you'd find in the
    * RDS console, e.g: rds:production-2015-06-26-06-05.
    */
  val snapshotIdentifier: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies whether the DB instance is
    * encrypted. Note that if you are creating a cross-region read replica this field
    * is ignored and you should instead declare `kmsKeyId` with a valid ARN. The
    * default is `false` if not specified.
    */
  val storageEncrypted: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * One of "standard" (magnetic), "gp2" (general
    * purpose SSD), or "io1" (provisioned IOPS SSD). The default is "io1" if `iops` is
    * specified, "gp2" if not.
    */
  val storageType: js.UndefOr[Input[String | StorageType]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Time zone of the DB instance. `timezone` is currently
    * only supported by Microsoft SQL Server. The `timezone` can only be set on
    * creation. See [MSSQL User
    * Guide](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone)
    * for more information.
    */
  val timezone: js.UndefOr[Input[String]] = js.native
  
  /**
    * (Required unless a `snapshotIdentifier` or `replicateSourceDb`
    * is provided) Username for the master DB user.
    */
  val username: js.UndefOr[Input[String]] = js.native
  
  /**
    * List of VPC security groups to
    * associate.
    */
  val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}
object InstanceArgs {
  
  @scala.inline
  def apply(instanceClass: Input[String | InstanceType]): InstanceArgs = {
    val __obj = js.Dynamic.literal(instanceClass = instanceClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceArgs]
  }
  
  @scala.inline
  implicit class InstanceArgsOps[Self <: InstanceArgs] (val x: Self) extends AnyVal {
    
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
    def setInstanceClass(value: Input[String | InstanceType]): Self = this.set("instanceClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocatedStorage(value: Input[Double]): Self = this.set("allocatedStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllocatedStorage: Self = this.set("allocatedStorage", js.undefined)
    
    @scala.inline
    def setAllowMajorVersionUpgrade(value: Input[Boolean]): Self = this.set("allowMajorVersionUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMajorVersionUpgrade: Self = this.set("allowMajorVersionUpgrade", js.undefined)
    
    @scala.inline
    def setApplyImmediately(value: Input[Boolean]): Self = this.set("applyImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyImmediately: Self = this.set("applyImmediately", js.undefined)
    
    @scala.inline
    def setAutoMinorVersionUpgrade(value: Input[Boolean]): Self = this.set("autoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoMinorVersionUpgrade: Self = this.set("autoMinorVersionUpgrade", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: Input[String]): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("availabilityZone", js.undefined)
    
    @scala.inline
    def setBackupRetentionPeriod(value: Input[Double]): Self = this.set("backupRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupRetentionPeriod: Self = this.set("backupRetentionPeriod", js.undefined)
    
    @scala.inline
    def setBackupWindow(value: Input[String]): Self = this.set("backupWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupWindow: Self = this.set("backupWindow", js.undefined)
    
    @scala.inline
    def setCaCertIdentifier(value: Input[String]): Self = this.set("caCertIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaCertIdentifier: Self = this.set("caCertIdentifier", js.undefined)
    
    @scala.inline
    def setCharacterSetName(value: Input[String]): Self = this.set("characterSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharacterSetName: Self = this.set("characterSetName", js.undefined)
    
    @scala.inline
    def setCopyTagsToSnapshot(value: Input[Boolean]): Self = this.set("copyTagsToSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyTagsToSnapshot: Self = this.set("copyTagsToSnapshot", js.undefined)
    
    @scala.inline
    def setDbSubnetGroupName(value: Input[String]): Self = this.set("dbSubnetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbSubnetGroupName: Self = this.set("dbSubnetGroupName", js.undefined)
    
    @scala.inline
    def setDeleteAutomatedBackups(value: Input[Boolean]): Self = this.set("deleteAutomatedBackups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteAutomatedBackups: Self = this.set("deleteAutomatedBackups", js.undefined)
    
    @scala.inline
    def setDeletionProtection(value: Input[Boolean]): Self = this.set("deletionProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletionProtection: Self = this.set("deletionProtection", js.undefined)
    
    @scala.inline
    def setDomain(value: Input[String]): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setDomainIamRoleName(value: Input[String]): Self = this.set("domainIamRoleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainIamRoleName: Self = this.set("domainIamRoleName", js.undefined)
    
    @scala.inline
    def setEnabledCloudwatchLogsExportsVarargs(value: Input[String]*): Self = this.set("enabledCloudwatchLogsExports", js.Array(value :_*))
    
    @scala.inline
    def setEnabledCloudwatchLogsExports(value: Input[js.Array[Input[String]]]): Self = this.set("enabledCloudwatchLogsExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledCloudwatchLogsExports: Self = this.set("enabledCloudwatchLogsExports", js.undefined)
    
    @scala.inline
    def setEngine(value: Input[String]): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: Input[String]): Self = this.set("engineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineVersion: Self = this.set("engineVersion", js.undefined)
    
    @scala.inline
    def setFinalSnapshotIdentifier(value: Input[String]): Self = this.set("finalSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinalSnapshotIdentifier: Self = this.set("finalSnapshotIdentifier", js.undefined)
    
    @scala.inline
    def setIamDatabaseAuthenticationEnabled(value: Input[Boolean]): Self = this.set("iamDatabaseAuthenticationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamDatabaseAuthenticationEnabled: Self = this.set("iamDatabaseAuthenticationEnabled", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Input[String]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setIdentifierPrefix(value: Input[String]): Self = this.set("identifierPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifierPrefix: Self = this.set("identifierPrefix", js.undefined)
    
    @scala.inline
    def setIops(value: Input[Double]): Self = this.set("iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIops: Self = this.set("iops", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: Input[String]): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("kmsKeyId", js.undefined)
    
    @scala.inline
    def setLicenseModel(value: Input[String]): Self = this.set("licenseModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseModel: Self = this.set("licenseModel", js.undefined)
    
    @scala.inline
    def setMaintenanceWindow(value: Input[String]): Self = this.set("maintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaintenanceWindow: Self = this.set("maintenanceWindow", js.undefined)
    
    @scala.inline
    def setMaxAllocatedStorage(value: Input[Double]): Self = this.set("maxAllocatedStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAllocatedStorage: Self = this.set("maxAllocatedStorage", js.undefined)
    
    @scala.inline
    def setMonitoringInterval(value: Input[Double]): Self = this.set("monitoringInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitoringInterval: Self = this.set("monitoringInterval", js.undefined)
    
    @scala.inline
    def setMonitoringRoleArn(value: Input[String]): Self = this.set("monitoringRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitoringRoleArn: Self = this.set("monitoringRoleArn", js.undefined)
    
    @scala.inline
    def setMultiAz(value: Input[Boolean]): Self = this.set("multiAz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiAz: Self = this.set("multiAz", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOptionGroupName(value: Input[String]): Self = this.set("optionGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionGroupName: Self = this.set("optionGroupName", js.undefined)
    
    @scala.inline
    def setParameterGroupName(value: Input[String]): Self = this.set("parameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterGroupName: Self = this.set("parameterGroupName", js.undefined)
    
    @scala.inline
    def setPassword(value: Input[String]): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPerformanceInsightsEnabled(value: Input[Boolean]): Self = this.set("performanceInsightsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformanceInsightsEnabled: Self = this.set("performanceInsightsEnabled", js.undefined)
    
    @scala.inline
    def setPerformanceInsightsKmsKeyId(value: Input[String]): Self = this.set("performanceInsightsKmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformanceInsightsKmsKeyId: Self = this.set("performanceInsightsKmsKeyId", js.undefined)
    
    @scala.inline
    def setPerformanceInsightsRetentionPeriod(value: Input[Double]): Self = this.set("performanceInsightsRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformanceInsightsRetentionPeriod: Self = this.set("performanceInsightsRetentionPeriod", js.undefined)
    
    @scala.inline
    def setPort(value: Input[Double]): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setPubliclyAccessible(value: Input[Boolean]): Self = this.set("publiclyAccessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePubliclyAccessible: Self = this.set("publiclyAccessible", js.undefined)
    
    @scala.inline
    def setReplicateSourceDb(value: Input[String]): Self = this.set("replicateSourceDb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicateSourceDb: Self = this.set("replicateSourceDb", js.undefined)
    
    @scala.inline
    def setRestoreToPointInTime(value: Input[InstanceRestoreToPointInTime]): Self = this.set("restoreToPointInTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestoreToPointInTime: Self = this.set("restoreToPointInTime", js.undefined)
    
    @scala.inline
    def setS3Import(value: Input[InstanceS3Import]): Self = this.set("s3Import", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Import: Self = this.set("s3Import", js.undefined)
    
    @scala.inline
    def setSecurityGroupNamesVarargs(value: Input[String]*): Self = this.set("securityGroupNames", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupNames(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroupNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroupNames: Self = this.set("securityGroupNames", js.undefined)
    
    @scala.inline
    def setSkipFinalSnapshot(value: Input[Boolean]): Self = this.set("skipFinalSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipFinalSnapshot: Self = this.set("skipFinalSnapshot", js.undefined)
    
    @scala.inline
    def setSnapshotIdentifier(value: Input[String]): Self = this.set("snapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotIdentifier: Self = this.set("snapshotIdentifier", js.undefined)
    
    @scala.inline
    def setStorageEncrypted(value: Input[Boolean]): Self = this.set("storageEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageEncrypted: Self = this.set("storageEncrypted", js.undefined)
    
    @scala.inline
    def setStorageType(value: Input[String | StorageType]): Self = this.set("storageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageType: Self = this.set("storageType", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTimezone(value: Input[String]): Self = this.set("timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
    
    @scala.inline
    def setUsername(value: Input[String]): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupIdsVarargs(value: Input[String]*): Self = this.set("vpcSecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setVpcSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = this.set("vpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcSecurityGroupIds: Self = this.set("vpcSecurityGroupIds", js.undefined)
  }
}
