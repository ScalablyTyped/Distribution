package typings.socketclusterClient.transportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnEventValue extends js.Object {
  var data: js.Any
  var event: String
}

object OnEventValue {
  @scala.inline
  def apply(data: js.Any, event: String): OnEventValue = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnEventValue]
  }
}

