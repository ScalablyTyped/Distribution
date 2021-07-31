package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.enumsRdsMod.InstanceType
import typings.pulumiAws.enumsRdsMod.StorageType
import typings.pulumiAws.outputMod.rds.InstanceRestoreToPointInTime
import typings.pulumiAws.outputMod.rds.InstanceS3Import
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rdsInstanceMod {
  
  @JSImport("@pulumi/aws/rds/instance", "Instance")
  @js.native
  class Instance protected () extends CustomResource {
    /**
      * Create a Instance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: InstanceArgs) = this()
    def this(name: String, args: InstanceArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The hostname of the RDS instance. See also `endpoint` and `port`.
      */
    val address: Output_[String] = js.native
    
    /**
      * The allocated storage in gibibytes. If `maxAllocatedStorage` is configured, this argument represents the initial storage allocation and differences from the configuration will be ignored automatically when Storage Autoscaling occurs.
      */
    val allocatedStorage: Output_[Double] = js.native
    
    /**
      * Indicates that major version
      * upgrades are allowed. Changing this parameter does not result in an outage and
      * the change is asynchronously applied as soon as possible.
      */
    val allowMajorVersionUpgrade: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Specifies whether any database modifications
      * are applied immediately, or during the next maintenance window. Default is
      * `false`. See [Amazon RDS Documentation for more
      * information.](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html)
      */
    val applyImmediately: Output_[Boolean] = js.native
    
    /**
      * The ARN of the RDS instance.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Indicates that minor engine upgrades
      * will be applied automatically to the DB instance during the maintenance window.
      * Defaults to true.
      */
    val autoMinorVersionUpgrade: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The AZ for the RDS instance.
      */
    val availabilityZone: Output_[String] = js.native
    
    /**
      * The days to retain backups for. Must be
      * between `0` and `35`. Must be greater than `0` if the database is used as a source for a Read Replica. [See Read Replica][1].
      */
    val backupRetentionPeriod: Output_[Double] = js.native
    
    /**
      * The daily time range (in UTC) during which
      * automated backups are created if they are enabled. Example: "09:46-10:16". Must
      * not overlap with `maintenanceWindow`.
      */
    val backupWindow: Output_[String] = js.native
    
    /**
      * The identifier of the CA certificate for the DB instance.
      */
    val caCertIdentifier: Output_[String] = js.native
    
    /**
      * The character set name to use for DB
      * encoding in Oracle and Microsoft SQL instances (collation). This can't be changed. See [Oracle Character Sets
      * Supported in Amazon RDS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.OracleCharacterSets.html)
      * or [Server-Level Collation for Microsoft SQL Server](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.SQLServer.CommonDBATasks.Collation.html) for more information.
      */
    val characterSetName: Output_[String] = js.native
    
    /**
      * Copy all Instance `tags` to snapshots. Default is `false`.
      */
    val copyTagsToSnapshot: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Name of `DB subnet group`. DB instance will
      * be created in the VPC associated with the DB subnet group. If unspecified, will
      * be created in the `default` VPC, or in EC2 Classic, if available. When working
      * with read replicas, it should be specified only if the source database
      * specifies an instance in another AWS Region. See [DBSubnetGroupName in API
      * action CreateDBInstanceReadReplica](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstanceReadReplica.html)
      * for additional read replica contraints.
      */
    val dbSubnetGroupName: Output_[String] = js.native
    
    /**
      * Specifies whether to remove automated backups immediately after the DB instance is deleted. Default is `true`.
      */
    val deleteAutomatedBackups: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * If the DB instance should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
      */
    val deletionProtection: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The ID of the Directory Service Active Directory domain to create the instance in.
      */
    val domain: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the IAM role to be used when making API calls to the Directory Service.
      */
    val domainIamRoleName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Set of log types to enable for exporting to CloudWatch logs. If omitted, no logs will be exported. Valid values (depending on `engine`). MySQL and MariaDB: `audit`, `error`, `general`, `slowquery`. PostgreSQL: `postgresql`, `upgrade`. MSSQL: `agent` , `error`. Oracle: `alert`, `audit`, `listener`, `trace`.
      */
    val enabledCloudwatchLogsExports: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The connection endpoint in `address:port` format.
      */
    val endpoint: Output_[String] = js.native
    
    /**
      * (Required unless a `snapshotIdentifier` or `replicateSourceDb`
      * is provided) The database engine to use.  For supported values, see the Engine parameter in [API action CreateDBInstance](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html).
      * Note that for Amazon Aurora instances the engine must match the `DB cluster`'s engine'.
      * For information on the difference between the available Aurora MySQL engines
      * see [Comparison between Aurora MySQL 1 and Aurora MySQL 2](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AuroraMySQL.Updates.20180206.html)
      * in the Amazon RDS User Guide.
      */
    val engine: Output_[String] = js.native
    
    /**
      * The engine version to use. If `autoMinorVersionUpgrade`
      * is enabled, you can provide a prefix of the version such as `5.7` (for `5.7.10`) and
      * this attribute will ignore differences in the patch version automatically (e.g. `5.7.17`).
      * For supported values, see the EngineVersion parameter in [API action CreateDBInstance](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html).
      * Note that for Amazon Aurora instances the engine version must match the `DB cluster`'s engine version'.
      */
    val engineVersion: Output_[String] = js.native
    
    /**
      * The name of your final DB snapshot
      * when this DB instance is deleted. Must be provided if `skipFinalSnapshot` is
      * set to `false`.
      */
    val finalSnapshotIdentifier: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The canonical hosted zone ID of the DB instance (to be used
      * in a Route 53 Alias record).
      */
    val hostedZoneId: Output_[String] = js.native
    
    /**
      * Specifies whether or
      * mappings of AWS Identity and Access Management (IAM) accounts to database
      * accounts is enabled.
      */
    val iamDatabaseAuthenticationEnabled: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The name of the RDS instance,
      * if omitted, this provider will assign a random, unique identifier.
      */
    val identifier: Output_[String] = js.native
    
    /**
      * Creates a unique
      * identifier beginning with the specified prefix. Conflicts with `identifier`.
      */
    val identifierPrefix: Output_[String] = js.native
    
    /**
      * The instance type of the RDS instance.
      */
    val instanceClass: Output_[String] = js.native
    
    /**
      * The amount of provisioned IOPS. Setting this implies a
      * storageType of "io1".
      */
    val iops: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The ARN for the KMS encryption key. If creating an
      * encrypted replica, set this to the destination KMS ARN.
      */
    val kmsKeyId: Output_[String] = js.native
    
    /**
      * The latest time, in UTC [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8), to which a database can be restored with point-in-time restore.
      */
    val latestRestorableTime: Output_[String] = js.native
    
    /**
      * (Optional, but required for some DB engines, i.e. Oracle
      * SE1) License model information for this DB instance.
      */
    val licenseModel: Output_[String] = js.native
    
    /**
      * The window to perform maintenance in.
      * Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00". See [RDS
      * Maintenance Window
      * docs](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow)
      * for more information.
      */
    val maintenanceWindow: Output_[String] = js.native
    
    /**
      * When configured, the upper limit to which Amazon RDS can automatically scale the storage of the DB instance. Configuring this will automatically ignore differences to `allocatedStorage`. Must be greater than or equal to `allocatedStorage` or `0` to disable Storage Autoscaling.
      */
    val maxAllocatedStorage: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The interval, in seconds, between points
      * when Enhanced Monitoring metrics are collected for the DB instance. To disable
      * collecting Enhanced Monitoring metrics, specify 0. The default is 0. Valid
      * Values: 0, 1, 5, 10, 15, 30, 60.
      */
    val monitoringInterval: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The ARN for the IAM role that permits RDS
      * to send enhanced monitoring metrics to CloudWatch Logs. You can find more
      * information on the [AWS
      * Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html)
      * what IAM permissions are needed to allow Enhanced Monitoring for RDS Instances.
      */
    val monitoringRoleArn: Output_[String] = js.native
    
    /**
      * Specifies if the RDS instance is multi-AZ
      */
    val multiAz: Output_[Boolean] = js.native
    
    /**
      * The name of the database to create when the DB instance is created. If this parameter is not specified, no database is created in the DB instance. Note that this does not apply for Oracle or SQL Server engines. See the [AWS documentation](http://docs.aws.amazon.com/cli/latest/reference/rds/create-db-instance.html) for more details on what applies for those engines.
      */
    val name: Output_[String] = js.native
    
    /**
      * Name of the DB option group to associate.
      */
    val optionGroupName: Output_[String] = js.native
    
    /**
      * Name of the DB parameter group to
      * associate.
      */
    val parameterGroupName: Output_[String] = js.native
    
    /**
      * (Required unless a `snapshotIdentifier` or `replicateSourceDb`
      * is provided) Password for the master DB user. Note that this may show up in
      * logs, and it will be stored in the state file.
      */
    val password: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Specifies whether Performance Insights are enabled. Defaults to false.
      */
    val performanceInsightsEnabled: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The ARN for the KMS key to encrypt Performance Insights data. When specifying `performanceInsightsKmsKeyId`, `performanceInsightsEnabled` needs to be set to true. Once KMS key is set, it can never be changed.
      */
    val performanceInsightsKmsKeyId: Output_[String] = js.native
    
    /**
      * The amount of time in days to retain Performance Insights data. Either 7 (7 days) or 731 (2 years). When specifying `performanceInsightsRetentionPeriod`, `performanceInsightsEnabled` needs to be set to true. Defaults to '7'.
      */
    val performanceInsightsRetentionPeriod: Output_[Double] = js.native
    
    /**
      * The port on which the DB accepts connections.
      */
    val port: Output_[Double] = js.native
    
    /**
      * Bool to control if instance is publicly
      * accessible. Default is `false`.
      */
    val publiclyAccessible: Output_[js.UndefOr[Boolean]] = js.native
    
    val replicas: Output_[js.Array[String]] = js.native
    
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
    val replicateSourceDb: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The RDS Resource ID of this instance.
      */
    val resourceId: Output_[String] = js.native
    
    /**
      * A configuration block for restoring a DB instance to an arbitrary point in time. Requires the `identifier` argument to be set with the name of the new DB instance to be created. See Restore To Point In Time below for details.
      */
    val restoreToPointInTime: Output_[js.UndefOr[InstanceRestoreToPointInTime]] = js.native
    
    /**
      * Restore from a Percona Xtrabackup in S3.  See [Importing Data into an Amazon RDS MySQL DB Instance](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/MySQL.Procedural.Importing.html)
      */
    val s3Import: Output_[js.UndefOr[InstanceS3Import]] = js.native
    
    /**
      * List of DB Security Groups to
      * associate. Only used for [DB Instances on the _EC2-Classic_
      * Platform](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.html#USER_VPC.FindDefaultVPC).
      */
    val securityGroupNames: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * Determines whether a final DB snapshot is
      * created before the DB instance is deleted. If true is specified, no DBSnapshot
      * is created. If false is specified, a DB snapshot is created before the DB
      * instance is deleted, using the value from `finalSnapshotIdentifier`. Default
      * is `false`.
      */
    val skipFinalSnapshot: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Specifies whether or not to create this
      * database from a snapshot. This correlates to the snapshot ID you'd find in the
      * RDS console, e.g: rds:production-2015-06-26-06-05.
      */
    val snapshotIdentifier: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The RDS instance status.
      */
    val status: Output_[String] = js.native
    
    /**
      * Specifies whether the DB instance is
      * encrypted. Note that if you are creating a cross-region read replica this field
      * is ignored and you should instead declare `kmsKeyId` with a valid ARN. The
      * default is `false` if not specified.
      */
    val storageEncrypted: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * One of "standard" (magnetic), "gp2" (general
      * purpose SSD), or "io1" (provisioned IOPS SSD). The default is "io1" if `iops` is
      * specified, "gp2" if not.
      */
    val storageType: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Time zone of the DB instance. `timezone` is currently
      * only supported by Microsoft SQL Server. The `timezone` can only be set on
      * creation. See [MSSQL User
      * Guide](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone)
      * for more information.
      */
    val timezone: Output_[String] = js.native
    
    /**
      * (Required unless a `snapshotIdentifier` or `replicateSourceDb`
      * is provided) Username for the master DB user.
      */
    val username: Output_[String] = js.native
    
    /**
      * List of VPC security groups to
      * associate.
      */
    val vpcSecurityGroupIds: Output_[js.Array[String]] = js.native
  }
  /* static members */
  object Instance {
    
    @JSImport("@pulumi/aws/rds/instance", "Instance")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Instance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Instance]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Instance]
    @scala.inline
    def get(name: String, id: Input[ID], state: InstanceState): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Instance]
    @scala.inline
    def get(name: String, id: Input[ID], state: InstanceState, opts: CustomResourceOptions): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Instance]
    
    /**
      * Returns true if the given object is an instance of Instance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/instance.Instance */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/rds/instance.Instance */ Boolean]
  }
  
  trait InstanceArgs extends StObject {
    
    /**
      * The allocated storage in gibibytes. If `maxAllocatedStorage` is configured, this argument represents the initial storage allocation and differences from the configuration will be ignored automatically when Storage Autoscaling occurs.
      */
    val allocatedStorage: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Indicates that major version
      * upgrades are allowed. Changing this parameter does not result in an outage and
      * the change is asynchronously applied as soon as possible.
      */
    val allowMajorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Specifies whether any database modifications
      * are applied immediately, or during the next maintenance window. Default is
      * `false`. See [Amazon RDS Documentation for more
      * information.](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html)
      */
    val applyImmediately: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Indicates that minor engine upgrades
      * will be applied automatically to the DB instance during the maintenance window.
      * Defaults to true.
      */
    val autoMinorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The AZ for the RDS instance.
      */
    val availabilityZone: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The days to retain backups for. Must be
      * between `0` and `35`. Must be greater than `0` if the database is used as a source for a Read Replica. [See Read Replica][1].
      */
    val backupRetentionPeriod: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The daily time range (in UTC) during which
      * automated backups are created if they are enabled. Example: "09:46-10:16". Must
      * not overlap with `maintenanceWindow`.
      */
    val backupWindow: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The identifier of the CA certificate for the DB instance.
      */
    val caCertIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The character set name to use for DB
      * encoding in Oracle and Microsoft SQL instances (collation). This can't be changed. See [Oracle Character Sets
      * Supported in Amazon RDS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.OracleCharacterSets.html)
      * or [Server-Level Collation for Microsoft SQL Server](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.SQLServer.CommonDBATasks.Collation.html) for more information.
      */
    val characterSetName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Copy all Instance `tags` to snapshots. Default is `false`.
      */
    val copyTagsToSnapshot: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Name of `DB subnet group`. DB instance will
      * be created in the VPC associated with the DB subnet group. If unspecified, will
      * be created in the `default` VPC, or in EC2 Classic, if available. When working
      * with read replicas, it should be specified only if the source database
      * specifies an instance in another AWS Region. See [DBSubnetGroupName in API
      * action CreateDBInstanceReadReplica](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstanceReadReplica.html)
      * for additional read replica contraints.
      */
    val dbSubnetGroupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies whether to remove automated backups immediately after the DB instance is deleted. Default is `true`.
      */
    val deleteAutomatedBackups: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * If the DB instance should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
      */
    val deletionProtection: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The ID of the Directory Service Active Directory domain to create the instance in.
      */
    val domain: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the IAM role to be used when making API calls to the Directory Service.
      */
    val domainIamRoleName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Set of log types to enable for exporting to CloudWatch logs. If omitted, no logs will be exported. Valid values (depending on `engine`). MySQL and MariaDB: `audit`, `error`, `general`, `slowquery`. PostgreSQL: `postgresql`, `upgrade`. MSSQL: `agent` , `error`. Oracle: `alert`, `audit`, `listener`, `trace`.
      */
    val enabledCloudwatchLogsExports: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * (Required unless a `snapshotIdentifier` or `replicateSourceDb`
      * is provided) The database engine to use.  For supported values, see the Engine parameter in [API action CreateDBInstance](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html).
      * Note that for Amazon Aurora instances the engine must match the `DB cluster`'s engine'.
      * For information on the difference between the available Aurora MySQL engines
      * see [Comparison between Aurora MySQL 1 and Aurora MySQL 2](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AuroraMySQL.Updates.20180206.html)
      * in the Amazon RDS User Guide.
      */
    val engine: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The engine version to use. If `autoMinorVersionUpgrade`
      * is enabled, you can provide a prefix of the version such as `5.7` (for `5.7.10`) and
      * this attribute will ignore differences in the patch version automatically (e.g. `5.7.17`).
      * For supported values, see the EngineVersion parameter in [API action CreateDBInstance](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html).
      * Note that for Amazon Aurora instances the engine version must match the `DB cluster`'s engine version'.
      */
    val engineVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of your final DB snapshot
      * when this DB instance is deleted. Must be provided if `skipFinalSnapshot` is
      * set to `false`.
      */
    val finalSnapshotIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies whether or
      * mappings of AWS Identity and Access Management (IAM) accounts to database
      * accounts is enabled.
      */
    val iamDatabaseAuthenticationEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The name of the RDS instance,
      * if omitted, this provider will assign a random, unique identifier.
      */
    val identifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates a unique
      * identifier beginning with the specified prefix. Conflicts with `identifier`.
      */
    val identifierPrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The instance type of the RDS instance.
      */
    val instanceClass: Input[String | InstanceType]
    
    /**
      * The amount of provisioned IOPS. Setting this implies a
      * storageType of "io1".
      */
    val iops: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The ARN for the KMS encryption key. If creating an
      * encrypted replica, set this to the destination KMS ARN.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * (Optional, but required for some DB engines, i.e. Oracle
      * SE1) License model information for this DB instance.
      */
    val licenseModel: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The window to perform maintenance in.
      * Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00". See [RDS
      * Maintenance Window
      * docs](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow)
      * for more information.
      */
    val maintenanceWindow: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * When configured, the upper limit to which Amazon RDS can automatically scale the storage of the DB instance. Configuring this will automatically ignore differences to `allocatedStorage`. Must be greater than or equal to `allocatedStorage` or `0` to disable Storage Autoscaling.
      */
    val maxAllocatedStorage: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The interval, in seconds, between points
      * when Enhanced Monitoring metrics are collected for the DB instance. To disable
      * collecting Enhanced Monitoring metrics, specify 0. The default is 0. Valid
      * Values: 0, 1, 5, 10, 15, 30, 60.
      */
    val monitoringInterval: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The ARN for the IAM role that permits RDS
      * to send enhanced monitoring metrics to CloudWatch Logs. You can find more
      * information on the [AWS
      * Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html)
      * what IAM permissions are needed to allow Enhanced Monitoring for RDS Instances.
      */
    val monitoringRoleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies if the RDS instance is multi-AZ
      */
    val multiAz: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The name of the database to create when the DB instance is created. If this parameter is not specified, no database is created in the DB instance. Note that this does not apply for Oracle or SQL Server engines. See the [AWS documentation](http://docs.aws.amazon.com/cli/latest/reference/rds/create-db-instance.html) for more details on what applies for those engines.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the DB option group to associate.
      */
    val optionGroupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the DB parameter group to
      * associate.
      */
    val parameterGroupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * (Required unless a `snapshotIdentifier` or `replicateSourceDb`
      * is provided) Password for the master DB user. Note that this may show up in
      * logs, and it will be stored in the state file.
      */
    val password: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies whether Performance Insights are enabled. Defaults to false.
      */
    val performanceInsightsEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The ARN for the KMS key to encrypt Performance Insights data. When specifying `performanceInsightsKmsKeyId`, `performanceInsightsEnabled` needs to be set to true. Once KMS key is set, it can never be changed.
      */
    val performanceInsightsKmsKeyId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The amount of time in days to retain Performance Insights data. Either 7 (7 days) or 731 (2 years). When specifying `performanceInsightsRetentionPeriod`, `performanceInsightsEnabled` needs to be set to true. Defaults to '7'.
      */
    val performanceInsightsRetentionPeriod: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The port on which the DB accepts connections.
      */
    val port: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Bool to control if instance is publicly
      * accessible. Default is `false`.
      */
    val publiclyAccessible: js.UndefOr[Input[Boolean]] = js.undefined
    
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
    val replicateSourceDb: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A configuration block for restoring a DB instance to an arbitrary point in time. Requires the `identifier` argument to be set with the name of the new DB instance to be created. See Restore To Point In Time below for details.
      */
    val restoreToPointInTime: js.UndefOr[Input[typings.pulumiAws.inputMod.rds.InstanceRestoreToPointInTime]] = js.undefined
    
    /**
      * Restore from a Percona Xtrabackup in S3.  See [Importing Data into an Amazon RDS MySQL DB Instance](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/MySQL.Procedural.Importing.html)
      */
    val s3Import: js.UndefOr[Input[typings.pulumiAws.inputMod.rds.InstanceS3Import]] = js.undefined
    
    /**
      * List of DB Security Groups to
      * associate. Only used for [DB Instances on the _EC2-Classic_
      * Platform](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.html#USER_VPC.FindDefaultVPC).
      */
    val securityGroupNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Determines whether a final DB snapshot is
      * created before the DB instance is deleted. If true is specified, no DBSnapshot
      * is created. If false is specified, a DB snapshot is created before the DB
      * instance is deleted, using the value from `finalSnapshotIdentifier`. Default
      * is `false`.
      */
    val skipFinalSnapshot: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Specifies whether or not to create this
      * database from a snapshot. This correlates to the snapshot ID you'd find in the
      * RDS console, e.g: rds:production-2015-06-26-06-05.
      */
    val snapshotIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies whether the DB instance is
      * encrypted. Note that if you are creating a cross-region read replica this field
      * is ignored and you should instead declare `kmsKeyId` with a valid ARN. The
      * default is `false` if not specified.
      */
    val storageEncrypted: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * One of "standard" (magnetic), "gp2" (general
      * purpose SSD), or "io1" (provisioned IOPS SSD). The default is "io1" if `iops` is
      * specified, "gp2" if not.
      */
    val storageType: js.UndefOr[Input[String | StorageType]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Time zone of the DB instance. `timezone` is currently
      * only supported by Microsoft SQL Server. The `timezone` can only be set on
      * creation. See [MSSQL User
      * Guide](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone)
      * for more information.
      */
    val timezone: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * (Required unless a `snapshotIdentifier` or `replicateSourceDb`
      * is provided) Username for the master DB user.
      */
    val username: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * List of VPC security groups to
      * associate.
      */
    val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  }
  object InstanceArgs {
    
    @scala.inline
    def apply(instanceClass: Input[String | InstanceType]): InstanceArgs = {
      val __obj = js.Dynamic.literal(instanceClass = instanceClass.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstanceArgs]
    }
    
    @scala.inline
    implicit class InstanceArgsMutableBuilder[Self <: InstanceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllocatedStorage(value: Input[Double]): Self = StObject.set(x, "allocatedStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllocatedStorageUndefined: Self = StObject.set(x, "allocatedStorage", js.undefined)
      
      @scala.inline
      def setAllowMajorVersionUpgrade(value: Input[Boolean]): Self = StObject.set(x, "allowMajorVersionUpgrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowMajorVersionUpgradeUndefined: Self = StObject.set(x, "allowMajorVersionUpgrade", js.undefined)
      
      @scala.inline
      def setApplyImmediately(value: Input[Boolean]): Self = StObject.set(x, "applyImmediately", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyImmediatelyUndefined: Self = StObject.set(x, "applyImmediately", js.undefined)
      
      @scala.inline
      def setAutoMinorVersionUpgrade(value: Input[Boolean]): Self = StObject.set(x, "autoMinorVersionUpgrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "autoMinorVersionUpgrade", js.undefined)
      
      @scala.inline
      def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      @scala.inline
      def setBackupRetentionPeriod(value: Input[Double]): Self = StObject.set(x, "backupRetentionPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupRetentionPeriodUndefined: Self = StObject.set(x, "backupRetentionPeriod", js.undefined)
      
      @scala.inline
      def setBackupWindow(value: Input[String]): Self = StObject.set(x, "backupWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupWindowUndefined: Self = StObject.set(x, "backupWindow", js.undefined)
      
      @scala.inline
      def setCaCertIdentifier(value: Input[String]): Self = StObject.set(x, "caCertIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaCertIdentifierUndefined: Self = StObject.set(x, "caCertIdentifier", js.undefined)
      
      @scala.inline
      def setCharacterSetName(value: Input[String]): Self = StObject.set(x, "characterSetName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterSetNameUndefined: Self = StObject.set(x, "characterSetName", js.undefined)
      
      @scala.inline
      def setCopyTagsToSnapshot(value: Input[Boolean]): Self = StObject.set(x, "copyTagsToSnapshot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyTagsToSnapshotUndefined: Self = StObject.set(x, "copyTagsToSnapshot", js.undefined)
      
      @scala.inline
      def setDbSubnetGroupName(value: Input[String]): Self = StObject.set(x, "dbSubnetGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbSubnetGroupNameUndefined: Self = StObject.set(x, "dbSubnetGroupName", js.undefined)
      
      @scala.inline
      def setDeleteAutomatedBackups(value: Input[Boolean]): Self = StObject.set(x, "deleteAutomatedBackups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteAutomatedBackupsUndefined: Self = StObject.set(x, "deleteAutomatedBackups", js.undefined)
      
      @scala.inline
      def setDeletionProtection(value: Input[Boolean]): Self = StObject.set(x, "deletionProtection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletionProtectionUndefined: Self = StObject.set(x, "deletionProtection", js.undefined)
      
      @scala.inline
      def setDomain(value: Input[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainIamRoleName(value: Input[String]): Self = StObject.set(x, "domainIamRoleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainIamRoleNameUndefined: Self = StObject.set(x, "domainIamRoleName", js.undefined)
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setEnabledCloudwatchLogsExports(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "enabledCloudwatchLogsExports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledCloudwatchLogsExportsUndefined: Self = StObject.set(x, "enabledCloudwatchLogsExports", js.undefined)
      
      @scala.inline
      def setEnabledCloudwatchLogsExportsVarargs(value: Input[String]*): Self = StObject.set(x, "enabledCloudwatchLogsExports", js.Array(value :_*))
      
      @scala.inline
      def setEngine(value: Input[String]): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      @scala.inline
      def setEngineVersion(value: Input[String]): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
      
      @scala.inline
      def setFinalSnapshotIdentifier(value: Input[String]): Self = StObject.set(x, "finalSnapshotIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinalSnapshotIdentifierUndefined: Self = StObject.set(x, "finalSnapshotIdentifier", js.undefined)
      
      @scala.inline
      def setIamDatabaseAuthenticationEnabled(value: Input[Boolean]): Self = StObject.set(x, "iamDatabaseAuthenticationEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamDatabaseAuthenticationEnabledUndefined: Self = StObject.set(x, "iamDatabaseAuthenticationEnabled", js.undefined)
      
      @scala.inline
      def setIdentifier(value: Input[String]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifierPrefix(value: Input[String]): Self = StObject.set(x, "identifierPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifierPrefixUndefined: Self = StObject.set(x, "identifierPrefix", js.undefined)
      
      @scala.inline
      def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
      
      @scala.inline
      def setInstanceClass(value: Input[String | InstanceType]): Self = StObject.set(x, "instanceClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIops(value: Input[Double]): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIopsUndefined: Self = StObject.set(x, "iops", js.undefined)
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setLicenseModel(value: Input[String]): Self = StObject.set(x, "licenseModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseModelUndefined: Self = StObject.set(x, "licenseModel", js.undefined)
      
      @scala.inline
      def setMaintenanceWindow(value: Input[String]): Self = StObject.set(x, "maintenanceWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaintenanceWindowUndefined: Self = StObject.set(x, "maintenanceWindow", js.undefined)
      
      @scala.inline
      def setMaxAllocatedStorage(value: Input[Double]): Self = StObject.set(x, "maxAllocatedStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAllocatedStorageUndefined: Self = StObject.set(x, "maxAllocatedStorage", js.undefined)
      
      @scala.inline
      def setMonitoringInterval(value: Input[Double]): Self = StObject.set(x, "monitoringInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonitoringIntervalUndefined: Self = StObject.set(x, "monitoringInterval", js.undefined)
      
      @scala.inline
      def setMonitoringRoleArn(value: Input[String]): Self = StObject.set(x, "monitoringRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonitoringRoleArnUndefined: Self = StObject.set(x, "monitoringRoleArn", js.undefined)
      
      @scala.inline
      def setMultiAz(value: Input[Boolean]): Self = StObject.set(x, "multiAz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiAzUndefined: Self = StObject.set(x, "multiAz", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOptionGroupName(value: Input[String]): Self = StObject.set(x, "optionGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionGroupNameUndefined: Self = StObject.set(x, "optionGroupName", js.undefined)
      
      @scala.inline
      def setParameterGroupName(value: Input[String]): Self = StObject.set(x, "parameterGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameterGroupNameUndefined: Self = StObject.set(x, "parameterGroupName", js.undefined)
      
      @scala.inline
      def setPassword(value: Input[String]): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setPerformanceInsightsEnabled(value: Input[Boolean]): Self = StObject.set(x, "performanceInsightsEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerformanceInsightsEnabledUndefined: Self = StObject.set(x, "performanceInsightsEnabled", js.undefined)
      
      @scala.inline
      def setPerformanceInsightsKmsKeyId(value: Input[String]): Self = StObject.set(x, "performanceInsightsKmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerformanceInsightsKmsKeyIdUndefined: Self = StObject.set(x, "performanceInsightsKmsKeyId", js.undefined)
      
      @scala.inline
      def setPerformanceInsightsRetentionPeriod(value: Input[Double]): Self = StObject.set(x, "performanceInsightsRetentionPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerformanceInsightsRetentionPeriodUndefined: Self = StObject.set(x, "performanceInsightsRetentionPeriod", js.undefined)
      
      @scala.inline
      def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPubliclyAccessible(value: Input[Boolean]): Self = StObject.set(x, "publiclyAccessible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubliclyAccessibleUndefined: Self = StObject.set(x, "publiclyAccessible", js.undefined)
      
      @scala.inline
      def setReplicateSourceDb(value: Input[String]): Self = StObject.set(x, "replicateSourceDb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicateSourceDbUndefined: Self = StObject.set(x, "replicateSourceDb", js.undefined)
      
      @scala.inline
      def setRestoreToPointInTime(value: Input[typings.pulumiAws.inputMod.rds.InstanceRestoreToPointInTime]): Self = StObject.set(x, "restoreToPointInTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestoreToPointInTimeUndefined: Self = StObject.set(x, "restoreToPointInTime", js.undefined)
      
      @scala.inline
      def setS3Import(value: Input[typings.pulumiAws.inputMod.rds.InstanceS3Import]): Self = StObject.set(x, "s3Import", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3ImportUndefined: Self = StObject.set(x, "s3Import", js.undefined)
      
      @scala.inline
      def setSecurityGroupNames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupNamesUndefined: Self = StObject.set(x, "securityGroupNames", js.undefined)
      
      @scala.inline
      def setSecurityGroupNamesVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupNames", js.Array(value :_*))
      
      @scala.inline
      def setSkipFinalSnapshot(value: Input[Boolean]): Self = StObject.set(x, "skipFinalSnapshot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipFinalSnapshotUndefined: Self = StObject.set(x, "skipFinalSnapshot", js.undefined)
      
      @scala.inline
      def setSnapshotIdentifier(value: Input[String]): Self = StObject.set(x, "snapshotIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotIdentifierUndefined: Self = StObject.set(x, "snapshotIdentifier", js.undefined)
      
      @scala.inline
      def setStorageEncrypted(value: Input[Boolean]): Self = StObject.set(x, "storageEncrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageEncryptedUndefined: Self = StObject.set(x, "storageEncrypted", js.undefined)
      
      @scala.inline
      def setStorageType(value: Input[String | StorageType]): Self = StObject.set(x, "storageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageTypeUndefined: Self = StObject.set(x, "storageType", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTimezone(value: Input[String]): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
      
      @scala.inline
      def setUsername(value: Input[String]): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      @scala.inline
      def setVpcSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "vpcSecurityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "vpcSecurityGroupIds", js.undefined)
      
      @scala.inline
      def setVpcSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "vpcSecurityGroupIds", js.Array(value :_*))
    }
  }
  
  trait InstanceState extends StObject {
    
    /**
      * The hostname of the RDS instance. See also `endpoint` and `port`.
      */
    val address: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The allocated storage in gibibytes. If `maxAllocatedStorage` is configured, this argument represents the initial storage allocation and differences from the configuration will be ignored automatically when Storage Autoscaling occurs.
      */
    val allocatedStorage: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Indicates that major version
      * upgrades are allowed. Changing this parameter does not result in an outage and
      * the change is asynchronously applied as soon as possible.
      */
    val allowMajorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Specifies whether any database modifications
      * are applied immediately, or during the next maintenance window. Default is
      * `false`. See [Amazon RDS Documentation for more
      * information.](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html)
      */
    val applyImmediately: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The ARN of the RDS instance.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Indicates that minor engine upgrades
      * will be applied automatically to the DB instance during the maintenance window.
      * Defaults to true.
      */
    val autoMinorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The AZ for the RDS instance.
      */
    val availabilityZone: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The days to retain backups for. Must be
      * between `0` and `35`. Must be greater than `0` if the database is used as a source for a Read Replica. [See Read Replica][1].
      */
    val backupRetentionPeriod: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The daily time range (in UTC) during which
      * automated backups are created if they are enabled. Example: "09:46-10:16". Must
      * not overlap with `maintenanceWindow`.
      */
    val backupWindow: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The identifier of the CA certificate for the DB instance.
      */
    val caCertIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The character set name to use for DB
      * encoding in Oracle and Microsoft SQL instances (collation). This can't be changed. See [Oracle Character Sets
      * Supported in Amazon RDS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.OracleCharacterSets.html)
      * or [Server-Level Collation for Microsoft SQL Server](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.SQLServer.CommonDBATasks.Collation.html) for more information.
      */
    val characterSetName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Copy all Instance `tags` to snapshots. Default is `false`.
      */
    val copyTagsToSnapshot: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Name of `DB subnet group`. DB instance will
      * be created in the VPC associated with the DB subnet group. If unspecified, will
      * be created in the `default` VPC, or in EC2 Classic, if available. When working
      * with read replicas, it should be specified only if the source database
      * specifies an instance in another AWS Region. See [DBSubnetGroupName in API
      * action CreateDBInstanceReadReplica](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstanceReadReplica.html)
      * for additional read replica contraints.
      */
    val dbSubnetGroupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies whether to remove automated backups immediately after the DB instance is deleted. Default is `true`.
      */
    val deleteAutomatedBackups: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * If the DB instance should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
      */
    val deletionProtection: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The ID of the Directory Service Active Directory domain to create the instance in.
      */
    val domain: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the IAM role to be used when making API calls to the Directory Service.
      */
    val domainIamRoleName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Set of log types to enable for exporting to CloudWatch logs. If omitted, no logs will be exported. Valid values (depending on `engine`). MySQL and MariaDB: `audit`, `error`, `general`, `slowquery`. PostgreSQL: `postgresql`, `upgrade`. MSSQL: `agent` , `error`. Oracle: `alert`, `audit`, `listener`, `trace`.
      */
    val enabledCloudwatchLogsExports: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The connection endpoint in `address:port` format.
      */
    val endpoint: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * (Required unless a `snapshotIdentifier` or `replicateSourceDb`
      * is provided) The database engine to use.  For supported values, see the Engine parameter in [API action CreateDBInstance](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html).
      * Note that for Amazon Aurora instances the engine must match the `DB cluster`'s engine'.
      * For information on the difference between the available Aurora MySQL engines
      * see [Comparison between Aurora MySQL 1 and Aurora MySQL 2](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AuroraMySQL.Updates.20180206.html)
      * in the Amazon RDS User Guide.
      */
    val engine: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The engine version to use. If `autoMinorVersionUpgrade`
      * is enabled, you can provide a prefix of the version such as `5.7` (for `5.7.10`) and
      * this attribute will ignore differences in the patch version automatically (e.g. `5.7.17`).
      * For supported values, see the EngineVersion parameter in [API action CreateDBInstance](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html).
      * Note that for Amazon Aurora instances the engine version must match the `DB cluster`'s engine version'.
      */
    val engineVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of your final DB snapshot
      * when this DB instance is deleted. Must be provided if `skipFinalSnapshot` is
      * set to `false`.
      */
    val finalSnapshotIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The canonical hosted zone ID of the DB instance (to be used
      * in a Route 53 Alias record).
      */
    val hostedZoneId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies whether or
      * mappings of AWS Identity and Access Management (IAM) accounts to database
      * accounts is enabled.
      */
    val iamDatabaseAuthenticationEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The name of the RDS instance,
      * if omitted, this provider will assign a random, unique identifier.
      */
    val identifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates a unique
      * identifier beginning with the specified prefix. Conflicts with `identifier`.
      */
    val identifierPrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The instance type of the RDS instance.
      */
    val instanceClass: js.UndefOr[Input[String | InstanceType]] = js.undefined
    
    /**
      * The amount of provisioned IOPS. Setting this implies a
      * storageType of "io1".
      */
    val iops: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The ARN for the KMS encryption key. If creating an
      * encrypted replica, set this to the destination KMS ARN.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The latest time, in UTC [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8), to which a database can be restored with point-in-time restore.
      */
    val latestRestorableTime: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * (Optional, but required for some DB engines, i.e. Oracle
      * SE1) License model information for this DB instance.
      */
    val licenseModel: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The window to perform maintenance in.
      * Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00". See [RDS
      * Maintenance Window
      * docs](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow)
      * for more information.
      */
    val maintenanceWindow: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * When configured, the upper limit to which Amazon RDS can automatically scale the storage of the DB instance. Configuring this will automatically ignore differences to `allocatedStorage`. Must be greater than or equal to `allocatedStorage` or `0` to disable Storage Autoscaling.
      */
    val maxAllocatedStorage: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The interval, in seconds, between points
      * when Enhanced Monitoring metrics are collected for the DB instance. To disable
      * collecting Enhanced Monitoring metrics, specify 0. The default is 0. Valid
      * Values: 0, 1, 5, 10, 15, 30, 60.
      */
    val monitoringInterval: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The ARN for the IAM role that permits RDS
      * to send enhanced monitoring metrics to CloudWatch Logs. You can find more
      * information on the [AWS
      * Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html)
      * what IAM permissions are needed to allow Enhanced Monitoring for RDS Instances.
      */
    val monitoringRoleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies if the RDS instance is multi-AZ
      */
    val multiAz: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The name of the database to create when the DB instance is created. If this parameter is not specified, no database is created in the DB instance. Note that this does not apply for Oracle or SQL Server engines. See the [AWS documentation](http://docs.aws.amazon.com/cli/latest/reference/rds/create-db-instance.html) for more details on what applies for those engines.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the DB option group to associate.
      */
    val optionGroupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the DB parameter group to
      * associate.
      */
    val parameterGroupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * (Required unless a `snapshotIdentifier` or `replicateSourceDb`
      * is provided) Password for the master DB user. Note that this may show up in
      * logs, and it will be stored in the state file.
      */
    val password: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies whether Performance Insights are enabled. Defaults to false.
      */
    val performanceInsightsEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The ARN for the KMS key to encrypt Performance Insights data. When specifying `performanceInsightsKmsKeyId`, `performanceInsightsEnabled` needs to be set to true. Once KMS key is set, it can never be changed.
      */
    val performanceInsightsKmsKeyId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The amount of time in days to retain Performance Insights data. Either 7 (7 days) or 731 (2 years). When specifying `performanceInsightsRetentionPeriod`, `performanceInsightsEnabled` needs to be set to true. Defaults to '7'.
      */
    val performanceInsightsRetentionPeriod: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The port on which the DB accepts connections.
      */
    val port: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Bool to control if instance is publicly
      * accessible. Default is `false`.
      */
    val publiclyAccessible: js.UndefOr[Input[Boolean]] = js.undefined
    
    val replicas: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
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
    val replicateSourceDb: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The RDS Resource ID of this instance.
      */
    val resourceId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A configuration block for restoring a DB instance to an arbitrary point in time. Requires the `identifier` argument to be set with the name of the new DB instance to be created. See Restore To Point In Time below for details.
      */
    val restoreToPointInTime: js.UndefOr[Input[typings.pulumiAws.inputMod.rds.InstanceRestoreToPointInTime]] = js.undefined
    
    /**
      * Restore from a Percona Xtrabackup in S3.  See [Importing Data into an Amazon RDS MySQL DB Instance](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/MySQL.Procedural.Importing.html)
      */
    val s3Import: js.UndefOr[Input[typings.pulumiAws.inputMod.rds.InstanceS3Import]] = js.undefined
    
    /**
      * List of DB Security Groups to
      * associate. Only used for [DB Instances on the _EC2-Classic_
      * Platform](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.html#USER_VPC.FindDefaultVPC).
      */
    val securityGroupNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Determines whether a final DB snapshot is
      * created before the DB instance is deleted. If true is specified, no DBSnapshot
      * is created. If false is specified, a DB snapshot is created before the DB
      * instance is deleted, using the value from `finalSnapshotIdentifier`. Default
      * is `false`.
      */
    val skipFinalSnapshot: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Specifies whether or not to create this
      * database from a snapshot. This correlates to the snapshot ID you'd find in the
      * RDS console, e.g: rds:production-2015-06-26-06-05.
      */
    val snapshotIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The RDS instance status.
      */
    val status: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies whether the DB instance is
      * encrypted. Note that if you are creating a cross-region read replica this field
      * is ignored and you should instead declare `kmsKeyId` with a valid ARN. The
      * default is `false` if not specified.
      */
    val storageEncrypted: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * One of "standard" (magnetic), "gp2" (general
      * purpose SSD), or "io1" (provisioned IOPS SSD). The default is "io1" if `iops` is
      * specified, "gp2" if not.
      */
    val storageType: js.UndefOr[Input[String | StorageType]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Time zone of the DB instance. `timezone` is currently
      * only supported by Microsoft SQL Server. The `timezone` can only be set on
      * creation. See [MSSQL User
      * Guide](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone)
      * for more information.
      */
    val timezone: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * (Required unless a `snapshotIdentifier` or `replicateSourceDb`
      * is provided) Username for the master DB user.
      */
    val username: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * List of VPC security groups to
      * associate.
      */
    val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  }
  object InstanceState {
    
    @scala.inline
    def apply(): InstanceState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstanceState]
    }
    
    @scala.inline
    implicit class InstanceStateMutableBuilder[Self <: InstanceState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: Input[String]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      @scala.inline
      def setAllocatedStorage(value: Input[Double]): Self = StObject.set(x, "allocatedStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllocatedStorageUndefined: Self = StObject.set(x, "allocatedStorage", js.undefined)
      
      @scala.inline
      def setAllowMajorVersionUpgrade(value: Input[Boolean]): Self = StObject.set(x, "allowMajorVersionUpgrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowMajorVersionUpgradeUndefined: Self = StObject.set(x, "allowMajorVersionUpgrade", js.undefined)
      
      @scala.inline
      def setApplyImmediately(value: Input[Boolean]): Self = StObject.set(x, "applyImmediately", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyImmediatelyUndefined: Self = StObject.set(x, "applyImmediately", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAutoMinorVersionUpgrade(value: Input[Boolean]): Self = StObject.set(x, "autoMinorVersionUpgrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "autoMinorVersionUpgrade", js.undefined)
      
      @scala.inline
      def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      @scala.inline
      def setBackupRetentionPeriod(value: Input[Double]): Self = StObject.set(x, "backupRetentionPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupRetentionPeriodUndefined: Self = StObject.set(x, "backupRetentionPeriod", js.undefined)
      
      @scala.inline
      def setBackupWindow(value: Input[String]): Self = StObject.set(x, "backupWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupWindowUndefined: Self = StObject.set(x, "backupWindow", js.undefined)
      
      @scala.inline
      def setCaCertIdentifier(value: Input[String]): Self = StObject.set(x, "caCertIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaCertIdentifierUndefined: Self = StObject.set(x, "caCertIdentifier", js.undefined)
      
      @scala.inline
      def setCharacterSetName(value: Input[String]): Self = StObject.set(x, "characterSetName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterSetNameUndefined: Self = StObject.set(x, "characterSetName", js.undefined)
      
      @scala.inline
      def setCopyTagsToSnapshot(value: Input[Boolean]): Self = StObject.set(x, "copyTagsToSnapshot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyTagsToSnapshotUndefined: Self = StObject.set(x, "copyTagsToSnapshot", js.undefined)
      
      @scala.inline
      def setDbSubnetGroupName(value: Input[String]): Self = StObject.set(x, "dbSubnetGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbSubnetGroupNameUndefined: Self = StObject.set(x, "dbSubnetGroupName", js.undefined)
      
      @scala.inline
      def setDeleteAutomatedBackups(value: Input[Boolean]): Self = StObject.set(x, "deleteAutomatedBackups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteAutomatedBackupsUndefined: Self = StObject.set(x, "deleteAutomatedBackups", js.undefined)
      
      @scala.inline
      def setDeletionProtection(value: Input[Boolean]): Self = StObject.set(x, "deletionProtection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletionProtectionUndefined: Self = StObject.set(x, "deletionProtection", js.undefined)
      
      @scala.inline
      def setDomain(value: Input[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainIamRoleName(value: Input[String]): Self = StObject.set(x, "domainIamRoleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainIamRoleNameUndefined: Self = StObject.set(x, "domainIamRoleName", js.undefined)
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setEnabledCloudwatchLogsExports(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "enabledCloudwatchLogsExports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledCloudwatchLogsExportsUndefined: Self = StObject.set(x, "enabledCloudwatchLogsExports", js.undefined)
      
      @scala.inline
      def setEnabledCloudwatchLogsExportsVarargs(value: Input[String]*): Self = StObject.set(x, "enabledCloudwatchLogsExports", js.Array(value :_*))
      
      @scala.inline
      def setEndpoint(value: Input[String]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      @scala.inline
      def setEngine(value: Input[String]): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      @scala.inline
      def setEngineVersion(value: Input[String]): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
      
      @scala.inline
      def setFinalSnapshotIdentifier(value: Input[String]): Self = StObject.set(x, "finalSnapshotIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinalSnapshotIdentifierUndefined: Self = StObject.set(x, "finalSnapshotIdentifier", js.undefined)
      
      @scala.inline
      def setHostedZoneId(value: Input[String]): Self = StObject.set(x, "hostedZoneId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostedZoneIdUndefined: Self = StObject.set(x, "hostedZoneId", js.undefined)
      
      @scala.inline
      def setIamDatabaseAuthenticationEnabled(value: Input[Boolean]): Self = StObject.set(x, "iamDatabaseAuthenticationEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamDatabaseAuthenticationEnabledUndefined: Self = StObject.set(x, "iamDatabaseAuthenticationEnabled", js.undefined)
      
      @scala.inline
      def setIdentifier(value: Input[String]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifierPrefix(value: Input[String]): Self = StObject.set(x, "identifierPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifierPrefixUndefined: Self = StObject.set(x, "identifierPrefix", js.undefined)
      
      @scala.inline
      def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
      
      @scala.inline
      def setInstanceClass(value: Input[String | InstanceType]): Self = StObject.set(x, "instanceClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceClassUndefined: Self = StObject.set(x, "instanceClass", js.undefined)
      
      @scala.inline
      def setIops(value: Input[Double]): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIopsUndefined: Self = StObject.set(x, "iops", js.undefined)
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setLatestRestorableTime(value: Input[String]): Self = StObject.set(x, "latestRestorableTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatestRestorableTimeUndefined: Self = StObject.set(x, "latestRestorableTime", js.undefined)
      
      @scala.inline
      def setLicenseModel(value: Input[String]): Self = StObject.set(x, "licenseModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseModelUndefined: Self = StObject.set(x, "licenseModel", js.undefined)
      
      @scala.inline
      def setMaintenanceWindow(value: Input[String]): Self = StObject.set(x, "maintenanceWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaintenanceWindowUndefined: Self = StObject.set(x, "maintenanceWindow", js.undefined)
      
      @scala.inline
      def setMaxAllocatedStorage(value: Input[Double]): Self = StObject.set(x, "maxAllocatedStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAllocatedStorageUndefined: Self = StObject.set(x, "maxAllocatedStorage", js.undefined)
      
      @scala.inline
      def setMonitoringInterval(value: Input[Double]): Self = StObject.set(x, "monitoringInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonitoringIntervalUndefined: Self = StObject.set(x, "monitoringInterval", js.undefined)
      
      @scala.inline
      def setMonitoringRoleArn(value: Input[String]): Self = StObject.set(x, "monitoringRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonitoringRoleArnUndefined: Self = StObject.set(x, "monitoringRoleArn", js.undefined)
      
      @scala.inline
      def setMultiAz(value: Input[Boolean]): Self = StObject.set(x, "multiAz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiAzUndefined: Self = StObject.set(x, "multiAz", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOptionGroupName(value: Input[String]): Self = StObject.set(x, "optionGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionGroupNameUndefined: Self = StObject.set(x, "optionGroupName", js.undefined)
      
      @scala.inline
      def setParameterGroupName(value: Input[String]): Self = StObject.set(x, "parameterGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameterGroupNameUndefined: Self = StObject.set(x, "parameterGroupName", js.undefined)
      
      @scala.inline
      def setPassword(value: Input[String]): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setPerformanceInsightsEnabled(value: Input[Boolean]): Self = StObject.set(x, "performanceInsightsEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerformanceInsightsEnabledUndefined: Self = StObject.set(x, "performanceInsightsEnabled", js.undefined)
      
      @scala.inline
      def setPerformanceInsightsKmsKeyId(value: Input[String]): Self = StObject.set(x, "performanceInsightsKmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerformanceInsightsKmsKeyIdUndefined: Self = StObject.set(x, "performanceInsightsKmsKeyId", js.undefined)
      
      @scala.inline
      def setPerformanceInsightsRetentionPeriod(value: Input[Double]): Self = StObject.set(x, "performanceInsightsRetentionPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerformanceInsightsRetentionPeriodUndefined: Self = StObject.set(x, "performanceInsightsRetentionPeriod", js.undefined)
      
      @scala.inline
      def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPubliclyAccessible(value: Input[Boolean]): Self = StObject.set(x, "publiclyAccessible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubliclyAccessibleUndefined: Self = StObject.set(x, "publiclyAccessible", js.undefined)
      
      @scala.inline
      def setReplicas(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicasUndefined: Self = StObject.set(x, "replicas", js.undefined)
      
      @scala.inline
      def setReplicasVarargs(value: Input[String]*): Self = StObject.set(x, "replicas", js.Array(value :_*))
      
      @scala.inline
      def setReplicateSourceDb(value: Input[String]): Self = StObject.set(x, "replicateSourceDb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicateSourceDbUndefined: Self = StObject.set(x, "replicateSourceDb", js.undefined)
      
      @scala.inline
      def setResourceId(value: Input[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
      
      @scala.inline
      def setRestoreToPointInTime(value: Input[typings.pulumiAws.inputMod.rds.InstanceRestoreToPointInTime]): Self = StObject.set(x, "restoreToPointInTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestoreToPointInTimeUndefined: Self = StObject.set(x, "restoreToPointInTime", js.undefined)
      
      @scala.inline
      def setS3Import(value: Input[typings.pulumiAws.inputMod.rds.InstanceS3Import]): Self = StObject.set(x, "s3Import", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3ImportUndefined: Self = StObject.set(x, "s3Import", js.undefined)
      
      @scala.inline
      def setSecurityGroupNames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupNamesUndefined: Self = StObject.set(x, "securityGroupNames", js.undefined)
      
      @scala.inline
      def setSecurityGroupNamesVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupNames", js.Array(value :_*))
      
      @scala.inline
      def setSkipFinalSnapshot(value: Input[Boolean]): Self = StObject.set(x, "skipFinalSnapshot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipFinalSnapshotUndefined: Self = StObject.set(x, "skipFinalSnapshot", js.undefined)
      
      @scala.inline
      def setSnapshotIdentifier(value: Input[String]): Self = StObject.set(x, "snapshotIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotIdentifierUndefined: Self = StObject.set(x, "snapshotIdentifier", js.undefined)
      
      @scala.inline
      def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setStorageEncrypted(value: Input[Boolean]): Self = StObject.set(x, "storageEncrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageEncryptedUndefined: Self = StObject.set(x, "storageEncrypted", js.undefined)
      
      @scala.inline
      def setStorageType(value: Input[String | StorageType]): Self = StObject.set(x, "storageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageTypeUndefined: Self = StObject.set(x, "storageType", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTimezone(value: Input[String]): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
      
      @scala.inline
      def setUsername(value: Input[String]): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      @scala.inline
      def setVpcSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "vpcSecurityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "vpcSecurityGroupIds", js.undefined)
      
      @scala.inline
      def setVpcSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "vpcSecurityGroupIds", js.Array(value :_*))
    }
  }
}
