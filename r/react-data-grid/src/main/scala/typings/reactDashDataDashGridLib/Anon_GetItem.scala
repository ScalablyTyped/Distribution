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
  def apply(getItem: () => js.Any, getPosition: () => js.Any, hideMenu: () => scala.Unit): Anon_GetItem = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction0(getItem), getPosition = js.Any.fromFunction0(getPosition), hideMenu = js.Any.fromFunction0(hideMenu))
  
    __obj.asInstanceOf[Anon_GetItem]
  }
}

