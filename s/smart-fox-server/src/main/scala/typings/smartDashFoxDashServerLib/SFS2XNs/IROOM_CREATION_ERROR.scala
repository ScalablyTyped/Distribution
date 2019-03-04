package typings
package smartDashFoxDashServerLib.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IROOM_CREATION_ERROR extends js.Object {
  var errorCode: scala.Double
  var errorMessage: java.lang.String
}

object IROOM_CREATION_ERROR {
  @scala.inline
  def apply(errorCode: scala.Double, errorMessage: java.lang.String): IROOM_CREATION_ERROR = {
    val __obj = js.Dynamic.literal(errorCode = errorCode, errorMessage = errorMessage)
  
    __obj.asInstanceOf[IROOM_CREATION_ERROR]
  }
}

