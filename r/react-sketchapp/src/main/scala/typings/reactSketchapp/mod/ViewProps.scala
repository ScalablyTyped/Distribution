package typings.reactSketchapp.mod

import typings.react.mod.ReactNode
import typings.reactSketchapp.typesMod.ResizeConstraints
import typings.reactSketchapp.typesMod.SketchShadow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewProps extends js.Object {
  var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var resizingConstraint: js.UndefOr[ResizeConstraints] = js.undefined
  var shadows: js.UndefOr[js.Array[SketchShadow]] = js.undefined
  var style: js.UndefOr[Style | StyleReference] = js.undefined
}

object ViewProps {
  @scala.inline
  def apply(
    children: js.Array[ReactNode] | ReactNode = null,
    name: String = null,
    resizingConstraint: ResizeConstraints = null,
    shadows: js.Array[SketchShadow] = null,
    style: Style | StyleReference = null
  ): ViewProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resizingConstraint != null) __obj.updateDynamic("resizingConstraint")(resizingConstraint.asInstanceOf[js.Any])
    if (shadows != null) __obj.updateDynamic("shadows")(shadows.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewProps]
  }
}

