package typings.steamDashLogin.steamDashLoginMod

import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SteamRequest
  extends Request[ParamsDictionary, js.Any, js.Any] {
  var logout: js.UndefOr[
    js.Function0[
      js.Function1[/* req */ typings.express.expressMod.Request[ParamsDictionary], js.Function0[Unit]]
    ]
  ] = js.native
  var user: js.UndefOr[SteamUser] = js.native
}

