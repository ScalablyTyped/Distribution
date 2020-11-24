package typings.reduxLittleRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HashRouterArgs extends js.Object {
  
  var basename: js.UndefOr[String] = js.native
  
  var hashType: js.UndefOr[String] = js.native
  
  var history: js.UndefOr[History] = js.native
  
  var routes: Routes = js.native
}
object HashRouterArgs {
  
  @scala.inline
  def apply(routes: Routes): HashRouterArgs = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashRouterArgs]
  }
  
  @scala.inline
  implicit class HashRouterArgsOps[Self <: HashRouterArgs] (val x: Self) extends AnyVal {
    
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
    def setRoutes(value: Routes): Self = this.set("routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasename(value: String): Self = this.set("basename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasename: Self = this.set("basename", js.undefined)
    
    @scala.inline
    def setHashType(value: String): Self = this.set("hashType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashType: Self = this.set("hashType", js.undefined)
    
    @scala.inline
    def setHistory(value: History): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
  }
}
