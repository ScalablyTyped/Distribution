package typings.steamUser.anon

import typings.steamid.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Friends extends StObject {
  
  var friends: js.Array[^]
}
object Friends {
  
  inline def apply(friends: js.Array[^]): Friends = {
    val __obj = js.Dynamic.literal(friends = friends.asInstanceOf[js.Any])
    __obj.asInstanceOf[Friends]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Friends] (val x: Self) extends AnyVal {
    
    inline def setFriends(value: js.Array[^]): Self = StObject.set(x, "friends", value.asInstanceOf[js.Any])
    
    inline def setFriendsVarargs(value: ^ *): Self = StObject.set(x, "friends", js.Array(value*))
  }
}
