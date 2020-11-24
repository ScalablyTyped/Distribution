package typings.prosemirrorTestBuilder.mod

import typings.prosemirrorModel.mod.Schema
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaggedFlatObject[S /* <: Schema[_, _] */] extends js.Object {
  
  var flat: js.Array[TaggedProsemirrorNode[S] | TaggedFlatObject[S]] = js.native
  
  var tag: Record[String, Double] = js.native
}
object TaggedFlatObject {
  
  @scala.inline
  def apply[S /* <: Schema[_, _] */](flat: js.Array[TaggedProsemirrorNode[S] | TaggedFlatObject[S]], tag: Record[String, Double]): TaggedFlatObject[S] = {
    val __obj = js.Dynamic.literal(flat = flat.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaggedFlatObject[S]]
  }
  
  @scala.inline
  implicit class TaggedFlatObjectOps[Self <: TaggedFlatObject[_], S /* <: Schema[_, _] */] (val x: Self with TaggedFlatObject[S]) extends AnyVal {
    
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
    def setFlatVarargs(value: (TaggedProsemirrorNode[S] | TaggedFlatObject[S])*): Self = this.set("flat", js.Array(value :_*))
    
    @scala.inline
    def setFlat(value: js.Array[TaggedProsemirrorNode[S] | TaggedFlatObject[S]]): Self = this.set("flat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: Record[String, Double]): Self = this.set("tag", value.asInstanceOf[js.Any])
  }
}
