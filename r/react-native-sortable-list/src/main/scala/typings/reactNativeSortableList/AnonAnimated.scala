package typings.reactNativeSortableList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimated extends js.Object {
  var animated: js.UndefOr[Boolean] = js.undefined
  var dx: js.UndefOr[Double] = js.undefined
  var dy: js.UndefOr[Double] = js.undefined
}

object AnonAnimated {
  @scala.inline
  def apply(animated: js.UndefOr[Boolean] = js.undefined, dx: Int | Double = null, dy: Int | Double = null): AnonAnimated = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimated]
  }
}

