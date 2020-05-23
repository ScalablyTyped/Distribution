package typings.reactPlyr.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Controls extends js.Object {
  var controls: js.UndefOr[Boolean] = js.undefined
  var seek: js.UndefOr[Boolean] = js.undefined
}

object Controls {
  @scala.inline
  def apply(controls: js.UndefOr[Boolean] = js.undefined, seek: js.UndefOr[Boolean] = js.undefined): Controls = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(seek)) __obj.updateDynamic("seek")(seek.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Controls]
  }
}

