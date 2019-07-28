package typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod

import typings.react.reactMod.Global.JSXNs.Element
import typings.reactDashNativeDashMaterialDashUi.Anon_ContainerViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerProps extends js.Object {
  var children: Element
  var style: js.UndefOr[Anon_ContainerViewStyle] = js.undefined
}

object DrawerProps {
  @scala.inline
  def apply(children: Element, style: Anon_ContainerViewStyle = null): DrawerProps = {
    val __obj = js.Dynamic.literal(children = children)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[DrawerProps]
  }
}

