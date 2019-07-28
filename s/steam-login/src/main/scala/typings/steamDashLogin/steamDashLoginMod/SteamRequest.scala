package typings.steamDashLogin.steamDashLoginMod

import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SteamRequest extends Request {
  var logout: js.UndefOr[
    js.Function0[js.Function1[/* req */ typings.express.expressMod.Request, js.Function0[Unit]]]
  ] = js.native
  var user: js.UndefOr[SteamUser] = js.native
}

