package typings.stdMocks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrint extends js.Object {
  var print: js.UndefOr[Boolean] = js.undefined
}

object AnonPrint {
  @scala.inline
  def apply(print: js.UndefOr[Boolean] = js.undefined): AnonPrint = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(print)) __obj.updateDynamic("print")(print.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrint]
  }
}

