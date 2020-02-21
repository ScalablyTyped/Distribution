package typings.pulsarClient.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProducerMessage extends js.Object {
  /**
    * The actual data payload of the message.
    */
  var data: Buffer
  /**
    * The timestamp associated with the message.
    */
  var eventTimestamp: js.UndefOr[Double] = js.undefined
  /**
    * The optional key associated with the message (particularly useful for things like topic compaction).
    */
  var partitionKey: js.UndefOr[String] = js.undefined
  /**
    * A Object for any application-specific metadata attached to the message.
    */
  var properties: js.UndefOr[MessageProperties] = js.undefined
  /**
    * The clusters to which this message will be replicated. Pulsar brokers handle message replication automatically;
    * you should only change this setting if you want to override the broker default.
    */
  var replicationClusters: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The sequence ID of the message.
    */
  var sequenceId: js.UndefOr[Double] = js.undefined
}

object ProducerMessage {
  @scala.inline
  def apply(
    data: Buffer,
    eventTimestamp: Int | Double = null,
    partitionKey: String = null,
    properties: MessageProperties = null,
    replicationClusters: js.Array[String] = null,
    sequenceId: Int | Double = null
  ): ProducerMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (eventTimestamp != null) __obj.updateDynamic("eventTimestamp")(eventTimestamp.asInstanceOf[js.Any])
    if (partitionKey != null) __obj.updateDynamic("partitionKey")(partitionKey.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (replicationClusters != null) __obj.updateDynamic("replicationClusters")(replicationClusters.asInstanceOf[js.Any])
    if (sequenceId != null) __obj.updateDynamic("sequenceId")(sequenceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProducerMessage]
  }
}

