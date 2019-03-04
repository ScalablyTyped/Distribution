package typings
package prosemirrorDashMenuLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DomPUpdate[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] extends js.Object {
  var dom: js.UndefOr[stdLib.DocumentFragment | scala.Null] = js.undefined
  def update(p: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Boolean
}

object Anon_DomPUpdate {
  @scala.inline
  def apply[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    update: js.Function1[prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], scala.Boolean],
    dom: stdLib.DocumentFragment = null
  ): Anon_DomPUpdate[S] = {
    val __obj = js.Dynamic.literal(update = update)
    if (dom != null) __obj.updateDynamic("dom")(dom)
    __obj.asInstanceOf[Anon_DomPUpdate[S]]
  }
}

