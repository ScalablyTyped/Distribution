package typings.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNumrcpterrors extends js.Object {
  var num_rcpt_errors: js.UndefOr[Double] = js.undefined
}

object AnonNumrcpterrors {
  @scala.inline
  def apply(num_rcpt_errors: Int | Double = null): AnonNumrcpterrors = {
    val __obj = js.Dynamic.literal()
    if (num_rcpt_errors != null) __obj.updateDynamic("num_rcpt_errors")(num_rcpt_errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNumrcpterrors]
  }
}

