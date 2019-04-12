package typings
package reactDashSketchappLib.libComponentsSvgPatternMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatternProps extends js.Object {
  var children: js.UndefOr[
    js.Array[reactLib.reactMod.ReactNs.ReactChild] | reactLib.reactMod.ReactNs.ReactChild
  ] = js.undefined
  var patternContentUnits: js.UndefOr[
    reactDashSketchappLib.reactDashSketchappLibStrings.userSpaceOnUse | reactDashSketchappLib.reactDashSketchappLibStrings.objectBoundingBox
  ] = js.undefined
  var patternTransform: js.UndefOr[java.lang.String] = js.undefined
  var patternUnits: js.UndefOr[
    reactDashSketchappLib.reactDashSketchappLibStrings.userSpaceOnUse | reactDashSketchappLib.reactDashSketchappLibStrings.objectBoundingBox
  ] = js.undefined
  var x1: js.UndefOr[reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp] = js.undefined
  var x2: js.UndefOr[reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp] = js.undefined
  var y1: js.UndefOr[reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp] = js.undefined
  var y2: js.UndefOr[reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp] = js.undefined
}

object PatternProps {
  @scala.inline
  def apply(
    children: js.Array[reactLib.reactMod.ReactNs.ReactChild] | reactLib.reactMod.ReactNs.ReactChild = null,
    patternContentUnits: reactDashSketchappLib.reactDashSketchappLibStrings.userSpaceOnUse | reactDashSketchappLib.reactDashSketchappLibStrings.objectBoundingBox = null,
    patternTransform: java.lang.String = null,
    patternUnits: reactDashSketchappLib.reactDashSketchappLibStrings.userSpaceOnUse | reactDashSketchappLib.reactDashSketchappLibStrings.objectBoundingBox = null,
    x1: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null,
    x2: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null,
    y1: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null,
    y2: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null
  ): PatternProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (patternContentUnits != null) __obj.updateDynamic("patternContentUnits")(patternContentUnits.asInstanceOf[js.Any])
    if (patternTransform != null) __obj.updateDynamic("patternTransform")(patternTransform)
    if (patternUnits != null) __obj.updateDynamic("patternUnits")(patternUnits.asInstanceOf[js.Any])
    if (x1 != null) __obj.updateDynamic("x1")(x1.asInstanceOf[js.Any])
    if (x2 != null) __obj.updateDynamic("x2")(x2.asInstanceOf[js.Any])
    if (y1 != null) __obj.updateDynamic("y1")(y1.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternProps]
  }
}

