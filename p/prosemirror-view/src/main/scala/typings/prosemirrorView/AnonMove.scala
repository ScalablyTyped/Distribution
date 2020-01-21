package typings.prosemirrorView

import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorModel.mod.Slice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMove[S /* <: Schema[_, _] */] extends js.Object {
  var move: Boolean
  var slice: Slice[S]
}

object AnonMove {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](move: Boolean, slice: Slice[S]): AnonMove[S] = {
    val __obj = js.Dynamic.literal(move = move.asInstanceOf[js.Any], slice = slice.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMove[S]]
  }
}

