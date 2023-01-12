package typings.pulsarClient.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProducerConfig extends StObject {
  
  var batchingEnabled: js.UndefOr[Boolean] = js.undefined
  
  var batchingMaxMessages: js.UndefOr[Double] = js.undefined
  
  var batchingMaxPublishDelayMs: js.UndefOr[Double] = js.undefined
  
  var blockIfQueueFull: js.UndefOr[Boolean] = js.undefined
  
  var compressionType: js.UndefOr[CompressionType] = js.undefined
  
  var cryptoFailureAction: js.UndefOr[ProducerCryptoFailureAction] = js.undefined
  
  var encryptionKey: js.UndefOr[String] = js.undefined
  
  var hashingScheme: js.UndefOr[HashingScheme] = js.undefined
  
  var initialSequenceId: js.UndefOr[Double] = js.undefined
  
  var maxPendingMessages: js.UndefOr[Double] = js.undefined
  
  var maxPendingMessagesAcrossPartitions: js.UndefOr[Double] = js.undefined
  
  var messageRoutingMode: js.UndefOr[MessageRoutingMode] = js.undefined
  
  var producerName: js.UndefOr[String] = js.undefined
  
  var properties: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var publicKeyPath: js.UndefOr[String] = js.undefined
  
  var sendTimeoutMs: js.UndefOr[Double] = js.undefined
  
  var topic: String
}
object ProducerConfig {
  
  inline def apply(topic: String): ProducerConfig = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProducerConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProducerConfig] (val x: Self) extends AnyVal {
    
    inline def setBatchingEnabled(value: Boolean): Self = StObject.set(x, "batchingEnabled", value.asInstanceOf[js.Any])
    
    inline def setBatchingEnabledUndefined: Self = StObject.set(x, "batchingEnabled", js.undefined)
    
    inline def setBatchingMaxMessages(value: Double): Self = StObject.set(x, "batchingMaxMessages", value.asInstanceOf[js.Any])
    
    inline def setBatchingMaxMessagesUndefined: Self = StObject.set(x, "batchingMaxMessages", js.undefined)
    
    inline def setBatchingMaxPublishDelayMs(value: Double): Self = StObject.set(x, "batchingMaxPublishDelayMs", value.asInstanceOf[js.Any])
    
    inline def setBatchingMaxPublishDelayMsUndefined: Self = StObject.set(x, "batchingMaxPublishDelayMs", js.undefined)
    
    inline def setBlockIfQueueFull(value: Boolean): Self = StObject.set(x, "blockIfQueueFull", value.asInstanceOf[js.Any])
    
    inline def setBlockIfQueueFullUndefined: Self = StObject.set(x, "blockIfQueueFull", js.undefined)
    
    inline def setCompressionType(value: CompressionType): Self = StObject.set(x, "compressionType", value.asInstanceOf[js.Any])
    
    inline def setCompressionTypeUndefined: Self = StObject.set(x, "compressionType", js.undefined)
    
    inline def setCryptoFailureAction(value: ProducerCryptoFailureAction): Self = StObject.set(x, "cryptoFailureAction", value.asInstanceOf[js.Any])
    
    inline def setCryptoFailureActionUndefined: Self = StObject.set(x, "cryptoFailureAction", js.undefined)
    
    inline def setEncryptionKey(value: String): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    inline def setHashingScheme(value: HashingScheme): Self = StObject.set(x, "hashingScheme", value.asInstanceOf[js.Any])
    
    inline def setHashingSchemeUndefined: Self = StObject.set(x, "hashingScheme", js.undefined)
    
    inline def setInitialSequenceId(value: Double): Self = StObject.set(x, "initialSequenceId", value.asInstanceOf[js.Any])
    
    inline def setInitialSequenceIdUndefined: Self = StObject.set(x, "initialSequenceId", js.undefined)
    
    inline def setMaxPendingMessages(value: Double): Self = StObject.set(x, "maxPendingMessages", value.asInstanceOf[js.Any])
    
    inline def setMaxPendingMessagesAcrossPartitions(value: Double): Self = StObject.set(x, "maxPendingMessagesAcrossPartitions", value.asInstanceOf[js.Any])
    
    inline def setMaxPendingMessagesAcrossPartitionsUndefined: Self = StObject.set(x, "maxPendingMessagesAcrossPartitions", js.undefined)
    
    inline def setMaxPendingMessagesUndefined: Self = StObject.set(x, "maxPendingMessages", js.undefined)
    
    inline def setMessageRoutingMode(value: MessageRoutingMode): Self = StObject.set(x, "messageRoutingMode", value.asInstanceOf[js.Any])
    
    inline def setMessageRoutingModeUndefined: Self = StObject.set(x, "messageRoutingMode", js.undefined)
    
    inline def setProducerName(value: String): Self = StObject.set(x, "producerName", value.asInstanceOf[js.Any])
    
    inline def setProducerNameUndefined: Self = StObject.set(x, "producerName", js.undefined)
    
    inline def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPublicKeyPath(value: String): Self = StObject.set(x, "publicKeyPath", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyPathUndefined: Self = StObject.set(x, "publicKeyPath", js.undefined)
    
    inline def setSendTimeoutMs(value: Double): Self = StObject.set(x, "sendTimeoutMs", value.asInstanceOf[js.Any])
    
    inline def setSendTimeoutMsUndefined: Self = StObject.set(x, "sendTimeoutMs", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
