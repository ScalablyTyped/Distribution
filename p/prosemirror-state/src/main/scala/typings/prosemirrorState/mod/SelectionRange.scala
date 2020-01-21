package typings.prosemirrorState.mod

import typings.prosemirrorModel.mod.ResolvedPos
import typings.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-state", "SelectionRange")
@js.native
class SelectionRange[S /* <: Schema[_, _] */] protected () extends js.Object {
  def this($from: ResolvedPos[S], $to: ResolvedPos[S]) = this()
  /**
    * The lower bound of the range.
    */
  @JSName("$from")
  var $from: ResolvedPos[S] = js.native
  /**
    * The upper bound of the range.
    */
  @JSName("$to")
  var $to: ResolvedPos[S] = js.native
}

