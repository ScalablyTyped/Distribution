package typings.prosemirrorTransform.mod

import typings.prosemirrorModel.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-transform", "joinPoint")
@js.native
object joinPoint extends js.Object {
  def apply(doc: Node[_], pos: Double): js.UndefOr[Double | Null] = js.native
  def apply(doc: Node[_], pos: Double, dir: Double): js.UndefOr[Double | Null] = js.native
}

