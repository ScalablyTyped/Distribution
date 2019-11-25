package typings.sparkpost.sparkpostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecipientList extends js.Object {
  /** Recipient list attribute object */
  var attributes: js.Any
  /** Detailed description of the recipient list */
  var description: String
  /** Short, unique, recipient list identifier */
  var id: String
  /** Short, pretty/readable recipient list display name, not required to be unique */
  var name: String
  /** Number of accepted recipients */
  var total_accepted_recipients: Double
}

object RecipientList {
  @scala.inline
  def apply(
    attributes: js.Any,
    description: String,
    id: String,
    name: String,
    total_accepted_recipients: Double
  ): RecipientList = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], total_accepted_recipients = total_accepted_recipients.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RecipientList]
  }
}

