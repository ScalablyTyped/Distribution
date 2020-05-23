package typings.reactInteractive.anon

import typings.react.mod.CSSProperties
import typings.reactInteractive.mod.FocusProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Focus extends FocusProps {
  var focus: js.UndefOr[CSSProperties] = js.undefined
}

object Focus {
  @scala.inline
  def apply(focus: CSSProperties = null): Focus = {
    val __obj = js.Dynamic.literal()
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focus]
  }
}

