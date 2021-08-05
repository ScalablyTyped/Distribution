package typings.prosemirrorModel.mod

import org.scalablytyped.runtime.TopLevel
import typings.orderedmap.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSpec[N /* <: String */, M /* <: String */] extends StObject {
  
  /**
    * The mark types that exist in this schema. The order in which they
    * are provided determines the order in which [mark
    * sets](#model.Mark.addToSet) are sorted and in which [parse
    * rules](#model.MarkSpec.parseDOM) are tried.
    */
  var marks: js.UndefOr[
    (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in M ]: prosemirror-model.prosemirror-model.MarkSpec}
    */ typings.prosemirrorModel.prosemirrorModelStrings.SchemaSpec & TopLevel[js.Any]) | ^[MarkSpec] | Null
  ] = js.undefined
  
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
    */ typings.prosemirrorModel.prosemirrorModelStrings.SchemaSpec & TopLevel[js.Any]) | ^[NodeSpec]
  
  /**
    * The name of the default top-level node for the schema. Defaults
    * to `"doc"`.
    */
  var topNode: js.UndefOr[String | Null] = js.undefined
}
object SchemaSpec {
  
  inline def apply[N /* <: String */, M /* <: String */](
    nodes: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in N ]: prosemirror-model.prosemirror-model.NodeSpec}
    */ typings.prosemirrorModel.prosemirrorModelStrings.SchemaSpec & TopLevel[js.Any]) | ^[NodeSpec]
  ): SchemaSpec[N, M] = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSpec[N, M]]
  }
  
  extension [Self <: SchemaSpec[?, ?], N /* <: String */, M /* <: String */](x: Self & (SchemaSpec[N, M])) {
    
    inline def setMarks(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ name in M ]: prosemirror-model.prosemirror-model.MarkSpec}
      */ typings.prosemirrorModel.prosemirrorModelStrings.SchemaSpec & TopLevel[js.Any]) | ^[MarkSpec]
    ): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
    
    inline def setMarksNull: Self = StObject.set(x, "marks", null)
    
    inline def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
    
    inline def setNodes(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ name in N ]: prosemirror-model.prosemirror-model.NodeSpec}
      */ typings.prosemirrorModel.prosemirrorModelStrings.SchemaSpec & TopLevel[js.Any]) | ^[NodeSpec]
    ): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setTopNode(value: String): Self = StObject.set(x, "topNode", value.asInstanceOf[js.Any])
    
    inline def setTopNodeNull: Self = StObject.set(x, "topNode", null)
    
    inline def setTopNodeUndefined: Self = StObject.set(x, "topNode", js.undefined)
  }
}
