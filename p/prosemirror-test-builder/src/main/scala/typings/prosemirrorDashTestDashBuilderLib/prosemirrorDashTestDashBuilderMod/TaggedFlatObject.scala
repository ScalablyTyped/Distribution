package typings
package prosemirrorDashTestDashBuilderLib.prosemirrorDashTestDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaggedFlatObject[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] extends js.Object {
  var flat: js.Array[TaggedProsemirrorNode[S] | TaggedFlatObject[S]]
  var tag: stdLib.Record[java.lang.String, scala.Double]
}

object TaggedFlatObject {
  @scala.inline
  def apply[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    flat: js.Array[TaggedProsemirrorNode[S] | TaggedFlatObject[S]],
    tag: stdLib.Record[java.lang.String, scala.Double]
  ): TaggedFlatObject[S] = {
    val __obj = js.Dynamic.literal(flat = flat, tag = tag)
  
    __obj.asInstanceOf[TaggedFlatObject[S]]
  }
}

