package typings.steamUser.anon

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionTicket extends StObject {
  
  var sessionTicket: Buffer
}
object SessionTicket {
  
  inline def apply(sessionTicket: Buffer): SessionTicket = {
    val __obj = js.Dynamic.literal(sessionTicket = sessionTicket.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionTicket]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SessionTicket] (val x: Self) extends AnyVal {
    
    inline def setSessionTicket(value: Buffer): Self = StObject.set(x, "sessionTicket", value.asInstanceOf[js.Any])
  }
}
