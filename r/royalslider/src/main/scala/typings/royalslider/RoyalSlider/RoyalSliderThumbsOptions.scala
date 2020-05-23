package typings.royalslider.RoyalSlider

import typings.royalslider.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoyalSliderThumbsOptions extends js.Object {
  /**
    * Adds span element with class thumbIco to every thumbnail. Useful for styling (default: false)
    */
  var appendSpan: js.UndefOr[Boolean] = js.undefined
  /**
    * Replaces default thumbnail arrow. You have to add it to DOM manually. (default: null)
    */
  var arrowLeft: js.UndefOr[JQuery] = js.undefined
  /**
    * Replaces default thumbnail arrow. You have to add it to DOM manually. (default: null)
    */
  var arrowRight: js.UndefOr[JQuery] = js.undefined
  /**
    * Thumbnails arrows. (default: true)
    */
  var arrows: js.UndefOr[Boolean] = js.undefined
  /**
    * Auto hide thumbnails arrows on hover. (default: false)
    */
  var arrowsAutoHide: js.UndefOr[Boolean] = js.undefined
  /**
    * Automatically centers container with thumbs if there are small number of items (default: true)
    */
  var autoCenter: js.UndefOr[Boolean] = js.undefined
  /**
    * Thumbnails mouse drag. (default: true)
    */
  var drag: js.UndefOr[Boolean] = js.undefined
  /**
    * Margin that equals thumbs spacing for first and last item. (default: true)
    */
  var firstMargin: js.UndefOr[Boolean] = js.undefined
  /**
    * Reduces size of main viewport area by thumbnails width or height, use it when you set 100 % width to slider.This option is always true, when slider is in fullscreen mode. (default: true)
    */
  var fitInViewport: js.UndefOr[Boolean] = js.undefined
  /**
    * 'horizontal' or 'vertical'. (default: 'horizontal')
    */
  var orientation: js.UndefOr[String] = js.undefined
  /**
    * Spacing between thumbs. (default: 4)
    */
  var spacing: js.UndefOr[Double] = js.undefined
  /**
    * Thumbnails touch. (default: true)
    */
  var touch: js.UndefOr[Boolean] = js.undefined
  /**
    * Thumbnails transition speed. (default: 600)
    */
  var transitionSpeed: js.UndefOr[Double] = js.undefined
}

object RoyalSliderThumbsOptions {
  @scala.inline
  def apply(
    appendSpan: js.UndefOr[Boolean] = js.undefined,
    arrowLeft: JQuery = null,
    arrowRight: JQuery = null,
    arrows: js.UndefOr[Boolean] = js.undefined,
    arrowsAutoHide: js.UndefOr[Boolean] = js.undefined,
    autoCenter: js.UndefOr[Boolean] = js.undefined,
    drag: js.UndefOr[Boolean] = js.undefined,
    firstMargin: js.UndefOr[Boolean] = js.undefined,
    fitInViewport: js.UndefOr[Boolean] = js.undefined,
    orientation: String = null,
    spacing: js.UndefOr[Double] = js.undefined,
    touch: js.UndefOr[Boolean] = js.undefined,
    transitionSpeed: js.UndefOr[Double] = js.undefined
  ): RoyalSliderThumbsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appendSpan)) __obj.updateDynamic("appendSpan")(appendSpan.get.asInstanceOf[js.Any])
    if (arrowLeft != null) __obj.updateDynamic("arrowLeft")(arrowLeft.asInstanceOf[js.Any])
    if (arrowRight != null) __obj.updateDynamic("arrowRight")(arrowRight.asInstanceOf[js.Any])
    if (!js.isUndefined(arrows)) __obj.updateDynamic("arrows")(arrows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(arrowsAutoHide)) __obj.updateDynamic("arrowsAutoHide")(arrowsAutoHide.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCenter)) __obj.updateDynamic("autoCenter")(autoCenter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drag)) __obj.updateDynamic("drag")(drag.get.asInstanceOf[js.Any])
    if (!js.isUndefined(firstMargin)) __obj.updateDynamic("firstMargin")(firstMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fitInViewport)) __obj.updateDynamic("fitInViewport")(fitInViewport.get.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(spacing)) __obj.updateDynamic("spacing")(spacing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(touch)) __obj.updateDynamic("touch")(touch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionSpeed)) __obj.updateDynamic("transitionSpeed")(transitionSpeed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoyalSliderThumbsOptions]
  }
}

