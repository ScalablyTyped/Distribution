package typings.sendgrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Asm extends js.Object {
  var asm: js.Any
  var attachments: js.Array[_]
  var batch_id: String
  var categories: js.Array[_]
  var content: String
  var custom_args: js.Array[_]
  var from: js.Any
  var headers: js.Array[_]
  var ip_pool_name: String
  var mail_settings: js.Any
  var personalizations: js.Array[_]
  var reply_to: js.Any
  var sections: js.Array[_]
  var send_at: Double
  var subject: String
  var template_id: String
  var tracking_settings: js.Any
}

object Anon_Asm {
  @scala.inline
  def apply(
    asm: js.Any,
    attachments: js.Array[_],
    batch_id: String,
    categories: js.Array[_],
    content: String,
    custom_args: js.Array[_],
    from: js.Any,
    headers: js.Array[_],
    ip_pool_name: String,
    mail_settings: js.Any,
    personalizations: js.Array[_],
    reply_to: js.Any,
    sections: js.Array[_],
    send_at: Double,
    subject: String,
    template_id: String,
    tracking_settings: js.Any
  ): Anon_Asm = {
    val __obj = js.Dynamic.literal(asm = asm, attachments = attachments, batch_id = batch_id, categories = categories, content = content, custom_args = custom_args, from = from, headers = headers, ip_pool_name = ip_pool_name, mail_settings = mail_settings, personalizations = personalizations, reply_to = reply_to, sections = sections, send_at = send_at, subject = subject, template_id = template_id, tracking_settings = tracking_settings)
  
    __obj.asInstanceOf[Anon_Asm]
  }
}

