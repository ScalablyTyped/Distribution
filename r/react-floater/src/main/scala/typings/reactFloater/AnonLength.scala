package typings.reactFloater

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLength extends js.Object {
  var length: js.UndefOr[Double] = js.undefined
  var spread: js.UndefOr[Double] = js.undefined
}

object AnonLength {
  @scala.inline
  def apply(length: Int | Double = null, spread: Int | Double = null): AnonLength = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (spread != null) __obj.updateDynamic("spread")(spread.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLength]
  }
}

