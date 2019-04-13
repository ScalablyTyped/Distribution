package typings
package reactDashOnclickoutsideLib.reactDashOnclickoutsideMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandleClickOutside[T] extends js.Object {
  @JSName("handleClickOutside")
  var handleClickOutside_Original: reactLib.reactMod.MouseEventHandler[T] = js.native
  def handleClickOutside(event: reactLib.reactMod.MouseEvent[T, reactLib.NativeMouseEvent]): scala.Unit = js.native
}

