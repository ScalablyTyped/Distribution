package typings.smartFoxServer.SFS2X

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEXTENSION_RESPONSE extends js.Object {
  var cmd: String
  var params: js.Object
  var sourceRoom: Double
}

object IEXTENSION_RESPONSE {
  @scala.inline
  def apply(cmd: String, params: js.Object, sourceRoom: Double): IEXTENSION_RESPONSE = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], sourceRoom = sourceRoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEXTENSION_RESPONSE]
  }
}

