package typings.slickgrid.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateResults extends js.Object {
  var msg: String
  var valid: Boolean
}

object ValidateResults {
  @scala.inline
  def apply(msg: String, valid: Boolean): ValidateResults = {
    val __obj = js.Dynamic.literal(msg = msg, valid = valid)
  
    __obj.asInstanceOf[ValidateResults]
  }
}

