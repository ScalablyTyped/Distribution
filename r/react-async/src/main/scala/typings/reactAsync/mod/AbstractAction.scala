package typings.reactAsync.mod

import typings.reactAsync.anon.Dictmeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractAction extends js.Object {
  var meta: Dictmeta
  var `type`: String
}

object AbstractAction {
  @scala.inline
  def apply(meta: Dictmeta, `type`: String): AbstractAction = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractAction]
  }
}

