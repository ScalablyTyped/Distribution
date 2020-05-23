package typings.sparkpost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Numrcpterrors extends js.Object {
  var num_rcpt_errors: js.UndefOr[Double] = js.undefined
}

object Numrcpterrors {
  @scala.inline
  def apply(num_rcpt_errors: js.UndefOr[Double] = js.undefined): Numrcpterrors = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(num_rcpt_errors)) __obj.updateDynamic("num_rcpt_errors")(num_rcpt_errors.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Numrcpterrors]
  }
}

