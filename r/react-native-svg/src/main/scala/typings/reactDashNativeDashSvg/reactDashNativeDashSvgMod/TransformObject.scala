package typings.reactDashNativeDashSvg.reactDashNativeDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformObject extends js.Object {
  var origin: js.UndefOr[NumberArray] = js.undefined
  var originX: js.UndefOr[NumberProp] = js.undefined
  var originY: js.UndefOr[NumberProp] = js.undefined
  var rotation: js.UndefOr[NumberProp] = js.undefined
  var scale: js.UndefOr[NumberArray] = js.undefined
  var scaleX: js.UndefOr[NumberProp] = js.undefined
  var scaleY: js.UndefOr[NumberProp] = js.undefined
  var skew: js.UndefOr[NumberArray] = js.undefined
  var skewX: js.UndefOr[NumberProp] = js.undefined
  var skewY: js.UndefOr[NumberProp] = js.undefined
  var translate: js.UndefOr[NumberArray] = js.undefined
  var translateX: js.UndefOr[NumberProp] = js.undefined
  var translateY: js.UndefOr[NumberProp] = js.undefined
  var x: js.UndefOr[NumberArray] = js.undefined
  var y: js.UndefOr[NumberArray] = js.undefined
}

object TransformObject {
  @scala.inline
  def apply(
    origin: NumberArray = null,
    originX: NumberProp = null,
    originY: NumberProp = null,
    rotation: NumberProp = null,
    scale: NumberArray = null,
    scaleX: NumberProp = null,
    scaleY: NumberProp = null,
    skew: NumberArray = null,
    skewX: NumberProp = null,
    skewY: NumberProp = null,
    translate: NumberArray = null,
    translateX: NumberProp = null,
    translateY: NumberProp = null,
    x: NumberArray = null,
    y: NumberArray = null
  ): TransformObject = {
    val __obj = js.Dynamic.literal()
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (originX != null) __obj.updateDynamic("originX")(originX.asInstanceOf[js.Any])
    if (originY != null) __obj.updateDynamic("originY")(originY.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX.asInstanceOf[js.Any])
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY.asInstanceOf[js.Any])
    if (skew != null) __obj.updateDynamic("skew")(skew.asInstanceOf[js.Any])
    if (skewX != null) __obj.updateDynamic("skewX")(skewX.asInstanceOf[js.Any])
    if (skewY != null) __obj.updateDynamic("skewY")(skewY.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (translateX != null) __obj.updateDynamic("translateX")(translateX.asInstanceOf[js.Any])
    if (translateY != null) __obj.updateDynamic("translateY")(translateY.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformObject]
  }
}

