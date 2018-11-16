package typings
package steamDashLoginLib.steamDashLoginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SteamRequest
  extends expressLib.expressMod.eNs.Request {
  var logout: js.UndefOr[
    js.Function0[
      js.Function1[/* req */ expressLib.expressMod.eNs.Request, js.Function0[scala.Unit]]
    ]
  ] = js.native
  var user: js.UndefOr[SteamUser] = js.native
}

