package typings.rcFieldForm.anon

import typings.rcFieldForm.interfaceMod.ValidateMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mismatch extends js.Object {
  var mismatch: js.UndefOr[ValidateMessage] = js.undefined
}

object Mismatch {
  @scala.inline
  def apply(mismatch: ValidateMessage = null): Mismatch = {
    val __obj = js.Dynamic.literal()
    if (mismatch != null) __obj.updateDynamic("mismatch")(mismatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mismatch]
  }
}

