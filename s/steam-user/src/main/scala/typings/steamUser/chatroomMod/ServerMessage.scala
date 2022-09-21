package typings.steamUser.chatroomMod

import typings.steamUser.mod.EChatRoomServerMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerMessage extends StObject {
  
  var message: EChatRoomServerMessage
  
  var steamid_param: js.UndefOr[SteamID] = js.undefined
  
  var string_param: js.UndefOr[String] = js.undefined
}
object ServerMessage {
  
  inline def apply(message: EChatRoomServerMessage): ServerMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerMessage]
  }
  
  extension [Self <: ServerMessage](x: Self) {
    
    inline def setMessage(value: EChatRoomServerMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setSteamid_param(value: SteamID): Self = StObject.set(x, "steamid_param", value.asInstanceOf[js.Any])
    
    inline def setSteamid_paramUndefined: Self = StObject.set(x, "steamid_param", js.undefined)
    
    inline def setString_param(value: String): Self = StObject.set(x, "string_param", value.asInstanceOf[js.Any])
    
    inline def setString_paramUndefined: Self = StObject.set(x, "string_param", js.undefined)
  }
}
