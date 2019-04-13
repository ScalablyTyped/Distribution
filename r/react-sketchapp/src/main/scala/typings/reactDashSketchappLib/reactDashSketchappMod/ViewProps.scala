package typings
package reactDashSketchappLib.reactDashSketchappMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewProps extends js.Object {
  var children: js.UndefOr[js.Array[reactLib.reactMod.ReactNode] | reactLib.reactMod.ReactNode] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var resizingConstraint: js.UndefOr[ResizingConstraintPropTypes] = js.undefined
  var shadows: js.UndefOr[js.Array[ShadowsPropTypes]] = js.undefined
  var style: js.UndefOr[Style | StyleReference] = js.undefined
}

object ViewProps {
  @scala.inline
  def apply(
    children: js.Array[reactLib.reactMod.ReactNode] | reactLib.reactMod.ReactNode = null,
    name: java.lang.String = null,
    resizingConstraint: ResizingConstraintPropTypes = null,
    shadows: js.Array[ShadowsPropTypes] = null,
    style: Style | StyleReference = null
  ): ViewProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (resizingConstraint != null) __obj.updateDynamic("resizingConstraint")(resizingConstraint)
    if (shadows != null) __obj.updateDynamic("shadows")(shadows)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewProps]
  }
}

