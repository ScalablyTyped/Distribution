package typings.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfirmPool extends js.Object {
  var confirmPool: AnonAutostart
  var regularPool: AnonAutostart
}

object AnonConfirmPool {
  @scala.inline
  def apply(confirmPool: AnonAutostart, regularPool: AnonAutostart): AnonConfirmPool = {
    val __obj = js.Dynamic.literal(confirmPool = confirmPool.asInstanceOf[js.Any], regularPool = regularPool.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfirmPool]
  }
}

