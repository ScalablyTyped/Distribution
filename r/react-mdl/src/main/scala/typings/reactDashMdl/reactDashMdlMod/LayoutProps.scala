package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutProps
  extends AllHTMLAttributes[js.Any]
     with ClassAttributes[js.Any] {
  var fixedDrawer: js.UndefOr[Boolean] = js.undefined
  var fixedHeader: js.UndefOr[Boolean] = js.undefined
  var fixedTabs: js.UndefOr[Boolean] = js.undefined
}

object LayoutProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[js.Any] = null,
    ClassAttributes: ClassAttributes[js.Any] = null,
    fixedDrawer: js.UndefOr[Boolean] = js.undefined,
    fixedHeader: js.UndefOr[Boolean] = js.undefined,
    fixedTabs: js.UndefOr[Boolean] = js.undefined
  ): LayoutProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(fixedDrawer)) __obj.updateDynamic("fixedDrawer")(fixedDrawer)
    if (!js.isUndefined(fixedHeader)) __obj.updateDynamic("fixedHeader")(fixedHeader)
    if (!js.isUndefined(fixedTabs)) __obj.updateDynamic("fixedTabs")(fixedTabs)
    __obj.asInstanceOf[LayoutProps]
  }
}

