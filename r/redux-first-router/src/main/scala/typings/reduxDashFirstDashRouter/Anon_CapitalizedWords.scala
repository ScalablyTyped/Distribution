package typings.reduxDashFirstDashRouter

import typings.reduxDashFirstDashRouter.reduxDashFirstDashRouterMod.ConfirmLeave
import typings.reduxDashFirstDashRouter.reduxDashFirstDashRouterMod.Meta
import typings.reduxDashFirstDashRouter.reduxDashFirstDashRouterMod.RouteThunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CapitalizedWords[TState] extends js.Object {
  var capitalizedWords: js.UndefOr[Boolean] = js.undefined
  var coerceNumbers: js.UndefOr[Boolean] = js.undefined
  var confirmLeave: js.UndefOr[ConfirmLeave] = js.undefined
  var fromPath: js.UndefOr[js.Function2[/* path */ String, /* key */ js.UndefOr[String], String]] = js.undefined
  var meta: js.UndefOr[Meta] = js.undefined
  var navKey: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var thunk: js.UndefOr[RouteThunk[TState]] = js.undefined
  var toPath: js.UndefOr[js.Function2[/* param */ String, /* key */ js.UndefOr[String], String]] = js.undefined
}

object Anon_CapitalizedWords {
  @scala.inline
  def apply[TState](
    capitalizedWords: js.UndefOr[Boolean] = js.undefined,
    coerceNumbers: js.UndefOr[Boolean] = js.undefined,
    confirmLeave: ConfirmLeave = null,
    fromPath: (/* path */ String, /* key */ js.UndefOr[String]) => String = null,
    meta: Meta = null,
    navKey: String = null,
    path: String = null,
    thunk: RouteThunk[TState] = null,
    toPath: (/* param */ String, /* key */ js.UndefOr[String]) => String = null
  ): Anon_CapitalizedWords[TState] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capitalizedWords)) __obj.updateDynamic("capitalizedWords")(capitalizedWords)
    if (!js.isUndefined(coerceNumbers)) __obj.updateDynamic("coerceNumbers")(coerceNumbers)
    if (confirmLeave != null) __obj.updateDynamic("confirmLeave")(confirmLeave)
    if (fromPath != null) __obj.updateDynamic("fromPath")(js.Any.fromFunction2(fromPath))
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (navKey != null) __obj.updateDynamic("navKey")(navKey)
    if (path != null) __obj.updateDynamic("path")(path)
    if (thunk != null) __obj.updateDynamic("thunk")(thunk)
    if (toPath != null) __obj.updateDynamic("toPath")(js.Any.fromFunction2(toPath))
    __obj.asInstanceOf[Anon_CapitalizedWords[TState]]
  }
}

