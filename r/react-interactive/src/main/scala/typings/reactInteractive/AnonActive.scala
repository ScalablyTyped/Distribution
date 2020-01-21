package typings.reactInteractive

import typings.react.mod.CSSProperties
import typings.reactInteractive.mod.ActiveProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActive extends ActiveProps {
  var active: js.UndefOr[CSSProperties] = js.undefined
}

object AnonActive {
  @scala.inline
  def apply(active: CSSProperties = null): AnonActive = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActive]
  }
}

