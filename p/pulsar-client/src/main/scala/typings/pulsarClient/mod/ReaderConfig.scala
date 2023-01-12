package typings.pulsarClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReaderConfig extends StObject {
  
  var listener: js.UndefOr[js.Function2[/* message */ Message, /* reader */ Reader, Unit]] = js.undefined
  
  var readCompacted: js.UndefOr[Boolean] = js.undefined
  
  var readerName: js.UndefOr[String] = js.undefined
  
  var receiverQueueSize: js.UndefOr[Double] = js.undefined
  
  var startMessageId: MessageId
  
  var subscriptionRolePrefix: js.UndefOr[String] = js.undefined
  
  var topic: String
}
object ReaderConfig {
  
  inline def apply(startMessageId: MessageId, topic: String): ReaderConfig = {
    val __obj = js.Dynamic.literal(startMessageId = startMessageId.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReaderConfig] (val x: Self) extends AnyVal {
    
    inline def setListener(value: (/* message */ Message, /* reader */ Reader) => Unit): Self = StObject.set(x, "listener", js.Any.fromFunction2(value))
    
    inline def setListenerUndefined: Self = StObject.set(x, "listener", js.undefined)
    
    inline def setReadCompacted(value: Boolean): Self = StObject.set(x, "readCompacted", value.asInstanceOf[js.Any])
    
    inline def setReadCompactedUndefined: Self = StObject.set(x, "readCompacted", js.undefined)
    
    inline def setReaderName(value: String): Self = StObject.set(x, "readerName", value.asInstanceOf[js.Any])
    
    inline def setReaderNameUndefined: Self = StObject.set(x, "readerName", js.undefined)
    
    inline def setReceiverQueueSize(value: Double): Self = StObject.set(x, "receiverQueueSize", value.asInstanceOf[js.Any])
    
    inline def setReceiverQueueSizeUndefined: Self = StObject.set(x, "receiverQueueSize", js.undefined)
    
    inline def setStartMessageId(value: MessageId): Self = StObject.set(x, "startMessageId", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionRolePrefix(value: String): Self = StObject.set(x, "subscriptionRolePrefix", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionRolePrefixUndefined: Self = StObject.set(x, "subscriptionRolePrefix", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
