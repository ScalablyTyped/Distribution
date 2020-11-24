package typings.pulumiAws.getReplicationGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * The provider-assigned unique ID for this managed resource.
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
  
  @scala.inline
  implicit class GetReplicationGroupResultOps[Self <: GetReplicationGroupResult] (val x: Self) extends AnyVal {
    
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
    def setAuthTokenEnabled(value: Boolean): Self = this.set("authTokenEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticFailoverEnabled(value: Boolean): Self = this.set("automaticFailoverEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationEndpointAddress(value: String): Self = this.set("configurationEndpointAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberClustersVarargs(value: String*): Self = this.set("memberClusters", js.Array(value :_*))
    
    @scala.inline
    def setMemberClusters(value: js.Array[String]): Self = this.set("memberClusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeType(value: String): Self = this.set("nodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberCacheClusters(value: Double): Self = this.set("numberCacheClusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryEndpointAddress(value: String): Self = this.set("primaryEndpointAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationGroupDescription(value: String): Self = this.set("replicationGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationGroupId(value: String): Self = this.set("replicationGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotRetentionLimit(value: Double): Self = this.set("snapshotRetentionLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotWindow(value: String): Self = this.set("snapshotWindow", value.asInstanceOf[js.Any])
  }
}
