package typings.pulsarClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProducerOpts extends js.Object {
  /**
    * If set to true, the producer send message as batch.
    * Default: true
    */
  var batchingEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum size of sending message in each time of batching.
    * Default: 1000
    */
  var batchingMaxMessages: js.UndefOr[Double] = js.undefined
  /**
    * The maximum time of delay sending message in batching.
    * Default: 10
    */
  var batchingMaxPublishDelayMs: js.UndefOr[Double] = js.undefined
  /**
    * If set to true, the producer's send method will wait when the outgoing message queue is full rather than failing and throwing an error
    * (the size of that queue is dictated by the maxPendingMessages parameter); if set to false (the default),send operations will fail and
    * throw a error when the queue is full.
    * Default: false
    */
  var blockIfQueueFull: js.UndefOr[Boolean] = js.undefined
  /**
    * The message data compression type used by the producer. The available options are LZ4, and Zlib.
    * Default: No Compression
    */
  var compressionType: js.UndefOr[CompressionType] = js.undefined
  /**
    * The hashing function that determines the partition on which a particular message is published (partitioned topics only).
    * The available options are: JavaStringHash (the equivalent of String.hashCode() in Java), Murmur3_32Hash (applies the Murmur3 hashing function),
    * or BoostHash (applies the hashing function from C++'s Boost library).
    * Default: BoostHash
    */
  var hashingScheme: js.UndefOr[HashingScheme] = js.undefined
  /**
    * The initial sequence ID of the message. When producer send message, add sequence ID to message. The ID is increased each time to send.
    */
  var initialSequenceId: js.UndefOr[Double] = js.undefined
  /**
    * The maximum size of the queue holding pending messages (i.e. messages waiting to receive an acknowledgment from the broker).
    * By default, when the queue is full all calls to the send method will fail unless blockIfQueueFull is set to true.
    * Default: 1000
    */
  var maxPendingMessages: js.UndefOr[Double] = js.undefined
  /**
    * The maximum size of the sum of partition's pending queue.
    * Default: 50000
    */
  var maxPendingMessagesAcrossPartitions: js.UndefOr[Double] = js.undefined
  /**
    * The message routing logic (for producers on partitioned topics). This logic is applied only when no key is set on messages. The available
    * options are: round robin (RoundRobinDistribution), or publishing all messages to a single partition (UseSinglePartition).
    * Default: UseSinglePartition
    */
  var messageRoutingMode: js.UndefOr[MessageRoutingModes] = js.undefined
  /**
    * A name for the producer. If you do not explicitly assign a name, Pulsar will automatically generate a globally unique name.
    * If you choose to explicitly assign a name, it will need to be unique across all Pulsar clusters, otherwise the creation operation will throw an error.
    */
  var producerName: js.UndefOr[String] = js.undefined
  /**
    * The metadata of producer.
    */
  var properties: js.UndefOr[MessageProperties] = js.undefined
  /**
    * When publishing a message to a topic, the producer will wait for an acknowledgment from the responsible Pulsar broker.
    * If a message is not acknowledged within the threshold set by this parameter, an error will be thrown. If you set sendTimeoutMs to -1,
    * the timeout will be set to infinity (and thus removed). Removing the send timeout is recommended when using Pulsar's message de-duplication feature.
    * Default: 30000
    */
  var sendTimeoutMs: js.UndefOr[Double] = js.undefined
  /**
    * The Pulsar topic to which the producer will publish messages.
    */
  var topic: String
}

object ProducerOpts {
  @scala.inline
  def apply(
    topic: String,
    batchingEnabled: js.UndefOr[Boolean] = js.undefined,
    batchingMaxMessages: js.UndefOr[Double] = js.undefined,
    batchingMaxPublishDelayMs: js.UndefOr[Double] = js.undefined,
    blockIfQueueFull: js.UndefOr[Boolean] = js.undefined,
    compressionType: CompressionType = null,
    hashingScheme: HashingScheme = null,
    initialSequenceId: js.UndefOr[Double] = js.undefined,
    maxPendingMessages: js.UndefOr[Double] = js.undefined,
    maxPendingMessagesAcrossPartitions: js.UndefOr[Double] = js.undefined,
    messageRoutingMode: MessageRoutingModes = null,
    producerName: String = null,
    properties: MessageProperties = null,
    sendTimeoutMs: js.UndefOr[Double] = js.undefined
  ): ProducerOpts = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    if (!js.isUndefined(batchingEnabled)) __obj.updateDynamic("batchingEnabled")(batchingEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(batchingMaxMessages)) __obj.updateDynamic("batchingMaxMessages")(batchingMaxMessages.get.asInstanceOf[js.Any])
    if (!js.isUndefined(batchingMaxPublishDelayMs)) __obj.updateDynamic("batchingMaxPublishDelayMs")(batchingMaxPublishDelayMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(blockIfQueueFull)) __obj.updateDynamic("blockIfQueueFull")(blockIfQueueFull.get.asInstanceOf[js.Any])
    if (compressionType != null) __obj.updateDynamic("compressionType")(compressionType.asInstanceOf[js.Any])
    if (hashingScheme != null) __obj.updateDynamic("hashingScheme")(hashingScheme.asInstanceOf[js.Any])
    if (!js.isUndefined(initialSequenceId)) __obj.updateDynamic("initialSequenceId")(initialSequenceId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPendingMessages)) __obj.updateDynamic("maxPendingMessages")(maxPendingMessages.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPendingMessagesAcrossPartitions)) __obj.updateDynamic("maxPendingMessagesAcrossPartitions")(maxPendingMessagesAcrossPartitions.get.asInstanceOf[js.Any])
    if (messageRoutingMode != null) __obj.updateDynamic("messageRoutingMode")(messageRoutingMode.asInstanceOf[js.Any])
    if (producerName != null) __obj.updateDynamic("producerName")(producerName.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (!js.isUndefined(sendTimeoutMs)) __obj.updateDynamic("sendTimeoutMs")(sendTimeoutMs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProducerOpts]
  }
}

