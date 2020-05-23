package typings.prosemirrorModel.anon

import typings.prosemirrorModel.mod.ProsemirrorNode
import typings.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index[S /* <: Schema[_, _] */] extends js.Object {
  var index: Double
  var node: js.UndefOr[ProsemirrorNode[S] | Null] = js.undefined
  var offset: Double
}

object Index {
  @scala.inline
  def apply[S](index: Double, offset: Double, node: js.UndefOr[Null | ProsemirrorNode[S]] = js.undefined): Index[S] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    if (!js.isUndefined(node)) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index[S]]
  }
}

