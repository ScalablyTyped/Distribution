package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object neptuneClusterMod {
  
  @JSImport("@pulumi/aws/neptune/cluster", "Cluster")
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
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Specifies whether any cluster modifications are applied immediately, or during the next maintenance window. Default is `false`.
      */
    val applyImmediately: Output_[Boolean] = js.native
    
    /**
      * The Neptune Cluster Amazon Resource Name (ARN)
      */
    val arn: Output_[String] = js.native
    
    /**
      * A list of EC2 Availability Zones that instances in the Neptune cluster can be created in.
      */
    val availabilityZones: Output_[js.Array[String]] = js.native
    
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
      * List of Neptune Instances that are a part of this cluster
      */
    val clusterMembers: Output_[js.Array[String]] = js.native
    
    /**
      * The Neptune Cluster Resource ID
      */
    val clusterResourceId: Output_[String] = js.native
    
    /**
      * A value that indicates whether the DB cluster has deletion protection enabled.The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled.
      */
    val deletionProtection: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * A list of the log types this DB cluster is configured to export to Cloudwatch Logs. Currently only supports `audit`.
      */
    val enableCloudwatchLogsExports: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The DNS address of the Neptune instance
      */
    val endpoint: Output_[String] = js.native
    
    /**
      * The name of the database engine to be used for this Neptune cluster. Defaults to `neptune`.
      */
    val engine: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The database engine version.
      */
    val engineVersion: Output_[String] = js.native
    
    /**
      * The name of your final Neptune snapshot when this Neptune cluster is deleted. If omitted, no final snapshot will be made.
      */
    val finalSnapshotIdentifier: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The Route53 Hosted Zone ID of the endpoint
      */
    val hostedZoneId: Output_[String] = js.native
    
    /**
      * Specifies whether or mappings of AWS Identity and Access Management (IAM) accounts to database accounts is enabled.
      */
    val iamDatabaseAuthenticationEnabled: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * A List of ARNs for the IAM roles to associate to the Neptune Cluster.
      */
    val iamRoles: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The ARN for the KMS encryption key. When specifying `kmsKeyArn`, `storageEncrypted` needs to be set to true.
      */
    val kmsKeyArn: Output_[String] = js.native
    
    /**
      * A cluster parameter group to associate with the cluster.
      */
    val neptuneClusterParameterGroupName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A Neptune subnet group to associate with this Neptune instance.
      */
    val neptuneSubnetGroupName: Output_[String] = js.native
    
    /**
      * The port on which the Neptune accepts connections. Default is `8182`.
      */
    val port: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter. Time in UTC. Default: A 30-minute window selected at random from an 8-hour block of time per region. e.g. 04:00-09:00
      */
    val preferredBackupWindow: Output_[String] = js.native
    
    /**
      * The weekly time range during which system maintenance can occur, in (UTC) e.g. wed:04:00-wed:04:30
      */
    val preferredMaintenanceWindow: Output_[String] = js.native
    
    /**
      * A read-only endpoint for the Neptune cluster, automatically load-balanced across replicas
      */
    val readerEndpoint: Output_[String] = js.native
    
    /**
      * ARN of a source Neptune cluster or Neptune instance if this Neptune cluster is to be created as a Read Replica.
      */
    val replicationSourceIdentifier: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Determines whether a final Neptune snapshot is created before the Neptune cluster is deleted. If true is specified, no Neptune snapshot is created. If false is specified, a Neptune snapshot is created before the Neptune cluster is deleted, using the value from `finalSnapshotIdentifier`. Default is `false`.
      */
    val skipFinalSnapshot: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a Neptune cluster snapshot, or the ARN when specifying a Neptune snapshot.
      */
    val snapshotIdentifier: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Specifies whether the Neptune cluster is encrypted. The default is `false` if not specified.
      */
    val storageEncrypted: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * A map of tags to assign to the Neptune cluster.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * List of VPC security groups to associate with the Cluster
      */
    val vpcSecurityGroupIds: Output_[js.Array[String]] = js.native
  }
  /* static members */
  object Cluster {
    
    @JSImport("@pulumi/aws/neptune/cluster", "Cluster")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Cluster resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Cluster]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Cluster]
    @scala.inline
    def get(name: String, id: Input[ID], state: ClusterState): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Cluster]
    @scala.inline
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Cluster]
    
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/neptune/cluster.Cluster */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/neptune/cluster.Cluster */ Boolean]
  }
  
  trait ClusterArgs extends StObject {
    
    /**
      * Specifies whether any cluster modifications are applied immediately, or during the next maintenance window. Default is `false`.
      */
    val applyImmediately: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A list of EC2 Availability Zones that instances in the Neptune cluster can be created in.
      */
    val availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The days to retain backups for. Default `1`
      */
    val backupRetentionPeriod: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The cluster identifier. If omitted, this provider will assign a random, unique identifier.
      */
    val clusterIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `clusterIdentifier`.
      */
    val clusterIdentifierPrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A value that indicates whether the DB cluster has deletion protection enabled.The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled.
      */
    val deletionProtection: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A list of the log types this DB cluster is configured to export to Cloudwatch Logs. Currently only supports `audit`.
      */
    val enableCloudwatchLogsExports: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The name of the database engine to be used for this Neptune cluster. Defaults to `neptune`.
      */
    val engine: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The database engine version.
      */
    val engineVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of your final Neptune snapshot when this Neptune cluster is deleted. If omitted, no final snapshot will be made.
      */
    val finalSnapshotIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies whether or mappings of AWS Identity and Access Management (IAM) accounts to database accounts is enabled.
      */
    val iamDatabaseAuthenticationEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A List of ARNs for the IAM roles to associate to the Neptune Cluster.
      */
    val iamRoles: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The ARN for the KMS encryption key. When specifying `kmsKeyArn`, `storageEncrypted` needs to be set to true.
      */
    val kmsKeyArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A cluster parameter group to associate with the cluster.
      */
    val neptuneClusterParameterGroupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A Neptune subnet group to associate with this Neptune instance.
      */
    val neptuneSubnetGroupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The port on which the Neptune accepts connections. Default is `8182`.
      */
    val port: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter. Time in UTC. Default: A 30-minute window selected at random from an 8-hour block of time per region. e.g. 04:00-09:00
      */
    val preferredBackupWindow: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The weekly time range during which system maintenance can occur, in (UTC) e.g. wed:04:00-wed:04:30
      */
    val preferredMaintenanceWindow: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * ARN of a source Neptune cluster or Neptune instance if this Neptune cluster is to be created as a Read Replica.
      */
    val replicationSourceIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Determines whether a final Neptune snapshot is created before the Neptune cluster is deleted. If true is specified, no Neptune snapshot is created. If false is specified, a Neptune snapshot is created before the Neptune cluster is deleted, using the value from `finalSnapshotIdentifier`. Default is `false`.
      */
    val skipFinalSnapshot: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a Neptune cluster snapshot, or the ARN when specifying a Neptune snapshot.
      */
    val snapshotIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies whether the Neptune cluster is encrypted. The default is `false` if not specified.
      */
    val storageEncrypted: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A map of tags to assign to the Neptune cluster.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * List of VPC security groups to associate with the Cluster
      */
    val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
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
      def setDeletionProtection(value: Input[Boolean]): Self = StObject.set(x, "deletionProtection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletionProtectionUndefined: Self = StObject.set(x, "deletionProtection", js.undefined)
      
      @scala.inline
      def setEnableCloudwatchLogsExports(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "enableCloudwatchLogsExports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCloudwatchLogsExportsUndefined: Self = StObject.set(x, "enableCloudwatchLogsExports", js.undefined)
      
      @scala.inline
      def setEnableCloudwatchLogsExportsVarargs(value: Input[String]*): Self = StObject.set(x, "enableCloudwatchLogsExports", js.Array(value :_*))
      
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
      def setIamRoles(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "iamRoles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamRolesUndefined: Self = StObject.set(x, "iamRoles", js.undefined)
      
      @scala.inline
      def setIamRolesVarargs(value: Input[String]*): Self = StObject.set(x, "iamRoles", js.Array(value :_*))
      
      @scala.inline
      def setKmsKeyArn(value: Input[String]): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
      
      @scala.inline
      def setNeptuneClusterParameterGroupName(value: Input[String]): Self = StObject.set(x, "neptuneClusterParameterGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeptuneClusterParameterGroupNameUndefined: Self = StObject.set(x, "neptuneClusterParameterGroupName", js.undefined)
      
      @scala.inline
      def setNeptuneSubnetGroupName(value: Input[String]): Self = StObject.set(x, "neptuneSubnetGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeptuneSubnetGroupNameUndefined: Self = StObject.set(x, "neptuneSubnetGroupName", js.undefined)
      
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
  
  trait ClusterState extends StObject {
    
    /**
      * Specifies whether any cluster modifications are applied immediately, or during the next maintenance window. Default is `false`.
      */
    val applyImmediately: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The Neptune Cluster Amazon Resource Name (ARN)
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of EC2 Availability Zones that instances in the Neptune cluster can be created in.
      */
    val availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The days to retain backups for. Default `1`
      */
    val backupRetentionPeriod: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The cluster identifier. If omitted, this provider will assign a random, unique identifier.
      */
    val clusterIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `clusterIdentifier`.
      */
    val clusterIdentifierPrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * List of Neptune Instances that are a part of this cluster
      */
    val clusterMembers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The Neptune Cluster Resource ID
      */
    val clusterResourceId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A value that indicates whether the DB cluster has deletion protection enabled.The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled.
      */
    val deletionProtection: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A list of the log types this DB cluster is configured to export to Cloudwatch Logs. Currently only supports `audit`.
      */
    val enableCloudwatchLogsExports: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The DNS address of the Neptune instance
      */
    val endpoint: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the database engine to be used for this Neptune cluster. Defaults to `neptune`.
      */
    val engine: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The database engine version.
      */
    val engineVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of your final Neptune snapshot when this Neptune cluster is deleted. If omitted, no final snapshot will be made.
      */
    val finalSnapshotIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Route53 Hosted Zone ID of the endpoint
      */
    val hostedZoneId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies whether or mappings of AWS Identity and Access Management (IAM) accounts to database accounts is enabled.
      */
    val iamDatabaseAuthenticationEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A List of ARNs for the IAM roles to associate to the Neptune Cluster.
      */
    val iamRoles: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The ARN for the KMS encryption key. When specifying `kmsKeyArn`, `storageEncrypted` needs to be set to true.
      */
    val kmsKeyArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A cluster parameter group to associate with the cluster.
      */
    val neptuneClusterParameterGroupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A Neptune subnet group to associate with this Neptune instance.
      */
    val neptuneSubnetGroupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The port on which the Neptune accepts connections. Default is `8182`.
      */
    val port: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter. Time in UTC. Default: A 30-minute window selected at random from an 8-hour block of time per region. e.g. 04:00-09:00
      */
    val preferredBackupWindow: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The weekly time range during which system maintenance can occur, in (UTC) e.g. wed:04:00-wed:04:30
      */
    val preferredMaintenanceWindow: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A read-only endpoint for the Neptune cluster, automatically load-balanced across replicas
      */
    val readerEndpoint: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * ARN of a source Neptune cluster or Neptune instance if this Neptune cluster is to be created as a Read Replica.
      */
    val replicationSourceIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Determines whether a final Neptune snapshot is created before the Neptune cluster is deleted. If true is specified, no Neptune snapshot is created. If false is specified, a Neptune snapshot is created before the Neptune cluster is deleted, using the value from `finalSnapshotIdentifier`. Default is `false`.
      */
    val skipFinalSnapshot: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a Neptune cluster snapshot, or the ARN when specifying a Neptune snapshot.
      */
    val snapshotIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies whether the Neptune cluster is encrypted. The default is `false` if not specified.
      */
    val storageEncrypted: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A map of tags to assign to the Neptune cluster.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * List of VPC security groups to associate with the Cluster
      */
    val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
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
      def setDeletionProtection(value: Input[Boolean]): Self = StObject.set(x, "deletionProtection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletionProtectionUndefined: Self = StObject.set(x, "deletionProtection", js.undefined)
      
      @scala.inline
      def setEnableCloudwatchLogsExports(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "enableCloudwatchLogsExports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCloudwatchLogsExportsUndefined: Self = StObject.set(x, "enableCloudwatchLogsExports", js.undefined)
      
      @scala.inline
      def setEnableCloudwatchLogsExportsVarargs(value: Input[String]*): Self = StObject.set(x, "enableCloudwatchLogsExports", js.Array(value :_*))
      
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
      def setIamRoles(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "iamRoles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamRolesUndefined: Self = StObject.set(x, "iamRoles", js.undefined)
      
      @scala.inline
      def setIamRolesVarargs(value: Input[String]*): Self = StObject.set(x, "iamRoles", js.Array(value :_*))
      
      @scala.inline
      def setKmsKeyArn(value: Input[String]): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
      
      @scala.inline
      def setNeptuneClusterParameterGroupName(value: Input[String]): Self = StObject.set(x, "neptuneClusterParameterGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeptuneClusterParameterGroupNameUndefined: Self = StObject.set(x, "neptuneClusterParameterGroupName", js.undefined)
      
      @scala.inline
      def setNeptuneSubnetGroupName(value: Input[String]): Self = StObject.set(x, "neptuneSubnetGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeptuneSubnetGroupNameUndefined: Self = StObject.set(x, "neptuneSubnetGroupName", js.undefined)
      
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
