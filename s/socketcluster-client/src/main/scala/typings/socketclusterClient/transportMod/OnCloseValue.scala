package typings.socketclusterClient.transportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnCloseValue extends js.Object {
  var code: Double
  var reason: String
}

object OnCloseValue {
  @scala.inline
  def apply(code: Double, reason: String): OnCloseValue = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnCloseValue]
  }
}

