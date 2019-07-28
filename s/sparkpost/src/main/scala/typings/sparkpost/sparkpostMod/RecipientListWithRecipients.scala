package typings.sparkpost.sparkpostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecipientListWithRecipients extends RecipientList {
  /** Array of recipient objects */
  var recipients: js.Array[Recipient]
}

object RecipientListWithRecipients {
  @scala.inline
  def apply(
    attributes: js.Any,
    description: String,
    id: String,
    name: String,
    recipients: js.Array[Recipient],
    total_accepted_recipients: Double
  ): RecipientListWithRecipients = {
    val __obj = js.Dynamic.literal(attributes = attributes, description = description, id = id, name = name, recipients = recipients, total_accepted_recipients = total_accepted_recipients)
  
    __obj.asInstanceOf[RecipientListWithRecipients]
  }
}

