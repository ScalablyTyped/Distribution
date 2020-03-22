package typings.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItem[ItemT] extends js.Object {
  var animated: js.UndefOr[Boolean | Null] = js.undefined
  var item: ItemT
  var viewPosition: js.UndefOr[Double] = js.undefined
}

object AnonItem {
  @scala.inline
  def apply[ItemT](item: ItemT, animated: js.UndefOr[Boolean] = js.undefined, viewPosition: Int | Double = null): AnonItem[ItemT] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (viewPosition != null) __obj.updateDynamic("viewPosition")(viewPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItem[ItemT]]
  }
}

