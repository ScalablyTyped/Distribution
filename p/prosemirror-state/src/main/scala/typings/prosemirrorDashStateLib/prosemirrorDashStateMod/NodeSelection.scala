package typings
package prosemirrorDashStateLib.prosemirrorDashStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-state", "NodeSelection")
@js.native
class NodeSelection[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] protected () extends Selection[S] {
  /**
     * Create a node selection. Does not verify the validity of its
     * argument.
     */
  def this($pos: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S]) = this()
  /**
     * The selected node.
     */
  var node: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S] = js.native
}

@JSImport("prosemirror-state", "NodeSelection")
@js.native
object NodeSelection extends js.Object {
  /**
     * Create a node selection from non-resolved positions.
     */
  def create[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](doc: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S], from: scala.Double): prosemirrorDashStateLib.prosemirrorDashStateMod.NodeSelection[S] = js.native
  /**
     * Determines whether the given node may be selected as a node
     * selection.
     */
  def isSelectable(node: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[_]): scala.Boolean = js.native
}

