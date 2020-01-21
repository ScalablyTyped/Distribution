package typings.reactDndTouchBackend

import typings.std.MouseEvent
import typings.std.Touch
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd-touch-backend/lib/utils/predicates", JSImport.Namespace)
@js.native
object predicatesMod extends js.Object {
  def eventShouldEndDrag(e: js.Any): Boolean = js.native
  def eventShouldStartDrag(e: js.Any): Boolean = js.native
  def isTouchEvent(e: MouseEvent): /* is std.TouchEvent */ Boolean = js.native
  def isTouchEvent(e: Touch): /* is std.TouchEvent */ Boolean = js.native
  def isTouchEvent(e: TouchEvent): /* is std.TouchEvent */ Boolean = js.native
}

