package typings.rollupTypescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCode extends js.Object {
  var code: String
  var map: js.Any
}

object AnonCode {
  @scala.inline
  def apply(code: String, map: js.Any): AnonCode = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCode]
  }
}

