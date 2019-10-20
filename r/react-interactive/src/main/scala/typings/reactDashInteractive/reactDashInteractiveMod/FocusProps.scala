package typings.reactDashInteractive.reactDashInteractiveMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusProps extends js.Object {
  var focus: js.UndefOr[CSSProperties] = js.undefined
  var focusFromMouse: js.UndefOr[CSSProperties] = js.undefined
  var focusFromTab: js.UndefOr[CSSProperties] = js.undefined
  var focusFromTouch: js.UndefOr[CSSProperties] = js.undefined
}

object FocusProps {
  @scala.inline
  def apply(
    focus: CSSProperties = null,
    focusFromMouse: CSSProperties = null,
    focusFromTab: CSSProperties = null,
    focusFromTouch: CSSProperties = null
  ): FocusProps = {
    val __obj = js.Dynamic.literal()
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (focusFromMouse != null) __obj.updateDynamic("focusFromMouse")(focusFromMouse)
    if (focusFromTab != null) __obj.updateDynamic("focusFromTab")(focusFromTab)
    if (focusFromTouch != null) __obj.updateDynamic("focusFromTouch")(focusFromTouch)
    __obj.asInstanceOf[FocusProps]
  }
}

