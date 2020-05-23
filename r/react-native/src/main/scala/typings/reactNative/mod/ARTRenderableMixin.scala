package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.bevel
import typings.reactNative.reactNativeStrings.butt
import typings.reactNative.reactNativeStrings.miter
import typings.reactNative.reactNativeStrings.round
import typings.reactNative.reactNativeStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ARTRenderableMixin extends ARTNodeMixin {
  var fill: js.UndefOr[String] = js.undefined
  var stroke: js.UndefOr[String] = js.undefined
  var strokeCap: js.UndefOr[butt | square | round] = js.undefined
  var strokeDash: js.UndefOr[js.Array[Double]] = js.undefined
  var strokeJoin: js.UndefOr[bevel | miter | round] = js.undefined
  var strokeWidth: js.UndefOr[Double] = js.undefined
}

object ARTRenderableMixin {
  @scala.inline
  def apply(
    fill: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    originX: js.UndefOr[Double] = js.undefined,
    originY: js.UndefOr[Double] = js.undefined,
    scale: js.UndefOr[Double] = js.undefined,
    scaleX: js.UndefOr[Double] = js.undefined,
    scaleY: js.UndefOr[Double] = js.undefined,
    stroke: String = null,
    strokeCap: butt | square | round = null,
    strokeDash: js.Array[Double] = null,
    strokeJoin: bevel | miter | round = null,
    strokeWidth: js.UndefOr[Double] = js.undefined,
    title: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): ARTRenderableMixin = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(originX)) __obj.updateDynamic("originX")(originX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(originY)) __obj.updateDynamic("originY")(originY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleX)) __obj.updateDynamic("scaleX")(scaleX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleY)) __obj.updateDynamic("scaleY")(scaleY.get.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeCap != null) __obj.updateDynamic("strokeCap")(strokeCap.asInstanceOf[js.Any])
    if (strokeDash != null) __obj.updateDynamic("strokeDash")(strokeDash.asInstanceOf[js.Any])
    if (strokeJoin != null) __obj.updateDynamic("strokeJoin")(strokeJoin.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeWidth)) __obj.updateDynamic("strokeWidth")(strokeWidth.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARTRenderableMixin]
  }
}

