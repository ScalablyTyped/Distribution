package typings.prosemirrorView.anon

import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorModel.mod.Slice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Move[S /* <: Schema[_, _] */] extends js.Object {
  var move: Boolean
  var slice: Slice[S]
}

object Move {
  @scala.inline
  def apply[/* <: typings.prosemirrorModel.mod.Schema[_, _] */ S](move: Boolean, slice: Slice[S]): Move[S] = {
    val __obj = js.Dynamic.literal(move = move.asInstanceOf[js.Any], slice = slice.asInstanceOf[js.Any])
    __obj.asInstanceOf[Move[S]]
  }
}

