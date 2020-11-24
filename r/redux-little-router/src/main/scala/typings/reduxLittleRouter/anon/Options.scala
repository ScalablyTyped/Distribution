package typings.reduxLittleRouter.anon

import typings.reduxLittleRouter.mod.Routes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var options: UpdateRoutes = js.native
  
  var routes: Routes = js.native
}
object Options {
  
  @scala.inline
  def apply(options: UpdateRoutes, routes: Routes): Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setOptions(value: UpdateRoutes): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutes(value: Routes): Self = this.set("routes", value.asInstanceOf[js.Any])
  }
}
