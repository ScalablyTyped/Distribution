package typings.qunitDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInverted extends js.Object {
  var inverted: js.UndefOr[Boolean] = js.undefined
}

object AnonInverted {
  @scala.inline
  def apply(inverted: js.UndefOr[Boolean] = js.undefined): AnonInverted = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInverted]
  }
}

