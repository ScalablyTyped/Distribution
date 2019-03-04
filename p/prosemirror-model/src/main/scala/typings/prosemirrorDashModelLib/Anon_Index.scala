package typings
package prosemirrorDashModelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] extends js.Object {
  var index: scala.Double
  var node: js.UndefOr[prosemirrorDashModelLib.prosemirrorDashModelMod.ProsemirrorNode[S] | scala.Null] = js.undefined
  var offset: scala.Double
}

object Anon_Index {
  @scala.inline
  def apply[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    index: scala.Double,
    offset: scala.Double,
    node: prosemirrorDashModelLib.prosemirrorDashModelMod.ProsemirrorNode[S] = null
  ): Anon_Index[S] = {
    val __obj = js.Dynamic.literal(index = index, offset = offset)
    if (node != null) __obj.updateDynamic("node")(node)
    __obj.asInstanceOf[Anon_Index[S]]
  }
}

