package typings.pulsarClient.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProducerMessage extends js.Object {
  
  /**
    * The actual data payload of the message.
    */
  var data: Buffer = js.native
  
  /**
    * The timestamp associated with the message.
    */
  var eventTimestamp: js.UndefOr[Double] = js.native
  
  /**
    * The optional key associated with the message (particularly useful for things like topic compaction).
    */
  var partitionKey: js.UndefOr[String] = js.native
  
  /**
    * A Object for any application-specific metadata attached to the message.
    */
  var properties: js.UndefOr[MessageProperties] = js.native
  
  /**
    * The clusters to which this message will be replicated. Pulsar brokers handle message replication automatically;
    * you should only change this setting if you want to override the broker default.
    */
  var replicationClusters: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The sequence ID of the message.
    */
  var sequenceId: js.UndefOr[Double] = js.native
}
object ProducerMessage {
  
  @scala.inline
  def apply(data: Buffer): ProducerMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProducerMessage]
  }
  
  @scala.inline
  implicit class ProducerMessageOps[Self <: ProducerMessage] (val x: Self) extends AnyVal {
    
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
    def setData(value: Buffer): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTimestamp(value: Double): Self = this.set("eventTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTimestamp: Self = this.set("eventTimestamp", js.undefined)
    
    @scala.inline
    def setPartitionKey(value: String): Self = this.set("partitionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitionKey: Self = this.set("partitionKey", js.undefined)
    
    @scala.inline
    def setProperties(value: MessageProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setReplicationClustersVarargs(value: String*): Self = this.set("replicationClusters", js.Array(value :_*))
    
    @scala.inline
    def setReplicationClusters(value: js.Array[String]): Self = this.set("replicationClusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationClusters: Self = this.set("replicationClusters", js.undefined)
    
    @scala.inline
    def setSequenceId(value: Double): Self = this.set("sequenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSequenceId: Self = this.set("sequenceId", js.undefined)
  }
}
