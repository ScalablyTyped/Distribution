package typings.reactMdl.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
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
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(fixedDrawer)) __obj.updateDynamic("fixedDrawer")(fixedDrawer.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedHeader)) __obj.updateDynamic("fixedHeader")(fixedHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedTabs)) __obj.updateDynamic("fixedTabs")(fixedTabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutProps]
  }
}

