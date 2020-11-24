package typings.prosemirrorModel.mod

import org.scalablytyped.runtime.TopLevel
import typings.orderedmap.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSpec[N /* <: String */, M /* <: String */] extends js.Object {
  
  /**
    * The mark types that exist in this schema. The order in which they
    * are provided determines the order in which [mark
    * sets](#model.Mark.addToSet) are sorted and in which [parse
    * rules](#model.MarkSpec.parseDOM) are tried.
    */
  var marks: js.UndefOr[
    (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in M ]: prosemirror-model.prosemirror-model.MarkSpec}
    */ typings.prosemirrorModel.prosemirrorModelStrings.SchemaSpec with TopLevel[js.Any]) | ^[MarkSpec] | Null
  ] = js.native
  
  /**
    * The node types in this schema. Maps names to
    * [`NodeSpec`](#model.NodeSpec) objects that describe the node type
    * associated with that name. Their order is significant—it
    * determines which [parse rules](#model.NodeSpec.parseDOM) take
    * precedence by default, and which nodes come first in a given
    * [group](#model.NodeSpec.group).
    */
  var nodes: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in N ]: prosemirror-model.prosemirror-model.NodeSpec}
    */ typings.prosemirrorModel.prosemirrorModelStrings.SchemaSpec with TopLevel[js.Any]) | ^[NodeSpec] = js.native
  
  /**
    * The name of the default top-level node for the schema. Defaults
    * to `"doc"`.
    */
  var topNode: js.UndefOr[String | Null] = js.native
}
object SchemaSpec {
  
  @scala.inline
  def apply[N /* <: String */, M /* <: String */](
    nodes: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in N ]: prosemirror-model.prosemirror-model.NodeSpec}
    */ typings.prosemirrorModel.prosemirrorModelStrings.SchemaSpec with TopLevel[js.Any]) | ^[NodeSpec]
  ): SchemaSpec[N, M] = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSpec[N, M]]
  }
  
  @scala.inline
  implicit class SchemaSpecOps[Self <: SchemaSpec[_, _], N /* <: String */, M /* <: String */] (val x: Self with (SchemaSpec[N, M])) extends AnyVal {
    
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
    def setNodes(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ name in N ]: prosemirror-model.prosemirror-model.NodeSpec}
      */ typings.prosemirrorModel.prosemirrorModelStrings.SchemaSpec with TopLevel[js.Any]) | ^[NodeSpec]
    ): Self = this.set("nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarks(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ name in M ]: prosemirror-model.prosemirror-model.MarkSpec}
      */ typings.prosemirrorModel.prosemirrorModelStrings.SchemaSpec with TopLevel[js.Any]) | ^[MarkSpec]
    ): Self = this.set("marks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarks: Self = this.set("marks", js.undefined)
    
    @scala.inline
    def setMarksNull: Self = this.set("marks", null)
    
    @scala.inline
    def setTopNode(value: String): Self = this.set("topNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopNode: Self = this.set("topNode", js.undefined)
    
    @scala.inline
    def setTopNodeNull: Self = this.set("topNode", null)
  }
}
