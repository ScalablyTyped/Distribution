package typings.steamUser.componentsChatroomMod

import typings.steamUser.mod.EChatRoomGroupRank
import typings.steamUser.mod.EChatRoomJoinState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatRoomMember extends StObject {
  
  var rank: EChatRoomGroupRank
  
  var role_ids: js.Array[String]
  
  var state: EChatRoomJoinState
  
  var steamid: SteamID
  
  var time_kick_expire: js.Date | Null
}
object ChatRoomMember {
  
  inline def apply(rank: EChatRoomGroupRank, role_ids: js.Array[String], state: EChatRoomJoinState, steamid: SteamID): ChatRoomMember = {
    val __obj = js.Dynamic.literal(rank = rank.asInstanceOf[js.Any], role_ids = role_ids.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], steamid = steamid.asInstanceOf[js.Any], time_kick_expire = null)
    __obj.asInstanceOf[ChatRoomMember]
  }
  
  extension [Self <: ChatRoomMember](x: Self) {
    
    inline def setRank(value: EChatRoomGroupRank): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    inline def setRole_ids(value: js.Array[String]): Self = StObject.set(x, "role_ids", value.asInstanceOf[js.Any])
    
    inline def setRole_idsVarargs(value: String*): Self = StObject.set(x, "role_ids", js.Array(value*))
    
    inline def setState(value: EChatRoomJoinState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setSteamid(value: SteamID): Self = StObject.set(x, "steamid", value.asInstanceOf[js.Any])
    
    inline def setTime_kick_expire(value: js.Date): Self = StObject.set(x, "time_kick_expire", value.asInstanceOf[js.Any])
    
    inline def setTime_kick_expireNull: Self = StObject.set(x, "time_kick_expire", null)
  }
}
