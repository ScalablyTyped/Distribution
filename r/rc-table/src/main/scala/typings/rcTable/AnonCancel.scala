package typings.rcTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancel extends js.Object {
  var cancel: js.Function
}

object AnonCancel {
  @scala.inline
  def apply(cancel: js.Function): AnonCancel = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCancel]
  }
}

