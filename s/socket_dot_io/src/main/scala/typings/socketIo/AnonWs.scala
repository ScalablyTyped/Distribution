package typings.socketIo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWs extends js.Object {
  var ws: js.Any
}

object AnonWs {
  @scala.inline
  def apply(ws: js.Any): AnonWs = {
    val __obj = js.Dynamic.literal(ws = ws.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonWs]
  }
}

