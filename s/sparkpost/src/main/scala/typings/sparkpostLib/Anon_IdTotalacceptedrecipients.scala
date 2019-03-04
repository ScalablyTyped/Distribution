package typings
package sparkpostLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdTotalacceptedrecipients extends js.Object {
  var id: java.lang.String
  var total_accepted_recipients: scala.Double
  var total_rejected_recipients: scala.Double
}

object Anon_IdTotalacceptedrecipients {
  @scala.inline
  def apply(
    id: java.lang.String,
    total_accepted_recipients: scala.Double,
    total_rejected_recipients: scala.Double
  ): Anon_IdTotalacceptedrecipients = {
    val __obj = js.Dynamic.literal(id = id, total_accepted_recipients = total_accepted_recipients, total_rejected_recipients = total_rejected_recipients)
  
    __obj.asInstanceOf[Anon_IdTotalacceptedrecipients]
  }
}

