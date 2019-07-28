package typings.reactDashSketchapp.libComponentsSvgSvgMod

import typings.react.reactMod.ReactNode
import typings.reactDashSketchapp.reactDashSketchappMod.ResizingConstraintPropTypes
import typings.reactDashSketchapp.reactDashSketchappMod.ShadowsPropTypes
import typings.reactDashSketchapp.reactDashSketchappMod.Style
import typings.reactDashSketchapp.reactDashSketchappMod.StyleReference
import typings.reactDashSketchapp.reactDashSketchappMod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvgProps extends ViewProps {
  var height: js.UndefOr[String | Double] = js.undefined
  var opacity: js.UndefOr[String | Double] = js.undefined
  var preserveAspectRatio: js.UndefOr[String] = js.undefined
  // more detail https://svgwg.org/svg2-draft/coords.html#ViewBoxAttribute
  var viewBox: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[String | Double] = js.undefined
}

object SvgProps {
  @scala.inline
  def apply(
    children: js.Array[ReactNode] | ReactNode = null,
    height: String | Double = null,
    name: String = null,
    opacity: String | Double = null,
    preserveAspectRatio: String = null,
    resizingConstraint: ResizingConstraintPropTypes = null,
    shadows: js.Array[ShadowsPropTypes] = null,
    style: Style | StyleReference = null,
    viewBox: String = null,
    width: String | Double = null
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

