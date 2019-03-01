package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecipientList extends js.Object {
  /** Recipient list attribute object */
  var attributes: js.Any
  /** Detailed description of the recipient list */
  var description: java.lang.String
  /** Short, unique, recipient list identifier */
  var id: java.lang.String
  /** Short, pretty/readable recipient list display name, not required to be unique */
  var name: java.lang.String
  /** Number of accepted recipients */
  var total_accepted_recipients: scala.Double
}

object RecipientList {
  @scala.inline
  def apply(
    attributes: js.Any,
    description: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    total_accepted_recipients: scala.Double
  ): RecipientList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("total_accepted_recipients")(total_accepted_recipients)
    __obj.asInstanceOf[RecipientList]
  }
}

