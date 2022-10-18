package typings.steamUser.componentsChatroomMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatRoomGroupSummary extends StObject {
  
  var active_member_count: Double
  
  var active_voice_member_count: Double
  
  var appid: Double | Null
  
  // not sure if optional or null
  var chat_group_avatar_sha: Buffer | Null
  
  var chat_group_avatar_url: String | Null
  
  var chat_group_id: String
  
  var chat_group_name: String
  
  var chat_group_tagline: String
  
  var chat_rooms: js.Array[ChatRoomState]
  
  var default_chat_id: String
  
  var steamid_owner: SteamID
  
  var top_members: js.Array[SteamID]
  
  var watching_broadcast_steamid: js.UndefOr[SteamID | Null] = js.undefined
}
object ChatRoomGroupSummary {
  
  inline def apply(
    active_member_count: Double,
    active_voice_member_count: Double,
    chat_group_id: String,
    chat_group_name: String,
    chat_group_tagline: String,
    chat_rooms: js.Array[ChatRoomState],
    default_chat_id: String,
    steamid_owner: SteamID,
    top_members: js.Array[SteamID]
  ): ChatRoomGroupSummary = {
    val __obj = js.Dynamic.literal(active_member_count = active_member_count.asInstanceOf[js.Any], active_voice_member_count = active_voice_member_count.asInstanceOf[js.Any], chat_group_id = chat_group_id.asInstanceOf[js.Any], chat_group_name = chat_group_name.asInstanceOf[js.Any], chat_group_tagline = chat_group_tagline.asInstanceOf[js.Any], chat_rooms = chat_rooms.asInstanceOf[js.Any], default_chat_id = default_chat_id.asInstanceOf[js.Any], steamid_owner = steamid_owner.asInstanceOf[js.Any], top_members = top_members.asInstanceOf[js.Any], appid = null, chat_group_avatar_sha = null, chat_group_avatar_url = null)
    __obj.asInstanceOf[ChatRoomGroupSummary]
  }
  
  extension [Self <: ChatRoomGroupSummary](x: Self) {
    
    inline def setActive_member_count(value: Double): Self = StObject.set(x, "active_member_count", value.asInstanceOf[js.Any])
    
    inline def setActive_voice_member_count(value: Double): Self = StObject.set(x, "active_voice_member_count", value.asInstanceOf[js.Any])
    
    inline def setAppid(value: Double): Self = StObject.set(x, "appid", value.asInstanceOf[js.Any])
    
    inline def setAppidNull: Self = StObject.set(x, "appid", null)
    
    inline def setChat_group_avatar_sha(value: Buffer): Self = StObject.set(x, "chat_group_avatar_sha", value.asInstanceOf[js.Any])
    
    inline def setChat_group_avatar_shaNull: Self = StObject.set(x, "chat_group_avatar_sha", null)
    
    inline def setChat_group_avatar_url(value: String): Self = StObject.set(x, "chat_group_avatar_url", value.asInstanceOf[js.Any])
    
    inline def setChat_group_avatar_urlNull: Self = StObject.set(x, "chat_group_avatar_url", null)
    
    inline def setChat_group_id(value: String): Self = StObject.set(x, "chat_group_id", value.asInstanceOf[js.Any])
    
    inline def setChat_group_name(value: String): Self = StObject.set(x, "chat_group_name", value.asInstanceOf[js.Any])
    
    inline def setChat_group_tagline(value: String): Self = StObject.set(x, "chat_group_tagline", value.asInstanceOf[js.Any])
    
    inline def setChat_rooms(value: js.Array[ChatRoomState]): Self = StObject.set(x, "chat_rooms", value.asInstanceOf[js.Any])
    
    inline def setChat_roomsVarargs(value: ChatRoomState*): Self = StObject.set(x, "chat_rooms", js.Array(value*))
    
    inline def setDefault_chat_id(value: String): Self = StObject.set(x, "default_chat_id", value.asInstanceOf[js.Any])
    
    inline def setSteamid_owner(value: SteamID): Self = StObject.set(x, "steamid_owner", value.asInstanceOf[js.Any])
    
    inline def setTop_members(value: js.Array[SteamID]): Self = StObject.set(x, "top_members", value.asInstanceOf[js.Any])
    
    inline def setTop_membersVarargs(value: SteamID*): Self = StObject.set(x, "top_members", js.Array(value*))
    
    inline def setWatching_broadcast_steamid(value: SteamID): Self = StObject.set(x, "watching_broadcast_steamid", value.asInstanceOf[js.Any])
    
    inline def setWatching_broadcast_steamidNull: Self = StObject.set(x, "watching_broadcast_steamid", null)
    
    inline def setWatching_broadcast_steamidUndefined: Self = StObject.set(x, "watching_broadcast_steamid", js.undefined)
  }
}
