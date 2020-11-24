package typings.prosemirrorMenu.mod

import typings.prosemirrorMenu.anon.Dom
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorView.mod.EditorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuElement[S /* <: Schema[_, _] */] extends js.Object {
  
  /**
    * Render the element for display in the menu. Must return a DOM
    * element and a function that can be used to update the element to
    * a new state. The `update` function will return false if the
    * update hid the entire element.
    */
  def render(pm: EditorView[S]): Dom[S] = js.native
}
object MenuElement {
  
  @scala.inline
  def apply[S /* <: Schema[_, _] */](render: EditorView[S] => Dom[S]): MenuElement[S] = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[MenuElement[S]]
  }
  
  @scala.inline
  implicit class MenuElementOps[Self <: MenuElement[_], S /* <: Schema[_, _] */] (val x: Self with MenuElement[S]) extends AnyVal {
    
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
    def setRender(value: EditorView[S] => Dom[S]): Self = this.set("render", js.Any.fromFunction1(value))
  }
}
