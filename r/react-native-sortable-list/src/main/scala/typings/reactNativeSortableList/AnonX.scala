package typings.reactNativeSortableList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonX extends js.Object {
  var animated: js.UndefOr[Boolean] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object AnonX {
  @scala.inline
  def apply(animated: js.UndefOr[Boolean] = js.undefined, x: Int | Double = null, y: Int | Double = null): AnonX = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonX]
  }
}

