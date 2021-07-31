package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.elasticache.ReplicationGroupClusterMode
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object replicationGroupMod {
  
  @JSImport("@pulumi/aws/elasticache/replicationGroup", "ReplicationGroup")
  @js.native
  class ReplicationGroup protected () extends CustomResource {
    /**
      * Create a ReplicationGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReplicationGroupArgs) = this()
    def this(name: String, args: ReplicationGroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Specifies whether any modifications are applied immediately, or during the next maintenance window. Default is `false`.
      */
    val applyImmediately: Output_[Boolean] = js.native
    
    /**
      * Whether to enable encryption at rest.
      */
    val atRestEncryptionEnabled: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The password used to access a password protected server. Can be specified only if `transitEncryptionEnabled = true`.
      */
    val authToken: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Specifies whether a minor engine upgrades will be applied automatically to the underlying Cache Cluster instances during the maintenance window. Defaults to `true`.
      */
    val autoMinorVersionUpgrade: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Specifies whether a read-only replica will be automatically promoted to read/write primary if the existing primary fails. If true, Multi-AZ is enabled for this replication group. If false, Multi-AZ is disabled for this replication group. Must be enabled for Redis (cluster mode enabled) replication groups. Defaults to `false`.
      */
    val automaticFailoverEnabled: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * A list of EC2 availability zones in which the replication group's cache clusters will be created. The order of the availability zones in the list is not important.
      */
    val availabilityZones: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * Create a native redis cluster. `automaticFailoverEnabled` must be set to true. Cluster Mode documented below. Only 1 `clusterMode` block is allowed.
      */
    val clusterMode: Output_[ReplicationGroupClusterMode] = js.native
    
    /**
      * The address of the replication group configuration endpoint when cluster mode is enabled.
      */
    val configurationEndpointAddress: Output_[String] = js.native
    
    /**
      * The name of the cache engine to be used for the clusters in this replication group. e.g. `redis`
      */
    val engine: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The version number of the cache engine to be used for the cache clusters in this replication group.
      */
    val engineVersion: Output_[String] = js.native
    
    /**
      * The ARN of the key that you wish to use if encrypting at rest. If not supplied, uses service managed encryption. Can be specified only if `atRestEncryptionEnabled = true`.
      */
    val kmsKeyId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Specifies the weekly time range for when maintenance
      * on the cache cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC).
      * The minimum maintenance window is a 60 minute period. Example: `sun:05:00-sun:09:00`
      */
    val maintenanceWindow: Output_[String] = js.native
    
    /**
      * The identifiers of all the nodes that are part of this replication group.
      */
    val memberClusters: Output_[js.Array[String]] = js.native
    
    /**
      * The compute and memory capacity of the nodes in the node group.
      */
    val nodeType: Output_[String] = js.native
    
    /**
      * An Amazon Resource Name (ARN) of an
      * SNS topic to send ElastiCache notifications to. Example:
      * `arn:aws:sns:us-east-1:012345678999:my_sns_topic`
      */
    val notificationTopicArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The number of cache clusters (primary and replicas) this replication group will have. If Multi-AZ is enabled, the value of this parameter must be at least 2. Updates will occur before other modifications.
      */
    val numberCacheClusters: Output_[Double] = js.native
    
    /**
      * The name of the parameter group to associate with this replication group. If this argument is omitted, the default cache parameter group for the specified engine is used.
      */
    val parameterGroupName: Output_[String] = js.native
    
    /**
      * The port number on which each of the cache nodes will accept connections. For Memcache the default is 11211, and for Redis the default port is 6379.
      */
    val port: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * (Redis only) The address of the endpoint for the primary node in the replication group, if the cluster mode is disabled.
      */
    val primaryEndpointAddress: Output_[String] = js.native
    
    /**
      * A user-created description for the replication group.
      */
    val replicationGroupDescription: Output_[String] = js.native
    
    /**
      * The replication group identifier. This parameter is stored as a lowercase string.
      */
    val replicationGroupId: Output_[String] = js.native
    
    /**
      * One or more Amazon VPC security groups associated with this replication group. Use this parameter only when you are creating a replication group in an Amazon Virtual Private Cloud
      */
    val securityGroupIds: Output_[js.Array[String]] = js.native
    
    /**
      * A list of cache security group names to associate with this replication group.
      */
    val securityGroupNames: Output_[js.Array[String]] = js.native
    
    /**
      * A single-element string list containing an
      * Amazon Resource Name (ARN) of a Redis RDB snapshot file stored in Amazon S3.
      * Example: `arn:aws:s3:::my_bucket/snapshot1.rdb`
      */
    val snapshotArns: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The name of a snapshot from which to restore data into the new node group. Changing the `snapshotName` forces a new resource.
      */
    val snapshotName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The number of days for which ElastiCache will
      * retain automatic cache cluster snapshots before deleting them. For example, if you set
      * SnapshotRetentionLimit to 5, then a snapshot that was taken today will be retained for 5 days
      * before being deleted. If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
      * Please note that setting a `snapshotRetentionLimit` is not supported on cache.t1.micro or cache.t2.* cache nodes
      */
    val snapshotRetentionLimit: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The daily time range (in UTC) during which ElastiCache will
      * begin taking a daily snapshot of your cache cluster. The minimum snapshot window is a 60 minute period. Example: `05:00-09:00`
      */
    val snapshotWindow: Output_[String] = js.native
    
    /**
      * The name of the cache subnet group to be used for the replication group.
      */
    val subnetGroupName: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource. Adding tags to this resource will add or overwrite any existing tags on the clusters in the replication group and not to the group itself.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Whether to enable encryption in transit.
      */
    val transitEncryptionEnabled: Output_[js.UndefOr[Boolean]] = js.native
  }
  /* static members */
  object ReplicationGroup {
    
    @JSImport("@pulumi/aws/elasticache/replicationGroup", "ReplicationGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ReplicationGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): ReplicationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ReplicationGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ReplicationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ReplicationGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: ReplicationGroupState): ReplicationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ReplicationGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: ReplicationGroupState, opts: CustomResourceOptions): ReplicationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ReplicationGroup]
    
    /**
      * Returns true if the given object is an instance of ReplicationGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticache/replicationGroup.ReplicationGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/elasticache/replicationGroup.ReplicationGroup */ Boolean]
  }
  
  trait ReplicationGroupArgs extends StObject {
    
    /**
      * Specifies whether any modifications are applied immediately, or during the next maintenance window. Default is `false`.
      */
    val applyImmediately: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Whether to enable encryption at rest.
      */
    val atRestEncryptionEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The password used to access a password protected server. Can be specified only if `transitEncryptionEnabled = true`.
      */
    val authToken: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies whether a minor engine upgrades will be applied automatically to the underlying Cache Cluster instances during the maintenance window. Defaults to `true`.
      */
    val autoMinorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Specifies whether a read-only replica will be automatically promoted to read/write primary if the existing primary fails. If true, Multi-AZ is enabled for this replication group. If false, Multi-AZ is disabled for this replication group. Must be enabled for Redis (cluster mode enabled) replication groups. Defaults to `false`.
      */
    val automaticFailoverEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A list of EC2 availability zones in which the replication group's cache clusters will be created. The order of the availability zones in the list is not important.
      */
    val availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Create a native redis cluster. `automaticFailoverEnabled` must be set to true. Cluster Mode documented below. Only 1 `clusterMode` block is allowed.
      */
    val clusterMode: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticache.ReplicationGroupClusterMode]] = js.undefined
    
    /**
      * The name of the cache engine to be used for the clusters in this replication group. e.g. `redis`
      */
    val engine: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The version number of the cache engine to be used for the cache clusters in this replication group.
      */
    val engineVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the key that you wish to use if encrypting at rest. If not supplied, uses service managed encryption. Can be specified only if `atRestEncryptionEnabled = true`.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the weekly time range for when maintenance
      * on the cache cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC).
      * The minimum maintenance window is a 60 minute period. Example: `sun:05:00-sun:09:00`
      */
    val maintenanceWindow: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The compute and memory capacity of the nodes in the node group.
      */
    val nodeType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * An Amazon Resource Name (ARN) of an
      * SNS topic to send ElastiCache notifications to. Example:
      * `arn:aws:sns:us-east-1:012345678999:my_sns_topic`
      */
    val notificationTopicArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The number of cache clusters (primary and replicas) this replication group will have. If Multi-AZ is enabled, the value of this parameter must be at least 2. Updates will occur before other modifications.
      */
    val numberCacheClusters: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The name of the parameter group to associate with this replication group. If this argument is omitted, the default cache parameter group for the specified engine is used.
      */
    val parameterGroupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The port number on which each of the cache nodes will accept connections. For Memcache the default is 11211, and for Redis the default port is 6379.
      */
    val port: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * A user-created description for the replication group.
      */
    val replicationGroupDescription: Input[String]
    
    /**
      * The replication group identifier. This parameter is stored as a lowercase string.
      */
    val replicationGroupId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * One or more Amazon VPC security groups associated with this replication group. Use this parameter only when you are creating a replication group in an Amazon Virtual Private Cloud
      */
    val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A list of cache security group names to associate with this replication group.
      */
    val securityGroupNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A single-element string list containing an
      * Amazon Resource Name (ARN) of a Redis RDB snapshot file stored in Amazon S3.
      * Example: `arn:aws:s3:::my_bucket/snapshot1.rdb`
      */
    val snapshotArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The name of a snapshot from which to restore data into the new node group. Changing the `snapshotName` forces a new resource.
      */
    val snapshotName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The number of days for which ElastiCache will
      * retain automatic cache cluster snapshots before deleting them. For example, if you set
      * SnapshotRetentionLimit to 5, then a snapshot that was taken today will be retained for 5 days
      * before being deleted. If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
      * Please note that setting a `snapshotRetentionLimit` is not supported on cache.t1.micro or cache.t2.* cache nodes
      */
    val snapshotRetentionLimit: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The daily time range (in UTC) during which ElastiCache will
      * begin taking a daily snapshot of your cache cluster. The minimum snapshot window is a 60 minute period. Example: `05:00-09:00`
      */
    val snapshotWindow: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the cache subnet group to be used for the replication group.
      */
    val subnetGroupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource. Adding tags to this resource will add or overwrite any existing tags on the clusters in the replication group and not to the group itself.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Whether to enable encryption in transit.
      */
    val transitEncryptionEnabled: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object ReplicationGroupArgs {
    
    @scala.inline
    def apply(replicationGroupDescription: Input[String]): ReplicationGroupArgs = {
      val __obj = js.Dynamic.literal(replicationGroupDescription = replicationGroupDescription.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplicationGroupArgs]
    }
    
    @scala.inline
    implicit class ReplicationGroupArgsMutableBuilder[Self <: ReplicationGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplyImmediately(value: Input[Boolean]): Self = StObject.set(x, "applyImmediately", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyImmediatelyUndefined: Self = StObject.set(x, "applyImmediately", js.undefined)
      
      @scala.inline
      def setAtRestEncryptionEnabled(value: Input[Boolean]): Self = StObject.set(x, "atRestEncryptionEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAtRestEncryptionEnabledUndefined: Self = StObject.set(x, "atRestEncryptionEnabled", js.undefined)
      
      @scala.inline
      def setAuthToken(value: Input[String]): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthTokenUndefined: Self = StObject.set(x, "authToken", js.undefined)
      
      @scala.inline
      def setAutoMinorVersionUpgrade(value: Input[Boolean]): Self = StObject.set(x, "autoMinorVersionUpgrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "autoMinorVersionUpgrade", js.undefined)
      
      @scala.inline
      def setAutomaticFailoverEnabled(value: Input[Boolean]): Self = StObject.set(x, "automaticFailoverEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutomaticFailoverEnabledUndefined: Self = StObject.set(x, "automaticFailoverEnabled", js.undefined)
      
      @scala.inline
      def setAvailabilityZones(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZonesUndefined: Self = StObject.set(x, "availabilityZones", js.undefined)
      
      @scala.inline
      def setAvailabilityZonesVarargs(value: Input[String]*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
      
      @scala.inline
      def setClusterMode(value: Input[typings.pulumiAws.inputMod.elasticache.ReplicationGroupClusterMode]): Self = StObject.set(x, "clusterMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterModeUndefined: Self = StObject.set(x, "clusterMode", js.undefined)
      
      @scala.inline
      def setEngine(value: Input[String]): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      @scala.inline
      def setEngineVersion(value: Input[String]): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setMaintenanceWindow(value: Input[String]): Self = StObject.set(x, "maintenanceWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaintenanceWindowUndefined: Self = StObject.set(x, "maintenanceWindow", js.undefined)
      
      @scala.inline
      def setNodeType(value: Input[String]): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeTypeUndefined: Self = StObject.set(x, "nodeType", js.undefined)
      
      @scala.inline
      def setNotificationTopicArn(value: Input[String]): Self = StObject.set(x, "notificationTopicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationTopicArnUndefined: Self = StObject.set(x, "notificationTopicArn", js.undefined)
      
      @scala.inline
      def setNumberCacheClusters(value: Input[Double]): Self = StObject.set(x, "numberCacheClusters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberCacheClustersUndefined: Self = StObject.set(x, "numberCacheClusters", js.undefined)
      
      @scala.inline
      def setParameterGroupName(value: Input[String]): Self = StObject.set(x, "parameterGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameterGroupNameUndefined: Self = StObject.set(x, "parameterGroupName", js.undefined)
      
      @scala.inline
      def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setReplicationGroupDescription(value: Input[String]): Self = StObject.set(x, "replicationGroupDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationGroupId(value: Input[String]): Self = StObject.set(x, "replicationGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationGroupIdUndefined: Self = StObject.set(x, "replicationGroupId", js.undefined)
      
      @scala.inline
      def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
      
      @scala.inline
      def setSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setSecurityGroupNames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupNamesUndefined: Self = StObject.set(x, "securityGroupNames", js.undefined)
      
      @scala.inline
      def setSecurityGroupNamesVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupNames", js.Array(value :_*))
      
      @scala.inline
      def setSnapshotArns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "snapshotArns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotArnsUndefined: Self = StObject.set(x, "snapshotArns", js.undefined)
      
      @scala.inline
      def setSnapshotArnsVarargs(value: Input[String]*): Self = StObject.set(x, "snapshotArns", js.Array(value :_*))
      
      @scala.inline
      def setSnapshotName(value: Input[String]): Self = StObject.set(x, "snapshotName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotNameUndefined: Self = StObject.set(x, "snapshotName", js.undefined)
      
      @scala.inline
      def setSnapshotRetentionLimit(value: Input[Double]): Self = StObject.set(x, "snapshotRetentionLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotRetentionLimitUndefined: Self = StObject.set(x, "snapshotRetentionLimit", js.undefined)
      
      @scala.inline
      def setSnapshotWindow(value: Input[String]): Self = StObject.set(x, "snapshotWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotWindowUndefined: Self = StObject.set(x, "snapshotWindow", js.undefined)
      
      @scala.inline
      def setSubnetGroupName(value: Input[String]): Self = StObject.set(x, "subnetGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetGroupNameUndefined: Self = StObject.set(x, "subnetGroupName", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTransitEncryptionEnabled(value: Input[Boolean]): Self = StObject.set(x, "transitEncryptionEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitEncryptionEnabledUndefined: Self = StObject.set(x, "transitEncryptionEnabled", js.undefined)
    }
  }
  
  trait ReplicationGroupState extends StObject {
    
    /**
      * Specifies whether any modifications are applied immediately, or during the next maintenance window. Default is `false`.
      */
    val applyImmediately: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Whether to enable encryption at rest.
      */
    val atRestEncryptionEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The password used to access a password protected server. Can be specified only if `transitEncryptionEnabled = true`.
      */
    val authToken: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies whether a minor engine upgrades will be applied automatically to the underlying Cache Cluster instances during the maintenance window. Defaults to `true`.
      */
    val autoMinorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Specifies whether a read-only replica will be automatically promoted to read/write primary if the existing primary fails. If true, Multi-AZ is enabled for this replication group. If false, Multi-AZ is disabled for this replication group. Must be enabled for Redis (cluster mode enabled) replication groups. Defaults to `false`.
      */
    val automaticFailoverEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A list of EC2 availability zones in which the replication group's cache clusters will be created. The order of the availability zones in the list is not important.
      */
    val availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Create a native redis cluster. `automaticFailoverEnabled` must be set to true. Cluster Mode documented below. Only 1 `clusterMode` block is allowed.
      */
    val clusterMode: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticache.ReplicationGroupClusterMode]] = js.undefined
    
    /**
      * The address of the replication group configuration endpoint when cluster mode is enabled.
      */
    val configurationEndpointAddress: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the cache engine to be used for the clusters in this replication group. e.g. `redis`
      */
    val engine: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The version number of the cache engine to be used for the cache clusters in this replication group.
      */
    val engineVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the key that you wish to use if encrypting at rest. If not supplied, uses service managed encryption. Can be specified only if `atRestEncryptionEnabled = true`.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the weekly time range for when maintenance
      * on the cache cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC).
      * The minimum maintenance window is a 60 minute period. Example: `sun:05:00-sun:09:00`
      */
    val maintenanceWindow: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The identifiers of all the nodes that are part of this replication group.
      */
    val memberClusters: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The compute and memory capacity of the nodes in the node group.
      */
    val nodeType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * An Amazon Resource Name (ARN) of an
      * SNS topic to send ElastiCache notifications to. Example:
      * `arn:aws:sns:us-east-1:012345678999:my_sns_topic`
      */
    val notificationTopicArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The number of cache clusters (primary and replicas) this replication group will have. If Multi-AZ is enabled, the value of this parameter must be at least 2. Updates will occur before other modifications.
      */
    val numberCacheClusters: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The name of the parameter group to associate with this replication group. If this argument is omitted, the default cache parameter group for the specified engine is used.
      */
    val parameterGroupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The port number on which each of the cache nodes will accept connections. For Memcache the default is 11211, and for Redis the default port is 6379.
      */
    val port: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * (Redis only) The address of the endpoint for the primary node in the replication group, if the cluster mode is disabled.
      */
    val primaryEndpointAddress: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A user-created description for the replication group.
      */
    val replicationGroupDescription: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The replication group identifier. This parameter is stored as a lowercase string.
      */
    val replicationGroupId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * One or more Amazon VPC security groups associated with this replication group. Use this parameter only when you are creating a replication group in an Amazon Virtual Private Cloud
      */
    val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A list of cache security group names to associate with this replication group.
      */
    val securityGroupNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A single-element string list containing an
      * Amazon Resource Name (ARN) of a Redis RDB snapshot file stored in Amazon S3.
      * Example: `arn:aws:s3:::my_bucket/snapshot1.rdb`
      */
    val snapshotArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The name of a snapshot from which to restore data into the new node group. Changing the `snapshotName` forces a new resource.
      */
    val snapshotName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The number of days for which ElastiCache will
      * retain automatic cache cluster snapshots before deleting them. For example, if you set
      * SnapshotRetentionLimit to 5, then a snapshot that was taken today will be retained for 5 days
      * before being deleted. If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
      * Please note that setting a `snapshotRetentionLimit` is not supported on cache.t1.micro or cache.t2.* cache nodes
      */
    val snapshotRetentionLimit: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The daily time range (in UTC) during which ElastiCache will
      * begin taking a daily snapshot of your cache cluster. The minimum snapshot window is a 60 minute period. Example: `05:00-09:00`
      */
    val snapshotWindow: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the cache subnet group to be used for the replication group.
      */
    val subnetGroupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource. Adding tags to this resource will add or overwrite any existing tags on the clusters in the replication group and not to the group itself.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Whether to enable encryption in transit.
      */
    val transitEncryptionEnabled: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object ReplicationGroupState {
    
    @scala.inline
    def apply(): ReplicationGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplicationGroupState]
    }
    
    @scala.inline
    implicit class ReplicationGroupStateMutableBuilder[Self <: ReplicationGroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplyImmediately(value: Input[Boolean]): Self = StObject.set(x, "applyImmediately", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyImmediatelyUndefined: Self = StObject.set(x, "applyImmediately", js.undefined)
      
      @scala.inline
      def setAtRestEncryptionEnabled(value: Input[Boolean]): Self = StObject.set(x, "atRestEncryptionEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAtRestEncryptionEnabledUndefined: Self = StObject.set(x, "atRestEncryptionEnabled", js.undefined)
      
      @scala.inline
      def setAuthToken(value: Input[String]): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthTokenUndefined: Self = StObject.set(x, "authToken", js.undefined)
      
      @scala.inline
      def setAutoMinorVersionUpgrade(value: Input[Boolean]): Self = StObject.set(x, "autoMinorVersionUpgrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "autoMinorVersionUpgrade", js.undefined)
      
      @scala.inline
      def setAutomaticFailoverEnabled(value: Input[Boolean]): Self = StObject.set(x, "automaticFailoverEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutomaticFailoverEnabledUndefined: Self = StObject.set(x, "automaticFailoverEnabled", js.undefined)
      
      @scala.inline
      def setAvailabilityZones(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZonesUndefined: Self = StObject.set(x, "availabilityZones", js.undefined)
      
      @scala.inline
      def setAvailabilityZonesVarargs(value: Input[String]*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
      
      @scala.inline
      def setClusterMode(value: Input[typings.pulumiAws.inputMod.elasticache.ReplicationGroupClusterMode]): Self = StObject.set(x, "clusterMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterModeUndefined: Self = StObject.set(x, "clusterMode", js.undefined)
      
      @scala.inline
      def setConfigurationEndpointAddress(value: Input[String]): Self = StObject.set(x, "configurationEndpointAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationEndpointAddressUndefined: Self = StObject.set(x, "configurationEndpointAddress", js.undefined)
      
      @scala.inline
      def setEngine(value: Input[String]): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      @scala.inline
      def setEngineVersion(value: Input[String]): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setMaintenanceWindow(value: Input[String]): Self = StObject.set(x, "maintenanceWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaintenanceWindowUndefined: Self = StObject.set(x, "maintenanceWindow", js.undefined)
      
      @scala.inline
      def setMemberClusters(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "memberClusters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemberClustersUndefined: Self = StObject.set(x, "memberClusters", js.undefined)
      
      @scala.inline
      def setMemberClustersVarargs(value: Input[String]*): Self = StObject.set(x, "memberClusters", js.Array(value :_*))
      
      @scala.inline
      def setNodeType(value: Input[String]): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeTypeUndefined: Self = StObject.set(x, "nodeType", js.undefined)
      
      @scala.inline
      def setNotificationTopicArn(value: Input[String]): Self = StObject.set(x, "notificationTopicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationTopicArnUndefined: Self = StObject.set(x, "notificationTopicArn", js.undefined)
      
      @scala.inline
      def setNumberCacheClusters(value: Input[Double]): Self = StObject.set(x, "numberCacheClusters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberCacheClustersUndefined: Self = StObject.set(x, "numberCacheClusters", js.undefined)
      
      @scala.inline
      def setParameterGroupName(value: Input[String]): Self = StObject.set(x, "parameterGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameterGroupNameUndefined: Self = StObject.set(x, "parameterGroupName", js.undefined)
      
      @scala.inline
      def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPrimaryEndpointAddress(value: Input[String]): Self = StObject.set(x, "primaryEndpointAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryEndpointAddressUndefined: Self = StObject.set(x, "primaryEndpointAddress", js.undefined)
      
      @scala.inline
      def setReplicationGroupDescription(value: Input[String]): Self = StObject.set(x, "replicationGroupDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationGroupDescriptionUndefined: Self = StObject.set(x, "replicationGroupDescription", js.undefined)
      
      @scala.inline
      def setReplicationGroupId(value: Input[String]): Self = StObject.set(x, "replicationGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationGroupIdUndefined: Self = StObject.set(x, "replicationGroupId", js.undefined)
      
      @scala.inline
      def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
      
      @scala.inline
      def setSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setSecurityGroupNames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupNamesUndefined: Self = StObject.set(x, "securityGroupNames", js.undefined)
      
      @scala.inline
      def setSecurityGroupNamesVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupNames", js.Array(value :_*))
      
      @scala.inline
      def setSnapshotArns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "snapshotArns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotArnsUndefined: Self = StObject.set(x, "snapshotArns", js.undefined)
      
      @scala.inline
      def setSnapshotArnsVarargs(value: Input[String]*): Self = StObject.set(x, "snapshotArns", js.Array(value :_*))
      
      @scala.inline
      def setSnapshotName(value: Input[String]): Self = StObject.set(x, "snapshotName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotNameUndefined: Self = StObject.set(x, "snapshotName", js.undefined)
      
      @scala.inline
      def setSnapshotRetentionLimit(value: Input[Double]): Self = StObject.set(x, "snapshotRetentionLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotRetentionLimitUndefined: Self = StObject.set(x, "snapshotRetentionLimit", js.undefined)
      
      @scala.inline
      def setSnapshotWindow(value: Input[String]): Self = StObject.set(x, "snapshotWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotWindowUndefined: Self = StObject.set(x, "snapshotWindow", js.undefined)
      
      @scala.inline
      def setSubnetGroupName(value: Input[String]): Self = StObject.set(x, "subnetGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetGroupNameUndefined: Self = StObject.set(x, "subnetGroupName", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTransitEncryptionEnabled(value: Input[Boolean]): Self = StObject.set(x, "transitEncryptionEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitEncryptionEnabledUndefined: Self = StObject.set(x, "transitEncryptionEnabled", js.undefined)
    }
  }
}
