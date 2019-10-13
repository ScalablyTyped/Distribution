package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabProps
  extends AllHTMLAttributes[js.Any]
     with ClassAttributes[js.Any]
     with CustomRenderedComponent {
  var active: js.UndefOr[Boolean] = js.undefined
  var cssPrefix: js.UndefOr[String] = js.undefined
  var onTabClick: js.UndefOr[js.Function1[/* tabId */ Double, _]] = js.undefined
  var tabId: js.UndefOr[Double] = js.undefined
}

object TabProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[js.Any] = null,
    ClassAttributes: ClassAttributes[js.Any] = null,
    CustomRenderedComponent: CustomRenderedComponent = null,
    active: js.UndefOr[Boolean] = js.undefined,
    cssPrefix: String = null,
    onTabClick: /* tabId */ Double => _ = null,
    tabId: Int | Double = null
  ): TabProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    js.Dynamic.global.Object.assign(__obj, CustomRenderedComponent)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (cssPrefix != null) __obj.updateDynamic("cssPrefix")(cssPrefix)
    if (onTabClick != null) __obj.updateDynamic("onTabClick")(js.Any.fromFunction1(onTabClick))
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabProps]
  }
}

