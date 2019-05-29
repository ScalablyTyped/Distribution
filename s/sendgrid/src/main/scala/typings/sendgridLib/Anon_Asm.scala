package typings
package sendgridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Asm extends js.Object {
  var asm: js.Any
  var attachments: js.Array[_]
  var batch_id: java.lang.String
  var categories: js.Array[_]
  var content: java.lang.String
  var custom_args: js.Array[_]
  var from: js.Any
  var headers: js.Array[_]
  var ip_pool_name: java.lang.String
  var mail_settings: js.Any
  var personalizations: js.Array[_]
  var reply_to: js.Any
  var sections: js.Array[_]
  var send_at: scala.Double
  var subject: java.lang.String
  var template_id: java.lang.String
  var tracking_settings: js.Any
}

object Anon_Asm {
  @scala.inline
  def apply(
    asm: js.Any,
    attachments: js.Array[_],
    batch_id: java.lang.String,
    categories: js.Array[_],
    content: java.lang.String,
    custom_args: js.Array[_],
    from: js.Any,
    headers: js.Array[_],
    ip_pool_name: java.lang.String,
    mail_settings: js.Any,
    personalizations: js.Array[_],
    reply_to: js.Any,
    sections: js.Array[_],
    send_at: scala.Double,
    subject: java.lang.String,
    template_id: java.lang.String,
    tracking_settings: js.Any
  ): Anon_Asm = {
    val __obj = js.Dynamic.literal(asm = asm, attachments = attachments, batch_id = batch_id, categories = categories, content = content, custom_args = custom_args, from = from, headers = headers, ip_pool_name = ip_pool_name, mail_settings = mail_settings, personalizations = personalizations, reply_to = reply_to, sections = sections, send_at = send_at, subject = subject, template_id = template_id, tracking_settings = tracking_settings)
  
    __obj.asInstanceOf[Anon_Asm]
  }
}

