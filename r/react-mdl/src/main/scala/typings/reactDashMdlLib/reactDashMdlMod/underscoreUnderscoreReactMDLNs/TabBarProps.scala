package typings
package reactDashMdlLib.reactDashMdlMod.underscoreUnderscoreReactMDLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarProps
  extends MDLHTMLAttributes
     with MDLDOMAttributes[TabBar] {
  var activeTab: js.UndefOr[scala.Double] = js.undefined
  var cssPrefix: java.lang.String
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* tabId */ scala.Double, _]] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[TabBar]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object TabBarProps {
  @scala.inline
  def apply(
    cssPrefix: java.lang.String,
    MDLDOMAttributes: MDLDOMAttributes[TabBar] = null,
    MDLHTMLAttributes: MDLHTMLAttributes = null,
    activeTab: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    onChange: js.Function1[/* tabId */ scala.Double, _] = null,
    onClick: reactLib.reactMod.ReactNs.MouseEventHandler[TabBar] = null,
    title: java.lang.String = null
  ): TabBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cssPrefix")(cssPrefix)
    js.Dynamic.global.Object.assign(__obj, MDLDOMAttributes)
    js.Dynamic.global.Object.assign(__obj, MDLHTMLAttributes)
    if (activeTab != null) __obj.updateDynamic("activeTab")(activeTab.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[TabBarProps]
  }
}

