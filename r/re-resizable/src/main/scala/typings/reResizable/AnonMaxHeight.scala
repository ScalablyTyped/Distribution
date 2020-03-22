package typings.reResizable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxHeight extends js.Object {
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
}

object AnonMaxHeight {
  @scala.inline
  def apply(maxHeight: Int | Double = null, maxWidth: Int | Double = null): AnonMaxHeight = {
    val __obj = js.Dynamic.literal()
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxHeight]
  }
}

