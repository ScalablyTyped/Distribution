package typings.solidDashAuthDashClient.solidDashAuthDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  var webId: String
}

object Session {
  @scala.inline
  def apply(webId: String): Session = {
    val __obj = js.Dynamic.literal(webId = webId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Session]
  }
}

