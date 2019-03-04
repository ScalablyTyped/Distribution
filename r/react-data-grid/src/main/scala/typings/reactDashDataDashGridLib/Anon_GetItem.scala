package typings
package reactDashDataDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetItem extends js.Object {
  def getItem(): js.Any
  def getPosition(): js.Any
  def hideMenu(): scala.Unit
}

object Anon_GetItem {
  @scala.inline
  def apply(
    getItem: js.Function0[js.Any],
    getPosition: js.Function0[js.Any],
    hideMenu: js.Function0[scala.Unit]
  ): Anon_GetItem = {
    val __obj = js.Dynamic.literal(getItem = getItem, getPosition = getPosition, hideMenu = hideMenu)
  
    __obj.asInstanceOf[Anon_GetItem]
  }
}

