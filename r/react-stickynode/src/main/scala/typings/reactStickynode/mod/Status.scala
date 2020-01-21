package typings.reactStickynode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Status extends js.Object {
  var status: StatusCode
}

object Status {
  @scala.inline
  def apply(status: StatusCode): Status = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Status]
  }
}

