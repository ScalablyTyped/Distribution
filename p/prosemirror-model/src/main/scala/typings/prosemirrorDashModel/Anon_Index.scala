package typings.prosemirrorDashModel

import typings.prosemirrorDashModel.prosemirrorDashModelMod.ProsemirrorNode
import typings.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index[S /* <: Schema[_, _] */] extends js.Object {
  var index: Double
  var node: js.UndefOr[ProsemirrorNode[S] | Null] = js.undefined
  var offset: Double
}

object Anon_Index {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](index: Double, offset: Double, node: ProsemirrorNode[S] = null): Anon_Index[S] = {
    val __obj = js.Dynamic.literal(index = index, offset = offset)
    if (node != null) __obj.updateDynamic("node")(node)
    __obj.asInstanceOf[Anon_Index[S]]
  }
}

