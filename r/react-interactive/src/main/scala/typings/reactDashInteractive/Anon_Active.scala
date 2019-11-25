package typings.reactDashInteractive

import typings.react.reactMod.CSSProperties
import typings.reactDashInteractive.reactDashInteractiveMod.ActiveProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Active extends ActiveProps {
  var active: js.UndefOr[CSSProperties] = js.undefined
}

object Anon_Active {
  @scala.inline
  def apply(active: CSSProperties = null): Anon_Active = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Active]
  }
}

