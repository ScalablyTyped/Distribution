package typings.prosemirrorModel.anon

import typings.prosemirrorModel.mod.ProsemirrorNode
import typings.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Index[S /* <: Schema[_, _] */] extends js.Object {
  
  var index: Double = js.native
  
  var node: js.UndefOr[ProsemirrorNode[S] | Null] = js.native
  
  var offset: Double = js.native
}
object Index {
  
  @scala.inline
  def apply[S /* <: Schema[_, _] */](index: Double, offset: Double): Index[S] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index[S]]
  }
  
  @scala.inline
  implicit class IndexOps[Self <: Index[_], S /* <: Schema[_, _] */] (val x: Self with Index[S]) extends AnyVal {
    
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: ProsemirrorNode[S]): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
    
    @scala.inline
    def setNodeNull: Self = this.set("node", null)
  }
}
