package typings
package smartDashFoxDashServerLib.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILOGIN_ERROR extends js.Object {
  var errorCode: scala.Double
  var errorMessage: java.lang.String
}

object ILOGIN_ERROR {
  @scala.inline
  def apply(errorCode: scala.Double, errorMessage: java.lang.String): ILOGIN_ERROR = {
    val __obj = js.Dynamic.literal(errorCode = errorCode, errorMessage = errorMessage)
  
    __obj.asInstanceOf[ILOGIN_ERROR]
  }
}

