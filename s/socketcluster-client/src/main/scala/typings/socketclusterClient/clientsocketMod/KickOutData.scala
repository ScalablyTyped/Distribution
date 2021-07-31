package typings.socketclusterClient.clientsocketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KickOutData extends StObject {
  
  var channel: String
  
  var message: js.UndefOr[String] = js.undefined
}
object KickOutData {
  
  @scala.inline
  def apply(channel: String): KickOutData = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[KickOutData]
  }
  
  @scala.inline
  implicit class KickOutDataMutableBuilder[Self <: KickOutData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
