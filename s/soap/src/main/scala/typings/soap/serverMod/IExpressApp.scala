package typings.soap.serverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IExpressApp extends js.Object {
  
  var route: js.Any = js.native
  
  var use: js.Any = js.native
}
object IExpressApp {
  
  @scala.inline
  def apply(route: js.Any, use: js.Any): IExpressApp = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExpressApp]
  }
  
  @scala.inline
  implicit class IExpressAppOps[Self <: IExpressApp] (val x: Self) extends AnyVal {
    
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
    def setRoute(value: js.Any): Self = this.set("route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse(value: js.Any): Self = this.set("use", value.asInstanceOf[js.Any])
  }
}
