package typings
package reduxDashFirstDashRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CapitalizedWords[TState] extends js.Object {
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

object Anon_CapitalizedWords {
  @scala.inline
  def apply[TState](
    path: java.lang.String,
    capitalizedWords: js.UndefOr[scala.Boolean] = js.undefined,
    coerceNumbers: js.UndefOr[scala.Boolean] = js.undefined,
    confirmLeave: reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.ConfirmLeave = null,
    fromPath: (/* path */ java.lang.String, /* key */ js.UndefOr[java.lang.String]) => java.lang.String = null,
    meta: reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.Meta = null,
    navKey: java.lang.String = null,
    thunk: reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.RouteThunk[TState] = null,
    toPath: (/* param */ java.lang.String, /* key */ js.UndefOr[java.lang.String]) => java.lang.String = null
  ): Anon_CapitalizedWords[TState] = {
    val __obj = js.Dynamic.literal(path = path)
    if (!js.isUndefined(capitalizedWords)) __obj.updateDynamic("capitalizedWords")(capitalizedWords)
    if (!js.isUndefined(coerceNumbers)) __obj.updateDynamic("coerceNumbers")(coerceNumbers)
    if (confirmLeave != null) __obj.updateDynamic("confirmLeave")(confirmLeave)
    if (fromPath != null) __obj.updateDynamic("fromPath")(js.Any.fromFunction2(fromPath))
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (navKey != null) __obj.updateDynamic("navKey")(navKey)
    if (thunk != null) __obj.updateDynamic("thunk")(thunk)
    if (toPath != null) __obj.updateDynamic("toPath")(js.Any.fromFunction2(toPath))
    __obj.asInstanceOf[Anon_CapitalizedWords[TState]]
  }
}

