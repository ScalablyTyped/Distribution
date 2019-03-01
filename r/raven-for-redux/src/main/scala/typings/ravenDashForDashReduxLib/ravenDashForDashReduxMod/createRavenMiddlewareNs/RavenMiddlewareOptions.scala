package typings
package ravenDashForDashReduxLib.ravenDashForDashReduxMod.createRavenMiddlewareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RavenMiddlewareOptions[T] extends js.Object {
  var actionTransformer: js.UndefOr[
    js.Function1[/* action */ reduxLib.reduxMod.Action[_], reduxLib.reduxMod.Action[_]]
  ] = js.undefined
  var breadcrumbCategory: js.UndefOr[java.lang.String] = js.undefined
  var breadcrumbDataFromAction: js.UndefOr[js.Function1[/* action */ reduxLib.reduxMod.Action[_], _]] = js.undefined
  var filterBreadcrumbActions: js.UndefOr[js.Function1[/* action */ reduxLib.reduxMod.Action[_], scala.Boolean]] = js.undefined
  var getUserContext: js.UndefOr[js.Function1[/* state */ T, RavenUserContext]] = js.undefined
  var stateTransformer: js.UndefOr[js.Function1[/* state */ T, T]] = js.undefined
}

object RavenMiddlewareOptions {
  @scala.inline
  def apply[T](
    actionTransformer: js.Function1[/* action */ reduxLib.reduxMod.Action[_], reduxLib.reduxMod.Action[_]] = null,
    breadcrumbCategory: java.lang.String = null,
    breadcrumbDataFromAction: js.Function1[/* action */ reduxLib.reduxMod.Action[_], _] = null,
    filterBreadcrumbActions: js.Function1[/* action */ reduxLib.reduxMod.Action[_], scala.Boolean] = null,
    getUserContext: js.Function1[/* state */ T, RavenUserContext] = null,
    stateTransformer: js.Function1[/* state */ T, T] = null
  ): RavenMiddlewareOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (actionTransformer != null) __obj.updateDynamic("actionTransformer")(actionTransformer)
    if (breadcrumbCategory != null) __obj.updateDynamic("breadcrumbCategory")(breadcrumbCategory)
    if (breadcrumbDataFromAction != null) __obj.updateDynamic("breadcrumbDataFromAction")(breadcrumbDataFromAction)
    if (filterBreadcrumbActions != null) __obj.updateDynamic("filterBreadcrumbActions")(filterBreadcrumbActions)
    if (getUserContext != null) __obj.updateDynamic("getUserContext")(getUserContext)
    if (stateTransformer != null) __obj.updateDynamic("stateTransformer")(stateTransformer)
    __obj.asInstanceOf[RavenMiddlewareOptions[T]]
  }
}

