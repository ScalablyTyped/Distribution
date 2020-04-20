package typings.socketclusterClient.transportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnOpenAbortValue extends js.Object {
  var code: Double
  var reason: String
}

object OnOpenAbortValue {
  @scala.inline
  def apply(code: Double, reason: String): OnOpenAbortValue = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnOpenAbortValue]
  }
}

