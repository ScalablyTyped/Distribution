package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimatedItem[ItemT] extends js.Object {
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  var item: ItemT
  var viewPosition: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AnimatedItem {
  @scala.inline
  def apply[ItemT](
    item: ItemT,
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    viewPosition: scala.Int | scala.Double = null
  ): Anon_AnimatedItem[ItemT] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (viewPosition != null) __obj.updateDynamic("viewPosition")(viewPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AnimatedItem[ItemT]]
  }
}

