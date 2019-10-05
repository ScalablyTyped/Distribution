package typings.smartDashFoxDashServer.SFS2X

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBUDDY_ERROR extends js.Object {
  var errorCode: Double
  var errorMessage: String
}

object IBUDDY_ERROR {
  @scala.inline
  def apply(errorCode: Double, errorMessage: String): IBUDDY_ERROR = {
    val __obj = js.Dynamic.literal(errorCode = errorCode, errorMessage = errorMessage)
  
    __obj.asInstanceOf[IBUDDY_ERROR]
  }
}

