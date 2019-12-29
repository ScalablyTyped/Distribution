package typings.atPusherChatkitDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hooksMod {
  import typings.atPusherChatkitDashClient.roomMod.PusherReadCursor
  import typings.atPusherChatkitDashClient.roomMod.PusherRoom
  import typings.atPusherChatkitDashClient.userMod.PusherUser

  type ReadCursorHook = js.Function1[/* cursor */ PusherReadCursor, Unit]
  type RoomHook = js.Function1[/* room */ PusherRoom, Unit]
  type RoomUserHook = js.Function2[/* room */ PusherRoom, /* user */ PusherUser, Unit]
  type UserHook = js.Function1[/* room */ PusherUser, Unit]
  type UserPresenceHook = js.Function2[/* state */ UserPresenceState, /* user */ PusherUser, Unit]
}
