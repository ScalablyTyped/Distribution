package typings
package reactDashLazyloadLib.reactDashLazyloadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LazyLoadProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var debounce: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var offset: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var once: js.UndefOr[scala.Boolean] = js.undefined
  var overflow: js.UndefOr[scala.Boolean] = js.undefined
  var placeholder: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var resize: js.UndefOr[scala.Boolean] = js.undefined
  var scroll: js.UndefOr[scala.Boolean] = js.undefined
  var throttle: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  var unmountIfInvisible: js.UndefOr[scala.Boolean] = js.undefined
}

object LazyLoadProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    debounce: scala.Double | scala.Boolean = null,
    height: scala.Double | java.lang.String = null,
    offset: scala.Double | js.Array[scala.Double] = null,
    once: js.UndefOr[scala.Boolean] = js.undefined,
    overflow: js.UndefOr[scala.Boolean] = js.undefined,
    placeholder: reactLib.reactMod.ReactNode = null,
    resize: js.UndefOr[scala.Boolean] = js.undefined,
    scroll: js.UndefOr[scala.Boolean] = js.undefined,
    throttle: scala.Double | scala.Boolean = null,
    unmountIfInvisible: js.UndefOr[scala.Boolean] = js.undefined
  ): LazyLoadProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once)
    if (!js.isUndefined(overflow)) __obj.updateDynamic("overflow")(overflow)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize)
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll)
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    if (!js.isUndefined(unmountIfInvisible)) __obj.updateDynamic("unmountIfInvisible")(unmountIfInvisible)
    __obj.asInstanceOf[LazyLoadProps]
  }
}

