package typings
package sparkpostLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Numrcpterrors extends js.Object {
  var num_rcpt_errors: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Numrcpterrors {
  @scala.inline
  def apply(num_rcpt_errors: scala.Int | scala.Double = null): Anon_Numrcpterrors = {
    val __obj = js.Dynamic.literal()
    if (num_rcpt_errors != null) __obj.updateDynamic("num_rcpt_errors")(num_rcpt_errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Numrcpterrors]
  }
}

