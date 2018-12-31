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

