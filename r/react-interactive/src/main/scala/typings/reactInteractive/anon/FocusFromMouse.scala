package typings.reactInteractive.anon

import typings.react.mod.CSSProperties
import typings.reactInteractive.mod.FocusProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusFromMouse extends FocusProps {
  var focusFromMouse: js.UndefOr[CSSProperties] = js.undefined
  var focusFromTab: js.UndefOr[CSSProperties] = js.undefined
  var focusFromTouch: js.UndefOr[CSSProperties] = js.undefined
}

object FocusFromMouse {
  @scala.inline
  def apply(
    focusFromMouse: CSSProperties = null,
    focusFromTab: CSSProperties = null,
    focusFromTouch: CSSProperties = null
  ): FocusFromMouse = {
    val __obj = js.Dynamic.literal()
    if (focusFromMouse != null) __obj.updateDynamic("focusFromMouse")(focusFromMouse.asInstanceOf[js.Any])
    if (focusFromTab != null) __obj.updateDynamic("focusFromTab")(focusFromTab.asInstanceOf[js.Any])
    if (focusFromTouch != null) __obj.updateDynamic("focusFromTouch")(focusFromTouch.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusFromMouse]
  }
}

