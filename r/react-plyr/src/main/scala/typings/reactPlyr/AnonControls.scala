package typings.reactPlyr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonControls extends js.Object {
  var controls: js.UndefOr[Boolean] = js.undefined
  var seek: js.UndefOr[Boolean] = js.undefined
}

object AnonControls {
  @scala.inline
  def apply(controls: js.UndefOr[Boolean] = js.undefined, seek: js.UndefOr[Boolean] = js.undefined): AnonControls = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (!js.isUndefined(seek)) __obj.updateDynamic("seek")(seek.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonControls]
  }
}

