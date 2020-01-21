package typings.raygun.mod.raygun

import typings.raygun.AnonClient
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaygunPayload extends js.Object {
  var details: AnonClient
  var occurredOn: Date
}

object RaygunPayload {
  @scala.inline
  def apply(details: AnonClient, occurredOn: Date): RaygunPayload = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], occurredOn = occurredOn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RaygunPayload]
  }
}

