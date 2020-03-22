package typings.rcFieldForm.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateOptions extends js.Object {
  var triggerName: js.UndefOr[String] = js.undefined
  var validateMessages: js.UndefOr[ValidateMessages] = js.undefined
}

object ValidateOptions {
  @scala.inline
  def apply(triggerName: String = null, validateMessages: ValidateMessages = null): ValidateOptions = {
    val __obj = js.Dynamic.literal()
    if (triggerName != null) __obj.updateDynamic("triggerName")(triggerName.asInstanceOf[js.Any])
    if (validateMessages != null) __obj.updateDynamic("validateMessages")(validateMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateOptions]
  }
}

