package typings
package reactDashSketchappLib.libComponentsSvgRadialGradientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialGradientProps extends js.Object {
  var children: js.UndefOr[js.Array[reactLib.reactMod.ReactNode] | reactLib.reactMod.ReactNode] = js.undefined
  var cx: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp
  var cy: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp
  var fx: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp
  var fy: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp
  var gradientUnits: js.UndefOr[
    reactDashSketchappLib.reactDashSketchappLibStrings.objectBoundingBox | reactDashSketchappLib.reactDashSketchappLibStrings.userSpaceOnUse
  ] = js.undefined
  var id: java.lang.String
  var r: js.UndefOr[reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp] = js.undefined
  var rx: js.UndefOr[reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp] = js.undefined
  var ry: js.UndefOr[reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp] = js.undefined
}

object RadialGradientProps {
  @scala.inline
  def apply(
    cx: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp,
    cy: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp,
    fx: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp,
    fy: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp,
    id: java.lang.String,
    children: js.Array[reactLib.reactMod.ReactNode] | reactLib.reactMod.ReactNode = null,
    gradientUnits: reactDashSketchappLib.reactDashSketchappLibStrings.objectBoundingBox | reactDashSketchappLib.reactDashSketchappLibStrings.userSpaceOnUse = null,
    r: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null,
    rx: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null,
    ry: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null
  ): RadialGradientProps = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], fx = fx.asInstanceOf[js.Any], fy = fy.asInstanceOf[js.Any], id = id)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (gradientUnits != null) __obj.updateDynamic("gradientUnits")(gradientUnits.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (rx != null) __obj.updateDynamic("rx")(rx.asInstanceOf[js.Any])
    if (ry != null) __obj.updateDynamic("ry")(ry.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialGradientProps]
  }
}

