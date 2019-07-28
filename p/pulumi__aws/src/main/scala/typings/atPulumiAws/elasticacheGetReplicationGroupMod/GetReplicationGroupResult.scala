package typings.atPulumiAws.elasticacheGetReplicationGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReplicationGroupResult extends js.Object {
  /**
    * A flag that enables using an AuthToken (password) when issuing Redis commands.
    */
  val authTokenEnabled: Boolean
  /**
    * A flag whether a read-only replica will be automatically promoted to read/write primary if the existing primary fails.
    */
  val automaticFailoverEnabled: Boolean
  /**
    * The configuration endpoint address to allow host discovery.
    */
  val configurationEndpointAddress: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * The identifiers of all the nodes that are part of this replication group.
    */
  val memberClusters: js.Array[String]
  /**
    * The cluster node type.
    */
  val nodeType: String
  /**
    * The number of cache clusters that the replication group has.
    */
  val numberCacheClusters: Double
  /**
    * The port number on which the configuration endpoint will accept connections.
    */
  val port: Double
  /**
    * The endpoint of the primary node in this node group (shard).
    */
  val primaryEndpointAddress: String
  /**
    * The description of the replication group.
    */
  val replicationGroupDescription: String
  /**
    * The identifier for the replication group.
    */
  val replicationGroupId: String
  /**
    * The number of days for which ElastiCache retains automatic cache cluster snapshots before deleting them.
    */
  val snapshotRetentionLimit: Double
  /**
    * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your node group (shard).
    */
  val snapshotWindow: String
}

object GetReplicationGroupResult {
  @scala.inline
  def apply(
    authTokenEnabled: Boolean,
    automaticFailoverEnabled: Boolean,
    configurationEndpointAddress: String,
    id: String,
    memberClusters: js.Array[String],
    nodeType: String,
    numberCacheClusters: Double,
    port: Double,
    primaryEndpointAddress: String,
    replicationGroupDescription: String,
    replicationGroupId: String,
    snapshotRetentionLimit: Double,
    snapshotWindow: String
  ): GetReplicationGroupResult = {
    val __obj = js.Dynamic.literal(authTokenEnabled = authTokenEnabled, automaticFailoverEnabled = automaticFailoverEnabled, configurationEndpointAddress = configurationEndpointAddress, id = id, memberClusters = memberClusters, nodeType = nodeType, numberCacheClusters = numberCacheClusters, port = port, primaryEndpointAddress = primaryEndpointAddress, replicationGroupDescription = replicationGroupDescription, replicationGroupId = replicationGroupId, snapshotRetentionLimit = snapshotRetentionLimit, snapshotWindow = snapshotWindow)
  
    __obj.asInstanceOf[GetReplicationGroupResult]
  }
}

