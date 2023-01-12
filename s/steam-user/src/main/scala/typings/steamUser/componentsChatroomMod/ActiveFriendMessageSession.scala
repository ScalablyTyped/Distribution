package typings.steamUser.componentsChatroomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveFriendMessageSession extends StObject {
  
  var steamid_friend: SteamID
  
  var time_last_message: js.Date
  
  var time_last_view: js.Date
  
  var unread_message_count: Double
}
object ActiveFriendMessageSession {
  
  inline def apply(
    steamid_friend: SteamID,
    time_last_message: js.Date,
    time_last_view: js.Date,
    unread_message_count: Double
  ): ActiveFriendMessageSession = {
    val __obj = js.Dynamic.literal(steamid_friend = steamid_friend.asInstanceOf[js.Any], time_last_message = time_last_message.asInstanceOf[js.Any], time_last_view = time_last_view.asInstanceOf[js.Any], unread_message_count = unread_message_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveFriendMessageSession]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveFriendMessageSession] (val x: Self) extends AnyVal {
    
    inline def setSteamid_friend(value: SteamID): Self = StObject.set(x, "steamid_friend", value.asInstanceOf[js.Any])
    
    inline def setTime_last_message(value: js.Date): Self = StObject.set(x, "time_last_message", value.asInstanceOf[js.Any])
    
    inline def setTime_last_view(value: js.Date): Self = StObject.set(x, "time_last_view", value.asInstanceOf[js.Any])
    
    inline def setUnread_message_count(value: Double): Self = StObject.set(x, "unread_message_count", value.asInstanceOf[js.Any])
  }
}
