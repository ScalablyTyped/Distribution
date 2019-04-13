package typings
package reactDashBootstrapLib.libPanelGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelGroupProps
  extends reactLib.reactMod.HTMLProps[PanelGroup] {
  var accordion: js.UndefOr[scala.Boolean] = js.undefined
  var activeKey: js.UndefOr[js.Any] = js.undefined
  var defaultActiveKey: js.UndefOr[js.Any] = js.undefined
  var generateChildId: js.UndefOr[js.Function] = js.undefined
  @JSName("onSelect")
  var onSelect_PanelGroupProps: js.UndefOr[reactDashBootstrapLib.reactDashBootstrapMod.SelectCallback] = js.undefined
}

object PanelGroupProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[PanelGroup] = null,
    accordion: js.UndefOr[scala.Boolean] = js.undefined,
    activeKey: js.Any = null,
    defaultActiveKey: js.Any = null,
    generateChildId: js.Function = null,
    onSelect: reactDashBootstrapLib.reactDashBootstrapMod.SelectCallback = null,
    role: java.lang.String = null
  ): PanelGroupProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(accordion)) __obj.updateDynamic("accordion")(accordion)
    if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey)
    if (defaultActiveKey != null) __obj.updateDynamic("defaultActiveKey")(defaultActiveKey)
    if (generateChildId != null) __obj.updateDynamic("generateChildId")(generateChildId)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (role != null) __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[PanelGroupProps]
  }
}

