package typings.steamUser.chatroomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageToDelete2 extends StObject {
  
  var ordinal: js.UndefOr[Double] = js.undefined
  
  var timestamp: js.Date
}
object MessageToDelete2 {
  
  inline def apply(timestamp: js.Date): MessageToDelete2 = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageToDelete2]
  }
  
  extension [Self <: MessageToDelete2](x: Self) {
    
    inline def setOrdinal(value: Double): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
    
    inline def setOrdinalUndefined: Self = StObject.set(x, "ordinal", js.undefined)
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
