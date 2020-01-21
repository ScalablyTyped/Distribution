package typings.reactSketchapp.svgSvgMod

import typings.react.mod.ReactNode
import typings.reactSketchapp.mod.Style
import typings.reactSketchapp.mod.StyleReference
import typings.reactSketchapp.mod.ViewProps
import typings.reactSketchapp.typesMod.ResizeConstraints
import typings.reactSketchapp.typesMod.SketchShadow
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
    resizingConstraint: ResizeConstraints = null,
    shadows: js.Array[SketchShadow] = null,
    style: Style | StyleReference = null,
    viewBox: String = null,
    width: String | Double = null
  ): SvgProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio.asInstanceOf[js.Any])
    if (resizingConstraint != null) __obj.updateDynamic("resizingConstraint")(resizingConstraint.asInstanceOf[js.Any])
    if (shadows != null) __obj.updateDynamic("shadows")(shadows.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgProps]
  }
}

