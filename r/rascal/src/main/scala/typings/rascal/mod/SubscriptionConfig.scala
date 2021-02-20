package typings.rascal.mod

import typings.amqplib.propertiesMod.Options.Consume
import typings.rascal.anon.Counter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionConfig extends StObject {
  
  var autoCreated: js.UndefOr[Boolean] = js.native
  
  var contentType: js.UndefOr[String] = js.native
  
  var deferCloseChannel: js.UndefOr[Double] = js.native
  
  var encryption: js.UndefOr[String] = js.native
  
  var handler: js.UndefOr[String] = js.native
  
  var handlers: js.UndefOr[js.Array[String]] = js.native
  
  var options: js.UndefOr[Consume] = js.native
  
  var prefetch: js.UndefOr[Double] = js.native
  
  var queue: js.UndefOr[String] = js.native
  
  var recovery: js.UndefOr[js.Any] = js.native
  
  var redeliveries: js.UndefOr[Counter] = js.native
  
  var retry: js.UndefOr[RetryConfig | Boolean] = js.native
  
  var vhost: js.UndefOr[String] = js.native
}
object SubscriptionConfig {
  
  @scala.inline
  def apply(): SubscriptionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionConfig]
  }
  
  @scala.inline
  implicit class SubscriptionConfigMutableBuilder[Self <: SubscriptionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoCreated(value: Boolean): Self = StObject.set(x, "autoCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCreatedUndefined: Self = StObject.set(x, "autoCreated", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setDeferCloseChannel(value: Double): Self = StObject.set(x, "deferCloseChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferCloseChannelUndefined: Self = StObject.set(x, "deferCloseChannel", js.undefined)
    
    @scala.inline
    def setEncryption(value: String): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
    
    @scala.inline
    def setHandler(value: String): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
    
    @scala.inline
    def setHandlers(value: js.Array[String]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
    
    @scala.inline
    def setHandlersVarargs(value: String*): Self = StObject.set(x, "handlers", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: Consume): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setPrefetch(value: Double): Self = StObject.set(x, "prefetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefetchUndefined: Self = StObject.set(x, "prefetch", js.undefined)
    
    @scala.inline
    def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
    
    @scala.inline
    def setRecovery(value: js.Any): Self = StObject.set(x, "recovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecoveryUndefined: Self = StObject.set(x, "recovery", js.undefined)
    
    @scala.inline
    def setRedeliveries(value: Counter): Self = StObject.set(x, "redeliveries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedeliveriesUndefined: Self = StObject.set(x, "redeliveries", js.undefined)
    
    @scala.inline
    def setRetry(value: RetryConfig | Boolean): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    
    @scala.inline
    def setVhost(value: String): Self = StObject.set(x, "vhost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVhostUndefined: Self = StObject.set(x, "vhost", js.undefined)
  }
}
