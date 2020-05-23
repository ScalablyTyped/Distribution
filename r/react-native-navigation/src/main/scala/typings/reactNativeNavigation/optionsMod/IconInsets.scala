package typings.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconInsets extends js.Object {
  /**
    * Configure bottom inset
    */
  var bottom: js.UndefOr[Double] = js.undefined
  /**
    * Configure left inset
    */
  var left: js.UndefOr[Double] = js.undefined
  /**
    * Configure right inset
    */
  var right: js.UndefOr[Double] = js.undefined
  /**
    * Configure top inset
    */
  var top: js.UndefOr[Double] = js.undefined
}

object IconInsets {
  @scala.inline
  def apply(
    bottom: js.UndefOr[Double] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    right: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined
  ): IconInsets = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconInsets]
  }
}

