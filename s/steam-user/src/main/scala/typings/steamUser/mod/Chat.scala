package typings.steamUser.mod

import typings.steamUser.anon.Permissions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chat extends StObject {
  
  var invisibleToFriends: Boolean
  
  var members: Permissions
  
  var name: String | Null
  
  var officersOnlyChat: Boolean
  
  var `private`: Boolean
  
  var unjoinable: Boolean
}
object Chat {
  
  inline def apply(
    invisibleToFriends: Boolean,
    members: Permissions,
    officersOnlyChat: Boolean,
    `private`: Boolean,
    unjoinable: Boolean
  ): Chat = {
    val __obj = js.Dynamic.literal(invisibleToFriends = invisibleToFriends.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], officersOnlyChat = officersOnlyChat.asInstanceOf[js.Any], unjoinable = unjoinable.asInstanceOf[js.Any], name = null)
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chat]
  }
  
  extension [Self <: Chat](x: Self) {
    
    inline def setInvisibleToFriends(value: Boolean): Self = StObject.set(x, "invisibleToFriends", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: Permissions): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setOfficersOnlyChat(value: Boolean): Self = StObject.set(x, "officersOnlyChat", value.asInstanceOf[js.Any])
    
    inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setUnjoinable(value: Boolean): Self = StObject.set(x, "unjoinable", value.asInstanceOf[js.Any])
  }
}
