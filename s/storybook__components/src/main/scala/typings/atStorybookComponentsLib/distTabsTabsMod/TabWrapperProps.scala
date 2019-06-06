package typings
package atStorybookComponentsLib.distTabsTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabWrapperProps extends js.Object {
  var active: scala.Boolean
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var render: js.UndefOr[js.Function0[reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
}

object TabWrapperProps {
  @scala.inline
  def apply(
    active: scala.Boolean,
    children: reactLib.reactMod.ReactNode = null,
    render: () => reactLib.reactMod.Global.JSXNs.Element = null
  ): TabWrapperProps = {
    val __obj = js.Dynamic.literal(active = active)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction0(render))
    __obj.asInstanceOf[TabWrapperProps]
  }
}

