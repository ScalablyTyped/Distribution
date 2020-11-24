package typings.prosemirrorState.mod

import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.ResolvedPos
import typings.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prosemirror-state", "NodeSelection")
@js.native
class NodeSelection[S /* <: Schema[_, _] */] protected () extends Selection[S] {
  /**
    * Create a node selection. Does not verify the validity of its
    * argument.
    */
  def this($pos: ResolvedPos[S]) = this()
  
  /**
    * The selected node.
    */
  var node: Node[S] = js.native
}
/* static members */
@JSImport("prosemirror-state", "NodeSelection")
@js.native
object NodeSelection extends js.Object {
  
  /**
    * Create a node selection from non-resolved positions.
    */
  def create[S /* <: Schema[_, _] */](doc: Node[S], from: Double): NodeSelection[S] = js.native
  
  /**
    * Determines whether the given node may be selected as a node
    * selection.
    */
  def isSelectable(node: Node[_]): Boolean = js.native
}
