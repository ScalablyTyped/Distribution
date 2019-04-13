package typings
package prosemirrorDashModelLib.prosemirrorDashModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaSpec[N /* <: java.lang.String */, M /* <: java.lang.String */] extends js.Object {
  /**
    * The mark types that exist in this schema. The order in which they
    * are provided determines the order in which [mark
    * sets](#model.Mark.addToSet) are sorted and in which [parse
    * rules](#model.MarkSpec.parseDOM) are tried.
    */
  var marks: js.UndefOr[
    (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ name in M ]: prosemirror-model.prosemirror-model.MarkSpec}
    */ prosemirrorDashModelLib.prosemirrorDashModelLibStrings.SchemaSpec with js.Any) | orderedmapLib.orderedmapMod.^[MarkSpec] | scala.Null
  ] = js.undefined
  /**
    * The node types in this schema. Maps names to
    * [`NodeSpec`](#model.NodeSpec) objects that describe the node type
    * associated with that name. Their order is significant—it
    * determines which [parse rules](#model.NodeSpec.parseDOM) take
    * precedence by default, and which nodes come first in a given
    * [group](#model.NodeSpec.group).
    */
  var nodes: (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ name in N ]: prosemirror-model.prosemirror-model.NodeSpec}
    */ prosemirrorDashModelLib.prosemirrorDashModelLibStrings.SchemaSpec with js.Any) | orderedmapLib.orderedmapMod.^[NodeSpec]
  /**
    * The name of the default top-level node for the schema. Defaults
    * to `"doc"`.
    */
  var topNode: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object SchemaSpec {
  @scala.inline
  def apply[N /* <: java.lang.String */, M /* <: java.lang.String */](
    nodes: (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ name in N ]: prosemirror-model.prosemirror-model.NodeSpec}
    */ prosemirrorDashModelLib.prosemirrorDashModelLibStrings.SchemaSpec with js.Any) | orderedmapLib.orderedmapMod.^[NodeSpec],
    marks: (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ name in M ]: prosemirror-model.prosemirror-model.MarkSpec}
    */ prosemirrorDashModelLib.prosemirrorDashModelLibStrings.SchemaSpec with js.Any) | orderedmapLib.orderedmapMod.^[MarkSpec] = null,
    topNode: java.lang.String = null
  ): SchemaSpec[N, M] = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (topNode != null) __obj.updateDynamic("topNode")(topNode)
    __obj.asInstanceOf[SchemaSpec[N, M]]
  }
}

