package typings
package reactDashToggleLib.reactDashToggleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToggleProps
  extends reactLib.reactMod.ReactNs.InputHTMLAttributes[stdLib.HTMLInputElement] {
  var icons: js.UndefOr[scala.Boolean | ToggleIcons] = js.undefined
}

object ToggleProps {
  @scala.inline
  def apply(
    InputHTMLAttributes: reactLib.reactMod.ReactNs.InputHTMLAttributes[stdLib.HTMLInputElement] = null,
    `aria-label`: java.lang.String = null,
    `aria-labelledby`: java.lang.String = null,
    icons: scala.Boolean | ToggleIcons = null
  ): ToggleProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, InputHTMLAttributes)
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`)
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToggleProps]
  }
}

