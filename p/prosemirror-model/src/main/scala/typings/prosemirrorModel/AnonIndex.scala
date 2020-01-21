package typings.prosemirrorModel

import typings.prosemirrorModel.mod.ProsemirrorNode
import typings.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndex[S /* <: Schema[_, _] */] extends js.Object {
  var index: Double
  var node: js.UndefOr[ProsemirrorNode[S] | Null] = js.undefined
  var offset: Double
}

object AnonIndex {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](index: Double, offset: Double, node: ProsemirrorNode[S] = null): AnonIndex[S] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndex[S]]
  }
}

