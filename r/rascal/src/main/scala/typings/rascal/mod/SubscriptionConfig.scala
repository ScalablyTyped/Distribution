package typings.rascal.mod

import typings.amqplib.propertiesMod.Options.Consume
import typings.rascal.anon.Counter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionConfig extends StObject {
  
  var autoCreated: js.UndefOr[Boolean] = js.undefined
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var deferCloseChannel: js.UndefOr[Double] = js.undefined
  
  var encryption: js.UndefOr[String] = js.undefined
  
  var handler: js.UndefOr[String] = js.undefined
  
  var handlers: js.UndefOr[js.Array[String]] = js.undefined
  
  var options: js.UndefOr[Consume] = js.undefined
  
  var prefetch: js.UndefOr[Double] = js.undefined
  
  var queue: js.UndefOr[String] = js.undefined
  
  var recovery: js.UndefOr[Any] = js.undefined
  
  var redeliveries: js.UndefOr[Counter] = js.undefined
  
  var retry: js.UndefOr[RetryConfig | Boolean] = js.undefined
  
  var vhost: js.UndefOr[String] = js.undefined
}
object SubscriptionConfig {
  
  inline def apply(): SubscriptionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscriptionConfig] (val x: Self) extends AnyVal {
    
    inline def setAutoCreated(value: Boolean): Self = StObject.set(x, "autoCreated", value.asInstanceOf[js.Any])
    
    inline def setAutoCreatedUndefined: Self = StObject.set(x, "autoCreated", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setDeferCloseChannel(value: Double): Self = StObject.set(x, "deferCloseChannel", value.asInstanceOf[js.Any])
    
    inline def setDeferCloseChannelUndefined: Self = StObject.set(x, "deferCloseChannel", js.undefined)
    
    inline def setEncryption(value: String): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
    
    inline def setHandler(value: String): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
    
    inline def setHandlers(value: js.Array[String]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
    
    inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
    
    inline def setHandlersVarargs(value: String*): Self = StObject.set(x, "handlers", js.Array(value*))
    
    inline def setOptions(value: Consume): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPrefetch(value: Double): Self = StObject.set(x, "prefetch", value.asInstanceOf[js.Any])
    
    inline def setPrefetchUndefined: Self = StObject.set(x, "prefetch", js.undefined)
    
    inline def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    inline def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
    
    inline def setRecovery(value: Any): Self = StObject.set(x, "recovery", value.asInstanceOf[js.Any])
    
    inline def setRecoveryUndefined: Self = StObject.set(x, "recovery", js.undefined)
    
    inline def setRedeliveries(value: Counter): Self = StObject.set(x, "redeliveries", value.asInstanceOf[js.Any])
    
    inline def setRedeliveriesUndefined: Self = StObject.set(x, "redeliveries", js.undefined)
    
    inline def setRetry(value: RetryConfig | Boolean): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    
    inline def setVhost(value: String): Self = StObject.set(x, "vhost", value.asInstanceOf[js.Any])
    
    inline def setVhostUndefined: Self = StObject.set(x, "vhost", js.undefined)
  }
}
