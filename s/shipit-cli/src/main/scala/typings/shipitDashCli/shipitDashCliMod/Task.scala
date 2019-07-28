package typings.shipitDashCli.shipitDashCliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task extends js.Object {
  var blocking: Boolean
  var dep: js.Array[String]
  var name: String
  def fn(): Unit
}

object Task {
  @scala.inline
  def apply(blocking: Boolean, dep: js.Array[String], fn: () => Unit, name: String): Task = {
    val __obj = js.Dynamic.literal(blocking = blocking, dep = dep, fn = js.Any.fromFunction0(fn), name = name)
  
    __obj.asInstanceOf[Task]
  }
}

