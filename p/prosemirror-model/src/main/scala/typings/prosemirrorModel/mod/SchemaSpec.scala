package typings.prosemirrorModel.mod

import org.scalablytyped.runtime.TopLevel
import typings.orderedmap.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    */ typings.prosemirrorModel.prosemirrorModelStrings.SchemaSpec with TopLevel[js.Any]) | ^[NodeSpec]
  /**
    * The name of the default top-level node for the schema. Defaults
    * to `"doc"`.
    */
  var topNode: js.UndefOr[String | Null] = js.undefined
}

object SchemaSpec {
  @scala.inline
  def apply[N, M](
    nodes: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in N ]: prosemirror-model.prosemirror-model.NodeSpec}
    */ typings.prosemirrorModel.prosemirrorModelStrings.SchemaSpec with TopLevel[js.Any]) | ^[NodeSpec],
    marks: js.UndefOr[
      Null | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in M ]: prosemirror-model.prosemirror-model.MarkSpec}
    */ typings.prosemirrorModel.prosemirrorModelStrings.SchemaSpec with TopLevel[js.Any]) | ^[MarkSpec]
    ] = js.undefined,
    topNode: js.UndefOr[Null | String] = js.undefined
  ): SchemaSpec[N, M] = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    if (!js.isUndefined(marks)) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (!js.isUndefined(topNode)) __obj.updateDynamic("topNode")(topNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSpec[N, M]]
  }
}

