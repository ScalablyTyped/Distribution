package typings.pulumiAws.replicationGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.elasticache.ReplicationGroupClusterMode
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationGroupArgs extends js.Object {
  /**
    * Specifies whether any modifications are applied immediately, or during the next maintenance window. Default is `false`.
    */
  val applyImmediately: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Whether to enable encryption at rest.
    */
  val atRestEncryptionEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The password used to access a password protected server. Can be specified only if `transitEncryptionEnabled = true`.
    */
  val authToken: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies whether a minor engine upgrades will be applied automatically to the underlying Cache Cluster instances during the maintenance window. Defaults to `true`.
    */
  val autoMinorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specifies whether a read-only replica will be automatically promoted to read/write primary if the existing primary fails. If true, Multi-AZ is enabled for this replication group. If false, Multi-AZ is disabled for this replication group. Must be enabled for Redis (cluster mode enabled) replication groups. Defaults to `false`.
    */
  val automaticFailoverEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A list of EC2 availability zones in which the replication group's cache clusters will be created. The order of the availability zones in the list is not important.
    */
  val availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Create a native redis cluster. `automaticFailoverEnabled` must be set to true. Cluster Mode documented below. Only 1 `clusterMode` block is allowed.
    */
  val clusterMode: js.UndefOr[Input[ReplicationGroupClusterMode]] = js.native
  /**
    * The name of the cache engine to be used for the clusters in this replication group. e.g. `redis`
    */
  val engine: js.UndefOr[Input[String]] = js.native
  /**
    * The version number of the cache engine to be used for the cache clusters in this replication group.
    */
  val engineVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the key that you wish to use if encrypting at rest. If not supplied, uses service managed encryption. Can be specified only if `atRestEncryptionEnabled = true`.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the weekly time range for when maintenance
    * on the cache cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC).
    * The minimum maintenance window is a 60 minute period. Example: `sun:05:00-sun:09:00`
    */
  val maintenanceWindow: js.UndefOr[Input[String]] = js.native
  /**
    * The compute and memory capacity of the nodes in the node group.
    */
  val nodeType: js.UndefOr[Input[String]] = js.native
  /**
    * An Amazon Resource Name (ARN) of an
    * SNS topic to send ElastiCache notifications to. Example:
    * `arn:aws:sns:us-east-1:012345678999:my_sns_topic`
    */
  val notificationTopicArn: js.UndefOr[Input[String]] = js.native
  /**
    * The number of cache clusters (primary and replicas) this replication group will have. If Multi-AZ is enabled, the value of this parameter must be at least 2. Updates will occur before other modifications.
    */
  val numberCacheClusters: js.UndefOr[Input[Double]] = js.native
  /**
    * The name of the parameter group to associate with this replication group. If this argument is omitted, the default cache parameter group for the specified engine is used.
    */
  val parameterGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * The port number on which each of the cache nodes will accept connections. For Memcache the default is 11211, and for Redis the default port is 6379.
    */
  val port: js.UndefOr[Input[Double]] = js.native
  /**
    * A user-created description for the replication group.
    */
  val replicationGroupDescription: Input[String] = js.native
  /**
    * The replication group identifier. This parameter is stored as a lowercase string.
    */
  val replicationGroupId: js.UndefOr[Input[String]] = js.native
  /**
    * One or more Amazon VPC security groups associated with this replication group. Use this parameter only when you are creating a replication group in an Amazon Virtual Private Cloud
    */
  val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A list of cache security group names to associate with this replication group.
    */
  val securityGroupNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A single-element string list containing an
    * Amazon Resource Name (ARN) of a Redis RDB snapshot file stored in Amazon S3.
    * Example: `arn:aws:s3:::my_bucket/snapshot1.rdb`
    */
  val snapshotArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The name of a snapshot from which to restore data into the new node group. Changing the `snapshotName` forces a new resource.
    */
  val snapshotName: js.UndefOr[Input[String]] = js.native
  /**
    * The number of days for which ElastiCache will
    * retain automatic cache cluster snapshots before deleting them. For example, if you set
    * SnapshotRetentionLimit to 5, then a snapshot that was taken today will be retained for 5 days
    * before being deleted. If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
    * Please note that setting a `snapshotRetentionLimit` is not supported on cache.t1.micro or cache.t2.* cache nodes
    */
  val snapshotRetentionLimit: js.UndefOr[Input[Double]] = js.native
  /**
    * The daily time range (in UTC) during which ElastiCache will
    * begin taking a daily snapshot of your cache cluster. The minimum snapshot window is a 60 minute period. Example: `05:00-09:00`
    */
  val snapshotWindow: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the cache subnet group to be used for the replication group.
    */
  val subnetGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * A map of tags to assign to the resource
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Whether to enable encryption in transit.
    */
  val transitEncryptionEnabled: js.UndefOr[Input[Boolean]] = js.native
}

object ReplicationGroupArgs {
  @scala.inline
  def apply(replicationGroupDescription: Input[String]): ReplicationGroupArgs = {
    val __obj = js.Dynamic.literal(replicationGroupDescription = replicationGroupDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationGroupArgs]
  }
  @scala.inline
  implicit class ReplicationGroupArgsOps[Self <: ReplicationGroupArgs] (val x: Self) extends AnyVal {
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
    def setReplicationGroupDescription(value: Input[String]): Self = this.set("replicationGroupDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplyImmediately(value: Input[Boolean]): Self = this.set("applyImmediately", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyImmediately: Self = this.set("applyImmediately", js.undefined)
    @scala.inline
    def setAtRestEncryptionEnabled(value: Input[Boolean]): Self = this.set("atRestEncryptionEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAtRestEncryptionEnabled: Self = this.set("atRestEncryptionEnabled", js.undefined)
    @scala.inline
    def setAuthToken(value: Input[String]): Self = this.set("authToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthToken: Self = this.set("authToken", js.undefined)
    @scala.inline
    def setAutoMinorVersionUpgrade(value: Input[Boolean]): Self = this.set("autoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoMinorVersionUpgrade: Self = this.set("autoMinorVersionUpgrade", js.undefined)
    @scala.inline
    def setAutomaticFailoverEnabled(value: Input[Boolean]): Self = this.set("automaticFailoverEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomaticFailoverEnabled: Self = this.set("automaticFailoverEnabled", js.undefined)
    @scala.inline
    def setAvailabilityZonesVarargs(value: Input[String]*): Self = this.set("availabilityZones", js.Array(value :_*))
    @scala.inline
    def setAvailabilityZones(value: Input[js.Array[Input[String]]]): Self = this.set("availabilityZones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("availabilityZones", js.undefined)
    @scala.inline
    def setClusterMode(value: Input[ReplicationGroupClusterMode]): Self = this.set("clusterMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterMode: Self = this.set("clusterMode", js.undefined)
    @scala.inline
    def setEngine(value: Input[String]): Self = this.set("engine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngine: Self = this.set("engine", js.undefined)
    @scala.inline
    def setEngineVersion(value: Input[String]): Self = this.set("engineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineVersion: Self = this.set("engineVersion", js.undefined)
    @scala.inline
    def setKmsKeyId(value: Input[String]): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("kmsKeyId", js.undefined)
    @scala.inline
    def setMaintenanceWindow(value: Input[String]): Self = this.set("maintenanceWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaintenanceWindow: Self = this.set("maintenanceWindow", js.undefined)
    @scala.inline
    def setNodeType(value: Input[String]): Self = this.set("nodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeType: Self = this.set("nodeType", js.undefined)
    @scala.inline
    def setNotificationTopicArn(value: Input[String]): Self = this.set("notificationTopicArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationTopicArn: Self = this.set("notificationTopicArn", js.undefined)
    @scala.inline
    def setNumberCacheClusters(value: Input[Double]): Self = this.set("numberCacheClusters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberCacheClusters: Self = this.set("numberCacheClusters", js.undefined)
    @scala.inline
    def setParameterGroupName(value: Input[String]): Self = this.set("parameterGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterGroupName: Self = this.set("parameterGroupName", js.undefined)
    @scala.inline
    def setPort(value: Input[Double]): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setReplicationGroupId(value: Input[String]): Self = this.set("replicationGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationGroupId: Self = this.set("replicationGroupId", js.undefined)
    @scala.inline
    def setSecurityGroupIdsVarargs(value: Input[String]*): Self = this.set("securityGroupIds", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("securityGroupIds", js.undefined)
    @scala.inline
    def setSecurityGroupNamesVarargs(value: Input[String]*): Self = this.set("securityGroupNames", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupNames(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroupNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroupNames: Self = this.set("securityGroupNames", js.undefined)
    @scala.inline
    def setSnapshotArnsVarargs(value: Input[String]*): Self = this.set("snapshotArns", js.Array(value :_*))
    @scala.inline
    def setSnapshotArns(value: Input[js.Array[Input[String]]]): Self = this.set("snapshotArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotArns: Self = this.set("snapshotArns", js.undefined)
    @scala.inline
    def setSnapshotName(value: Input[String]): Self = this.set("snapshotName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotName: Self = this.set("snapshotName", js.undefined)
    @scala.inline
    def setSnapshotRetentionLimit(value: Input[Double]): Self = this.set("snapshotRetentionLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotRetentionLimit: Self = this.set("snapshotRetentionLimit", js.undefined)
    @scala.inline
    def setSnapshotWindow(value: Input[String]): Self = this.set("snapshotWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotWindow: Self = this.set("snapshotWindow", js.undefined)
    @scala.inline
    def setSubnetGroupName(value: Input[String]): Self = this.set("subnetGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetGroupName: Self = this.set("subnetGroupName", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTransitEncryptionEnabled(value: Input[Boolean]): Self = this.set("transitEncryptionEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitEncryptionEnabled: Self = this.set("transitEncryptionEnabled", js.undefined)
  }
  
}

