package typings.reactInteractive.anon

import typings.react.mod.CSSProperties
import typings.reactInteractive.mod.ActiveProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Active extends ActiveProps {
  var active: js.UndefOr[CSSProperties] = js.undefined
}

object Active {
  @scala.inline
  def apply(active: CSSProperties = null): Active = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    __obj.asInstanceOf[Active]
  }
}

