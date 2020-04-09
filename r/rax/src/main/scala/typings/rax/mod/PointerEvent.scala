package typings.rax.mod

import typings.rax.raxStrings.mouse
import typings.rax.raxStrings.pen
import typings.rax.raxStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointerEvent[T] extends MouseEvent[T, NativePointerEvent] {
  var height: Double = js.native
  var isPrimary: Boolean = js.native
  var pointerId: Double = js.native
  var pointerType: mouse | pen | touch = js.native
  var pressure: Double = js.native
  var tiltX: Double = js.native
  var tiltY: Double = js.native
  var width: Double = js.native
}

