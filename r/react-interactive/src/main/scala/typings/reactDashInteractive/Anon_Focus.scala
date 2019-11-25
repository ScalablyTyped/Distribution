package typings.reactDashInteractive

import typings.react.reactMod.CSSProperties
import typings.reactDashInteractive.reactDashInteractiveMod.FocusProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Focus extends FocusProps {
  var focus: js.UndefOr[CSSProperties] = js.undefined
}

object Anon_Focus {
  @scala.inline
  def apply(focus: CSSProperties = null): Anon_Focus = {
    val __obj = js.Dynamic.literal()
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Focus]
  }
}

