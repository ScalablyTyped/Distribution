package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLengthNumber extends js.Object {
  var length: js.UndefOr[Double] = js.undefined
}

object AnonLengthNumber {
  @scala.inline
  def apply(length: Int | Double = null): AnonLengthNumber = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLengthNumber]
  }
}

