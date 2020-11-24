package typings.pusherChatkitClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object hooksMod {
  
  type ReadCursorHook = js.Function1[/* cursor */ typings.pusherChatkitClient.roomMod.PusherReadCursor, scala.Unit]
  
  type RoomHook = js.Function1[/* room */ typings.pusherChatkitClient.roomMod.PusherRoom, scala.Unit]
  
  type RoomUserHook = js.Function2[
    /* room */ typings.pusherChatkitClient.roomMod.PusherRoom, 
    /* user */ typings.pusherChatkitClient.userMod.PusherUser, 
    scala.Unit
  ]
  
  type UserHook = js.Function1[/* room */ typings.pusherChatkitClient.userMod.PusherUser, scala.Unit]
  
  type UserPresenceHook = js.Function2[
    /* state */ typings.pusherChatkitClient.hooksMod.UserPresenceState, 
    /* user */ typings.pusherChatkitClient.userMod.PusherUser, 
    scala.Unit
  ]
}
