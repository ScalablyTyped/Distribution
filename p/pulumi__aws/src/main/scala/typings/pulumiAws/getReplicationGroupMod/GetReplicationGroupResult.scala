package typings.pulumiAws.getReplicationGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReplicationGroupResult extends js.Object {
  /**
    * A flag that enables using an AuthToken (password) when issuing Redis commands.
    */
  val authTokenEnabled: Boolean = js.native
  /**
    * A flag whether a read-only replica will be automatically promoted to read/write primary if the existing primary fails.
    */
  val automaticFailoverEnabled: Boolean = js.native
  /**
    * The configuration endpoint address to allow host discovery.
    */
  val configurationEndpointAddress: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The identifiers of all the nodes that are part of this replication group.
    */
  val memberClusters: js.Array[String] = js.native
  /**
    * The cluster node type.
    */
  val nodeType: String = js.native
  /**
    * The number of cache clusters that the replication group has.
    */
  val numberCacheClusters: Double = js.native
  /**
    * The port number on which the configuration endpoint will accept connections.
    */
  val port: Double = js.native
  /**
    * The endpoint of the primary node in this node group (shard).
    */
  val primaryEndpointAddress: String = js.native
  /**
    * The description of the replication group.
    */
  val replicationGroupDescription: String = js.native
  /**
    * The identifier for the replication group.
    */
  val replicationGroupId: String = js.native
  /**
    * The number of days for which ElastiCache retains automatic cache cluster snapshots before deleting them.
    */
  val snapshotRetentionLimit: Double = js.native
  /**
    * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your node group (shard).
    */
  val snapshotWindow: String = js.native
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
    val __obj = js.Dynamic.literal(authTokenEnabled = authTokenEnabled.asInstanceOf[js.Any], automaticFailoverEnabled = automaticFailoverEnabled.asInstanceOf[js.Any], configurationEndpointAddress = configurationEndpointAddress.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memberClusters = memberClusters.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], numberCacheClusters = numberCacheClusters.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], primaryEndpointAddress = primaryEndpointAddress.asInstanceOf[js.Any], replicationGroupDescription = replicationGroupDescription.asInstanceOf[js.Any], replicationGroupId = replicationGroupId.asInstanceOf[js.Any], snapshotRetentionLimit = snapshotRetentionLimit.asInstanceOf[js.Any], snapshotWindow = snapshotWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReplicationGroupResult]
  }
}

