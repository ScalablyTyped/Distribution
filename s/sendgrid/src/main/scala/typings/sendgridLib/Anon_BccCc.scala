package typings
package sendgridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BccCc extends js.Object {
  var bcc: js.Any
  var cc: js.Any
  var custom_args: js.Any
  var headers: js.Any
  var send_at: scala.Double
  var subject: java.lang.String
  var substitutions: js.Any
  var to: js.Any
}

object Anon_BccCc {
  @scala.inline
  def apply(
    bcc: js.Any,
    cc: js.Any,
    custom_args: js.Any,
    headers: js.Any,
    send_at: scala.Double,
    subject: java.lang.String,
    substitutions: js.Any,
    to: js.Any
  ): Anon_BccCc = {
    val __obj = js.Dynamic.literal(bcc = bcc, cc = cc, custom_args = custom_args, headers = headers, send_at = send_at, subject = subject, substitutions = substitutions, to = to)
  
    __obj.asInstanceOf[Anon_BccCc]
  }
}

