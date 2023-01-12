package typings.socketclusterServer.serverMod

import typings.socketclusterServer.serversocketMod.CloseData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClosureData
  extends StObject
     with CloseData {
  
  var socket: typings.socketclusterServer.serversocketMod.^
}
object ClosureData {
  
  inline def apply(code: Double, reason: String, socket: typings.socketclusterServer.serversocketMod.^): ClosureData = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClosureData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClosureData] (val x: Self) extends AnyVal {
    
    inline def setSocket(value: typings.socketclusterServer.serversocketMod.^): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
  }
}
