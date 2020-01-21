package typings.smartFoxServer.SFS2X

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICONNECTION extends js.Object {
  var success: Boolean
}

object ICONNECTION {
  @scala.inline
  def apply(success: Boolean): ICONNECTION = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICONNECTION]
  }
}

