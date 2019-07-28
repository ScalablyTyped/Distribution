package typings.sparkpost.sparkpostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRecipientList extends js.Object {
  /** Recipient list attribute object */
  var attributes: js.UndefOr[js.Any] = js.undefined
  /** Detailed description of the recipient list */
  var description: js.UndefOr[String] = js.undefined
  /** Short, unique, recipient list identifier */
  var id: js.UndefOr[String] = js.undefined
  /** Short, pretty/readable recipient list display name, not required to be unique */
  var name: js.UndefOr[String] = js.undefined
  /** Array of recipient objects */
  var recipients: js.Array[Recipient]
}

object UpdateRecipientList {
  @scala.inline
  def apply(
    recipients: js.Array[Recipient],
    attributes: js.Any = null,
    description: String = null,
    id: String = null,
    name: String = null
  ): UpdateRecipientList = {
    val __obj = js.Dynamic.literal(recipients = recipients)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[UpdateRecipientList]
  }
}

