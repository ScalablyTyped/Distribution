package typings.steamUser.chatroomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatRoleActions extends StObject {
  
  var can_ban: Boolean
  
  var can_change_group_roles: Boolean
  
  var can_change_tagline_avatar_name: Boolean
  
  var can_change_user_roles: Boolean
  
  var can_chat: Boolean
  
  var can_create_rename_delete_channel: Boolean
  
  var can_invite: Boolean
  
  var can_kick: Boolean
  
  var can_mention_all: Boolean
  
  var can_set_watching_broadcast: Boolean
  
  var can_view_history: Boolean
  
  var role_id: String
}
object ChatRoleActions {
  
  inline def apply(
    can_ban: Boolean,
    can_change_group_roles: Boolean,
    can_change_tagline_avatar_name: Boolean,
    can_change_user_roles: Boolean,
    can_chat: Boolean,
    can_create_rename_delete_channel: Boolean,
    can_invite: Boolean,
    can_kick: Boolean,
    can_mention_all: Boolean,
    can_set_watching_broadcast: Boolean,
    can_view_history: Boolean,
    role_id: String
  ): ChatRoleActions = {
    val __obj = js.Dynamic.literal(can_ban = can_ban.asInstanceOf[js.Any], can_change_group_roles = can_change_group_roles.asInstanceOf[js.Any], can_change_tagline_avatar_name = can_change_tagline_avatar_name.asInstanceOf[js.Any], can_change_user_roles = can_change_user_roles.asInstanceOf[js.Any], can_chat = can_chat.asInstanceOf[js.Any], can_create_rename_delete_channel = can_create_rename_delete_channel.asInstanceOf[js.Any], can_invite = can_invite.asInstanceOf[js.Any], can_kick = can_kick.asInstanceOf[js.Any], can_mention_all = can_mention_all.asInstanceOf[js.Any], can_set_watching_broadcast = can_set_watching_broadcast.asInstanceOf[js.Any], can_view_history = can_view_history.asInstanceOf[js.Any], role_id = role_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoleActions]
  }
  
  extension [Self <: ChatRoleActions](x: Self) {
    
    inline def setCan_ban(value: Boolean): Self = StObject.set(x, "can_ban", value.asInstanceOf[js.Any])
    
    inline def setCan_change_group_roles(value: Boolean): Self = StObject.set(x, "can_change_group_roles", value.asInstanceOf[js.Any])
    
    inline def setCan_change_tagline_avatar_name(value: Boolean): Self = StObject.set(x, "can_change_tagline_avatar_name", value.asInstanceOf[js.Any])
    
    inline def setCan_change_user_roles(value: Boolean): Self = StObject.set(x, "can_change_user_roles", value.asInstanceOf[js.Any])
    
    inline def setCan_chat(value: Boolean): Self = StObject.set(x, "can_chat", value.asInstanceOf[js.Any])
    
    inline def setCan_create_rename_delete_channel(value: Boolean): Self = StObject.set(x, "can_create_rename_delete_channel", value.asInstanceOf[js.Any])
    
    inline def setCan_invite(value: Boolean): Self = StObject.set(x, "can_invite", value.asInstanceOf[js.Any])
    
    inline def setCan_kick(value: Boolean): Self = StObject.set(x, "can_kick", value.asInstanceOf[js.Any])
    
    inline def setCan_mention_all(value: Boolean): Self = StObject.set(x, "can_mention_all", value.asInstanceOf[js.Any])
    
    inline def setCan_set_watching_broadcast(value: Boolean): Self = StObject.set(x, "can_set_watching_broadcast", value.asInstanceOf[js.Any])
    
    inline def setCan_view_history(value: Boolean): Self = StObject.set(x, "can_view_history", value.asInstanceOf[js.Any])
    
    inline def setRole_id(value: String): Self = StObject.set(x, "role_id", value.asInstanceOf[js.Any])
  }
}
