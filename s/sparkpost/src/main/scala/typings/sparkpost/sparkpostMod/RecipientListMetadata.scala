package typings.sparkpost.sparkpostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecipientListMetadata extends js.Object {
  var id: String
  var name: String
  var total_accepted_recipients: Double
  var total_rejected_recipients: Double
}

object RecipientListMetadata {
  @scala.inline
  def apply(id: String, name: String, total_accepted_recipients: Double, total_rejected_recipients: Double): RecipientListMetadata = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], total_accepted_recipients = total_accepted_recipients.asInstanceOf[js.Any], total_rejected_recipients = total_rejected_recipients.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RecipientListMetadata]
  }
}

