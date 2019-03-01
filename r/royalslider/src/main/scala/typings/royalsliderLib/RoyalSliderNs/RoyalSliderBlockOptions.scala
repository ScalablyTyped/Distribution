package typings
package royalsliderLib.RoyalSliderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoyalSliderBlockOptions extends js.Object {
  /**
    * Delay between each block show up, in ms. (default: 200)
    */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
    * Easing function of block animation.Read more in easing section of docs. (default: 'easeOutSine' )
    */
  var easing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * true or false  (default: true)
    */
  var fadeEffect: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Move effect direction.Can be 'left', 'right', 'top', 'bottom' or 'none'. (default: 'top')
    */
  var moveEffect: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Distance for move effect in pixels. (default: 20)
    */
  var moveOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * Transition speed of block, in ms. (default: 400)
    */
  var speed: js.UndefOr[scala.Double] = js.undefined
}

object RoyalSliderBlockOptions {
  @scala.inline
  def apply(
    delay: scala.Int | scala.Double = null,
    easing: java.lang.String = null,
    fadeEffect: js.UndefOr[scala.Boolean] = js.undefined,
    moveEffect: java.lang.String = null,
    moveOffset: scala.Int | scala.Double = null,
    speed: scala.Int | scala.Double = null
  ): RoyalSliderBlockOptions = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (!js.isUndefined(fadeEffect)) __obj.updateDynamic("fadeEffect")(fadeEffect)
    if (moveEffect != null) __obj.updateDynamic("moveEffect")(moveEffect)
    if (moveOffset != null) __obj.updateDynamic("moveOffset")(moveOffset.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoyalSliderBlockOptions]
  }
}

