package typings.reactBootstrap.tabsMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactBootstrap.mod.SelectCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps
  extends AllHTMLAttributes[Tabs]
     with ClassAttributes[Tabs] {
  var activeKey: js.UndefOr[js.Any] = js.undefined
  var animation: js.UndefOr[Boolean] = js.undefined
  var bsStyle: js.UndefOr[String] = js.undefined
  var defaultActiveKey: js.UndefOr[js.Any] = js.undefined
  var justified: js.UndefOr[Boolean] = js.undefined
   // TODO: Add more specific type
  var mountOnEnter: js.UndefOr[Boolean] = js.undefined
  @JSName("onSelect")
  var onSelect_TabsProps: js.UndefOr[SelectCallback] = js.undefined
  var paneWidth: js.UndefOr[js.Any] = js.undefined
   // TODO: Add more specific type
  var position: js.UndefOr[String] = js.undefined
  var tabWidth: js.UndefOr[js.Any] = js.undefined
  var unmountOnExit: js.UndefOr[Boolean] = js.undefined
}

object TabsProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[Tabs] = null,
    ClassAttributes: ClassAttributes[Tabs] = null,
    activeKey: js.Any = null,
    animation: js.UndefOr[Boolean] = js.undefined,
    bsStyle: String = null,
    defaultActiveKey: js.Any = null,
    justified: js.UndefOr[Boolean] = js.undefined,
    mountOnEnter: js.UndefOr[Boolean] = js.undefined,
    onSelect: SelectCallback = null,
    paneWidth: js.Any = null,
    position: String = null,
    tabWidth: js.Any = null,
    unmountOnExit: js.UndefOr[Boolean] = js.undefined
  ): TabsProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey.asInstanceOf[js.Any])
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.get.asInstanceOf[js.Any])
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle.asInstanceOf[js.Any])
    if (defaultActiveKey != null) __obj.updateDynamic("defaultActiveKey")(defaultActiveKey.asInstanceOf[js.Any])
    if (!js.isUndefined(justified)) __obj.updateDynamic("justified")(justified.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mountOnEnter)) __obj.updateDynamic("mountOnEnter")(mountOnEnter.get.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect.asInstanceOf[js.Any])
    if (paneWidth != null) __obj.updateDynamic("paneWidth")(paneWidth.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (tabWidth != null) __obj.updateDynamic("tabWidth")(tabWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(unmountOnExit)) __obj.updateDynamic("unmountOnExit")(unmountOnExit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsProps]
  }
}

