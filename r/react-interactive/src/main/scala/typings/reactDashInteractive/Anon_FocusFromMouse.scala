package typings.reactDashInteractive

import typings.react.reactMod.CSSProperties
import typings.reactDashInteractive.reactDashInteractiveMod.FocusProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FocusFromMouse extends FocusProps {
  var focusFromMouse: js.UndefOr[CSSProperties] = js.undefined
  var focusFromTab: js.UndefOr[CSSProperties] = js.undefined
  var focusFromTouch: js.UndefOr[CSSProperties] = js.undefined
}

object Anon_FocusFromMouse {
  @scala.inline
  def apply(
    focusFromMouse: CSSProperties = null,
    focusFromTab: CSSProperties = null,
    focusFromTouch: CSSProperties = null
  ): Anon_FocusFromMouse = {
    val __obj = js.Dynamic.literal()
    if (focusFromMouse != null) __obj.updateDynamic("focusFromMouse")(focusFromMouse.asInstanceOf[js.Any])
    if (focusFromTab != null) __obj.updateDynamic("focusFromTab")(focusFromTab.asInstanceOf[js.Any])
    if (focusFromTouch != null) __obj.updateDynamic("focusFromTouch")(focusFromTouch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FocusFromMouse]
  }
}

