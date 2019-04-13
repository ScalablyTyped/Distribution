package typings
package reactDashStickynodeLib.reactDashStickynodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Status extends js.Object {
  var status: StatusCode
}

object Status {
  @scala.inline
  def apply(status: StatusCode): Status = {
    val __obj = js.Dynamic.literal(status = status)
  
    __obj.asInstanceOf[Status]
  }
}

