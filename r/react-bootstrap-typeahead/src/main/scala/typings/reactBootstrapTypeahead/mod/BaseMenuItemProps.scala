package typings.reactBootstrapTypeahead.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.li
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseMenuItemProps
  extends AllHTMLAttributes[li]
     with ClassAttributes[li] {
  var active: js.UndefOr[Boolean] = js.undefined
}

object BaseMenuItemProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[li] = null,
    ClassAttributes: ClassAttributes[li] = null,
    active: js.UndefOr[Boolean] = js.undefined
  ): BaseMenuItemProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseMenuItemProps]
  }
}

