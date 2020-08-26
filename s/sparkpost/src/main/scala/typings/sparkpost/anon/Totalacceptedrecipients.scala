package typings.sparkpost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Totalacceptedrecipients extends js.Object {
  var id: String = js.native
  var total_accepted_recipients: Double = js.native
  var total_rejected_recipients: Double = js.native
}

object Totalacceptedrecipients {
  @scala.inline
  def apply(id: String, total_accepted_recipients: Double, total_rejected_recipients: Double): Totalacceptedrecipients = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], total_accepted_recipients = total_accepted_recipients.asInstanceOf[js.Any], total_rejected_recipients = total_rejected_recipients.asInstanceOf[js.Any])
    __obj.asInstanceOf[Totalacceptedrecipients]
  }
  @scala.inline
  implicit class TotalacceptedrecipientsOps[Self <: Totalacceptedrecipients] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_accepted_recipients(value: Double): Self = this.set("total_accepted_recipients", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_rejected_recipients(value: Double): Self = this.set("total_rejected_recipients", value.asInstanceOf[js.Any])
  }
  
}

