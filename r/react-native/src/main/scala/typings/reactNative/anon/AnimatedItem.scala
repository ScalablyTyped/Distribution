package typings.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimatedItem[ItemT] extends js.Object {
  var animated: js.UndefOr[Boolean] = js.undefined
  var item: ItemT
  var viewPosition: js.UndefOr[Double] = js.undefined
}

object AnimatedItem {
  @scala.inline
  def apply[ItemT](
    item: ItemT,
    animated: js.UndefOr[Boolean] = js.undefined,
    viewPosition: js.UndefOr[Double] = js.undefined
  ): AnimatedItem[ItemT] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(viewPosition)) __obj.updateDynamic("viewPosition")(viewPosition.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedItem[ItemT]]
  }
}

