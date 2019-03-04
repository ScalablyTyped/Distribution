package typings
package shipitDashCliLib.shipitDashCliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task extends js.Object {
  var blocking: scala.Boolean
  var dep: js.Array[java.lang.String]
  var name: java.lang.String
  def fn(): scala.Unit
}

object Task {
  @scala.inline
  def apply(
    blocking: scala.Boolean,
    dep: js.Array[java.lang.String],
    fn: js.Function0[scala.Unit],
    name: java.lang.String
  ): Task = {
    val __obj = js.Dynamic.literal(blocking = blocking, dep = dep, fn = fn, name = name)
  
    __obj.asInstanceOf[Task]
  }
}

