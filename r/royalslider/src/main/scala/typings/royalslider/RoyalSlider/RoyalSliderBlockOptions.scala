package typings.royalslider.RoyalSlider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoyalSliderBlockOptions extends js.Object {
  /**
    * Delay between each block show up, in ms. (default: 200)
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * Easing function of block animation.Read more in easing section of docs. (default: 'easeOutSine' )
    */
  var easing: js.UndefOr[String] = js.undefined
  /**
    * true or false  (default: true)
    */
  var fadeEffect: js.UndefOr[Boolean] = js.undefined
  /**
    * Move effect direction.Can be 'left', 'right', 'top', 'bottom' or 'none'. (default: 'top')
    */
  var moveEffect: js.UndefOr[String] = js.undefined
  /**
    * Distance for move effect in pixels. (default: 20)
    */
  var moveOffset: js.UndefOr[Double] = js.undefined
  /**
    * Transition speed of block, in ms. (default: 400)
    */
  var speed: js.UndefOr[Double] = js.undefined
}

object RoyalSliderBlockOptions {
  @scala.inline
  def apply(
    delay: Int | Double = null,
    easing: String = null,
    fadeEffect: js.UndefOr[Boolean] = js.undefined,
    moveEffect: String = null,
    moveOffset: Int | Double = null,
    speed: Int | Double = null
  ): RoyalSliderBlockOptions = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeEffect)) __obj.updateDynamic("fadeEffect")(fadeEffect.asInstanceOf[js.Any])
    if (moveEffect != null) __obj.updateDynamic("moveEffect")(moveEffect.asInstanceOf[js.Any])
    if (moveOffset != null) __obj.updateDynamic("moveOffset")(moveOffset.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoyalSliderBlockOptions]
  }
}

