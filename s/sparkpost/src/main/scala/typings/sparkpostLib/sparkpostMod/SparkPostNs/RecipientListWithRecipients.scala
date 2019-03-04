package typings
package sparkpostLib.sparkpostMod.SparkPostNs

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
    description: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    recipients: js.Array[Recipient],
    total_accepted_recipients: scala.Double
  ): RecipientListWithRecipients = {
    val __obj = js.Dynamic.literal(attributes = attributes, description = description, id = id, name = name, recipients = recipients, total_accepted_recipients = total_accepted_recipients)
  
    __obj.asInstanceOf[RecipientListWithRecipients]
  }
}

