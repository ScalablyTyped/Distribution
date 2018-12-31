package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  /** Valid email address */
  var email: java.lang.String
  /** Email address to display in the “To” header instead of address.email (for CC and BCC) */
  var header_to: js.UndefOr[java.lang.String] = js.undefined
  /** User-friendly name for the email address */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

