package typings.reactDashBootstrap.libPagerMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.reactDashBootstrap.reactDashBootstrapMod.SelectCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagerProps
  extends AllHTMLAttributes[Pager]
     with ClassAttributes[Pager] {
  var bsClass: js.UndefOr[String] = js.undefined
  @JSName("onSelect")
  var onSelect_PagerProps: js.UndefOr[SelectCallback] = js.undefined
}

object PagerProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[Pager] = null,
    ClassAttributes: ClassAttributes[Pager] = null,
    bsClass: String = null,
    onSelect: SelectCallback = null
  ): PagerProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    __obj.asInstanceOf[PagerProps]
  }
}

