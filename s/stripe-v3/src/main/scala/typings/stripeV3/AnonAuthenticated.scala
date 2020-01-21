package typings.stripeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthenticated extends js.Object {
  var authenticated: Boolean
}

object AnonAuthenticated {
  @scala.inline
  def apply(authenticated: Boolean): AnonAuthenticated = {
    val __obj = js.Dynamic.literal(authenticated = authenticated.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAuthenticated]
  }
}

