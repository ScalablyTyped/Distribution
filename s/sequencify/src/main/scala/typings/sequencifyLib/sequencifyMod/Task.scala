package typings
package sequencifyLib.sequencifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task extends js.Object {
  var dep: js.Array[java.lang.String]
  var name: java.lang.String
}

object Task {
  @scala.inline
  def apply(dep: js.Array[java.lang.String], name: java.lang.String): Task = {
    val __obj = js.Dynamic.literal(dep = dep, name = name)
  
    __obj.asInstanceOf[Task]
  }
}

