package typings.reduxDashApiDashMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Payload[Payload] extends js.Object {
  var payload: Payload
}

object Anon_Payload {
  @scala.inline
  def apply[Payload](payload: Payload): Anon_Payload[Payload] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Payload[Payload]]
  }
}

