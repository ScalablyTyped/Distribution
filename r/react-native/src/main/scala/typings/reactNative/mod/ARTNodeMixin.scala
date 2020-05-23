package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ARTNodeMixin extends js.Object {
  var opacity: js.UndefOr[Double] = js.undefined
  var originX: js.UndefOr[Double] = js.undefined
  var originY: js.UndefOr[Double] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var scaleX: js.UndefOr[Double] = js.undefined
  var scaleY: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object ARTNodeMixin {
  @scala.inline
  def apply(
    opacity: js.UndefOr[Double] = js.undefined,
    originX: js.UndefOr[Double] = js.undefined,
    originY: js.UndefOr[Double] = js.undefined,
    scale: js.UndefOr[Double] = js.undefined,
    scaleX: js.UndefOr[Double] = js.undefined,
    scaleY: js.UndefOr[Double] = js.undefined,
    title: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): ARTNodeMixin = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(originX)) __obj.updateDynamic("originX")(originX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(originY)) __obj.updateDynamic("originY")(originY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleX)) __obj.updateDynamic("scaleX")(scaleX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleY)) __obj.updateDynamic("scaleY")(scaleY.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARTNodeMixin]
  }
}

