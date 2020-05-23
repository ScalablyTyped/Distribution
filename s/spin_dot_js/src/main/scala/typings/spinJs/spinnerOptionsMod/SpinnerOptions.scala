package typings.spinJs.spinnerOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerOptions extends js.Object {
  /**
    * The animation name used for the spinner lines. Defaults to 'spinner-line-fade-default'.
    */
  var animation: js.UndefOr[String] = js.undefined
  /**
    * The CSS class to assign to the spinner
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * A CSS color string, or array of strings to set the line color
    */
  var color: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Corner roundness (0..1)
    */
  var corners: js.UndefOr[Double] = js.undefined
  /**
    * 1: clockwise, -1: counterclockwise
    */
  var direction: js.UndefOr[Double] = js.undefined
  /**
    * A CSS color string, or array of strings to set the color that lines will fade to.
    * Defaults to transparent.
    */
  var fadeColor: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Left position relative to parent (defaults to 50%)
    */
  var left: js.UndefOr[String] = js.undefined
  /**
    * The length of each line
    */
  var length: js.UndefOr[Double] = js.undefined
  /**
    * The number of lines to draw
    */
  var lines: js.UndefOr[Double] = js.undefined
  /**
    * Element positioning
    */
  var position: js.UndefOr[String] = js.undefined
  /**
    * The radius of the inner circle
    */
  var radius: js.UndefOr[Double] = js.undefined
  /**
    * The rotation offset
    */
  var rotate: js.UndefOr[Double] = js.undefined
  /**
    * Scales overall size of the spinner
    */
  var scale: js.UndefOr[Double] = js.undefined
  /**
    * Whether to render the default shadow (boolean).
    * A string can be used to set a custom box-shadow value.
    */
  var shadow: js.UndefOr[Boolean | String] = js.undefined
  /**
    * Rounds per second
    */
  var speed: js.UndefOr[Double] = js.undefined
  /**
    * Top position relative to parent (defaults to 50%)
    */
  var top: js.UndefOr[String] = js.undefined
  /**
    * The line thickness
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * The z-index (defaults to 2000000000)
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object SpinnerOptions {
  @scala.inline
  def apply(
    animation: String = null,
    className: String = null,
    color: String | js.Array[String] = null,
    corners: js.UndefOr[Double] = js.undefined,
    direction: js.UndefOr[Double] = js.undefined,
    fadeColor: String | js.Array[String] = null,
    left: String = null,
    length: js.UndefOr[Double] = js.undefined,
    lines: js.UndefOr[Double] = js.undefined,
    position: String = null,
    radius: js.UndefOr[Double] = js.undefined,
    rotate: js.UndefOr[Double] = js.undefined,
    scale: js.UndefOr[Double] = js.undefined,
    shadow: Boolean | String = null,
    speed: js.UndefOr[Double] = js.undefined,
    top: String = null,
    width: js.UndefOr[Double] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): SpinnerOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(corners)) __obj.updateDynamic("corners")(corners.get.asInstanceOf[js.Any])
    if (!js.isUndefined(direction)) __obj.updateDynamic("direction")(direction.get.asInstanceOf[js.Any])
    if (fadeColor != null) __obj.updateDynamic("fadeColor")(fadeColor.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lines)) __obj.updateDynamic("lines")(lines.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotate)) __obj.updateDynamic("rotate")(rotate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpinnerOptions]
  }
}

