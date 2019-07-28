package typings.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdTotalacceptedrecipients extends js.Object {
  var id: String
  var total_accepted_recipients: Double
  var total_rejected_recipients: Double
}

object Anon_IdTotalacceptedrecipients {
  @scala.inline
  def apply(id: String, total_accepted_recipients: Double, total_rejected_recipients: Double): Anon_IdTotalacceptedrecipients = {
    val __obj = js.Dynamic.literal(id = id, total_accepted_recipients = total_accepted_recipients, total_rejected_recipients = total_rejected_recipients)
  
    __obj.asInstanceOf[Anon_IdTotalacceptedrecipients]
  }
}

