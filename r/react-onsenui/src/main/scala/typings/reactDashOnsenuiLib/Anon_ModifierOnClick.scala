package typings
package reactDashOnsenuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ModifierOnClick extends js.Object {
  var modifier: js.UndefOr[java.lang.String] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[_]] = js.undefined
}

object Anon_ModifierOnClick {
  @scala.inline
  def apply(modifier: java.lang.String = null, onClick: reactLib.reactMod.MouseEventHandler[_] = null): Anon_ModifierOnClick = {
    val __obj = js.Dynamic.literal()
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    __obj.asInstanceOf[Anon_ModifierOnClick]
  }
}

