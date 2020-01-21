package typings.sicList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCode extends js.Object {
  var code: String
  var description: String
}

object AnonCode {
  @scala.inline
  def apply(code: String, description: String): AnonCode = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCode]
  }
}

