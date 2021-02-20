package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.enumsRdsMod.EngineMode
import typings.pulumiAws.enumsRdsMod.EngineType
import typings.pulumiAws.outputMod.rds.ClusterRestoreToPointInTime
import typings.pulumiAws.outputMod.rds.ClusterS3Import
import typings.pulumiAws.outputMod.rds.ClusterScalingConfiguration
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rdsClusterMod {
  
  @JSImport("@pulumi/aws/rds/cluster", "Cluster")
  @js.native
  class Cluster protected () extends CustomResource {
    /**
      * Create a Cluster resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Enable to allow major engine version upgrades when changing engine versions. Defaults to `false`.
      */
    val allowMajorVersionUpgrade: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Specifies whether any cluster modifications are applied immediately, or during the next maintenance window. Default is `false`. See [Amazon RDS Documentation for more information.](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html)
      */
    val applyImmediately: Output_[Boolean] = js.native
    
    /**
      * Amazon Resource Name (ARN) of cluster
      */
    val arn: Output_[String] = js.native
    
    /**
      * A list of EC2 Availability Zones for the DB cluster storage where DB cluster instances can be created. RDS automatically assigns 3 AZs if less than 3 AZs are configured, which will show as a difference requiring resource recreation next provider update. It is recommended to specify 3 AZs or use [the `ignoreChanges` argument](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) if necessary.
      */
    val availabilityZones: Output_[js.Array[String]] = js.native
    
    /**
      * The target backtrack window, in seconds. Only available for `aurora` engine currently. To disable backtracking, set this value to `0`. Defaults to `0`. Must be between `0` and `259200` (72 hours)
      */
    val backtrackWindow: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The days to retain backups for. Default `1`
      */
    val backupRetentionPeriod: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The cluster identifier. If omitted, this provider will assign a random, unique identifier.
      */
    val clusterIdentifier: Output_[String] = js.native
    
    /**
      * Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `clusterIdentifier`.
      */
    val clusterIdentifierPrefix: Output_[String] = js.native
    
    /**
      * List of RDS Instances that are a part of this cluster
      */
    val clusterMembers: Output_[js.Array[String]] = js.native
    
    /**
      * The RDS Cluster Resource ID
      */
    val clusterResourceId: Output_[String] = js.native
    
    /**
      * Copy all Cluster `tags` to snapshots. Default is `false`.
      */
    val copyTagsToSnapshot: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Name for an automatically created database on cluster creation. There are different naming restrictions per database engine: [RDS Naming Constraints](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Limits.html#RDS_Limits.Constraints)
      */
    val databaseName: Output_[String] = js.native
    
    /**
      * A cluster parameter group to associate with the cluster.
      */
    val dbClusterParameterGroupName: Output_[String] = js.native
    
    /**
      * A DB subnet group to associate with this DB instance. **NOTE:** This must match the `dbSubnetGroupName` specified on every `aws.rds.ClusterInstance` in the cluster.
      */
    val dbSubnetGroupName: Output_[String] = js.native
    
    /**
      * If the DB instance should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
      */
    val deletionProtection: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Enable HTTP endpoint (data API). Only valid when `engineMode` is set to `serverless`.
      */
    val enableHttpEndpoint: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Set of log types to export to cloudwatch. If omitted, no logs will be exported. The following log types are supported: `audit`, `error`, `general`, `slowquery`, `postgresql` (PostgreSQL).
      */
    val enabledCloudwatchLogsExports: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The DNS address of the RDS instance
      */
    val endpoint: Output_[String] = js.native
    
    /**
      * The name of the database engine to be used for this DB cluster. Defaults to `aurora`. Valid Values: `aurora`, `aurora-mysql`, `aurora-postgresql`
      */
    val engine: Output_[js.UndefOr[EngineType]] = js.native
    
    /**
      * The database engine mode. Valid values: `global` (only valid for Aurora MySQL 1.21 and earlier), `multimaster`, `parallelquery`, `provisioned`, `serverless`. Defaults to: `provisioned`. See the [RDS User Guide](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/aurora-serverless.html) for limitations when using `serverless`.
      */
    val engineMode: Output_[js.UndefOr[EngineMode]] = js.native
    
    /**
      * The database engine version. Updating this argument results in an outage. See the [Aurora MySQL](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Updates.html) and [Aurora Postgres](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraPostgreSQL.Updates.html) documentation for your configured engine to determine this value. For example with Aurora MySQL 2, a potential value for this argument is `5.7.mysql_aurora.2.03.2`.
      */
    val engineVersion: Output_[String] = js.native
    
    /**
      * The name of your final DB snapshot when this DB cluster is deleted. If omitted, no final snapshot will be made.
      */
    val finalSnapshotIdentifier: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The global cluster identifier specified on `aws.rds.GlobalCluster`.
      */
    val globalClusterIdentifier: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The Route53 Hosted Zone ID of the endpoint
      */
    val hostedZoneId: Output_[String] = js.native
    
    /**
      * Specifies whether or mappings of AWS Identity and Access Management (IAM) accounts to database accounts is enabled. Please see [AWS Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html) for availability and limitations.
      */
    val iamDatabaseAuthenticationEnabled: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * A List of ARNs for the IAM roles to associate to the RDS Cluster.
      */
    val iamRoles: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The ARN for the KMS encryption key. When specifying `kmsKeyId`, `storageEncrypted` needs to be set to true.
      */
    val kmsKeyId: Output_[String] = js.native
    
    /**
      * Password for the master DB user. Note that this may show up in logs, and it will be stored in the state file. Please refer to the [RDS Naming Constraints](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Limits.html#RDS_Limits.Constraints)
      */
    val masterPassword: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Username for the master DB user. Please refer to the [RDS Naming Constraints](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Limits.html#RDS_Limits.Constraints). This argument does not support in-place updates and cannot be changed during a restore from snapshot.
      */
    val masterUsername: Output_[String] = js.native
    
    /**
      * The port on which the DB accepts connections
      */
    val port: Output_[Double] = js.native
    
    /**
      * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter.Time in UTC. Default: A 30-minute window selected at random from an 8-hour block of time per region. e.g. 04:00-09:00
      */
    val preferredBackupWindow: Output_[String] = js.native
    
    /**
      * The weekly time range during which system maintenance can occur, in (UTC) e.g. wed:04:00-wed:04:30
      */
    val preferredMaintenanceWindow: Output_[String] = js.native
    
    /**
      * A read-only endpoint for the Aurora cluster, automatically
      * load-balanced across replicas
      */
    val readerEndpoint: Output_[String] = js.native
    
    /**
      * ARN of the source DB cluster or DB instance if this DB cluster is created as a Read Replica.
      */
    val replicationSourceIdentifier: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Nested attribute for [point in time restore](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_PIT.html). More details below.
      */
    val restoreToPointInTime: Output_[js.UndefOr[ClusterRestoreToPointInTime]] = js.native
    
    val s3Import: Output_[js.UndefOr[ClusterS3Import]] = js.native
    
    /**
      * Nested attribute with scaling properties. Only valid when `engineMode` is set to `serverless`. More details below.
      */
    val scalingConfiguration: Output_[js.UndefOr[ClusterScalingConfiguration]] = js.native
    
    /**
      * Determines whether a final DB snapshot is created before the DB cluster is deleted. If true is specified, no DB snapshot is created. If false is specified, a DB snapshot is created before the DB cluster is deleted, using the value from `finalSnapshotIdentifier`. Default is `false`.
      */
    val skipFinalSnapshot: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a DB cluster snapshot, or the ARN when specifying a DB snapshot.
      */
    val snapshotIdentifier: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The source region for an encrypted replica DB cluster.
      */
    val sourceRegion: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Specifies whether the DB cluster is encrypted
      */
    val storageEncrypted: Output_[Boolean] = js.native
    
    /**
      * A map of tags to assign to the DB cluster.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * List of VPC security groups to associate with the Cluster
      */
    val vpcSecurityGroupIds: Output_[js.Array[String]] = js.native
  }
  /* static members */
  object Cluster {
    
    /**
      * Get an existing Cluster resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/rds/cluster", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID]): Cluster = js.native
    @JSImport("@pulumi/aws/rds/cluster", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Cluster = js.native
    @JSImport("@pulumi/aws/rds/cluster", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState): Cluster = js.native
    @JSImport("@pulumi/aws/rds/cluster", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): Cluster = js.native
    
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/rds/cluster", "Cluster.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/cluster.Cluster */ Boolean = js.native
  }
  
  @js.native
  trait ClusterArgs extends StObject {
    
    /**
      * Enable to allow major engine version upgrades when changing engine versions. Defaults to `false`.
      */
    val allowMajorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Specifies whether any cluster modifications are applied immediately, or during the next maintenance window. Default is `false`. See [Amazon RDS Documentation for more information.](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html)
      */
    val applyImmediately: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * A list of EC2 Availability Zones for the DB cluster storage where DB cluster instances can be created. RDS automatically assigns 3 AZs if less than 3 AZs are configured, which will show as a difference requiring resource recreation next provider update. It is recommended to specify 3 AZs or use [the `ignoreChanges` argument](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) if necessary.
      */
    val availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The target backtrack window, in seconds. Only available for `aurora` engine currently. To disable backtracking, set this value to `0`. Defaults to `0`. Must be between `0` and `259200` (72 hours)
      */
    val backtrackWindow: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The days to retain backups for. Default `1`
      */
    val backupRetentionPeriod: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The cluster identifier. If omitted, this provider will assign a random, unique identifier.
      */
    val clusterIdentifier: js.UndefOr[Input[String]] = js.native
    
    /**
      * Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `clusterIdentifier`.
      */
    val clusterIdentifierPrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * List of RDS Instances that are a part of this cluster
      */
    val clusterMembers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Copy all Cluster `tags` to snapshots. Default is `false`.
      */
    val copyTagsToSnapshot: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Name for an automatically created database on cluster creation. There are different naming restrictions per database engine: [RDS Naming Constraints](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Limits.html#RDS_Limits.Constraints)
      */
    val databaseName: js.UndefOr[Input[String]] = js.native
    
    /**
      * A cluster parameter group to associate with the cluster.
      */
    val dbClusterParameterGroupName: js.UndefOr[Input[String]] = js.native
    
    /**
      * A DB subnet group to associate with this DB instance. **NOTE:** This must match the `dbSubnetGroupName` specified on every `aws.rds.ClusterInstance` in the cluster.
      */
    val dbSubnetGroupName: js.UndefOr[Input[String]] = js.native
    
    /**
      * If the DB instance should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
      */
    val deletionProtection: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Enable HTTP endpoint (data API). Only valid when `engineMode` is set to `serverless`.
      */
    val enableHttpEndpoint: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Set of log types to export to cloudwatch. If omitted, no logs will be exported. The following log types are supported: `audit`, `error`, `general`, `slowquery`, `postgresql` (PostgreSQL).
      */
    val enabledCloudwatchLogsExports: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The name of the database engine to be used for this DB cluster. Defaults to `aurora`. Valid Values: `aurora`, `aurora-mysql`, `aurora-postgresql`
      */
    val engine: js.UndefOr[Input[EngineType]] = js.native
    
    /**
      * The database engine mode. Valid values: `global` (only valid for Aurora MySQL 1.21 and earlier), `multimaster`, `parallelquery`, `provisioned`, `serverless`. Defaults to: `provisioned`. See the [RDS User Guide](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/aurora-serverless.html) for limitations when using `serverless`.
      */
    val engineMode: js.UndefOr[Input[EngineMode]] = js.native
    
    /**
      * The database engine version. Updating this argument results in an outage. See the [Aurora MySQL](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Updates.html) and [Aurora Postgres](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraPostgreSQL.Updates.html) documentation for your configured engine to determine this value. For example with Aurora MySQL 2, a potential value for this argument is `5.7.mysql_aurora.2.03.2`.
      */
    val engineVersion: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of your final DB snapshot when this DB cluster is deleted. If omitted, no final snapshot will be made.
      */
    val finalSnapshotIdentifier: js.UndefOr[Input[String]] = js.native
    
    /**
      * The global cluster identifier specified on `aws.rds.GlobalCluster`.
      */
    val globalClusterIdentifier: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies whether or mappings of AWS Identity and Access Management (IAM) accounts to database accounts is enabled. Please see [AWS Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html) for availability and limitations.
      */
    val iamDatabaseAuthenticationEnabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * A List of ARNs for the IAM roles to associate to the RDS Cluster.
      */
    val iamRoles: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The ARN for the KMS encryption key. When specifying `kmsKeyId`, `storageEncrypted` needs to be set to true.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Password for the master DB user. Note that this may show up in logs, and it will be stored in the state file. Please refer to the [RDS Naming Constraints](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Limits.html#RDS_Limits.Constraints)
      */
    val masterPassword: js.UndefOr[Input[String]] = js.native
    
    /**
      * Username for the master DB user. Please refer to the [RDS Naming Constraints](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Limits.html#RDS_Limits.Constraints). This argument does not support in-place updates and cannot be changed during a restore from snapshot.
      */
    val masterUsername: js.UndefOr[Input[String]] = js.native
    
    /**
      * The port on which the DB accepts connections
      */
    val port: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter.Time in UTC. Default: A 30-minute window selected at random from an 8-hour block of time per region. e.g. 04:00-09:00
      */
    val preferredBackupWindow: js.UndefOr[Input[String]] = js.native
    
    /**
      * The weekly time range during which system maintenance can occur, in (UTC) e.g. wed:04:00-wed:04:30
      */
    val preferredMaintenanceWindow: js.UndefOr[Input[String]] = js.native
    
    /**
      * ARN of the source DB cluster or DB instance if this DB cluster is created as a Read Replica.
      */
    val replicationSourceIdentifier: js.UndefOr[Input[String]] = js.native
    
    /**
      * Nested attribute for [point in time restore](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_PIT.html). More details below.
      */
    val restoreToPointInTime: js.UndefOr[Input[typings.pulumiAws.inputMod.rds.ClusterRestoreToPointInTime]] = js.native
    
    val s3Import: js.UndefOr[Input[typings.pulumiAws.inputMod.rds.ClusterS3Import]] = js.native
    
    /**
      * Nested attribute with scaling properties. Only valid when `engineMode` is set to `serverless`. More details below.
      */
    val scalingConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.rds.ClusterScalingConfiguration]] = js.native
    
    /**
      * Determines whether a final DB snapshot is created before the DB cluster is deleted. If true is specified, no DB snapshot is created. If false is specified, a DB snapshot is created before the DB cluster is deleted, using the value from `finalSnapshotIdentifier`. Default is `false`.
      */
    val skipFinalSnapshot: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a DB cluster snapshot, or the ARN when specifying a DB snapshot.
      */
    val snapshotIdentifier: js.UndefOr[Input[String]] = js.native
    
    /**
      * The source region for an encrypted replica DB cluster.
      */
    val sourceRegion: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies whether the DB cluster is encrypted
      */
    val storageEncrypted: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * A map of tags to assign to the DB cluster.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * List of VPC security groups to associate with the Cluster
      */
    val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  }
  object ClusterArgs {
    
    @scala.inline
    def apply(): ClusterArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterArgs]
    }
    
    @scala.inline
    implicit class ClusterArgsMutableBuilder[Self <: ClusterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowMajorVersionUpgrade(value: Input[Boolean]): Self = StObject.set(x, "allowMajorVersionUpgrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowMajorVersionUpgradeUndefined: Self = StObject.set(x, "allowMajorVersionUpgrade", js.undefined)
      
      @scala.inline
      def setApplyImmediately(value: Input[Boolean]): Self = StObject.set(x, "applyImmediately", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyImmediatelyUndefined: Self = StObject.set(x, "applyImmediately", js.undefined)
      
      @scala.inline
      def setAvailabilityZones(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZonesUndefined: Self = StObject.set(x, "availabilityZones", js.undefined)
      
      @scala.inline
      def setAvailabilityZonesVarargs(value: Input[String]*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
      
      @scala.inline
      def setBacktrackWindow(value: Input[Double]): Self = StObject.set(x, "backtrackWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBacktrackWindowUndefined: Self = StObject.set(x, "backtrackWindow", js.undefined)
      
      @scala.inline
      def setBackupRetentionPeriod(value: Input[Double]): Self = StObject.set(x, "backupRetentionPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupRetentionPeriodUndefined: Self = StObject.set(x, "backupRetentionPeriod", js.undefined)
      
      @scala.inline
      def setClusterIdentifier(value: Input[String]): Self = StObject.set(x, "clusterIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterIdentifierPrefix(value: Input[String]): Self = StObject.set(x, "clusterIdentifierPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterIdentifierPrefixUndefined: Self = StObject.set(x, "clusterIdentifierPrefix", js.undefined)
      
      @scala.inline
      def setClusterIdentifierUndefined: Self = StObject.set(x, "clusterIdentifier", js.undefined)
      
      @scala.inline
      def setClusterMembers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "clusterMembers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterMembersUndefined: Self = StObject.set(x, "clusterMembers", js.undefined)
      
      @scala.inline
      def setClusterMembersVarargs(value: Input[String]*): Self = StObject.set(x, "clusterMembers", js.Array(value :_*))
      
      @scala.inline
      def setCopyTagsToSnapshot(value: Input[Boolean]): Self = StObject.set(x, "copyTagsToSnapshot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyTagsToSnapshotUndefined: Self = StObject.set(x, "copyTagsToSnapshot", js.undefined)
      
      @scala.inline
      def setDatabaseName(value: Input[String]): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseNameUndefined: Self = StObject.set(x, "databaseName", js.undefined)
      
      @scala.inline
      def setDbClusterParameterGroupName(value: Input[String]): Self = StObject.set(x, "dbClusterParameterGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbClusterParameterGroupNameUndefined: Self = StObject.set(x, "dbClusterParameterGroupName", js.undefined)
      
      @scala.inline
      def setDbSubnetGroupName(value: Input[String]): Self = StObject.set(x, "dbSubnetGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbSubnetGroupNameUndefined: Self = StObject.set(x, "dbSubnetGroupName", js.undefined)
      
      @scala.inline
      def setDeletionProtection(value: Input[Boolean]): Self = StObject.set(x, "deletionProtection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletionProtectionUndefined: Self = StObject.set(x, "deletionProtection", js.undefined)
      
      @scala.inline
      def setEnableHttpEndpoint(value: Input[Boolean]): Self = StObject.set(x, "enableHttpEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableHttpEndpointUndefined: Self = StObject.set(x, "enableHttpEndpoint", js.undefined)
      
      @scala.inline
      def setEnabledCloudwatchLogsExports(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "enabledCloudwatchLogsExports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledCloudwatchLogsExportsUndefined: Self = StObject.set(x, "enabledCloudwatchLogsExports", js.undefined)
      
      @scala.inline
      def setEnabledCloudwatchLogsExportsVarargs(value: Input[String]*): Self = StObject.set(x, "enabledCloudwatchLogsExports", js.Array(value :_*))
      
      @scala.inline
      def setEngine(value: Input[EngineType]): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineMode(value: Input[EngineMode]): Self = StObject.set(x, "engineMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineModeUndefined: Self = StObject.set(x, "engineMode", js.undefined)
      
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
      def setGlobalClusterIdentifier(value: Input[String]): Self = StObject.set(x, "globalClusterIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalClusterIdentifierUndefined: Self = StObject.set(x, "globalClusterIdentifier", js.undefined)
      
      @scala.inline
      def setIamDatabaseAuthenticationEnabled(value: Input[Boolean]): Self = StObject.set(x, "iamDatabaseAuthenticationEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamDatabaseAuthenticationEnabledUndefined: Self = StObject.set(x, "iamDatabaseAuthenticationEnabled", js.undefined)
      
      @scala.inline
      def setIamRoles(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "iamRoles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamRolesUndefined: Self = StObject.set(x, "iamRoles", js.undefined)
      
      @scala.inline
      def setIamRolesVarargs(value: Input[String]*): Self = StObject.set(x, "iamRoles", js.Array(value :_*))
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setMasterPassword(value: Input[String]): Self = StObject.set(x, "masterPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasterPasswordUndefined: Self = StObject.set(x, "masterPassword", js.undefined)
      
      @scala.inline
      def setMasterUsername(value: Input[String]): Self = StObject.set(x, "masterUsername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasterUsernameUndefined: Self = StObject.set(x, "masterUsername", js.undefined)
      
      @scala.inline
      def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPreferredBackupWindow(value: Input[String]): Self = StObject.set(x, "preferredBackupWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredBackupWindowUndefined: Self = StObject.set(x, "preferredBackupWindow", js.undefined)
      
      @scala.inline
      def setPreferredMaintenanceWindow(value: Input[String]): Self = StObject.set(x, "preferredMaintenanceWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "preferredMaintenanceWindow", js.undefined)
      
      @scala.inline
      def setReplicationSourceIdentifier(value: Input[String]): Self = StObject.set(x, "replicationSourceIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationSourceIdentifierUndefined: Self = StObject.set(x, "replicationSourceIdentifier", js.undefined)
      
      @scala.inline
      def setRestoreToPointInTime(value: Input[typings.pulumiAws.inputMod.rds.ClusterRestoreToPointInTime]): Self = StObject.set(x, "restoreToPointInTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestoreToPointInTimeUndefined: Self = StObject.set(x, "restoreToPointInTime", js.undefined)
      
      @scala.inline
      def setS3Import(value: Input[typings.pulumiAws.inputMod.rds.ClusterS3Import]): Self = StObject.set(x, "s3Import", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3ImportUndefined: Self = StObject.set(x, "s3Import", js.undefined)
      
      @scala.inline
      def setScalingConfiguration(value: Input[typings.pulumiAws.inputMod.rds.ClusterScalingConfiguration]): Self = StObject.set(x, "scalingConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalingConfigurationUndefined: Self = StObject.set(x, "scalingConfiguration", js.undefined)
      
      @scala.inline
      def setSkipFinalSnapshot(value: Input[Boolean]): Self = StObject.set(x, "skipFinalSnapshot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipFinalSnapshotUndefined: Self = StObject.set(x, "skipFinalSnapshot", js.undefined)
      
      @scala.inline
      def setSnapshotIdentifier(value: Input[String]): Self = StObject.set(x, "snapshotIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotIdentifierUndefined: Self = StObject.set(x, "snapshotIdentifier", js.undefined)
      
      @scala.inline
      def setSourceRegion(value: Input[String]): Self = StObject.set(x, "sourceRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceRegionUndefined: Self = StObject.set(x, "sourceRegion", js.undefined)
      
      @scala.inline
      def setStorageEncrypted(value: Input[Boolean]): Self = StObject.set(x, "storageEncrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageEncryptedUndefined: Self = StObject.set(x, "storageEncrypted", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "vpcSecurityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "vpcSecurityGroupIds", js.undefined)
      
      @scala.inline
      def setVpcSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "vpcSecurityGroupIds", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ClusterState extends StObject {
    
    /**
      * Enable to allow major engine version upgrades when changing engine versions. Defaults to `false`.
      */
    val allowMajorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Specifies whether any cluster modifications are applied immediately, or during the next maintenance window. Default is `false`. See [Amazon RDS Documentation for more information.](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html)
      */
    val applyImmediately: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of cluster
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of EC2 Availability Zones for the DB cluster storage where DB cluster instances can be created. RDS automatically assigns 3 AZs if less than 3 AZs are configured, which will show as a difference requiring resource recreation next provider update. It is recommended to specify 3 AZs or use [the `ignoreChanges` argument](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) if necessary.
      */
    val availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The target backtrack window, in seconds. Only available for `aurora` engine currently. To disable backtracking, set this value to `0`. Defaults to `0`. Must be between `0` and `259200` (72 hours)
      */
    val backtrackWindow: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The days to retain backups for. Default `1`
      */
    val backupRetentionPeriod: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The cluster identifier. If omitted, this provider will assign a random, unique identifier.
      */
    val clusterIdentifier: js.UndefOr[Input[String]] = js.native
    
    /**
      * Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `clusterIdentifier`.
      */
    val clusterIdentifierPrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * List of RDS Instances that are a part of this cluster
      */
    val clusterMembers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The RDS Cluster Resource ID
      */
    val clusterResourceId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Copy all Cluster `tags` to snapshots. Default is `false`.
      */
    val copyTagsToSnapshot: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Name for an automatically created database on cluster creation. There are different naming restrictions per database engine: [RDS Naming Constraints](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Limits.html#RDS_Limits.Constraints)
      */
    val databaseName: js.UndefOr[Input[String]] = js.native
    
    /**
      * A cluster parameter group to associate with the cluster.
      */
    val dbClusterParameterGroupName: js.UndefOr[Input[String]] = js.native
    
    /**
      * A DB subnet group to associate with this DB instance. **NOTE:** This must match the `dbSubnetGroupName` specified on every `aws.rds.ClusterInstance` in the cluster.
      */
    val dbSubnetGroupName: js.UndefOr[Input[String]] = js.native
    
    /**
      * If the DB instance should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
      */
    val deletionProtection: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Enable HTTP endpoint (data API). Only valid when `engineMode` is set to `serverless`.
      */
    val enableHttpEndpoint: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Set of log types to export to cloudwatch. If omitted, no logs will be exported. The following log types are supported: `audit`, `error`, `general`, `slowquery`, `postgresql` (PostgreSQL).
      */
    val enabledCloudwatchLogsExports: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The DNS address of the RDS instance
      */
    val endpoint: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the database engine to be used for this DB cluster. Defaults to `aurora`. Valid Values: `aurora`, `aurora-mysql`, `aurora-postgresql`
      */
    val engine: js.UndefOr[Input[EngineType]] = js.native
    
    /**
      * The database engine mode. Valid values: `global` (only valid for Aurora MySQL 1.21 and earlier), `multimaster`, `parallelquery`, `provisioned`, `serverless`. Defaults to: `provisioned`. See the [RDS User Guide](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/aurora-serverless.html) for limitations when using `serverless`.
      */
    val engineMode: js.UndefOr[Input[EngineMode]] = js.native
    
    /**
      * The database engine version. Updating this argument results in an outage. See the [Aurora MySQL](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Updates.html) and [Aurora Postgres](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraPostgreSQL.Updates.html) documentation for your configured engine to determine this value. For example with Aurora MySQL 2, a potential value for this argument is `5.7.mysql_aurora.2.03.2`.
      */
    val engineVersion: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of your final DB snapshot when this DB cluster is deleted. If omitted, no final snapshot will be made.
      */
    val finalSnapshotIdentifier: js.UndefOr[Input[String]] = js.native
    
    /**
      * The global cluster identifier specified on `aws.rds.GlobalCluster`.
      */
    val globalClusterIdentifier: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Route53 Hosted Zone ID of the endpoint
      */
    val hostedZoneId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies whether or mappings of AWS Identity and Access Management (IAM) accounts to database accounts is enabled. Please see [AWS Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html) for availability and limitations.
      */
    val iamDatabaseAuthenticationEnabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * A List of ARNs for the IAM roles to associate to the RDS Cluster.
      */
    val iamRoles: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The ARN for the KMS encryption key. When specifying `kmsKeyId`, `storageEncrypted` needs to be set to true.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Password for the master DB user. Note that this may show up in logs, and it will be stored in the state file. Please refer to the [RDS Naming Constraints](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Limits.html#RDS_Limits.Constraints)
      */
    val masterPassword: js.UndefOr[Input[String]] = js.native
    
    /**
      * Username for the master DB user. Please refer to the [RDS Naming Constraints](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Limits.html#RDS_Limits.Constraints). This argument does not support in-place updates and cannot be changed during a restore from snapshot.
      */
    val masterUsername: js.UndefOr[Input[String]] = js.native
    
    /**
      * The port on which the DB accepts connections
      */
    val port: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter.Time in UTC. Default: A 30-minute window selected at random from an 8-hour block of time per region. e.g. 04:00-09:00
      */
    val preferredBackupWindow: js.UndefOr[Input[String]] = js.native
    
    /**
      * The weekly time range during which system maintenance can occur, in (UTC) e.g. wed:04:00-wed:04:30
      */
    val preferredMaintenanceWindow: js.UndefOr[Input[String]] = js.native
    
    /**
      * A read-only endpoint for the Aurora cluster, automatically
      * load-balanced across replicas
      */
    val readerEndpoint: js.UndefOr[Input[String]] = js.native
    
    /**
      * ARN of the source DB cluster or DB instance if this DB cluster is created as a Read Replica.
      */
    val replicationSourceIdentifier: js.UndefOr[Input[String]] = js.native
    
    /**
      * Nested attribute for [point in time restore](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_PIT.html). More details below.
      */
    val restoreToPointInTime: js.UndefOr[Input[typings.pulumiAws.inputMod.rds.ClusterRestoreToPointInTime]] = js.native
    
    val s3Import: js.UndefOr[Input[typings.pulumiAws.inputMod.rds.ClusterS3Import]] = js.native
    
    /**
      * Nested attribute with scaling properties. Only valid when `engineMode` is set to `serverless`. More details below.
      */
    val scalingConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.rds.ClusterScalingConfiguration]] = js.native
    
    /**
      * Determines whether a final DB snapshot is created before the DB cluster is deleted. If true is specified, no DB snapshot is created. If false is specified, a DB snapshot is created before the DB cluster is deleted, using the value from `finalSnapshotIdentifier`. Default is `false`.
      */
    val skipFinalSnapshot: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a DB cluster snapshot, or the ARN when specifying a DB snapshot.
      */
    val snapshotIdentifier: js.UndefOr[Input[String]] = js.native
    
    /**
      * The source region for an encrypted replica DB cluster.
      */
    val sourceRegion: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies whether the DB cluster is encrypted
      */
    val storageEncrypted: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * A map of tags to assign to the DB cluster.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * List of VPC security groups to associate with the Cluster
      */
    val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  }
  object ClusterState {
    
    @scala.inline
    def apply(): ClusterState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterState]
    }
    
    @scala.inline
    implicit class ClusterStateMutableBuilder[Self <: ClusterState] (val x: Self) extends AnyVal {
      
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
      def setAvailabilityZones(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZonesUndefined: Self = StObject.set(x, "availabilityZones", js.undefined)
      
      @scala.inline
      def setAvailabilityZonesVarargs(value: Input[String]*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
      
      @scala.inline
      def setBacktrackWindow(value: Input[Double]): Self = StObject.set(x, "backtrackWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBacktrackWindowUndefined: Self = StObject.set(x, "backtrackWindow", js.undefined)
      
      @scala.inline
      def setBackupRetentionPeriod(value: Input[Double]): Self = StObject.set(x, "backupRetentionPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupRetentionPeriodUndefined: Self = StObject.set(x, "backupRetentionPeriod", js.undefined)
      
      @scala.inline
      def setClusterIdentifier(value: Input[String]): Self = StObject.set(x, "clusterIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterIdentifierPrefix(value: Input[String]): Self = StObject.set(x, "clusterIdentifierPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterIdentifierPrefixUndefined: Self = StObject.set(x, "clusterIdentifierPrefix", js.undefined)
      
      @scala.inline
      def setClusterIdentifierUndefined: Self = StObject.set(x, "clusterIdentifier", js.undefined)
      
      @scala.inline
      def setClusterMembers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "clusterMembers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterMembersUndefined: Self = StObject.set(x, "clusterMembers", js.undefined)
      
      @scala.inline
      def setClusterMembersVarargs(value: Input[String]*): Self = StObject.set(x, "clusterMembers", js.Array(value :_*))
      
      @scala.inline
      def setClusterResourceId(value: Input[String]): Self = StObject.set(x, "clusterResourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterResourceIdUndefined: Self = StObject.set(x, "clusterResourceId", js.undefined)
      
      @scala.inline
      def setCopyTagsToSnapshot(value: Input[Boolean]): Self = StObject.set(x, "copyTagsToSnapshot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyTagsToSnapshotUndefined: Self = StObject.set(x, "copyTagsToSnapshot", js.undefined)
      
      @scala.inline
      def setDatabaseName(value: Input[String]): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseNameUndefined: Self = StObject.set(x, "databaseName", js.undefined)
      
      @scala.inline
      def setDbClusterParameterGroupName(value: Input[String]): Self = StObject.set(x, "dbClusterParameterGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbClusterParameterGroupNameUndefined: Self = StObject.set(x, "dbClusterParameterGroupName", js.undefined)
      
      @scala.inline
      def setDbSubnetGroupName(value: Input[String]): Self = StObject.set(x, "dbSubnetGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbSubnetGroupNameUndefined: Self = StObject.set(x, "dbSubnetGroupName", js.undefined)
      
      @scala.inline
      def setDeletionProtection(value: Input[Boolean]): Self = StObject.set(x, "deletionProtection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletionProtectionUndefined: Self = StObject.set(x, "deletionProtection", js.undefined)
      
      @scala.inline
      def setEnableHttpEndpoint(value: Input[Boolean]): Self = StObject.set(x, "enableHttpEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableHttpEndpointUndefined: Self = StObject.set(x, "enableHttpEndpoint", js.undefined)
      
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
      def setEngine(value: Input[EngineType]): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineMode(value: Input[EngineMode]): Self = StObject.set(x, "engineMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineModeUndefined: Self = StObject.set(x, "engineMode", js.undefined)
      
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
      def setGlobalClusterIdentifier(value: Input[String]): Self = StObject.set(x, "globalClusterIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalClusterIdentifierUndefined: Self = StObject.set(x, "globalClusterIdentifier", js.undefined)
      
      @scala.inline
      def setHostedZoneId(value: Input[String]): Self = StObject.set(x, "hostedZoneId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostedZoneIdUndefined: Self = StObject.set(x, "hostedZoneId", js.undefined)
      
      @scala.inline
      def setIamDatabaseAuthenticationEnabled(value: Input[Boolean]): Self = StObject.set(x, "iamDatabaseAuthenticationEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamDatabaseAuthenticationEnabledUndefined: Self = StObject.set(x, "iamDatabaseAuthenticationEnabled", js.undefined)
      
      @scala.inline
      def setIamRoles(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "iamRoles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamRolesUndefined: Self = StObject.set(x, "iamRoles", js.undefined)
      
      @scala.inline
      def setIamRolesVarargs(value: Input[String]*): Self = StObject.set(x, "iamRoles", js.Array(value :_*))
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setMasterPassword(value: Input[String]): Self = StObject.set(x, "masterPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasterPasswordUndefined: Self = StObject.set(x, "masterPassword", js.undefined)
      
      @scala.inline
      def setMasterUsername(value: Input[String]): Self = StObject.set(x, "masterUsername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasterUsernameUndefined: Self = StObject.set(x, "masterUsername", js.undefined)
      
      @scala.inline
      def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPreferredBackupWindow(value: Input[String]): Self = StObject.set(x, "preferredBackupWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredBackupWindowUndefined: Self = StObject.set(x, "preferredBackupWindow", js.undefined)
      
      @scala.inline
      def setPreferredMaintenanceWindow(value: Input[String]): Self = StObject.set(x, "preferredMaintenanceWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "preferredMaintenanceWindow", js.undefined)
      
      @scala.inline
      def setReaderEndpoint(value: Input[String]): Self = StObject.set(x, "readerEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReaderEndpointUndefined: Self = StObject.set(x, "readerEndpoint", js.undefined)
      
      @scala.inline
      def setReplicationSourceIdentifier(value: Input[String]): Self = StObject.set(x, "replicationSourceIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationSourceIdentifierUndefined: Self = StObject.set(x, "replicationSourceIdentifier", js.undefined)
      
      @scala.inline
      def setRestoreToPointInTime(value: Input[typings.pulumiAws.inputMod.rds.ClusterRestoreToPointInTime]): Self = StObject.set(x, "restoreToPointInTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestoreToPointInTimeUndefined: Self = StObject.set(x, "restoreToPointInTime", js.undefined)
      
      @scala.inline
      def setS3Import(value: Input[typings.pulumiAws.inputMod.rds.ClusterS3Import]): Self = StObject.set(x, "s3Import", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3ImportUndefined: Self = StObject.set(x, "s3Import", js.undefined)
      
      @scala.inline
      def setScalingConfiguration(value: Input[typings.pulumiAws.inputMod.rds.ClusterScalingConfiguration]): Self = StObject.set(x, "scalingConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalingConfigurationUndefined: Self = StObject.set(x, "scalingConfiguration", js.undefined)
      
      @scala.inline
      def setSkipFinalSnapshot(value: Input[Boolean]): Self = StObject.set(x, "skipFinalSnapshot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipFinalSnapshotUndefined: Self = StObject.set(x, "skipFinalSnapshot", js.undefined)
      
      @scala.inline
      def setSnapshotIdentifier(value: Input[String]): Self = StObject.set(x, "snapshotIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotIdentifierUndefined: Self = StObject.set(x, "snapshotIdentifier", js.undefined)
      
      @scala.inline
      def setSourceRegion(value: Input[String]): Self = StObject.set(x, "sourceRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceRegionUndefined: Self = StObject.set(x, "sourceRegion", js.undefined)
      
      @scala.inline
      def setStorageEncrypted(value: Input[Boolean]): Self = StObject.set(x, "storageEncrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageEncryptedUndefined: Self = StObject.set(x, "storageEncrypted", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "vpcSecurityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "vpcSecurityGroupIds", js.undefined)
      
      @scala.inline
      def setVpcSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "vpcSecurityGroupIds", js.Array(value :_*))
    }
  }
}
