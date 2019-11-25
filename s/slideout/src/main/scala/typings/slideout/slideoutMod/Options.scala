package typings.slideout.slideoutMod

import typings.slideout.slideoutStrings.left
import typings.slideout.slideoutStrings.right
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to customize a new instance of Slideout.
  */
trait Options extends js.Object {
  /**
    * The time (milliseconds) to open/close the slideout.
    * Default: 300.
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * The CSS effect to use when animating the opening and closing of the slideout.
    * Default: ease.
    */
  var fx: js.UndefOr[String] = js.undefined
  /**
    * The DOM element that contains your menu application (.slideout-menu).
    */
  var menu: HTMLElement
  /**
    *   Default: 256.
    */
  var padding: js.UndefOr[Double] = js.undefined
  /**
    * The DOM element that contains all your application content (.slideout-panel).
    */
  var panel: HTMLElement
  /**
    * The side to open the slideout.
    * Default: left.
    */
  var side: js.UndefOr[left | right] = js.undefined
  /**
    * The number of px needed for the menu can be opened completely, otherwise it closes.
    * Default: 70.
    */
  var tolerance: js.UndefOr[Double] = js.undefined
  /**
    * Set this option to false to disable Slideout touch events.
    * Default: true.
    */
  var touch: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    menu: HTMLElement,
    panel: HTMLElement,
    duration: Int | Double = null,
    fx: String = null,
    padding: Int | Double = null,
    side: left | right = null,
    tolerance: Int | Double = null,
    touch: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (fx != null) __obj.updateDynamic("fx")(fx.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    if (!js.isUndefined(touch)) __obj.updateDynamic("touch")(touch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

