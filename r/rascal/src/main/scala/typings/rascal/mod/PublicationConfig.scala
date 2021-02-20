package typings.rascal.mod

import typings.amqplib.propertiesMod.Options.Publish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicationConfig extends StObject {
  
  var autoCreated: js.UndefOr[Boolean] = js.native
  
  var confirm: js.UndefOr[Boolean] = js.native
  
  var deprecated: js.UndefOr[Boolean] = js.native
  
  var encryption: js.UndefOr[String] = js.native
  
  var exchange: js.UndefOr[String] = js.native
  
  var options: js.UndefOr[Publish] = js.native
  
  var queue: js.UndefOr[String] = js.native
  
  var routingKey: js.UndefOr[String] = js.native
  
  var vhost: js.UndefOr[String] = js.native
}
object PublicationConfig {
  
  @scala.inline
  def apply(): PublicationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicationConfig]
  }
  
  @scala.inline
  implicit class PublicationConfigMutableBuilder[Self <: PublicationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoCreated(value: Boolean): Self = StObject.set(x, "autoCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCreatedUndefined: Self = StObject.set(x, "autoCreated", js.undefined)
    
    @scala.inline
    def setConfirm(value: Boolean): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
    
    @scala.inline
    def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    @scala.inline
    def setEncryption(value: String): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
    
    @scala.inline
    def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExchangeUndefined: Self = StObject.set(x, "exchange", js.undefined)
    
    @scala.inline
    def setOptions(value: Publish): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
    
    @scala.inline
    def setRoutingKey(value: String): Self = StObject.set(x, "routingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingKeyUndefined: Self = StObject.set(x, "routingKey", js.undefined)
    
    @scala.inline
    def setVhost(value: String): Self = StObject.set(x, "vhost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVhostUndefined: Self = StObject.set(x, "vhost", js.undefined)
  }
}
