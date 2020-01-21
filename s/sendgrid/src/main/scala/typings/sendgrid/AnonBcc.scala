package typings.sendgrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBcc extends js.Object {
  var bcc: js.Any
  var bypass_list_management: js.Any
  var footer: js.Any
  var sandbox_mode: js.Any
  var spam_check: js.Any
}

object AnonBcc {
  @scala.inline
  def apply(
    bcc: js.Any,
    bypass_list_management: js.Any,
    footer: js.Any,
    sandbox_mode: js.Any,
    spam_check: js.Any
  ): AnonBcc = {
    val __obj = js.Dynamic.literal(bcc = bcc.asInstanceOf[js.Any], bypass_list_management = bypass_list_management.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], sandbox_mode = sandbox_mode.asInstanceOf[js.Any], spam_check = spam_check.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBcc]
  }
}

