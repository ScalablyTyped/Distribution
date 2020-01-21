package typings.reactNativeFirebase.mod.RNFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmationResult extends js.Object {
  var verificationId: String | Null
  def confirm(verificationCode: String): js.Promise[User | Null]
}

object ConfirmationResult {
  @scala.inline
  def apply(confirm: String => js.Promise[User | Null], verificationId: String = null): ConfirmationResult = {
    val __obj = js.Dynamic.literal(confirm = js.Any.fromFunction1(confirm))
    if (verificationId != null) __obj.updateDynamic("verificationId")(verificationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmationResult]
  }
}

