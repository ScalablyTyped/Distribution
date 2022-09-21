package typings.steamUser.chatroomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageToDelete1 extends StObject {
  
  var ordinal: js.UndefOr[Double] = js.undefined
  
  var server_timestamp: js.Date
}
object MessageToDelete1 {
  
  inline def apply(server_timestamp: js.Date): MessageToDelete1 = {
    val __obj = js.Dynamic.literal(server_timestamp = server_timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageToDelete1]
  }
  
  extension [Self <: MessageToDelete1](x: Self) {
    
    inline def setOrdinal(value: Double): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
    
    inline def setOrdinalUndefined: Self = StObject.set(x, "ordinal", js.undefined)
    
    inline def setServer_timestamp(value: js.Date): Self = StObject.set(x, "server_timestamp", value.asInstanceOf[js.Any])
  }
}
