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
    (prosemirrorDashModelLib.prosemirrorDashModelLibStrings.SchemaSpec with js.Any) | orderedmapLib.orderedmapMod.namespaced[MarkSpec] | scala.Null
  ] = js.undefined
  /**
     * The node types in this schema. Maps names to
     * [`NodeSpec`](#model.NodeSpec) objects that describe the node type
     * associated with that name. Their order is significant—it
     * determines which [parse rules](#model.NodeSpec.parseDOM) take
     * precedence by default, and which nodes come first in a given
     * [group](#model.NodeSpec.group).
     */
  var nodes: (prosemirrorDashModelLib.prosemirrorDashModelLibStrings.SchemaSpec with js.Any) | orderedmapLib.orderedmapMod.namespaced[NodeSpec]
  /**
     * The name of the default top-level node for the schema. Defaults
     * to `"doc"`.
     */
  var topNode: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

