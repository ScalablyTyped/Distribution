package typings.prosemirrorState.anon

import typings.prosemirrorState.mod.EditorState
import typings.prosemirrorView.mod.EditorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Destroy[S /* <: typings.prosemirrorModel.mod.Schema[_, _] */] extends js.Object {
  
  var destroy: js.UndefOr[js.Function0[Unit] | Null] = js.native
  
  var update: js.UndefOr[
    (js.Function2[/* view */ EditorView[S], /* prevState */ EditorState[S], Unit]) | Null
  ] = js.native
}
object Destroy {
  
  @scala.inline
  def apply[S /* <: typings.prosemirrorModel.mod.Schema[_, _] */](): Destroy[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Destroy[S]]
  }
  
  @scala.inline
  implicit class DestroyOps[Self <: Destroy[_], S /* <: typings.prosemirrorModel.mod.Schema[_, _] */] (val x: Self with Destroy[S]) extends AnyVal {
    
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setDestroyNull: Self = this.set("destroy", null)
    
    @scala.inline
    def setUpdate(value: (/* view */ EditorView[S], /* prevState */ EditorState[S]) => Unit): Self = this.set("update", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    
    @scala.inline
    def setUpdateNull: Self = this.set("update", null)
  }
}
