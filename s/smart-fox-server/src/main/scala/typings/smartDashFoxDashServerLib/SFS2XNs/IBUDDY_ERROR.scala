package typings
package smartDashFoxDashServerLib.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBUDDY_ERROR extends js.Object {
  var errorCode: scala.Double
  var errorMessage: java.lang.String
}

object IBUDDY_ERROR {
  @scala.inline
  def apply(errorCode: scala.Double, errorMessage: java.lang.String): IBUDDY_ERROR = {
    val __obj = js.Dynamic.literal(errorCode = errorCode, errorMessage = errorMessage)
  
    __obj.asInstanceOf[IBUDDY_ERROR]
  }
}

