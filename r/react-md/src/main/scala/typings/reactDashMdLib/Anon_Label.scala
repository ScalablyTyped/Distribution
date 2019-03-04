package typings
package reactDashMdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Label extends js.Object {
  var label: reactLib.reactMod.ReactNs.ReactNode
  var onClick: js.UndefOr[js.Function] = js.undefined
}

object Anon_Label {
  @scala.inline
  def apply(label: reactLib.reactMod.ReactNs.ReactNode, onClick: js.Function = null): Anon_Label = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    __obj.asInstanceOf[Anon_Label]
  }
}

