package typings
package reactDashSketchappLib.libComponentsSvgSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvgProps
  extends reactDashSketchappLib.reactDashSketchappMod.ViewProps {
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var opacity: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var preserveAspectRatio: js.UndefOr[java.lang.String] = js.undefined
  // more detail https://svgwg.org/svg2-draft/coords.html#ViewBoxAttribute
  var viewBox: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object SvgProps {
  @scala.inline
  def apply(
    children: js.Array[reactLib.reactMod.ReactNode] | reactLib.reactMod.ReactNode = null,
    height: java.lang.String | scala.Double = null,
    name: java.lang.String = null,
    opacity: java.lang.String | scala.Double = null,
    preserveAspectRatio: java.lang.String = null,
    resizingConstraint: reactDashSketchappLib.reactDashSketchappMod.ResizingConstraintPropTypes = null,
    shadows: js.Array[reactDashSketchappLib.reactDashSketchappMod.ShadowsPropTypes] = null,
    style: reactDashSketchappLib.reactDashSketchappMod.Style | reactDashSketchappLib.reactDashSketchappMod.StyleReference = null,
    viewBox: java.lang.String = null,
    width: java.lang.String | scala.Double = null
  ): SvgProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio)
    if (resizingConstraint != null) __obj.updateDynamic("resizingConstraint")(resizingConstraint)
    if (shadows != null) __obj.updateDynamic("shadows")(shadows)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgProps]
  }
}

