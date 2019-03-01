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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("recipients")(recipients)
    __obj.updateDynamic("total_accepted_recipients")(total_accepted_recipients)
    __obj.asInstanceOf[RecipientListWithRecipients]
  }
}

