package typings.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewPosition extends js.Object {
  var animated: js.UndefOr[Boolean] = js.undefined
  var index: Double
  var viewOffset: js.UndefOr[Double] = js.undefined
  var viewPosition: js.UndefOr[Double] = js.undefined
}

object ViewPosition {
  @scala.inline
  def apply(
    index: Double,
    animated: js.UndefOr[Boolean] = js.undefined,
    viewOffset: js.UndefOr[Double] = js.undefined,
    viewPosition: js.UndefOr[Double] = js.undefined
  ): ViewPosition = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(viewOffset)) __obj.updateDynamic("viewOffset")(viewOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(viewPosition)) __obj.updateDynamic("viewPosition")(viewPosition.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewPosition]
  }
}

