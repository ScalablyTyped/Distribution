package typings
package atPulumiAwsLib.elasticacheGetReplicationGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReplicationGroupResult extends js.Object {
  /**
    * A flag that enables using an AuthToken (password) when issuing Redis commands.
    */
  val authTokenEnabled: scala.Boolean
  /**
    * A flag whether a read-only replica will be automatically promoted to read/write primary if the existing primary fails.
    */
  val automaticFailoverEnabled: scala.Boolean
  /**
    * The configuration endpoint address to allow host discovery.
    */
  val configurationEndpointAddress: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The identifiers of all the nodes that are part of this replication group.
    */
  val memberClusters: js.Array[java.lang.String]
  /**
    * The cluster node type.
    */
  val nodeType: java.lang.String
  /**
    * The number of cache clusters that the replication group has.
    */
  val numberCacheClusters: scala.Double
  /**
    * The port number on which the configuration endpoint will accept connections.
    */
  val port: scala.Double
  /**
    * The endpoint of the primary node in this node group (shard).
    */
  val primaryEndpointAddress: java.lang.String
  /**
    * The description of the replication group.
    */
  val replicationGroupDescription: java.lang.String
  /**
    * The number of days for which ElastiCache retains automatic cache cluster snapshots before deleting them.
    */
  val snapshotRetentionLimit: scala.Double
  /**
    * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your node group (shard).
    */
  val snapshotWindow: java.lang.String
}

