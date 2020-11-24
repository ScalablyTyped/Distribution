package typings.prosemirrorMenu.anon

import typings.prosemirrorMenu.mod.MenuElement
import typings.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Content[S /* <: Schema[_, _] */] extends js.Object {
  
  var content: js.Array[js.Array[MenuElement[S]]] = js.native
  
  var floating: js.UndefOr[Boolean | Null] = js.native
}
object Content {
  
  @scala.inline
  def apply[S /* <: Schema[_, _] */](content: js.Array[js.Array[MenuElement[S]]]): Content[S] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content[S]]
  }
  
  @scala.inline
  implicit class ContentOps[Self <: Content[_], S /* <: Schema[_, _] */] (val x: Self with Content[S]) extends AnyVal {
    
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
    def setContentVarargs(value: js.Array[MenuElement[S]]*): Self = this.set("content", js.Array(value :_*))
    
    @scala.inline
    def setContent(value: js.Array[js.Array[MenuElement[S]]]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloating(value: Boolean): Self = this.set("floating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloating: Self = this.set("floating", js.undefined)
    
    @scala.inline
    def setFloatingNull: Self = this.set("floating", null)
  }
}
