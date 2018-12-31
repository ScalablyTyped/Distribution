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

