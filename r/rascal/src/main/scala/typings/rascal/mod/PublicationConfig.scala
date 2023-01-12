package typings.rascal.mod

import typings.amqplib.propertiesMod.Options.Publish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicationConfig extends StObject {
  
  var autoCreated: js.UndefOr[Boolean] = js.undefined
  
  var confirm: js.UndefOr[Boolean] = js.undefined
  
  var deprecated: js.UndefOr[Boolean] = js.undefined
  
  var encryption: js.UndefOr[String] = js.undefined
  
  var exchange: js.UndefOr[String] = js.undefined
  
  var options: js.UndefOr[Publish] = js.undefined
  
  var queue: js.UndefOr[String] = js.undefined
  
  var routingKey: js.UndefOr[String] = js.undefined
  
  var vhost: js.UndefOr[String] = js.undefined
}
object PublicationConfig {
  
  inline def apply(): PublicationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublicationConfig] (val x: Self) extends AnyVal {
    
    inline def setAutoCreated(value: Boolean): Self = StObject.set(x, "autoCreated", value.asInstanceOf[js.Any])
    
    inline def setAutoCreatedUndefined: Self = StObject.set(x, "autoCreated", js.undefined)
    
    inline def setConfirm(value: Boolean): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
    
    inline def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setEncryption(value: String): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
    
    inline def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
    
    inline def setExchangeUndefined: Self = StObject.set(x, "exchange", js.undefined)
    
    inline def setOptions(value: Publish): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    inline def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
    
    inline def setRoutingKey(value: String): Self = StObject.set(x, "routingKey", value.asInstanceOf[js.Any])
    
    inline def setRoutingKeyUndefined: Self = StObject.set(x, "routingKey", js.undefined)
    
    inline def setVhost(value: String): Self = StObject.set(x, "vhost", value.asInstanceOf[js.Any])
    
    inline def setVhostUndefined: Self = StObject.set(x, "vhost", js.undefined)
  }
}
