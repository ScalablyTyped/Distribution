package typings.pulsarClient

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.pulsarClient.anon.CertificatePath
import typings.pulsarClient.anon.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pulsar-client", "AuthenticationTls")
  @js.native
  class AuthenticationTls protected () extends StObject {
    def this(authTlsOpts: CertificatePath) = this()
    
    var certificatePath: String = js.native
    
    var privateKeyPath: String = js.native
  }
  
  @JSImport("pulsar-client", "AuthenticationToken")
  @js.native
  class AuthenticationToken protected () extends StObject {
    def this(authTokenOpts: Token) = this()
    
    var token: String = js.native
  }
  
  @JSImport("pulsar-client", "Client")
  @js.native
  class Client protected () extends StObject {
    def this(opts: ClientOpts) = this()
    
    def close(): js.Promise[Null] = js.native
    
    def createProducer(data: ProducerOpts): js.Promise[Producer] = js.native
    
    def createReader(data: ReaderOpts): js.Promise[Reader] = js.native
    
    def subscribe(data: SubscribeOpts): js.Promise[Consumer] = js.native
  }
  
  @JSImport("pulsar-client", "Consumer")
  @js.native
  class Consumer () extends StObject {
    
    /**
      * Acknowledges a message to the Pulsar broker by message object.
      * @param message Message to acknowledge.
      */
    def acknowledge(message: Message): Unit = js.native
    
    /**
      * Acknowledges all the messages in the stream, up to and including the specified message.
      * The acknowledgeCumulative method will return void, and send the ack to the broker asynchronously.
      * After that, the messages will not be redelivered to the consumer. Cumulative acking can not be used with a shared subscription type.
      * @param message Message to acknowledge cumulatively.
      */
    def acknowledgeCumulative(message: Message): Unit = js.native
    
    /**
      * Acknowledges all the messages in the stream, up to and including the specified message ID.
      * @param messageId Message ID to acknowledge cumulatively.
      */
    def acknowledgeCumulativeId(messageId: MessageId): Unit = js.native
    
    /**
      * Acknowledges a message to the Pulsar broker by message ID object.
      * @param messageId Message ID to acknowledge.
      */
    def acknowledgeId(messageId: MessageId): Unit = js.native
    
    /**
      * Closes the consumer, disabling its ability to receive messages from the broker.
      */
    def close(): js.Promise[Null] = js.native
    
    /**
      * Negatively acknowledges a message to the Pulsar broker by message object.
      * @param message Message to acknowledge.
      */
    def negativeAcknowledge(message: Message): Unit = js.native
    
    /**
      * Negatively acknowledges a message to the Pulsar broker by message ID object.
      * @param messageId Message ID to acknowledge.
      */
    def negativeAcknowledgeId(messageId: MessageId): Unit = js.native
    
    /**
      * Receives a single message from the topic with optional specific timeout in milliseconds.
      * @param timeout Wait timeout in milliseconds.
      */
    def receive(): js.Promise[Message] = js.native
    def receive(timeout: Double): js.Promise[Message] = js.native
  }
  
  @JSImport("pulsar-client", "Message")
  @js.native
  class Message () extends StObject {
    
    /**
      * Getter method of message data.
      */
    def getData(): Buffer = js.native
    
    /**
      * Getter method of event timestamp.
      */
    def getEventTimestamp(): Double = js.native
    
    /**
      * Getter method of message id object.
      */
    def getMessageId(): MessageId = js.native
    
    /**
      * Getter method of partition key.
      */
    def getPartitionKey(): String = js.native
    
    /**
      * Getter method of properties.
      */
    def getProperties(): MessageProperties = js.native
    
    /**
      * Getter method of publish timestamp.
      */
    def getPublishTimestamp(): Double = js.native
    
    /**
      * Getter method of topic name.
      */
    def getTopicName(): String = js.native
  }
  
  @JSImport("pulsar-client", "MessageId")
  @js.native
  class MessageId () extends StObject {
    
    /**
      * Serialize the message id into a Buffer for storing.
      */
    def serialize(): Buffer = js.native
  }
  /* static members */
  object MessageId {
    
    /**
      * Deserialize a message id object from a Buffer.
      * @param data
      */
    @JSImport("pulsar-client", "MessageId.deserialize")
    @js.native
    def deserialize(data: Buffer): MessageId = js.native
    
    /**
      * MessageId representing the earliest, or oldest available message stored in the topic.
      */
    @JSImport("pulsar-client", "MessageId.earliest")
    @js.native
    def earliest(): MessageId = js.native
    
    /**
      * MessageId representing the latest, or last published message in the topic.
      */
    @JSImport("pulsar-client", "MessageId.latest")
    @js.native
    def latest(): MessageId = js.native
  }
  
  @JSImport("pulsar-client", "Producer")
  @js.native
  class Producer () extends StObject {
    
    /**
      * Closes the producer and releases all resources allocated to it. If close() is called then no more messages will be accepted from the publisher.
      * This method will return Promise object, and when all pending publish requests have been persisted by Pulsar then run executor function.
      * If an error is thrown, no pending writes will be retried.
      */
    def close(): js.Promise[Null] = js.native
    
    /**
      * Sends message from send queue to Pulser broker. When the message is successfully acknowledged by the Pulsar broker,
      * or an error will be thrown, the Promise object run executor function.
      */
    def flush(): js.Promise[Null] = js.native
    
    /**
      * Publishes a message to the producer's topic. When the message is successfully acknowledged by the Pulsar broker,
      * or an error will be thrown, the Promise object run executor function.
      * @param message Message to be published.
      */
    def send(message: ProducerMessage): js.Promise[Null] = js.native
  }
  
  @JSImport("pulsar-client", "Reader")
  @js.native
  class Reader () extends StObject {
    
    /**
      * Closes the reader, disabling its ability to receive messages from the broker.
      */
    def close(): js.Promise[Null] = js.native
    
    /**
      * Return whether Broker has next message in target topic.
      */
    def hasNext(): Boolean = js.native
    
    /**
      * Receives the next message on the topic (analogous to the receive method for consumers)
      * with optional specific timeout in milliseconds.
      * @param timeout Wait timeout in milliseconds.
      */
    def readNext(): js.Promise[Message] = js.native
    def readNext(timeout: Double): js.Promise[Message] = js.native
  }
  
  @js.native
  trait ClientOpts extends StObject {
    
    /**
      * Configure the authentication provider.
      * Default: No Authentication
      */
    var authentication: js.UndefOr[AuthenticationTls | AuthenticationToken] = js.native
    
    /**
      * The number of concurrent lookup requests that can be sent on each broker connection.
      * Setting a maximum helps to keep from overloading brokers.
      * You should set values over the default only if the client needs to produce and/or subscribe to thousands of Pulsar topics.
      * Default: 50000
      */
    var concurrentLookupRequest: js.UndefOr[Double] = js.native
    
    /**
      * The number of threads to use for handling connections to Pulsar brokers.
      * Default: 1
      */
    var ioThreads: js.UndefOr[Double] = js.native
    
    /**
      * The number of threads used by message listeners (consumers and readers).
      * Default: 1
      */
    var messageListenerThreads: js.UndefOr[Double] = js.native
    
    /**
      * The timeout for Node.js client operations (creating producers, subscribing to and unsubscribing from topics).
      * Retries will occur until this threshold is reached, at which point the operation will fail.
      * Default: 30
      */
    var operationTimeoutSeconds: js.UndefOr[Double] = js.native
    
    /**
      * The connection URL for the Pulsar cluster.
      */
    var serviceUrl: String = js.native
    
    /**
      * Interval between each stat info. Stats is activated with positive statsInterval. The value should be set to >= 1 second.
      * Default: 600
      */
    var statsIntervalInSeconds: js.UndefOr[Double] = js.native
    
    /**
      * The boolean value of setup whether the Pulsar client accepts untrusted TLS certificate from broker.
      * Default: false
      */
    var tlsAllowInsecureConnection: js.UndefOr[Boolean] = js.native
    
    /**
      * The file path for the trusted TLS certificate.
      */
    var tlsTrustCertsFilePath: js.UndefOr[String] = js.native
    
    /**
      * The boolean value of setup whether to enable TLS hostname verification.
      * Default: false
      */
    var tlsValidateHostname: js.UndefOr[Boolean] = js.native
  }
  object ClientOpts {
    
    @scala.inline
    def apply(serviceUrl: String): ClientOpts = {
      val __obj = js.Dynamic.literal(serviceUrl = serviceUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientOpts]
    }
    
    @scala.inline
    implicit class ClientOptsMutableBuilder[Self <: ClientOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthentication(value: AuthenticationTls | AuthenticationToken): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthenticationUndefined: Self = StObject.set(x, "authentication", js.undefined)
      
      @scala.inline
      def setConcurrentLookupRequest(value: Double): Self = StObject.set(x, "concurrentLookupRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrentLookupRequestUndefined: Self = StObject.set(x, "concurrentLookupRequest", js.undefined)
      
      @scala.inline
      def setIoThreads(value: Double): Self = StObject.set(x, "ioThreads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIoThreadsUndefined: Self = StObject.set(x, "ioThreads", js.undefined)
      
      @scala.inline
      def setMessageListenerThreads(value: Double): Self = StObject.set(x, "messageListenerThreads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageListenerThreadsUndefined: Self = StObject.set(x, "messageListenerThreads", js.undefined)
      
      @scala.inline
      def setOperationTimeoutSeconds(value: Double): Self = StObject.set(x, "operationTimeoutSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationTimeoutSecondsUndefined: Self = StObject.set(x, "operationTimeoutSeconds", js.undefined)
      
      @scala.inline
      def setServiceUrl(value: String): Self = StObject.set(x, "serviceUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsIntervalInSeconds(value: Double): Self = StObject.set(x, "statsIntervalInSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsIntervalInSecondsUndefined: Self = StObject.set(x, "statsIntervalInSeconds", js.undefined)
      
      @scala.inline
      def setTlsAllowInsecureConnection(value: Boolean): Self = StObject.set(x, "tlsAllowInsecureConnection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsAllowInsecureConnectionUndefined: Self = StObject.set(x, "tlsAllowInsecureConnection", js.undefined)
      
      @scala.inline
      def setTlsTrustCertsFilePath(value: String): Self = StObject.set(x, "tlsTrustCertsFilePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsTrustCertsFilePathUndefined: Self = StObject.set(x, "tlsTrustCertsFilePath", js.undefined)
      
      @scala.inline
      def setTlsValidateHostname(value: Boolean): Self = StObject.set(x, "tlsValidateHostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsValidateHostnameUndefined: Self = StObject.set(x, "tlsValidateHostname", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pulsarClient.pulsarClientStrings.LZ4
    - typings.pulsarClient.pulsarClientStrings.Zlib
  */
  trait CompressionType extends StObject
  object CompressionType {
    
    @scala.inline
    def LZ4: typings.pulsarClient.pulsarClientStrings.LZ4 = "LZ4".asInstanceOf[typings.pulsarClient.pulsarClientStrings.LZ4]
    
    @scala.inline
    def Zlib: typings.pulsarClient.pulsarClientStrings.Zlib = "Zlib".asInstanceOf[typings.pulsarClient.pulsarClientStrings.Zlib]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pulsarClient.pulsarClientStrings.BoostHash
    - typings.pulsarClient.pulsarClientStrings.JavaStringHash
    - typings.pulsarClient.pulsarClientStrings.Murmur3_32Hash
  */
  trait HashingScheme extends StObject
  object HashingScheme {
    
    @scala.inline
    def BoostHash: typings.pulsarClient.pulsarClientStrings.BoostHash = "BoostHash".asInstanceOf[typings.pulsarClient.pulsarClientStrings.BoostHash]
    
    @scala.inline
    def JavaStringHash: typings.pulsarClient.pulsarClientStrings.JavaStringHash = "JavaStringHash".asInstanceOf[typings.pulsarClient.pulsarClientStrings.JavaStringHash]
    
    @scala.inline
    def Murmur3_32Hash: typings.pulsarClient.pulsarClientStrings.Murmur3_32Hash = "Murmur3_32Hash".asInstanceOf[typings.pulsarClient.pulsarClientStrings.Murmur3_32Hash]
  }
  
  type MessageProperties = StringDictionary[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.pulsarClient.pulsarClientStrings.RoundRobinPartition
    - typings.pulsarClient.pulsarClientStrings.SinglePartition
    - typings.pulsarClient.pulsarClientStrings.CustomPartition
  */
  trait MessageRoutingModes extends StObject
  object MessageRoutingModes {
    
    @scala.inline
    def CustomPartition: typings.pulsarClient.pulsarClientStrings.CustomPartition = "CustomPartition".asInstanceOf[typings.pulsarClient.pulsarClientStrings.CustomPartition]
    
    @scala.inline
    def RoundRobinPartition: typings.pulsarClient.pulsarClientStrings.RoundRobinPartition = "RoundRobinPartition".asInstanceOf[typings.pulsarClient.pulsarClientStrings.RoundRobinPartition]
    
    @scala.inline
    def SinglePartition: typings.pulsarClient.pulsarClientStrings.SinglePartition = "SinglePartition".asInstanceOf[typings.pulsarClient.pulsarClientStrings.SinglePartition]
  }
  
  @js.native
  trait ProducerMessage extends StObject {
    
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
    implicit class ProducerMessageMutableBuilder[Self <: ProducerMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventTimestamp(value: Double): Self = StObject.set(x, "eventTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventTimestampUndefined: Self = StObject.set(x, "eventTimestamp", js.undefined)
      
      @scala.inline
      def setPartitionKey(value: String): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartitionKeyUndefined: Self = StObject.set(x, "partitionKey", js.undefined)
      
      @scala.inline
      def setProperties(value: MessageProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setReplicationClusters(value: js.Array[String]): Self = StObject.set(x, "replicationClusters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationClustersUndefined: Self = StObject.set(x, "replicationClusters", js.undefined)
      
      @scala.inline
      def setReplicationClustersVarargs(value: String*): Self = StObject.set(x, "replicationClusters", js.Array(value :_*))
      
      @scala.inline
      def setSequenceId(value: Double): Self = StObject.set(x, "sequenceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequenceIdUndefined: Self = StObject.set(x, "sequenceId", js.undefined)
    }
  }
  
  @js.native
  trait ProducerOpts extends StObject {
    
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
    implicit class ProducerOptsMutableBuilder[Self <: ProducerOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatchingEnabled(value: Boolean): Self = StObject.set(x, "batchingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchingEnabledUndefined: Self = StObject.set(x, "batchingEnabled", js.undefined)
      
      @scala.inline
      def setBatchingMaxMessages(value: Double): Self = StObject.set(x, "batchingMaxMessages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchingMaxMessagesUndefined: Self = StObject.set(x, "batchingMaxMessages", js.undefined)
      
      @scala.inline
      def setBatchingMaxPublishDelayMs(value: Double): Self = StObject.set(x, "batchingMaxPublishDelayMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchingMaxPublishDelayMsUndefined: Self = StObject.set(x, "batchingMaxPublishDelayMs", js.undefined)
      
      @scala.inline
      def setBlockIfQueueFull(value: Boolean): Self = StObject.set(x, "blockIfQueueFull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockIfQueueFullUndefined: Self = StObject.set(x, "blockIfQueueFull", js.undefined)
      
      @scala.inline
      def setCompressionType(value: CompressionType): Self = StObject.set(x, "compressionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionTypeUndefined: Self = StObject.set(x, "compressionType", js.undefined)
      
      @scala.inline
      def setHashingScheme(value: HashingScheme): Self = StObject.set(x, "hashingScheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashingSchemeUndefined: Self = StObject.set(x, "hashingScheme", js.undefined)
      
      @scala.inline
      def setInitialSequenceId(value: Double): Self = StObject.set(x, "initialSequenceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSequenceIdUndefined: Self = StObject.set(x, "initialSequenceId", js.undefined)
      
      @scala.inline
      def setMaxPendingMessages(value: Double): Self = StObject.set(x, "maxPendingMessages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPendingMessagesAcrossPartitions(value: Double): Self = StObject.set(x, "maxPendingMessagesAcrossPartitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPendingMessagesAcrossPartitionsUndefined: Self = StObject.set(x, "maxPendingMessagesAcrossPartitions", js.undefined)
      
      @scala.inline
      def setMaxPendingMessagesUndefined: Self = StObject.set(x, "maxPendingMessages", js.undefined)
      
      @scala.inline
      def setMessageRoutingMode(value: MessageRoutingModes): Self = StObject.set(x, "messageRoutingMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageRoutingModeUndefined: Self = StObject.set(x, "messageRoutingMode", js.undefined)
      
      @scala.inline
      def setProducerName(value: String): Self = StObject.set(x, "producerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProducerNameUndefined: Self = StObject.set(x, "producerName", js.undefined)
      
      @scala.inline
      def setProperties(value: MessageProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setSendTimeoutMs(value: Double): Self = StObject.set(x, "sendTimeoutMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSendTimeoutMsUndefined: Self = StObject.set(x, "sendTimeoutMs", js.undefined)
      
      @scala.inline
      def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReaderOpts extends StObject {
    
    /**
      * The name of the reader.
      */
    var readerName: js.UndefOr[String] = js.native
    
    /**
      * Sets the size of the reader's receiver queue, i.e. the number of messages that can be accumulated by the reader before the application calls readNext.
      * A value higher than the default of 1000 could increase reader throughput, though at the expense of more memory utilization.
      * Default 1000
      */
    var receiverQueueSize: js.UndefOr[Double] = js.native
    
    /**
      * The initial reader position, i.e. the message at which the reader begins processing messages.
      * The options are Pulsar.MessageId.earliest (the earliest available message on the topic), Pulsar.MessageId.latest (the latest available message on the topic),
      * or a message ID object for a position that is not earliest or latest.
      */
    var startMessageId: MessageId = js.native
    
    /**
      * The subscription role prefix.
      */
    var subscriptionRolePrefix: js.UndefOr[String] = js.native
    
    /**
      * The Pulsar topic on which the reader will establish a subscription and listen for messages.
      */
    var topic: String = js.native
  }
  object ReaderOpts {
    
    @scala.inline
    def apply(startMessageId: MessageId, topic: String): ReaderOpts = {
      val __obj = js.Dynamic.literal(startMessageId = startMessageId.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReaderOpts]
    }
    
    @scala.inline
    implicit class ReaderOptsMutableBuilder[Self <: ReaderOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReaderName(value: String): Self = StObject.set(x, "readerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReaderNameUndefined: Self = StObject.set(x, "readerName", js.undefined)
      
      @scala.inline
      def setReceiverQueueSize(value: Double): Self = StObject.set(x, "receiverQueueSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceiverQueueSizeUndefined: Self = StObject.set(x, "receiverQueueSize", js.undefined)
      
      @scala.inline
      def setStartMessageId(value: MessageId): Self = StObject.set(x, "startMessageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionRolePrefix(value: String): Self = StObject.set(x, "subscriptionRolePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionRolePrefixUndefined: Self = StObject.set(x, "subscriptionRolePrefix", js.undefined)
      
      @scala.inline
      def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SubscribeOpts extends StObject {
    
    /**
      * Acknowledge timeout in milliseconds.
      * Default: 0
      */
    var ackTimeoutMs: js.UndefOr[Double] = js.native
    
    /**
      * The name of consumer. Currently, failover mode uses consumer name for ordering.
      */
    var consumerName: js.UndefOr[String] = js.native
    
    /**
      * The metadata of consumer.
      */
    var properties: js.UndefOr[MessageProperties] = js.native
    
    /**
      * Sets the size of the consumer's receiver queue, i.e. the number of messages that can be accumulated by the consumer before the application calls receive.
      * A value higher than the default could increase consumer throughput, though at the expense of more memory utilization.
      * Default: 1000
      */
    var receiverQueueSize: js.UndefOr[Double] = js.native
    
    /**
      * Set the max total receiver queue size across partitions.
      * This setting will be used to reduce the receiver queue size for individual partitions if the total exceeds this value.
      * Default: 50000
      */
    var receiverQueueSizeAcrossPartitions: js.UndefOr[Double] = js.native
    
    /**
      * The subscription name for this consumer.
      */
    var subscription: String = js.native
    
    /**
      * Available options are Exclusive, Shared, and Failover.
      * Default: Exclusive
      */
    var subscriptionType: js.UndefOr[SubscriptionType] = js.native
    
    /**
      * The Pulsar topic on which the consumer will establish a subscription and listen for messages.
      */
    var topic: String = js.native
  }
  object SubscribeOpts {
    
    @scala.inline
    def apply(subscription: String, topic: String): SubscribeOpts = {
      val __obj = js.Dynamic.literal(subscription = subscription.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscribeOpts]
    }
    
    @scala.inline
    implicit class SubscribeOptsMutableBuilder[Self <: SubscribeOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAckTimeoutMs(value: Double): Self = StObject.set(x, "ackTimeoutMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAckTimeoutMsUndefined: Self = StObject.set(x, "ackTimeoutMs", js.undefined)
      
      @scala.inline
      def setConsumerName(value: String): Self = StObject.set(x, "consumerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumerNameUndefined: Self = StObject.set(x, "consumerName", js.undefined)
      
      @scala.inline
      def setProperties(value: MessageProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setReceiverQueueSize(value: Double): Self = StObject.set(x, "receiverQueueSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceiverQueueSizeAcrossPartitions(value: Double): Self = StObject.set(x, "receiverQueueSizeAcrossPartitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceiverQueueSizeAcrossPartitionsUndefined: Self = StObject.set(x, "receiverQueueSizeAcrossPartitions", js.undefined)
      
      @scala.inline
      def setReceiverQueueSizeUndefined: Self = StObject.set(x, "receiverQueueSize", js.undefined)
      
      @scala.inline
      def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionType(value: SubscriptionType): Self = StObject.set(x, "subscriptionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionTypeUndefined: Self = StObject.set(x, "subscriptionType", js.undefined)
      
      @scala.inline
      def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pulsarClient.pulsarClientStrings.Exclusive
    - typings.pulsarClient.pulsarClientStrings.Shared
    - typings.pulsarClient.pulsarClientStrings.Failover
    - typings.pulsarClient.pulsarClientStrings.KeyShared
  */
  trait SubscriptionType extends StObject
  object SubscriptionType {
    
    @scala.inline
    def Exclusive: typings.pulsarClient.pulsarClientStrings.Exclusive = "Exclusive".asInstanceOf[typings.pulsarClient.pulsarClientStrings.Exclusive]
    
    @scala.inline
    def Failover: typings.pulsarClient.pulsarClientStrings.Failover = "Failover".asInstanceOf[typings.pulsarClient.pulsarClientStrings.Failover]
    
    @scala.inline
    def KeyShared: typings.pulsarClient.pulsarClientStrings.KeyShared = "KeyShared".asInstanceOf[typings.pulsarClient.pulsarClientStrings.KeyShared]
    
    @scala.inline
    def Shared: typings.pulsarClient.pulsarClientStrings.Shared = "Shared".asInstanceOf[typings.pulsarClient.pulsarClientStrings.Shared]
  }
}
