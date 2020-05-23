package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSGesture extends js.Object {
  var target: Element
  def addPointer(pointerId: Double): Unit
  def stop(): Unit
}

object MSGesture {
  @scala.inline
  def apply(addPointer: Double => Unit, stop: () => Unit, target: Element): MSGesture = {
    val __obj = js.Dynamic.literal(addPointer = js.Any.fromFunction1(addPointer), stop = js.Any.fromFunction0(stop), target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSGesture]
  }
}

