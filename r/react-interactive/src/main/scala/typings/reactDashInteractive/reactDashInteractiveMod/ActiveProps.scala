package typings.reactDashInteractive.reactDashInteractiveMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveProps extends js.Object {
  var active: js.UndefOr[CSSProperties] = js.undefined
  var hoverActive: js.UndefOr[CSSProperties] = js.undefined
  var keyActive: js.UndefOr[CSSProperties] = js.undefined
  var touchActive: js.UndefOr[CSSProperties] = js.undefined
}

object ActiveProps {
  @scala.inline
  def apply(
    active: CSSProperties = null,
    hoverActive: CSSProperties = null,
    keyActive: CSSProperties = null,
    touchActive: CSSProperties = null
  ): ActiveProps = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active)
    if (hoverActive != null) __obj.updateDynamic("hoverActive")(hoverActive)
    if (keyActive != null) __obj.updateDynamic("keyActive")(keyActive)
    if (touchActive != null) __obj.updateDynamic("touchActive")(touchActive)
    __obj.asInstanceOf[ActiveProps]
  }
}

