package typings.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTotalacceptedrecipients extends js.Object {
  var id: String
  var total_accepted_recipients: Double
  var total_rejected_recipients: Double
}

object AnonTotalacceptedrecipients {
  @scala.inline
  def apply(id: String, total_accepted_recipients: Double, total_rejected_recipients: Double): AnonTotalacceptedrecipients = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], total_accepted_recipients = total_accepted_recipients.asInstanceOf[js.Any], total_rejected_recipients = total_rejected_recipients.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTotalacceptedrecipients]
  }
}

