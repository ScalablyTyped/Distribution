package typings.prosemirrorTransform.mod

import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorModel.mod.Slice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-transform", "dropPoint")
@js.native
object dropPoint extends js.Object {
  def apply[S /* <: Schema[_, _] */](doc: Node[S], pos: Double, slice: Slice[S]): js.UndefOr[Double | Null] = js.native
}

