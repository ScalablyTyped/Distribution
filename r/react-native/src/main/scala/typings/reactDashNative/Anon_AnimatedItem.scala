package typings.reactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimatedItem[ItemT] extends js.Object {
  var animated: js.UndefOr[Boolean] = js.undefined
  var item: ItemT
  var viewPosition: js.UndefOr[Double] = js.undefined
}

object Anon_AnimatedItem {
  @scala.inline
  def apply[ItemT](item: ItemT, animated: js.UndefOr[Boolean] = js.undefined, viewPosition: Int | Double = null): Anon_AnimatedItem[ItemT] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (viewPosition != null) __obj.updateDynamic("viewPosition")(viewPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AnimatedItem[ItemT]]
  }
}

