package typings.reactDashScrollDashIntoDashViewDashIfDashNeeded.reactDashScrollDashIntoDashViewDashIfDashNeededMod

import typings.react.reactMod.HTMLProps
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactScrollIntoViewIfNeededProps extends HTMLProps[HTMLElement] {
  var active: js.UndefOr[Boolean] = js.undefined
  var elementType: js.UndefOr[
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 175 */ js.Any
  ] = js.undefined
  var options: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ScrollIntoViewIfNeeded.Options */ js.Any
  ] = js.undefined
}

object ReactScrollIntoViewIfNeededProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[HTMLElement] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    elementType: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 175 */ js.Any = null,
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ScrollIntoViewIfNeeded.Options */ js.Any = null
  ): ReactScrollIntoViewIfNeededProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (elementType != null) __obj.updateDynamic("elementType")(elementType)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[ReactScrollIntoViewIfNeededProps]
  }
}

