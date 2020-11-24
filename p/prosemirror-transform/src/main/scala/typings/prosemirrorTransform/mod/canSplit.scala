package typings.prosemirrorTransform.mod

import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorTransform.anon.Attrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prosemirror-transform", "canSplit")
@js.native
object canSplit extends js.Object {
  
  def apply[S /* <: Schema[_, _] */](doc: Node[S], pos: Double): Boolean = js.native
  def apply[S /* <: Schema[_, _] */](
    doc: Node[S],
    pos: Double,
    depth: js.UndefOr[scala.Nothing],
    typesAfter: js.Array[js.UndefOr[Attrs[S] | Null]]
  ): Boolean = js.native
  def apply[S /* <: Schema[_, _] */](doc: Node[S], pos: Double, depth: Double): Boolean = js.native
  def apply[S /* <: Schema[_, _] */](doc: Node[S], pos: Double, depth: Double, typesAfter: js.Array[js.UndefOr[Attrs[S] | Null]]): Boolean = js.native
}
