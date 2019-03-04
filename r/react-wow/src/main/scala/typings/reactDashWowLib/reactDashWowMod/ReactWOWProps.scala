package typings
package reactDashWowLib.reactDashWowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactWOWProps extends js.Object {
  /**
    * Animation css class.
    * @default animated
    */
  var animateClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Animation name.
    * @see https://daneden.github.io/animate.css/
    */
  var animation: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 76 */ js.Any
  /**
    * The callback is fired every time an animation is stoped.
    */
  var callback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Content you want to apply the animation to.
    */
  var children: reactLib.reactMod.Global.JSXNs.Element
  /**
    * Animation delay.
    */
  var delay: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Disable the animation.
    * @default false
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Animation duration.
    */
  var duration: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Animation iteration count.
    */
  var iteration: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Distance to the element when triggering the animation.
    * @default 0
    */
  var offset: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  /**
    * If your components inside a overflow container, set this to true.
    * @default false
    */
  var overflow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Listen and react to resize event.
    * @default true
    */
  var resize: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Listen and react to scroll event.
    * @default true
    */
  var scroll: js.UndefOr[scala.Boolean] = js.undefined
}

object ReactWOWProps {
  @scala.inline
  def apply(
    animation: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 76 */ js.Any,
    children: reactLib.reactMod.Global.JSXNs.Element,
    animateClass: java.lang.String = null,
    callback: js.Function0[scala.Unit] = null,
    delay: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    duration: java.lang.String = null,
    iteration: java.lang.String = null,
    offset: scala.Double | js.Array[scala.Double] = null,
    overflow: js.UndefOr[scala.Boolean] = js.undefined,
    resize: js.UndefOr[scala.Boolean] = js.undefined,
    scroll: js.UndefOr[scala.Boolean] = js.undefined
  ): ReactWOWProps = {
    val __obj = js.Dynamic.literal(animation = animation, children = children)
    if (animateClass != null) __obj.updateDynamic("animateClass")(animateClass)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (delay != null) __obj.updateDynamic("delay")(delay)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (duration != null) __obj.updateDynamic("duration")(duration)
    if (iteration != null) __obj.updateDynamic("iteration")(iteration)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(overflow)) __obj.updateDynamic("overflow")(overflow)
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize)
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll)
    __obj.asInstanceOf[ReactWOWProps]
  }
}

