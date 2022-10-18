package typings.socketclusterClient.libClientsocketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnsubscribeData extends StObject {
  
  var channel: String
}
object UnsubscribeData {
  
  inline def apply(channel: String): UnsubscribeData = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsubscribeData]
  }
  
  extension [Self <: UnsubscribeData](x: Self) {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
  }
}
