package typings
package prosemirrorDashTransformLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attrs[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] extends js.Object {
  var attrs: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any] | scala.Null] = js.undefined
  var `type`: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S]
}

object Anon_Attrs {
  @scala.inline
  def apply[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    `type`: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S],
    attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_Attrs[S] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (attrs != null) __obj.updateDynamic("attrs")(attrs)
    __obj.asInstanceOf[Anon_Attrs[S]]
  }
}

