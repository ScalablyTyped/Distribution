package typings.sequencify.sequencifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task extends js.Object {
  var dep: js.Array[String]
  var name: String
}

object Task {
  @scala.inline
  def apply(dep: js.Array[String], name: String): Task = {
    val __obj = js.Dynamic.literal(dep = dep, name = name)
  
    __obj.asInstanceOf[Task]
  }
}

