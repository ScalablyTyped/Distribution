package typings.prosemirrorState.anon

import typings.prosemirrorModel.mod.Mark
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorState.mod.Plugin
import typings.prosemirrorState.mod.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Doc[S /* <: typings.prosemirrorModel.mod.Schema[_, _] */] extends js.Object {
  
  var doc: js.UndefOr[Node[S] | Null] = js.native
  
  var plugins: js.UndefOr[(js.Array[Plugin[_, S]]) | Null] = js.native
  
  var schema: js.UndefOr[S | Null] = js.native
  
  var selection: js.UndefOr[Selection[S] | Null] = js.native
  
  var storedMarks: js.UndefOr[js.Array[Mark[_]] | Null] = js.native
}
object Doc {
  
  @scala.inline
  def apply[S /* <: typings.prosemirrorModel.mod.Schema[_, _] */](): Doc[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Doc[S]]
  }
  
  @scala.inline
  implicit class DocOps[Self <: Doc[_], S /* <: typings.prosemirrorModel.mod.Schema[_, _] */] (val x: Self with Doc[S]) extends AnyVal {
    
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
    def setDoc(value: Node[S]): Self = this.set("doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoc: Self = this.set("doc", js.undefined)
    
    @scala.inline
    def setDocNull: Self = this.set("doc", null)
    
    @scala.inline
    def setPluginsVarargs(value: (Plugin[js.Any, S])*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[Plugin[_, S]]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setPluginsNull: Self = this.set("plugins", null)
    
    @scala.inline
    def setSchema(value: S): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    
    @scala.inline
    def setSchemaNull: Self = this.set("schema", null)
    
    @scala.inline
    def setSelection(value: Selection[S]): Self = this.set("selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    
    @scala.inline
    def setSelectionNull: Self = this.set("selection", null)
    
    @scala.inline
    def setStoredMarksVarargs(value: Mark[js.Any]*): Self = this.set("storedMarks", js.Array(value :_*))
    
    @scala.inline
    def setStoredMarks(value: js.Array[Mark[_]]): Self = this.set("storedMarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoredMarks: Self = this.set("storedMarks", js.undefined)
    
    @scala.inline
    def setStoredMarksNull: Self = this.set("storedMarks", null)
  }
}
