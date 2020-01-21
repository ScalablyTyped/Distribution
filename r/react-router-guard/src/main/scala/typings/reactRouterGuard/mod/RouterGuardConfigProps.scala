package typings.reactRouterGuard.mod

import typings.react.mod.LazyExoticComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterGuardConfigProps extends js.Object {
  var canActivate: js.UndefOr[js.Array[js.Function0[js.Promise[_]]]] = js.undefined
  var component: LazyExoticComponent[_]
  var exact: js.UndefOr[Boolean] = js.undefined
  var path: String
  var redirect: js.UndefOr[String] = js.undefined
  var routes: js.UndefOr[js.Array[RouterGuardConfigProps]] = js.undefined
}

object RouterGuardConfigProps {
  @scala.inline
  def apply(
    component: LazyExoticComponent[_],
    path: String,
    canActivate: js.Array[js.Function0[js.Promise[_]]] = null,
    exact: js.UndefOr[Boolean] = js.undefined,
    redirect: String = null,
    routes: js.Array[RouterGuardConfigProps] = null
  ): RouterGuardConfigProps = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (canActivate != null) __obj.updateDynamic("canActivate")(canActivate.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterGuardConfigProps]
  }
}

