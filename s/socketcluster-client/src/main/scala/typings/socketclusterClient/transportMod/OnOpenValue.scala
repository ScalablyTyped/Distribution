package typings.socketclusterClient.transportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnOpenValue extends js.Object {
  var authToken: js.Object | Null
  var id: String
  var isAuthenticated: Boolean
  var pingTimeout: Double
}

object OnOpenValue {
  @scala.inline
  def apply(id: String, isAuthenticated: Boolean, pingTimeout: Double, authToken: js.Object = null): OnOpenValue = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isAuthenticated = isAuthenticated.asInstanceOf[js.Any], pingTimeout = pingTimeout.asInstanceOf[js.Any], authToken = authToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnOpenValue]
  }
}

