package typings.pubnub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Uuid extends StObject {
  
  var channel: IdString
  
  var uuid: IdString
}
object Uuid {
  
  inline def apply(channel: IdString, uuid: IdString): Uuid = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uuid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Uuid] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: IdString): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: IdString): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
