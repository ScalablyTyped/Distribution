package typings.steamcommunity

import typings.steamcommunity.mod.Callback
import typings.steamcommunity.mod.userid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsChatMod {
  
  trait Chat extends StObject {
    
    /**
      * @deprecated No support for new Steam chat. Use steam-user instead.
      */
    def chatLogoff(): Unit
    
    /**
      * @deprecated No support for new Steam chat. Use steam-user instead.
      *
      * @param interval
      * @param uiMode
      */
    def chatLogon(interval: Double, uiMode: String): Unit
    
    /**
      * @deprecated No support for new Steam chat. Use steam-user instead.
      * @param recipient
      * @param text
      * @param [type]
      * @param [callback]
      */
    def chatMessage(recipient: userid, text: String, `type`: String, callback: Callback): Unit
  }
  object Chat {
    
    inline def apply(
      chatLogoff: () => Unit,
      chatLogon: (Double, String) => Unit,
      chatMessage: (userid, String, String, Callback) => Unit
    ): Chat = {
      val __obj = js.Dynamic.literal(chatLogoff = js.Any.fromFunction0(chatLogoff), chatLogon = js.Any.fromFunction2(chatLogon), chatMessage = js.Any.fromFunction4(chatMessage))
      __obj.asInstanceOf[Chat]
    }
    
    extension [Self <: Chat](x: Self) {
      
      inline def setChatLogoff(value: () => Unit): Self = StObject.set(x, "chatLogoff", js.Any.fromFunction0(value))
      
      inline def setChatLogon(value: (Double, String) => Unit): Self = StObject.set(x, "chatLogon", js.Any.fromFunction2(value))
      
      inline def setChatMessage(value: (userid, String, String, Callback) => Unit): Self = StObject.set(x, "chatMessage", js.Any.fromFunction4(value))
    }
  }
}
