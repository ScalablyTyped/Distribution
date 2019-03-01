package typings
package prosemirrorDashModelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Next extends js.Object {
  var next: prosemirrorDashModelLib.prosemirrorDashModelMod.ContentMatch[_]
  var `type`: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[_]
}

object Anon_Next {
  @scala.inline
  def apply(
    next: prosemirrorDashModelLib.prosemirrorDashModelMod.ContentMatch[_],
    `type`: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[_]
  ): Anon_Next = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[Anon_Next]
  }
}

