package typings.pubnub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Channel extends StObject {
  
  var channel: Id
  
  var uuid: Id
}
object Channel {
  
  inline def apply(channel: Id, uuid: Id): Channel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
  
  extension [Self <: Channel](x: Self) {
    
    inline def setChannel(value: Id): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: Id): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
