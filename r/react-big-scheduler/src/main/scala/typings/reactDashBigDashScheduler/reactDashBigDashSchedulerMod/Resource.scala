package typings.reactDashBigDashScheduler.reactDashBigDashSchedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
  var id: String
  var name: String
}

object Resource {
  @scala.inline
  def apply(id: String, name: String): Resource = {
    val __obj = js.Dynamic.literal(id = id, name = name)
  
    __obj.asInstanceOf[Resource]
  }
}

