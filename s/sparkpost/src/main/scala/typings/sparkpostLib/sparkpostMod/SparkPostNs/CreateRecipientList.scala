package typings
package sparkpostLib.sparkpostMod.SparkPostNs

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

