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
    val __obj = js.Dynamic.literal(asm = asm.asInstanceOf[js.Any], attachments = attachments.asInstanceOf[js.Any], batch_id = batch_id.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], custom_args = custom_args.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ip_pool_name = ip_pool_name.asInstanceOf[js.Any], mail_settings = mail_settings.asInstanceOf[js.Any], personalizations = personalizations.asInstanceOf[js.Any], reply_to = reply_to.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], send_at = send_at.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], template_id = template_id.asInstanceOf[js.Any], tracking_settings = tracking_settings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Asm]
  }
}

