package typings.steamUser.anon

import typings.steamUser.componentsChatroomMod.ActiveFriendMessageSession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sessions extends StObject {
  
  var sessions: js.Array[ActiveFriendMessageSession]
  
  var timestamp: js.Date
}
object Sessions {
  
  inline def apply(sessions: js.Array[ActiveFriendMessageSession], timestamp: js.Date): Sessions = {
    val __obj = js.Dynamic.literal(sessions = sessions.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sessions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sessions] (val x: Self) extends AnyVal {
    
    inline def setSessions(value: js.Array[ActiveFriendMessageSession]): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
    
    inline def setSessionsVarargs(value: ActiveFriendMessageSession*): Self = StObject.set(x, "sessions", js.Array(value*))
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
