package typings.prosemirrorView.anon

import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorModel.mod.Slice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Move[S /* <: Schema[_, _] */] extends js.Object {
  
  var move: Boolean = js.native
  
  var slice: Slice[S] = js.native
}
object Move {
  
  @scala.inline
  def apply[S /* <: Schema[_, _] */](move: Boolean, slice: Slice[S]): Move[S] = {
    val __obj = js.Dynamic.literal(move = move.asInstanceOf[js.Any], slice = slice.asInstanceOf[js.Any])
    __obj.asInstanceOf[Move[S]]
  }
  
  @scala.inline
  implicit class MoveOps[Self <: Move[_], S /* <: Schema[_, _] */] (val x: Self with Move[S]) extends AnyVal {
    
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
    def setMove(value: Boolean): Self = this.set("move", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlice(value: Slice[S]): Self = this.set("slice", value.asInstanceOf[js.Any])
  }
}
