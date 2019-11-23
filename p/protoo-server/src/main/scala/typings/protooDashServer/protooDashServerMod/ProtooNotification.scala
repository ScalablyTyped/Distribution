package typings.protooDashServer.protooDashServerMod

import typings.protooDashServer.protooDashServerNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtooNotification extends js.Object {
  var data: js.Any
  var method: String
  var notification: `true`
}

object ProtooNotification {
  @scala.inline
  def apply(data: js.Any, method: String, notification: `true`): ProtooNotification = {
    val __obj = js.Dynamic.literal(data = data, method = method, notification = notification)
  
    __obj.asInstanceOf[ProtooNotification]
  }
}

