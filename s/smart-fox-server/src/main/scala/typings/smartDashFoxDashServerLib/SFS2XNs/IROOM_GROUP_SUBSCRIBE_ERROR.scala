package typings
package smartDashFoxDashServerLib.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IROOM_GROUP_SUBSCRIBE_ERROR extends js.Object {
  var errorCode: scala.Double
  var errorMessage: java.lang.String
}

object IROOM_GROUP_SUBSCRIBE_ERROR {
  @scala.inline
  def apply(errorCode: scala.Double, errorMessage: java.lang.String): IROOM_GROUP_SUBSCRIBE_ERROR = {
    val __obj = js.Dynamic.literal(errorCode = errorCode, errorMessage = errorMessage)
  
    __obj.asInstanceOf[IROOM_GROUP_SUBSCRIBE_ERROR]
  }
}

