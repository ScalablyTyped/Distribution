package typings
package reactDashMdlLib.reactDashMdlMod.underscoreUnderscoreReactMDLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabProps
  extends reactLib.reactMod.ReactNs.HTMLProps[js.Any]
     with CustomRenderedComponent {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var cssPrefix: js.UndefOr[java.lang.String] = js.undefined
  var onTabClick: js.UndefOr[js.Function1[/* tabId */ scala.Double, _]] = js.undefined
  var tabId: js.UndefOr[scala.Double] = js.undefined
}

object TabProps {
  @scala.inline
  def apply(
    CustomRenderedComponent: CustomRenderedComponent = null,
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[js.Any] = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    cssPrefix: java.lang.String = null,
    onTabClick: js.Function1[/* tabId */ scala.Double, _] = null,
    tabId: scala.Int | scala.Double = null
  ): TabProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, CustomRenderedComponent)
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (cssPrefix != null) __obj.updateDynamic("cssPrefix")(cssPrefix)
    if (onTabClick != null) __obj.updateDynamic("onTabClick")(onTabClick)
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabProps]
  }
}

