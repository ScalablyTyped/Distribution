package typings
package prosemirrorDashStateLib.prosemirrorDashStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-state", "SelectionRange")
@js.native
class SelectionRange[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] protected () extends js.Object {
  def this($from: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S], $to: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S]) = this()
  /**
     * The lower bound of the range.
     */
  @JSName("$from")
  var $from: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S] = js.native
  /**
     * The upper bound of the range.
     */
  @JSName("$to")
  var $to: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S] = js.native
}

