package typings
package reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BottomNavigationProps extends js.Object {
  var active: js.UndefOr[java.lang.String] = js.undefined
  var children: reactLib.reactMod.Global.JSXNs.Element | js.Array[reactLib.reactMod.Global.JSXNs.Element]
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactDashNativeDashMaterialDashUiLib.Anon_ContainerViewStyle] = js.undefined
}

object BottomNavigationProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.Global.JSXNs.Element | js.Array[reactLib.reactMod.Global.JSXNs.Element],
    active: java.lang.String = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactDashNativeDashMaterialDashUiLib.Anon_ContainerViewStyle = null
  ): BottomNavigationProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (active != null) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[BottomNavigationProps]
  }
}

