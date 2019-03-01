package typings
package reactDashNativeDashSvgLib.reactDashNativeDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformProps extends TransformObject {
  var transform: js.UndefOr[
    reactDashNativeDashSvgLib.ColumnMajorTransformMatrix | java.lang.String | TransformObject
  ] = js.undefined
}

object TransformProps {
  @scala.inline
  def apply(
    origin: reactDashNativeDashSvgLib.NumberProp = null,
    originX: reactDashNativeDashSvgLib.NumberProp = null,
    originY: reactDashNativeDashSvgLib.NumberProp = null,
    rotate: reactDashNativeDashSvgLib.NumberProp = null,
    rotation: reactDashNativeDashSvgLib.NumberProp = null,
    scale: reactDashNativeDashSvgLib.NumberProp = null,
    scaleX: reactDashNativeDashSvgLib.NumberProp = null,
    scaleY: reactDashNativeDashSvgLib.NumberProp = null,
    skew: reactDashNativeDashSvgLib.NumberProp = null,
    skewX: reactDashNativeDashSvgLib.NumberProp = null,
    skewY: reactDashNativeDashSvgLib.NumberProp = null,
    transform: reactDashNativeDashSvgLib.ColumnMajorTransformMatrix | java.lang.String | TransformObject = null,
    translate: reactDashNativeDashSvgLib.NumberProp = null,
    translateX: reactDashNativeDashSvgLib.NumberProp = null,
    translateY: reactDashNativeDashSvgLib.NumberProp = null,
    x: reactDashNativeDashSvgLib.NumberProp = null,
    y: reactDashNativeDashSvgLib.NumberProp = null
  ): TransformProps = {
    val __obj = js.Dynamic.literal()
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (originX != null) __obj.updateDynamic("originX")(originX.asInstanceOf[js.Any])
    if (originY != null) __obj.updateDynamic("originY")(originY.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX.asInstanceOf[js.Any])
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY.asInstanceOf[js.Any])
    if (skew != null) __obj.updateDynamic("skew")(skew.asInstanceOf[js.Any])
    if (skewX != null) __obj.updateDynamic("skewX")(skewX.asInstanceOf[js.Any])
    if (skewY != null) __obj.updateDynamic("skewY")(skewY.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (translateX != null) __obj.updateDynamic("translateX")(translateX.asInstanceOf[js.Any])
    if (translateY != null) __obj.updateDynamic("translateY")(translateY.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformProps]
  }
}

