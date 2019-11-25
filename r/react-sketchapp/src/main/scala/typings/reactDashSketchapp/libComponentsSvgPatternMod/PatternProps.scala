package typings.reactDashSketchapp.libComponentsSvgPatternMod

import typings.react.reactMod.ReactNode
import typings.reactDashSketchapp.libComponentsSvgPropsMod.NumberProp
import typings.reactDashSketchapp.reactDashSketchappStrings.objectBoundingBox
import typings.reactDashSketchapp.reactDashSketchappStrings.userSpaceOnUse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatternProps extends js.Object {
  var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
  var patternContentUnits: js.UndefOr[userSpaceOnUse | objectBoundingBox] = js.undefined
  var patternTransform: js.UndefOr[String] = js.undefined
  var patternUnits: js.UndefOr[userSpaceOnUse | objectBoundingBox] = js.undefined
  var x1: js.UndefOr[NumberProp] = js.undefined
  var x2: js.UndefOr[NumberProp] = js.undefined
  var y1: js.UndefOr[NumberProp] = js.undefined
  var y2: js.UndefOr[NumberProp] = js.undefined
}

object PatternProps {
  @scala.inline
  def apply(
    children: js.Array[ReactNode] | ReactNode = null,
    patternContentUnits: userSpaceOnUse | objectBoundingBox = null,
    patternTransform: String = null,
    patternUnits: userSpaceOnUse | objectBoundingBox = null,
    x1: NumberProp = null,
    x2: NumberProp = null,
    y1: NumberProp = null,
    y2: NumberProp = null
  ): PatternProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (patternContentUnits != null) __obj.updateDynamic("patternContentUnits")(patternContentUnits.asInstanceOf[js.Any])
    if (patternTransform != null) __obj.updateDynamic("patternTransform")(patternTransform.asInstanceOf[js.Any])
    if (patternUnits != null) __obj.updateDynamic("patternUnits")(patternUnits.asInstanceOf[js.Any])
    if (x1 != null) __obj.updateDynamic("x1")(x1.asInstanceOf[js.Any])
    if (x2 != null) __obj.updateDynamic("x2")(x2.asInstanceOf[js.Any])
    if (y1 != null) __obj.updateDynamic("y1")(y1.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternProps]
  }
}

