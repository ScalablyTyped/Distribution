package typings.rcFieldForm

import typings.rcFieldForm.interfaceMod.ValidateMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMismatch extends js.Object {
  var mismatch: js.UndefOr[ValidateMessage] = js.undefined
}

object AnonMismatch {
  @scala.inline
  def apply(mismatch: ValidateMessage = null): AnonMismatch = {
    val __obj = js.Dynamic.literal()
    if (mismatch != null) __obj.updateDynamic("mismatch")(mismatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMismatch]
  }
}

