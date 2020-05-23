package typings.reactScrollIntoViewIfNeeded.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.scrollIntoViewIfNeeded.mod.Options
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactScrollIntoViewIfNeededProps
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement] {
  var active: js.UndefOr[Boolean] = js.undefined
  var elementType: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.undefined
  var options: js.UndefOr[Options[_]] = js.undefined
}

object ReactScrollIntoViewIfNeededProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    ClassAttributes: ClassAttributes[HTMLElement] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    elementType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any = null,
    options: Options[_] = null
  ): ReactScrollIntoViewIfNeededProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (elementType != null) __obj.updateDynamic("elementType")(elementType.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactScrollIntoViewIfNeededProps]
  }
}

