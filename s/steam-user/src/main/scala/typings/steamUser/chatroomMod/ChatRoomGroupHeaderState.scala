package typings.steamUser.chatroomMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatRoomGroupHeaderState extends StObject {
  
  var appid: Double | Null
  
  var avatar_sha: Buffer | Null
  
  var avatar_url: String | Null
  
  var chat_group_id: String
  
  var chat_name: String
  
  var clanid: SteamID | Null
  
  var default_role_id: String
  
  var role_actions: js.Array[ChatRoleActions]
  
  var roles: js.Array[ChatRole]
  
  var steamid_owner: SteamID
  
  var tagline: String
  
  var watching_broadcast_steamid: js.UndefOr[SteamID | Null] = js.undefined
}
object ChatRoomGroupHeaderState {
  
  inline def apply(
    chat_group_id: String,
    chat_name: String,
    default_role_id: String,
    role_actions: js.Array[ChatRoleActions],
    roles: js.Array[ChatRole],
    steamid_owner: SteamID,
    tagline: String
  ): ChatRoomGroupHeaderState = {
    val __obj = js.Dynamic.literal(chat_group_id = chat_group_id.asInstanceOf[js.Any], chat_name = chat_name.asInstanceOf[js.Any], default_role_id = default_role_id.asInstanceOf[js.Any], role_actions = role_actions.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], steamid_owner = steamid_owner.asInstanceOf[js.Any], tagline = tagline.asInstanceOf[js.Any], appid = null, avatar_sha = null, avatar_url = null, clanid = null)
    __obj.asInstanceOf[ChatRoomGroupHeaderState]
  }
  
  extension [Self <: ChatRoomGroupHeaderState](x: Self) {
    
    inline def setAppid(value: Double): Self = StObject.set(x, "appid", value.asInstanceOf[js.Any])
    
    inline def setAppidNull: Self = StObject.set(x, "appid", null)
    
    inline def setAvatar_sha(value: Buffer): Self = StObject.set(x, "avatar_sha", value.asInstanceOf[js.Any])
    
    inline def setAvatar_shaNull: Self = StObject.set(x, "avatar_sha", null)
    
    inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
    
    inline def setAvatar_urlNull: Self = StObject.set(x, "avatar_url", null)
    
    inline def setChat_group_id(value: String): Self = StObject.set(x, "chat_group_id", value.asInstanceOf[js.Any])
    
    inline def setChat_name(value: String): Self = StObject.set(x, "chat_name", value.asInstanceOf[js.Any])
    
    inline def setClanid(value: SteamID): Self = StObject.set(x, "clanid", value.asInstanceOf[js.Any])
    
    inline def setClanidNull: Self = StObject.set(x, "clanid", null)
    
    inline def setDefault_role_id(value: String): Self = StObject.set(x, "default_role_id", value.asInstanceOf[js.Any])
    
    inline def setRole_actions(value: js.Array[ChatRoleActions]): Self = StObject.set(x, "role_actions", value.asInstanceOf[js.Any])
    
    inline def setRole_actionsVarargs(value: ChatRoleActions*): Self = StObject.set(x, "role_actions", js.Array(value*))
    
    inline def setRoles(value: js.Array[ChatRole]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesVarargs(value: ChatRole*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setSteamid_owner(value: SteamID): Self = StObject.set(x, "steamid_owner", value.asInstanceOf[js.Any])
    
    inline def setTagline(value: String): Self = StObject.set(x, "tagline", value.asInstanceOf[js.Any])
    
    inline def setWatching_broadcast_steamid(value: SteamID): Self = StObject.set(x, "watching_broadcast_steamid", value.asInstanceOf[js.Any])
    
    inline def setWatching_broadcast_steamidNull: Self = StObject.set(x, "watching_broadcast_steamid", null)
    
    inline def setWatching_broadcast_steamidUndefined: Self = StObject.set(x, "watching_broadcast_steamid", js.undefined)
  }
}
