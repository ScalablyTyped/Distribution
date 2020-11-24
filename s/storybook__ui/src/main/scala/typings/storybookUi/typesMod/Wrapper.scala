package typings.storybookUi.typesMod

import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Wrapper extends js.Object {
  
  var render: FunctionComponent[WrapperProps] = js.native
}
object Wrapper {
  
  @scala.inline
  def apply(render: FunctionComponent[WrapperProps]): Wrapper = {
    val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wrapper]
  }
  
  @scala.inline
  implicit class WrapperOps[Self <: Wrapper] (val x: Self) extends AnyVal {
    
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
    def setRender(value: FunctionComponent[WrapperProps]): Self = this.set("render", value.asInstanceOf[js.Any])
  }
}
