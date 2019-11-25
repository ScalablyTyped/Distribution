package typings.reactDashScrollDashIntoDashViewDashIfDashNeeded.reactDashScrollDashIntoDashViewDashIfDashNeededMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactScrollIntoViewIfNeededProps
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement] {
  var active: js.UndefOr[Boolean] = js.undefined
  var elementType: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any
  ] = js.undefined
  var options: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ScrollIntoViewIfNeeded.Options */ js.Any
  ] = js.undefined
}

object ReactScrollIntoViewIfNeededProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    ClassAttributes: ClassAttributes[HTMLElement] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    elementType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any = null,
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ScrollIntoViewIfNeeded.Options */ js.Any = null
  ): ReactScrollIntoViewIfNeededProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (elementType != null) __obj.updateDynamic("elementType")(elementType.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactScrollIntoViewIfNeededProps]
  }
}

