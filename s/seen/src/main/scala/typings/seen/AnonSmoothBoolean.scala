package typings.seen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSmoothBoolean extends js.Object {
  var smooth: js.UndefOr[Boolean] = js.undefined
}

object AnonSmoothBoolean {
  @scala.inline
  def apply(smooth: js.UndefOr[Boolean] = js.undefined): AnonSmoothBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(smooth)) __obj.updateDynamic("smooth")(smooth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSmoothBoolean]
  }
}

