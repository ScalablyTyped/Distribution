package typings.reactSketchapp.radialGradientMod

import typings.react.mod.ReactNode
import typings.reactSketchapp.propsMod.NumberProp
import typings.reactSketchapp.reactSketchappStrings.objectBoundingBox
import typings.reactSketchapp.reactSketchappStrings.userSpaceOnUse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialGradientProps extends js.Object {
  var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
  var cx: NumberProp
  var cy: NumberProp
  var fx: NumberProp
  var fy: NumberProp
  var gradientUnits: js.UndefOr[objectBoundingBox | userSpaceOnUse] = js.undefined
  var id: String
  var r: js.UndefOr[NumberProp] = js.undefined
  var rx: js.UndefOr[NumberProp] = js.undefined
  var ry: js.UndefOr[NumberProp] = js.undefined
}

object RadialGradientProps {
  @scala.inline
  def apply(
    cx: NumberProp,
    cy: NumberProp,
    fx: NumberProp,
    fy: NumberProp,
    id: String,
    children: js.Array[ReactNode] | ReactNode = null,
    gradientUnits: objectBoundingBox | userSpaceOnUse = null,
    r: NumberProp = null,
    rx: NumberProp = null,
    ry: NumberProp = null
  ): RadialGradientProps = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], fx = fx.asInstanceOf[js.Any], fy = fy.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (gradientUnits != null) __obj.updateDynamic("gradientUnits")(gradientUnits.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (rx != null) __obj.updateDynamic("rx")(rx.asInstanceOf[js.Any])
    if (ry != null) __obj.updateDynamic("ry")(ry.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialGradientProps]
  }
}

