package typings.reactRouterGuard.mod

import typings.react.mod.LazyExoticComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterGuardConfigProps extends js.Object {
  var canActivate: js.UndefOr[js.Array[js.Function0[js.Promise[_]]]] = js.native
  var component: LazyExoticComponent[_] = js.native
  var exact: js.UndefOr[Boolean] = js.native
  var path: String = js.native
  var redirect: js.UndefOr[String] = js.native
  var routes: js.UndefOr[js.Array[RouterGuardConfigProps]] = js.native
}

object RouterGuardConfigProps {
  @scala.inline
  def apply(component: LazyExoticComponent[_], path: String): RouterGuardConfigProps = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterGuardConfigProps]
  }
  @scala.inline
  implicit class RouterGuardConfigPropsOps[Self <: RouterGuardConfigProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComponent(value: LazyExoticComponent[_]): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanActivateVarargs(value: js.Function0[js.Promise[js.Any]]*): Self = this.set("canActivate", js.Array(value :_*))
    @scala.inline
    def setCanActivate(value: js.Array[js.Function0[js.Promise[_]]]): Self = this.set("canActivate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanActivate: Self = this.set("canActivate", js.undefined)
    @scala.inline
    def setExact(value: Boolean): Self = this.set("exact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExact: Self = this.set("exact", js.undefined)
    @scala.inline
    def setRedirect(value: String): Self = this.set("redirect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirect: Self = this.set("redirect", js.undefined)
    @scala.inline
    def setRoutesVarargs(value: RouterGuardConfigProps*): Self = this.set("routes", js.Array(value :_*))
    @scala.inline
    def setRoutes(value: js.Array[RouterGuardConfigProps]): Self = this.set("routes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoutes: Self = this.set("routes", js.undefined)
  }
  
}

