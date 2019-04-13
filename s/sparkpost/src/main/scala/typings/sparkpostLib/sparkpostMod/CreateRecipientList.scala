package typings
package sparkpostLib.sparkpostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRecipientList extends js.Object {
  /** Recipient list attribute object */
  var attributes: js.UndefOr[js.Any] = js.undefined
  /** Detailed description of the recipient list */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Short, unique, recipient list identifier */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Short, pretty/readable recipient list display name, not required to be unique */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** limit the number of recipient errors returned. */
  var num_rcpt_errors: js.UndefOr[scala.Double] = js.undefined
  /** Array of recipient objects */
  var recipients: js.Array[Recipient]
}

object CreateRecipientList {
  @scala.inline
  def apply(
    recipients: js.Array[Recipient],
    attributes: js.Any = null,
    description: java.lang.String = null,
    id: java.lang.String = null,
    name: java.lang.String = null,
    num_rcpt_errors: scala.Int | scala.Double = null
  ): CreateRecipientList = {
    val __obj = js.Dynamic.literal(recipients = recipients)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (num_rcpt_errors != null) __obj.updateDynamic("num_rcpt_errors")(num_rcpt_errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRecipientList]
  }
}

