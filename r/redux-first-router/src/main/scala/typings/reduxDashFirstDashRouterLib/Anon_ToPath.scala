package typings
package reduxDashFirstDashRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_ToPath[TState] extends js.Object {
  var capitalizedWords: js.UndefOr[scala.Boolean] = js.undefined
  var coerceNumbers: js.UndefOr[scala.Boolean] = js.undefined
  var confirmLeave: js.UndefOr[reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.ConfirmLeave] = js.undefined
  var fromPath: js.UndefOr[
    js.Function2[
      /* path */ java.lang.String, 
      /* key */ js.UndefOr[java.lang.String], 
      java.lang.String
    ]
  ] = js.undefined
  var meta: js.UndefOr[reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.Meta] = js.undefined
  var navKey: js.UndefOr[java.lang.String] = js.undefined
  var path: java.lang.String
  var thunk: js.UndefOr[reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.RouteThunk[TState]] = js.undefined
  var toPath: js.UndefOr[
    js.Function2[
      /* param */ java.lang.String, 
      /* key */ js.UndefOr[java.lang.String], 
      java.lang.String
    ]
  ] = js.undefined
}

