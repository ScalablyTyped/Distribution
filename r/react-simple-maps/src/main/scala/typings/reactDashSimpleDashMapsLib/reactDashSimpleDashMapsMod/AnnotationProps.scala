package typings
package reactDashSimpleDashMapsLib.reactDashSimpleDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationProps extends js.Object {
  var curve: js.UndefOr[scala.Double] = js.undefined
  var dx: js.UndefOr[scala.Double] = js.undefined
  var dy: js.UndefOr[scala.Double] = js.undefined
  var markerEnd: js.UndefOr[java.lang.String] = js.undefined
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  var strokeWidth: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var subject: js.UndefOr[Point] = js.undefined
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

object AnnotationProps {
  @scala.inline
  def apply(
    curve: scala.Int | scala.Double = null,
    dx: scala.Int | scala.Double = null,
    dy: scala.Int | scala.Double = null,
    markerEnd: java.lang.String = null,
    stroke: java.lang.String = null,
    strokeWidth: scala.Int | scala.Double = null,
    style: reactLib.reactMod.CSSProperties = null,
    subject: Point = null,
    zoom: scala.Int | scala.Double = null
  ): AnnotationProps = {
    val __obj = js.Dynamic.literal()
    if (curve != null) __obj.updateDynamic("curve")(curve.asInstanceOf[js.Any])
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    if (markerEnd != null) __obj.updateDynamic("markerEnd")(markerEnd)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationProps]
  }
}

