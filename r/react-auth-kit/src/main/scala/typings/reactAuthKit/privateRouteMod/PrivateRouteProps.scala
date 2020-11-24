package typings.reactAuthKit.privateRouteMod

import typings.reactRouter.mod.RouteProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrivateRouteProps extends RouteProps {
  
  var loginPath: String = js.native
}
object PrivateRouteProps {
  
  @scala.inline
  def apply(loginPath: String): PrivateRouteProps = {
    val __obj = js.Dynamic.literal(loginPath = loginPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateRouteProps]
  }
  
  @scala.inline
  implicit class PrivateRoutePropsOps[Self <: PrivateRouteProps] (val x: Self) extends AnyVal {
    
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
    def setLoginPath(value: String): Self = this.set("loginPath", value.asInstanceOf[js.Any])
  }
}
