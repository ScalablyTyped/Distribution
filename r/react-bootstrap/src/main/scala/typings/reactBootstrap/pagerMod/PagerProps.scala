package typings.reactBootstrap.pagerMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactBootstrap.mod.SelectCallback
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
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagerProps]
  }
}

