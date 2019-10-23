package typings.reactDashDivDash100vh.reactDashDivDash100vhMod

import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Div100vhProps
  extends HTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement] {
  var as: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any
  ] = js.undefined
}

object Div100vhProps {
  @scala.inline
  def apply(
    ClassAttributes: ClassAttributes[HTMLElement] = null,
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    as: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any = null
  ): Div100vhProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (as != null) __obj.updateDynamic("as")(as)
    __obj.asInstanceOf[Div100vhProps]
  }
}

