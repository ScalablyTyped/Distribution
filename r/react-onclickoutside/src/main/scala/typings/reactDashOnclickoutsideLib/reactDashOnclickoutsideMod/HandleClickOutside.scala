package typings
package reactDashOnclickoutsideLib.reactDashOnclickoutsideMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleClickOutside[T] extends js.Object {
  var handleClickOutside: reactLib.reactMod.MouseEventHandler[T]
}

object HandleClickOutside {
  @scala.inline
  def apply[T](handleClickOutside: reactLib.reactMod.MouseEventHandler[T]): HandleClickOutside[T] = {
    val __obj = js.Dynamic.literal(handleClickOutside = handleClickOutside)
  
    __obj.asInstanceOf[HandleClickOutside[T]]
  }
}

