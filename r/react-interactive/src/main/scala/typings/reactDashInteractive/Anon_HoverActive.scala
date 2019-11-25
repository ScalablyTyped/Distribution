package typings.reactDashInteractive

import typings.react.reactMod.CSSProperties
import typings.reactDashInteractive.reactDashInteractiveMod.ActiveProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HoverActive extends ActiveProps {
  var hoverActive: js.UndefOr[CSSProperties] = js.undefined
  var keyActive: js.UndefOr[CSSProperties] = js.undefined
  var touchActive: js.UndefOr[CSSProperties] = js.undefined
}

object Anon_HoverActive {
  @scala.inline
  def apply(
    hoverActive: CSSProperties = null,
    keyActive: CSSProperties = null,
    touchActive: CSSProperties = null
  ): Anon_HoverActive = {
    val __obj = js.Dynamic.literal()
    if (hoverActive != null) __obj.updateDynamic("hoverActive")(hoverActive.asInstanceOf[js.Any])
    if (keyActive != null) __obj.updateDynamic("keyActive")(keyActive.asInstanceOf[js.Any])
    if (touchActive != null) __obj.updateDynamic("touchActive")(touchActive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HoverActive]
  }
}

