package typings.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item[ItemT] extends js.Object {
  var animated: js.UndefOr[Boolean | Null] = js.undefined
  var item: ItemT
  var viewPosition: js.UndefOr[Double] = js.undefined
}

object Item {
  @scala.inline
  def apply[ItemT](
    item: ItemT,
    animated: js.UndefOr[Null | Boolean] = js.undefined,
    viewPosition: js.UndefOr[Double] = js.undefined
  ): Item[ItemT] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (!js.isUndefined(viewPosition)) __obj.updateDynamic("viewPosition")(viewPosition.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item[ItemT]]
  }
}

