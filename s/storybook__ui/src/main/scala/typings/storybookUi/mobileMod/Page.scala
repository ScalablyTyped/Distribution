package typings.storybookUi.mobileMod

import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Page extends js.Object {
  
  var key: String = js.native
  
  var render: FunctionComponent[js.Object] = js.native
  
  var route: FunctionComponent[js.Object] = js.native
}
object Page {
  
  @scala.inline
  def apply(key: String, render: FunctionComponent[js.Object], route: FunctionComponent[js.Object]): Page = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
  
  @scala.inline
  implicit class PageOps[Self <: Page] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRender(value: FunctionComponent[js.Object]): Self = this.set("render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoute(value: FunctionComponent[js.Object]): Self = this.set("route", value.asInstanceOf[js.Any])
  }
}
