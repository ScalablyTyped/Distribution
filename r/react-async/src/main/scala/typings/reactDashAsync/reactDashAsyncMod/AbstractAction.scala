package typings.reactDashAsync.reactDashAsyncMod

import typings.reactDashAsync.Anon_Counter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractAction extends js.Object {
  var meta: Anon_Counter
  var `type`: String
}

object AbstractAction {
  @scala.inline
  def apply(meta: Anon_Counter, `type`: String): AbstractAction = {
    val __obj = js.Dynamic.literal(meta = meta)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AbstractAction]
  }
}

