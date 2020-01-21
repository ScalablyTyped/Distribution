package typings.sourceMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBias extends js.Object {
  var bias: js.UndefOr[Double] = js.undefined
}

object AnonBias {
  @scala.inline
  def apply(bias: Int | Double = null): AnonBias = {
    val __obj = js.Dynamic.literal()
    if (bias != null) __obj.updateDynamic("bias")(bias.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBias]
  }
}

