package typings
package reactDashSketchappLib.libComponentsSvgPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrokeProps extends js.Object {
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  var strokeDasharray: js.UndefOr[NumberArrayProp] = js.undefined
  var strokeDashoffset: js.UndefOr[NumberProp] = js.undefined
  var strokeLinecap: js.UndefOr[
    reactDashSketchappLib.reactDashSketchappLibStrings.butt | reactDashSketchappLib.reactDashSketchappLibStrings.square | reactDashSketchappLib.reactDashSketchappLibStrings.round
  ] = js.undefined
  var strokeLinejoin: js.UndefOr[
    reactDashSketchappLib.reactDashSketchappLibStrings.miter | reactDashSketchappLib.reactDashSketchappLibStrings.bevel | reactDashSketchappLib.reactDashSketchappLibStrings.round
  ] = js.undefined
  var strokeMiterlimit: js.UndefOr[NumberProp] = js.undefined
  var strokeOpacity: js.UndefOr[NumberProp] = js.undefined
  var strokeWidth: js.UndefOr[NumberProp] = js.undefined
}

object StrokeProps {
  @scala.inline
  def apply(
    stroke: java.lang.String = null,
    strokeDasharray: NumberArrayProp = null,
    strokeDashoffset: NumberProp = null,
    strokeLinecap: reactDashSketchappLib.reactDashSketchappLibStrings.butt | reactDashSketchappLib.reactDashSketchappLibStrings.square | reactDashSketchappLib.reactDashSketchappLibStrings.round = null,
    strokeLinejoin: reactDashSketchappLib.reactDashSketchappLibStrings.miter | reactDashSketchappLib.reactDashSketchappLibStrings.bevel | reactDashSketchappLib.reactDashSketchappLibStrings.round = null,
    strokeMiterlimit: NumberProp = null,
    strokeOpacity: NumberProp = null,
    strokeWidth: NumberProp = null
  ): StrokeProps = {
    val __obj = js.Dynamic.literal()
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (strokeDasharray != null) __obj.updateDynamic("strokeDasharray")(strokeDasharray.asInstanceOf[js.Any])
    if (strokeDashoffset != null) __obj.updateDynamic("strokeDashoffset")(strokeDashoffset.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeLinejoin != null) __obj.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
    if (strokeMiterlimit != null) __obj.updateDynamic("strokeMiterlimit")(strokeMiterlimit.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrokeProps]
  }
}

