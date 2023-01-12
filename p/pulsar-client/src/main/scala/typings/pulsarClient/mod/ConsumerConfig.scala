package typings.pulsarClient.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumerConfig extends StObject {
  
  var ackTimeoutMs: js.UndefOr[Double] = js.undefined
  
  var consumerName: js.UndefOr[String] = js.undefined
  
  var cryptoFailureAction: js.UndefOr[ConsumerCryptoFailureAction] = js.undefined
  
  var listener: js.UndefOr[js.Function2[/* message */ Message, /* consumer */ Consumer, Unit]] = js.undefined
  
  var nAckRedeliverTimeoutMs: js.UndefOr[Double] = js.undefined
  
  var privateKeyPath: js.UndefOr[String] = js.undefined
  
  var properties: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var readCompacted: js.UndefOr[Boolean] = js.undefined
  
  var receiverQueueSize: js.UndefOr[Double] = js.undefined
  
  var receiverQueueSizeAcrossPartitions: js.UndefOr[Double] = js.undefined
  
  var subscription: String
  
  var subscriptionInitialPosition: js.UndefOr[InitialPosition] = js.undefined
  
  var subscriptionType: js.UndefOr[SubscriptionType] = js.undefined
  
  var topic: js.UndefOr[String] = js.undefined
  
  var topics: js.UndefOr[js.Array[String]] = js.undefined
  
  var topicsPattern: js.UndefOr[String] = js.undefined
}
object ConsumerConfig {
  
  inline def apply(subscription: String): ConsumerConfig = {
    val __obj = js.Dynamic.literal(subscription = subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConsumerConfig] (val x: Self) extends AnyVal {
    
    inline def setAckTimeoutMs(value: Double): Self = StObject.set(x, "ackTimeoutMs", value.asInstanceOf[js.Any])
    
    inline def setAckTimeoutMsUndefined: Self = StObject.set(x, "ackTimeoutMs", js.undefined)
    
    inline def setConsumerName(value: String): Self = StObject.set(x, "consumerName", value.asInstanceOf[js.Any])
    
    inline def setConsumerNameUndefined: Self = StObject.set(x, "consumerName", js.undefined)
    
    inline def setCryptoFailureAction(value: ConsumerCryptoFailureAction): Self = StObject.set(x, "cryptoFailureAction", value.asInstanceOf[js.Any])
    
    inline def setCryptoFailureActionUndefined: Self = StObject.set(x, "cryptoFailureAction", js.undefined)
    
    inline def setListener(value: (/* message */ Message, /* consumer */ Consumer) => Unit): Self = StObject.set(x, "listener", js.Any.fromFunction2(value))
    
    inline def setListenerUndefined: Self = StObject.set(x, "listener", js.undefined)
    
    inline def setNAckRedeliverTimeoutMs(value: Double): Self = StObject.set(x, "nAckRedeliverTimeoutMs", value.asInstanceOf[js.Any])
    
    inline def setNAckRedeliverTimeoutMsUndefined: Self = StObject.set(x, "nAckRedeliverTimeoutMs", js.undefined)
    
    inline def setPrivateKeyPath(value: String): Self = StObject.set(x, "privateKeyPath", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyPathUndefined: Self = StObject.set(x, "privateKeyPath", js.undefined)
    
    inline def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setReadCompacted(value: Boolean): Self = StObject.set(x, "readCompacted", value.asInstanceOf[js.Any])
    
    inline def setReadCompactedUndefined: Self = StObject.set(x, "readCompacted", js.undefined)
    
    inline def setReceiverQueueSize(value: Double): Self = StObject.set(x, "receiverQueueSize", value.asInstanceOf[js.Any])
    
    inline def setReceiverQueueSizeAcrossPartitions(value: Double): Self = StObject.set(x, "receiverQueueSizeAcrossPartitions", value.asInstanceOf[js.Any])
    
    inline def setReceiverQueueSizeAcrossPartitionsUndefined: Self = StObject.set(x, "receiverQueueSizeAcrossPartitions", js.undefined)
    
    inline def setReceiverQueueSizeUndefined: Self = StObject.set(x, "receiverQueueSize", js.undefined)
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionInitialPosition(value: InitialPosition): Self = StObject.set(x, "subscriptionInitialPosition", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionInitialPositionUndefined: Self = StObject.set(x, "subscriptionInitialPosition", js.undefined)
    
    inline def setSubscriptionType(value: SubscriptionType): Self = StObject.set(x, "subscriptionType", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionTypeUndefined: Self = StObject.set(x, "subscriptionType", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    
    inline def setTopics(value: js.Array[String]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsPattern(value: String): Self = StObject.set(x, "topicsPattern", value.asInstanceOf[js.Any])
    
    inline def setTopicsPatternUndefined: Self = StObject.set(x, "topicsPattern", js.undefined)
    
    inline def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
    
    inline def setTopicsVarargs(value: String*): Self = StObject.set(x, "topics", js.Array(value*))
  }
}
