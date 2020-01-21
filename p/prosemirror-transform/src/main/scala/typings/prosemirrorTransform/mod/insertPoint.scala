package typings.prosemirrorTransform.mod

import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.NodeType
import typings.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-transform", "insertPoint")
@js.native
object insertPoint extends js.Object {
  def apply[S /* <: Schema[_, _] */](doc: Node[S], pos: Double, nodeType: NodeType[S]): js.UndefOr[Double | Null] = js.native
}

