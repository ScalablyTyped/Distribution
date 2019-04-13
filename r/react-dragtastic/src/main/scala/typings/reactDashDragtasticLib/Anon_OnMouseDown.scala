package typings
package reactDashDragtasticLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_OnMouseDown extends js.Object {
  @JSName("onMouseDown")
  var onMouseDown_Original: reactLib.reactMod.MouseEventHandler[reactLib.Element] = js.native
  @JSName("onTouchStart")
  var onTouchStart_Original: reactLib.reactMod.TouchEventHandler[reactLib.Element] = js.native
  def onMouseDown(event: reactLib.reactMod.MouseEvent[reactLib.Element, reactLib.NativeMouseEvent]): scala.Unit = js.native
  def onTouchStart(event: reactLib.reactMod.TouchEvent[reactLib.Element]): scala.Unit = js.native
}

