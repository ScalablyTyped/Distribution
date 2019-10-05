package typings.smartDashFoxDashServer.SFS2X

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISOCKET_ERROR extends js.Object {
  var errorMessage: String
}

object ISOCKET_ERROR {
  @scala.inline
  def apply(errorMessage: String): ISOCKET_ERROR = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage)
  
    __obj.asInstanceOf[ISOCKET_ERROR]
  }
}

