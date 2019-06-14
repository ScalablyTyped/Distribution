package typings
package reactDashAsyncLib.reactDashAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractAction extends js.Object {
  var meta: reactDashAsyncLib.Anon_Counter
  var `type`: java.lang.String
}

object AbstractAction {
  @scala.inline
  def apply(meta: reactDashAsyncLib.Anon_Counter, `type`: java.lang.String): AbstractAction = {
    val __obj = js.Dynamic.literal(meta = meta)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AbstractAction]
  }
}

