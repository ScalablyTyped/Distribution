package typings
package reactDashSketchappLib.libComponentsSvgLinearGradientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearGradientProps extends js.Object {
  var children: js.UndefOr[js.Array[reactLib.reactMod.ReactNode] | reactLib.reactMod.ReactNode] = js.undefined
  var gradientUnits: js.UndefOr[
    reactDashSketchappLib.reactDashSketchappLibStrings.objectBoundingBox | reactDashSketchappLib.reactDashSketchappLibStrings.userSpaceOnUse
  ] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var x1: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp
  var x2: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp
  var y1: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp
  var y2: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp
}

object LinearGradientProps {
  @scala.inline
  def apply(
    x1: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp,
    x2: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp,
    y1: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp,
    y2: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp,
    children: js.Array[reactLib.reactMod.ReactNode] | reactLib.reactMod.ReactNode = null,
    gradientUnits: reactDashSketchappLib.reactDashSketchappLibStrings.objectBoundingBox | reactDashSketchappLib.reactDashSketchappLibStrings.userSpaceOnUse = null,
    id: java.lang.String = null
  ): LinearGradientProps = {
    val __obj = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (gradientUnits != null) __obj.updateDynamic("gradientUnits")(gradientUnits.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[LinearGradientProps]
  }
}

