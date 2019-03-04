package typings
package smartDashFoxDashServerLib.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEXTENSION_RESPONSE extends js.Object {
  var cmd: java.lang.String
  var params: js.Object
  var sourceRoom: scala.Double
}

object IEXTENSION_RESPONSE {
  @scala.inline
  def apply(cmd: java.lang.String, params: js.Object, sourceRoom: scala.Double): IEXTENSION_RESPONSE = {
    val __obj = js.Dynamic.literal(cmd = cmd, params = params, sourceRoom = sourceRoom)
  
    __obj.asInstanceOf[IEXTENSION_RESPONSE]
  }
}

