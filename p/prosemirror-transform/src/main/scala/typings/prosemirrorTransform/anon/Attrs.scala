package typings.prosemirrorTransform.anon

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.NodeType
import typings.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attrs[S /* <: Schema[_, _] */] extends js.Object {
  
  var attrs: js.UndefOr[StringDictionary[js.Any] | Null] = js.native
  
  var `type`: NodeType[S] = js.native
}
object Attrs {
  
  @scala.inline
  def apply[S /* <: Schema[_, _] */](`type`: NodeType[S]): Attrs[S] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attrs[S]]
  }
  
  @scala.inline
  implicit class AttrsOps[Self <: Attrs[_], S /* <: Schema[_, _] */] (val x: Self with Attrs[S]) extends AnyVal {
    
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
    def setType(value: NodeType[S]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttrs(value: StringDictionary[js.Any]): Self = this.set("attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttrs: Self = this.set("attrs", js.undefined)
    
    @scala.inline
    def setAttrsNull: Self = this.set("attrs", null)
  }
}
