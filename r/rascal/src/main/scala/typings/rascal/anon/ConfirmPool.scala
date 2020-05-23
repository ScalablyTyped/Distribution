package typings.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmPool extends js.Object {
  var confirmPool: Autostart
  var regularPool: Autostart
}

object ConfirmPool {
  @scala.inline
  def apply(confirmPool: Autostart, regularPool: Autostart): ConfirmPool = {
    val __obj = js.Dynamic.literal(confirmPool = confirmPool.asInstanceOf[js.Any], regularPool = regularPool.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmPool]
  }
}

