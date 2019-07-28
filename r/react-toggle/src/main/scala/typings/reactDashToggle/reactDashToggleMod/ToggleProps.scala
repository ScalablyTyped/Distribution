package typings.reactDashToggle.reactDashToggleMod

import typings.react.reactMod.InputHTMLAttributes
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToggleProps extends InputHTMLAttributes[HTMLInputElement] {
  var icons: js.UndefOr[Boolean | ToggleIcons] = js.undefined
}

object ToggleProps {
  @scala.inline
  def apply(
    InputHTMLAttributes: InputHTMLAttributes[HTMLInputElement] = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    icons: Boolean | ToggleIcons = null
  ): ToggleProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, InputHTMLAttributes)
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`)
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToggleProps]
  }
}

