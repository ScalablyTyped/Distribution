package typings.reactDashModal.reactDashModalMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Styles extends js.Object {
  var content: js.UndefOr[CSSProperties] = js.undefined
  var overlay: js.UndefOr[CSSProperties] = js.undefined
}

object Styles {
  @scala.inline
  def apply(content: CSSProperties = null, overlay: CSSProperties = null): Styles = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Styles]
  }
}

