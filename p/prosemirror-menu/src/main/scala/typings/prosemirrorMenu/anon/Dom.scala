package typings.prosemirrorMenu.anon

import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.mod.EditorState
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dom[S /* <: Schema[_, _] */] extends js.Object {
  
  var dom: Node = js.native
  
  def update(p: EditorState[S]): Boolean = js.native
}
object Dom {
  
  @scala.inline
  def apply[S /* <: Schema[_, _] */](dom: Node, update: EditorState[S] => Boolean): Dom[S] = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Dom[S]]
  }
  
  @scala.inline
  implicit class DomOps[Self <: Dom[_], S /* <: Schema[_, _] */] (val x: Self with Dom[S]) extends AnyVal {
    
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
    def setDom(value: Node): Self = this.set("dom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: EditorState[S] => Boolean): Self = this.set("update", js.Any.fromFunction1(value))
  }
}
