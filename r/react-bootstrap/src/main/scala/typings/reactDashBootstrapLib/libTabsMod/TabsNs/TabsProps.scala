package typings
package reactDashBootstrapLib.libTabsMod.TabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libTabsMod.Tabs] {
  var activeKey: js.UndefOr[js.Any] = js.undefined
  var animation: js.UndefOr[scala.Boolean] = js.undefined
  var bsStyle: js.UndefOr[java.lang.String] = js.undefined
  var defaultActiveKey: js.UndefOr[js.Any] = js.undefined
  var justified: js.UndefOr[scala.Boolean] = js.undefined
   // TODO: Add more specific type
  var mountOnEnter: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("onSelect")
  var onSelect_TabsProps: js.UndefOr[reactDashBootstrapLib.reactDashBootstrapMod.SelectCallback] = js.undefined
  var paneWidth: js.UndefOr[js.Any] = js.undefined
   // TODO: Add more specific type
  var position: js.UndefOr[java.lang.String] = js.undefined
  var tabWidth: js.UndefOr[js.Any] = js.undefined
  var unmountOnExit: js.UndefOr[scala.Boolean] = js.undefined
}

object TabsProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libTabsMod.Tabs] = null,
    activeKey: js.Any = null,
    animation: js.UndefOr[scala.Boolean] = js.undefined,
    bsStyle: java.lang.String = null,
    defaultActiveKey: js.Any = null,
    justified: js.UndefOr[scala.Boolean] = js.undefined,
    mountOnEnter: js.UndefOr[scala.Boolean] = js.undefined,
    onSelect: reactDashBootstrapLib.reactDashBootstrapMod.SelectCallback = null,
    paneWidth: js.Any = null,
    position: java.lang.String = null,
    tabWidth: js.Any = null,
    unmountOnExit: js.UndefOr[scala.Boolean] = js.undefined
  ): TabsProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey)
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation)
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle)
    if (defaultActiveKey != null) __obj.updateDynamic("defaultActiveKey")(defaultActiveKey)
    if (!js.isUndefined(justified)) __obj.updateDynamic("justified")(justified)
    if (!js.isUndefined(mountOnEnter)) __obj.updateDynamic("mountOnEnter")(mountOnEnter)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (paneWidth != null) __obj.updateDynamic("paneWidth")(paneWidth)
    if (position != null) __obj.updateDynamic("position")(position)
    if (tabWidth != null) __obj.updateDynamic("tabWidth")(tabWidth)
    if (!js.isUndefined(unmountOnExit)) __obj.updateDynamic("unmountOnExit")(unmountOnExit)
    __obj.asInstanceOf[TabsProps]
  }
}

