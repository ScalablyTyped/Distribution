package typings
package prosemirrorDashMenuLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DomP[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] extends js.Object {
  var dom: stdLib.Node
  def update(p: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Unit
}

object Anon_DomP {
  @scala.inline
  def apply[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    dom: stdLib.Node,
    update: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S] => scala.Unit
  ): Anon_DomP[S] = {
    val __obj = js.Dynamic.literal(dom = dom, update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[Anon_DomP[S]]
  }
}

