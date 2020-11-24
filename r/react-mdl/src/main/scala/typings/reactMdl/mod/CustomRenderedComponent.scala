package typings.reactMdl.mod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomRenderedComponent extends js.Object {
  
  var component: js.UndefOr[String | Element | js.Function] = js.native
}
object CustomRenderedComponent {
  
  @scala.inline
  def apply(): CustomRenderedComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomRenderedComponent]
  }
  
  @scala.inline
  implicit class CustomRenderedComponentOps[Self <: CustomRenderedComponent] (val x: Self) extends AnyVal {
    
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
    def setComponent(value: String | Element | js.Function): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
  }
}
