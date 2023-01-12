package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMessagesParameters extends StObject {
  
  var channel: String
  
  // timetoken
  var end: js.UndefOr[String | Double] = js.undefined
  
  var start: js.UndefOr[String | Double] = js.undefined
}
object DeleteMessagesParameters {
  
  inline def apply(channel: String): DeleteMessagesParameters = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMessagesParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteMessagesParameters] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: String | Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: String | Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
