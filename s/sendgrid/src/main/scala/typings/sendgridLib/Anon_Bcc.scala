package typings
package sendgridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bcc extends js.Object {
  var bcc: js.Any
  var bypass_list_management: js.Any
  var footer: js.Any
  var sandbox_mode: js.Any
  var spam_check: js.Any
}

object Anon_Bcc {
  @scala.inline
  def apply(
    bcc: js.Any,
    bypass_list_management: js.Any,
    footer: js.Any,
    sandbox_mode: js.Any,
    spam_check: js.Any
  ): Anon_Bcc = {
    val __obj = js.Dynamic.literal(bcc = bcc, bypass_list_management = bypass_list_management, footer = footer, sandbox_mode = sandbox_mode, spam_check = spam_check)
  
    __obj.asInstanceOf[Anon_Bcc]
  }
}

