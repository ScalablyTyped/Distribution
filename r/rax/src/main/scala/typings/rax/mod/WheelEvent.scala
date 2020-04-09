package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WheelEvent[T] extends MouseEvent[T, NativeWheelEvent] {
  var deltaMode: Double = js.native
  var deltaX: Double = js.native
  var deltaY: Double = js.native
  var deltaZ: Double = js.native
}

