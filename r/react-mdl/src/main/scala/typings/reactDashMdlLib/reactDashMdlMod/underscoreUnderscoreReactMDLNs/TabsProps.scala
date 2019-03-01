package typings
package reactDashMdlLib.reactDashMdlMod.underscoreUnderscoreReactMDLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps
  extends MDLHTMLAttributes
     with MDLDOMAttributes[Tabs] {
  var activeTab: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* tabId */ scala.Double, _]] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[Tabs]] = js.undefined
  var tabBarProps: js.UndefOr[TabBarProps] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object TabsProps {
  @scala.inline
  def apply(
    MDLDOMAttributes: MDLDOMAttributes[Tabs] = null,
    MDLHTMLAttributes: MDLHTMLAttributes = null,
    activeTab: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    onChange: js.Function1[/* tabId */ scala.Double, _] = null,
    onClick: reactLib.reactMod.ReactNs.MouseEventHandler[Tabs] = null,
    tabBarProps: TabBarProps = null,
    title: java.lang.String = null
  ): TabsProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, MDLDOMAttributes)
    js.Dynamic.global.Object.assign(__obj, MDLHTMLAttributes)
    if (activeTab != null) __obj.updateDynamic("activeTab")(activeTab.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (tabBarProps != null) __obj.updateDynamic("tabBarProps")(tabBarProps)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[TabsProps]
  }
}

