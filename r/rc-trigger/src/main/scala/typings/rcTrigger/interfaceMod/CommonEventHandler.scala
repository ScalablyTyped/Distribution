package typings.rcTrigger.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonEventHandler extends js.Object {
  def remove(): Unit
}

object CommonEventHandler {
  @scala.inline
  def apply(remove: () => Unit): CommonEventHandler = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
  
    __obj.asInstanceOf[CommonEventHandler]
  }
}

