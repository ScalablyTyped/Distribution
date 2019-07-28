package typings.smartDashFoxDashServer.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILOGIN_ERROR extends js.Object {
  var errorCode: Double
  var errorMessage: String
}

object ILOGIN_ERROR {
  @scala.inline
  def apply(errorCode: Double, errorMessage: String): ILOGIN_ERROR = {
    val __obj = js.Dynamic.literal(errorCode = errorCode, errorMessage = errorMessage)
  
    __obj.asInstanceOf[ILOGIN_ERROR]
  }
}

