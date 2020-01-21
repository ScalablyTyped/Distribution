package typings.reactInteractive

import typings.react.mod.CSSProperties
import typings.reactInteractive.mod.ActiveProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHoverActive extends ActiveProps {
  var hoverActive: js.UndefOr[CSSProperties] = js.undefined
  var keyActive: js.UndefOr[CSSProperties] = js.undefined
  var touchActive: js.UndefOr[CSSProperties] = js.undefined
}

object AnonHoverActive {
  @scala.inline
  def apply(
    hoverActive: CSSProperties = null,
    keyActive: CSSProperties = null,
    touchActive: CSSProperties = null
  ): AnonHoverActive = {
    val __obj = js.Dynamic.literal()
    if (hoverActive != null) __obj.updateDynamic("hoverActive")(hoverActive.asInstanceOf[js.Any])
    if (keyActive != null) __obj.updateDynamic("keyActive")(keyActive.asInstanceOf[js.Any])
    if (touchActive != null) __obj.updateDynamic("touchActive")(touchActive.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHoverActive]
  }
}

