package typings
package atPulumiAwsLib.elasticacheReplicationGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationGroupState extends js.Object {
  /**
    * Specifies whether any modifications are applied immediately, or during the next maintenance window. Default is `false`.
    */
  val applyImmediately: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Whether to enable encryption at rest.
    */
  val atRestEncryptionEnabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The password used to access a password protected server. Can be specified only if `transit_encryption_enabled = true`.
    */
  val authToken: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies whether a minor engine upgrades will be applied automatically to the underlying Cache Cluster instances during the maintenance window. Defaults to `true`.
    */
  val autoMinorVersionUpgrade: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Specifies whether a read-only replica will be automatically promoted to read/write primary if the existing primary fails. If true, Multi-AZ is enabled for this replication group. If false, Multi-AZ is disabled for this replication group. Must be enabled for Redis (cluster mode enabled) replication groups. Defaults to `false`.
    */
  val automaticFailoverEnabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * A list of EC2 availability zones in which the replication group's cache clusters will be created. The order of the availability zones in the list is not important.
    */
  val availabilityZones: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Create a native redis cluster. `automatic_failover_enabled` must be set to true. Cluster Mode documented below. Only 1 `cluster_mode` block is allowed.
    */
  val clusterMode: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_NumNodeGroupsReplicasPerNodeGroup]
  ] = js.undefined
  /**
    * The address of the replication group configuration endpoint when cluster mode is enabled.
    */
  val configurationEndpointAddress: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the cache engine to be used for the clusters in this replication group. e.g. `redis`
    */
  val engine: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The version number of the cache engine to be used for the cache clusters in this replication group.
    */
  val engineVersion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies the weekly time range for when maintenance
    * on the cache cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC).
    * The minimum maintenance window is a 60 minute period. Example: `sun:05:00-sun:09:00`
    */
  val maintenanceWindow: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The identifiers of all the nodes that are part of this replication group.
    */
  val memberClusters: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The compute and memory capacity of the nodes in the node group.
    */
  val nodeType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * An Amazon Resource Name (ARN) of an
    * SNS topic to send ElastiCache notifications to. Example:
    * `arn:aws:sns:us-east-1:012345678999:my_sns_topic`
    */
  val notificationTopicArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The number of cache clusters (primary and replicas) this replication group will have. If Multi-AZ is enabled, the value of this parameter must be at least 2. Updates will occur before other modifications.
    */
  val numberCacheClusters: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The name of the parameter group to associate with this replication group. If this argument is omitted, the default cache parameter group for the specified engine is used.
    */
  val parameterGroupName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The port number on which each of the cache nodes will accept connections. For Memcache the default is 11211, and for Redis the default port is 6379.
    */
  val port: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * (Redis only) The address of the endpoint for the primary node in the replication group, if the cluster mode is disabled.
    */
  val primaryEndpointAddress: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A user-created description for the replication group.
    */
  val replicationGroupDescription: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The replication group identifier. This parameter is stored as a lowercase string.
    */
  val replicationGroupId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * One or more Amazon VPC security groups associated with this replication group. Use this parameter only when you are creating a replication group in an Amazon Virtual Private Cloud
    */
  val securityGroupIds: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * A list of cache security group names to associate with this replication group.
    */
  val securityGroupNames: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * A single-element string list containing an
    * Amazon Resource Name (ARN) of a Redis RDB snapshot file stored in Amazon S3.
    * Example: `arn:aws:s3:::my_bucket/snapshot1.rdb`
    */
  val snapshotArns: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The name of a snapshot from which to restore data into the new node group. Changing the `snapshot_name` forces a new resource.
    */
  val snapshotName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The number of days for which ElastiCache will
    * retain automatic cache cluster snapshots before deleting them. For example, if you set
    * SnapshotRetentionLimit to 5, then a snapshot that was taken today will be retained for 5 days
    * before being deleted. If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
    * Please note that setting a `snapshot_retention_limit` is not supported on cache.t1.micro or cache.t2.* cache nodes
    */
  val snapshotRetentionLimit: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The daily time range (in UTC) during which ElastiCache will
    * begin taking a daily snapshot of your cache cluster. The minimum snapshot window is a 60 minute period. Example: `05:00-09:00`
    */
  val snapshotWindow: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the cache subnet group to be used for the replication group.
    */
  val subnetGroupName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * Whether to enable encryption in transit.
    */
  val transitEncryptionEnabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

object ReplicationGroupState {
  @scala.inline
  def apply(
    applyImmediately: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    atRestEncryptionEnabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    authToken: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    autoMinorVersionUpgrade: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    automaticFailoverEnabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    availabilityZones: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    clusterMode: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_NumNodeGroupsReplicasPerNodeGroup] = null,
    configurationEndpointAddress: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    engine: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    engineVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    maintenanceWindow: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    memberClusters: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    nodeType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    notificationTopicArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    numberCacheClusters: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    parameterGroupName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    port: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    primaryEndpointAddress: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    replicationGroupDescription: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    replicationGroupId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    securityGroupIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    securityGroupNames: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    snapshotArns: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    snapshotName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    snapshotRetentionLimit: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    snapshotWindow: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    subnetGroupName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    transitEncryptionEnabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): ReplicationGroupState = {
    val __obj = js.Dynamic.literal()
    if (applyImmediately != null) __obj.updateDynamic("applyImmediately")(applyImmediately.asInstanceOf[js.Any])
    if (atRestEncryptionEnabled != null) __obj.updateDynamic("atRestEncryptionEnabled")(atRestEncryptionEnabled.asInstanceOf[js.Any])
    if (authToken != null) __obj.updateDynamic("authToken")(authToken.asInstanceOf[js.Any])
    if (autoMinorVersionUpgrade != null) __obj.updateDynamic("autoMinorVersionUpgrade")(autoMinorVersionUpgrade.asInstanceOf[js.Any])
    if (automaticFailoverEnabled != null) __obj.updateDynamic("automaticFailoverEnabled")(automaticFailoverEnabled.asInstanceOf[js.Any])
    if (availabilityZones != null) __obj.updateDynamic("availabilityZones")(availabilityZones.asInstanceOf[js.Any])
    if (clusterMode != null) __obj.updateDynamic("clusterMode")(clusterMode.asInstanceOf[js.Any])
    if (configurationEndpointAddress != null) __obj.updateDynamic("configurationEndpointAddress")(configurationEndpointAddress.asInstanceOf[js.Any])
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (engineVersion != null) __obj.updateDynamic("engineVersion")(engineVersion.asInstanceOf[js.Any])
    if (maintenanceWindow != null) __obj.updateDynamic("maintenanceWindow")(maintenanceWindow.asInstanceOf[js.Any])
    if (memberClusters != null) __obj.updateDynamic("memberClusters")(memberClusters.asInstanceOf[js.Any])
    if (nodeType != null) __obj.updateDynamic("nodeType")(nodeType.asInstanceOf[js.Any])
    if (notificationTopicArn != null) __obj.updateDynamic("notificationTopicArn")(notificationTopicArn.asInstanceOf[js.Any])
    if (numberCacheClusters != null) __obj.updateDynamic("numberCacheClusters")(numberCacheClusters.asInstanceOf[js.Any])
    if (parameterGroupName != null) __obj.updateDynamic("parameterGroupName")(parameterGroupName.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (primaryEndpointAddress != null) __obj.updateDynamic("primaryEndpointAddress")(primaryEndpointAddress.asInstanceOf[js.Any])
    if (replicationGroupDescription != null) __obj.updateDynamic("replicationGroupDescription")(replicationGroupDescription.asInstanceOf[js.Any])
    if (replicationGroupId != null) __obj.updateDynamic("replicationGroupId")(replicationGroupId.asInstanceOf[js.Any])
    if (securityGroupIds != null) __obj.updateDynamic("securityGroupIds")(securityGroupIds.asInstanceOf[js.Any])
    if (securityGroupNames != null) __obj.updateDynamic("securityGroupNames")(securityGroupNames.asInstanceOf[js.Any])
    if (snapshotArns != null) __obj.updateDynamic("snapshotArns")(snapshotArns.asInstanceOf[js.Any])
    if (snapshotName != null) __obj.updateDynamic("snapshotName")(snapshotName.asInstanceOf[js.Any])
    if (snapshotRetentionLimit != null) __obj.updateDynamic("snapshotRetentionLimit")(snapshotRetentionLimit.asInstanceOf[js.Any])
    if (snapshotWindow != null) __obj.updateDynamic("snapshotWindow")(snapshotWindow.asInstanceOf[js.Any])
    if (subnetGroupName != null) __obj.updateDynamic("subnetGroupName")(subnetGroupName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (transitEncryptionEnabled != null) __obj.updateDynamic("transitEncryptionEnabled")(transitEncryptionEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationGroupState]
  }
}

