package typings.reactNativeAuth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var clientId: String
  var domain: String
}

object Options {
  @scala.inline
  def apply(clientId: String, domain: String): Options = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

