package typings
package reactourLib.reactourMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrowProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.native
  var disabled: js.UndefOr[scala.Boolean] = js.native
  var inverted: js.UndefOr[scala.Boolean] = js.native
  var label: js.UndefOr[reactLib.reactMod.ReactNode] = js.native
  @JSName("onClick")
  var onClick_Original: reactLib.reactMod.MouseEventHandler[stdLib.HTMLButtonElement] = js.native
  def onClick(event: reactLib.reactMod.MouseEvent[stdLib.HTMLButtonElement, reactLib.NativeMouseEvent]): scala.Unit = js.native
}

