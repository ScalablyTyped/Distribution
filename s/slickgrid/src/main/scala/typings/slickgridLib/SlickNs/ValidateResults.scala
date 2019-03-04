package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateResults extends js.Object {
  var msg: java.lang.String
  var valid: scala.Boolean
}

object ValidateResults {
  @scala.inline
  def apply(msg: java.lang.String, valid: scala.Boolean): ValidateResults = {
    val __obj = js.Dynamic.literal(msg = msg, valid = valid)
  
    __obj.asInstanceOf[ValidateResults]
  }
}

