package typings.pulsarClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProducerOpts extends js.Object {
  /**
    * If set to true, the producer send message as batch.
    * Default: true
    */
  var batchingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The maximum size of sending message in each time of batching.
    * Default: 1000
    */
  var batchingMaxMessages: js.UndefOr[Double] = js.native
  /**
    * The maximum time of delay sending message in batching.
    * Default: 10
    */
  var batchingMaxPublishDelayMs: js.UndefOr[Double] = js.native
  /**
    * If set to true, the producer's send method will wait when the outgoing message queue is full rather than failing and throwing an error
    * (the size of that queue is dictated by the maxPendingMessages parameter); if set to false (the default),send operations will fail and
    * throw a error when the queue is full.
    * Default: false
    */
  var blockIfQueueFull: js.UndefOr[Boolean] = js.native
  /**
    * The message data compression type used by the producer. The available options are LZ4, and Zlib.
    * Default: No Compression
    */
  var compressionType: js.UndefOr[CompressionType] = js.native
  /**
    * The hashing function that determines the partition on which a particular message is published (partitioned topics only).
    * The available options are: JavaStringHash (the equivalent of String.hashCode() in Java), Murmur3_32Hash (applies the Murmur3 hashing function),
    * or BoostHash (applies the hashing function from C++'s Boost library).
    * Default: BoostHash
    */
  var hashingScheme: js.UndefOr[HashingScheme] = js.native
  /**
    * The initial sequence ID of the message. When producer send message, add sequence ID to message. The ID is increased each time to send.
    */
  var initialSequenceId: js.UndefOr[Double] = js.native
  /**
    * The maximum size of the queue holding pending messages (i.e. messages waiting to receive an acknowledgment from the broker).
    * By default, when the queue is full all calls to the send method will fail unless blockIfQueueFull is set to true.
    * Default: 1000
    */
  var maxPendingMessages: js.UndefOr[Double] = js.native
  /**
    * The maximum size of the sum of partition's pending queue.
    * Default: 50000
    */
  var maxPendingMessagesAcrossPartitions: js.UndefOr[Double] = js.native
  /**
    * The message routing logic (for producers on partitioned topics). This logic is applied only when no key is set on messages. The available
    * options are: round robin (RoundRobinDistribution), or publishing all messages to a single partition (UseSinglePartition).
    * Default: UseSinglePartition
    */
  var messageRoutingMode: js.UndefOr[MessageRoutingModes] = js.native
  /**
    * A name for the producer. If you do not explicitly assign a name, Pulsar will automatically generate a globally unique name.
    * If you choose to explicitly assign a name, it will need to be unique across all Pulsar clusters, otherwise the creation operation will throw an error.
    */
  var producerName: js.UndefOr[String] = js.native
  /**
    * The metadata of producer.
    */
  var properties: js.UndefOr[MessageProperties] = js.native
  /**
    * When publishing a message to a topic, the producer will wait for an acknowledgment from the responsible Pulsar broker.
    * If a message is not acknowledged within the threshold set by this parameter, an error will be thrown. If you set sendTimeoutMs to -1,
    * the timeout will be set to infinity (and thus removed). Removing the send timeout is recommended when using Pulsar's message de-duplication feature.
    * Default: 30000
    */
  var sendTimeoutMs: js.UndefOr[Double] = js.native
  /**
    * The Pulsar topic to which the producer will publish messages.
    */
  var topic: String = js.native
}

object ProducerOpts {
  @scala.inline
  def apply(topic: String): ProducerOpts = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProducerOpts]
  }
  @scala.inline
  implicit class ProducerOptsOps[Self <: ProducerOpts] (val x: Self) extends AnyVal {
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
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    @scala.inline
    def setBatchingEnabled(value: Boolean): Self = this.set("batchingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchingEnabled: Self = this.set("batchingEnabled", js.undefined)
    @scala.inline
    def setBatchingMaxMessages(value: Double): Self = this.set("batchingMaxMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchingMaxMessages: Self = this.set("batchingMaxMessages", js.undefined)
    @scala.inline
    def setBatchingMaxPublishDelayMs(value: Double): Self = this.set("batchingMaxPublishDelayMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchingMaxPublishDelayMs: Self = this.set("batchingMaxPublishDelayMs", js.undefined)
    @scala.inline
    def setBlockIfQueueFull(value: Boolean): Self = this.set("blockIfQueueFull", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockIfQueueFull: Self = this.set("blockIfQueueFull", js.undefined)
    @scala.inline
    def setCompressionType(value: CompressionType): Self = this.set("compressionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompressionType: Self = this.set("compressionType", js.undefined)
    @scala.inline
    def setHashingScheme(value: HashingScheme): Self = this.set("hashingScheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHashingScheme: Self = this.set("hashingScheme", js.undefined)
    @scala.inline
    def setInitialSequenceId(value: Double): Self = this.set("initialSequenceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialSequenceId: Self = this.set("initialSequenceId", js.undefined)
    @scala.inline
    def setMaxPendingMessages(value: Double): Self = this.set("maxPendingMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPendingMessages: Self = this.set("maxPendingMessages", js.undefined)
    @scala.inline
    def setMaxPendingMessagesAcrossPartitions(value: Double): Self = this.set("maxPendingMessagesAcrossPartitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPendingMessagesAcrossPartitions: Self = this.set("maxPendingMessagesAcrossPartitions", js.undefined)
    @scala.inline
    def setMessageRoutingMode(value: MessageRoutingModes): Self = this.set("messageRoutingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageRoutingMode: Self = this.set("messageRoutingMode", js.undefined)
    @scala.inline
    def setProducerName(value: String): Self = this.set("producerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProducerName: Self = this.set("producerName", js.undefined)
    @scala.inline
    def setPropertiesVarargs(value: js.Any*): Self = this.set("properties", js.Array(value :_*))
    @scala.inline
    def setProperties(value: MessageProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setSendTimeoutMs(value: Double): Self = this.set("sendTimeoutMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendTimeoutMs: Self = this.set("sendTimeoutMs", js.undefined)
  }
  
}

