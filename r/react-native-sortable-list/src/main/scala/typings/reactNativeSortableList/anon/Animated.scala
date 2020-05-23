package typings.reactNativeSortableList.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animated extends js.Object {
  var animated: js.UndefOr[Boolean] = js.undefined
  var dx: js.UndefOr[Double] = js.undefined
  var dy: js.UndefOr[Double] = js.undefined
}

object Animated {
  @scala.inline
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    dx: js.UndefOr[Double] = js.undefined,
    dy: js.UndefOr[Double] = js.undefined
  ): Animated = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dx)) __obj.updateDynamic("dx")(dx.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dy)) __obj.updateDynamic("dy")(dy.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animated]
  }
}

