package typings
package prosemirrorDashViewLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Move[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] extends js.Object {
  var move: scala.Boolean
  var slice: prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[S]
}

object Anon_Move {
  @scala.inline
  def apply[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](move: scala.Boolean, slice: prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[S]): Anon_Move[S] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("move")(move)
    __obj.updateDynamic("slice")(slice)
    __obj.asInstanceOf[Anon_Move[S]]
  }
}

