package typings.reduxLittleRouter.mod

import typings.reduxLittleRouter.anon.BaseUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpressRouterArgs extends js.Object {
  
  var request: BaseUrl = js.native
  
  var routes: Routes = js.native
}
object ExpressRouterArgs {
  
  @scala.inline
  def apply(request: BaseUrl, routes: Routes): ExpressRouterArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressRouterArgs]
  }
  
  @scala.inline
  implicit class ExpressRouterArgsOps[Self <: ExpressRouterArgs] (val x: Self) extends AnyVal {
    
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
    def setRequest(value: BaseUrl): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutes(value: Routes): Self = this.set("routes", value.asInstanceOf[js.Any])
  }
}
