package typings.reactDashBootstrap.libPanelGroupMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.reactDashBootstrap.reactDashBootstrapMod.SelectCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelGroupProps
  extends AllHTMLAttributes[PanelGroup]
     with ClassAttributes[PanelGroup] {
  var accordion: js.UndefOr[Boolean] = js.undefined
  var activeKey: js.UndefOr[js.Any] = js.undefined
  var defaultActiveKey: js.UndefOr[js.Any] = js.undefined
  var generateChildId: js.UndefOr[js.Function] = js.undefined
  @JSName("onSelect")
  var onSelect_PanelGroupProps: js.UndefOr[SelectCallback] = js.undefined
}

object PanelGroupProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[PanelGroup] = null,
    ClassAttributes: ClassAttributes[PanelGroup] = null,
    accordion: js.UndefOr[Boolean] = js.undefined,
    activeKey: js.Any = null,
    defaultActiveKey: js.Any = null,
    generateChildId: js.Function = null,
    onSelect: SelectCallback = null
  ): PanelGroupProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(accordion)) __obj.updateDynamic("accordion")(accordion.asInstanceOf[js.Any])
    if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey.asInstanceOf[js.Any])
    if (defaultActiveKey != null) __obj.updateDynamic("defaultActiveKey")(defaultActiveKey.asInstanceOf[js.Any])
    if (generateChildId != null) __obj.updateDynamic("generateChildId")(generateChildId.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanelGroupProps]
  }
}

