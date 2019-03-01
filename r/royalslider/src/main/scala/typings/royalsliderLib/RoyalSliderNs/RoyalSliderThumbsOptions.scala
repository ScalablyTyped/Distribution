package typings
package royalsliderLib.RoyalSliderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoyalSliderThumbsOptions extends js.Object {
  /**
    * Adds span element with class thumbIco to every thumbnail. Useful for styling (default: false)
    */
  var appendSpan: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Replaces default thumbnail arrow. You have to add it to DOM manually. (default: null)
    */
  var arrowLeft: js.UndefOr[royalsliderLib.JQuery] = js.undefined
  /**
    * Replaces default thumbnail arrow. You have to add it to DOM manually. (default: null)
    */
  var arrowRight: js.UndefOr[royalsliderLib.JQuery] = js.undefined
  /**
    * Thumbnails arrows. (default: true)
    */
  var arrows: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Auto hide thumbnails arrows on hover. (default: false)
    */
  var arrowsAutoHide: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Automatically centers container with thumbs if there are small number of items (default: true)
    */
  var autoCenter: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Thumbnails mouse drag. (default: true)
    */
  var drag: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Margin that equals thumbs spacing for first and last item. (default: true)
    */
  var firstMargin: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Reduces size of main viewport area by thumbnails width or height, use it when you set 100 % width to slider.This option is always true, when slider is in fullscreen mode. (default: true)
    */
  var fitInViewport: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 'horizontal' or 'vertical'. (default: 'horizontal')
    */
  var orientation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Spacing between thumbs. (default: 4)
    */
  var spacing: js.UndefOr[scala.Double] = js.undefined
  /**
    * Thumbnails touch. (default: true)
    */
  var touch: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Thumbnails transition speed. (default: 600)
    */
  var transitionSpeed: js.UndefOr[scala.Double] = js.undefined
}

object RoyalSliderThumbsOptions {
  @scala.inline
  def apply(
    appendSpan: js.UndefOr[scala.Boolean] = js.undefined,
    arrowLeft: royalsliderLib.JQuery = null,
    arrowRight: royalsliderLib.JQuery = null,
    arrows: js.UndefOr[scala.Boolean] = js.undefined,
    arrowsAutoHide: js.UndefOr[scala.Boolean] = js.undefined,
    autoCenter: js.UndefOr[scala.Boolean] = js.undefined,
    drag: js.UndefOr[scala.Boolean] = js.undefined,
    firstMargin: js.UndefOr[scala.Boolean] = js.undefined,
    fitInViewport: js.UndefOr[scala.Boolean] = js.undefined,
    orientation: java.lang.String = null,
    spacing: scala.Int | scala.Double = null,
    touch: js.UndefOr[scala.Boolean] = js.undefined,
    transitionSpeed: scala.Int | scala.Double = null
  ): RoyalSliderThumbsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appendSpan)) __obj.updateDynamic("appendSpan")(appendSpan)
    if (arrowLeft != null) __obj.updateDynamic("arrowLeft")(arrowLeft)
    if (arrowRight != null) __obj.updateDynamic("arrowRight")(arrowRight)
    if (!js.isUndefined(arrows)) __obj.updateDynamic("arrows")(arrows)
    if (!js.isUndefined(arrowsAutoHide)) __obj.updateDynamic("arrowsAutoHide")(arrowsAutoHide)
    if (!js.isUndefined(autoCenter)) __obj.updateDynamic("autoCenter")(autoCenter)
    if (!js.isUndefined(drag)) __obj.updateDynamic("drag")(drag)
    if (!js.isUndefined(firstMargin)) __obj.updateDynamic("firstMargin")(firstMargin)
    if (!js.isUndefined(fitInViewport)) __obj.updateDynamic("fitInViewport")(fitInViewport)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (!js.isUndefined(touch)) __obj.updateDynamic("touch")(touch)
    if (transitionSpeed != null) __obj.updateDynamic("transitionSpeed")(transitionSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoyalSliderThumbsOptions]
  }
}

