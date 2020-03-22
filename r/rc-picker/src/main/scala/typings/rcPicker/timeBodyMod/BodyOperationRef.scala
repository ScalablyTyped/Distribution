package typings.rcPicker.timeBodyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyOperationRef extends js.Object {
  def onUpDown(diff: Double): Unit
}

object BodyOperationRef {
  @scala.inline
  def apply(onUpDown: Double => Unit): BodyOperationRef = {
    val __obj = js.Dynamic.literal(onUpDown = js.Any.fromFunction1(onUpDown))
  
    __obj.asInstanceOf[BodyOperationRef]
  }
}

