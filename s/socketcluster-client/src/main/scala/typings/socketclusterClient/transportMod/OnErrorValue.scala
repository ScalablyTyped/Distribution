package typings.socketclusterClient.transportMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnErrorValue extends js.Object {
  var error: Error
}

object OnErrorValue {
  @scala.inline
  def apply(error: Error): OnErrorValue = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnErrorValue]
  }
}

