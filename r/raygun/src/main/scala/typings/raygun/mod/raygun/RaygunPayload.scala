package typings.raygun.mod.raygun

import typings.raygun.anon.Client
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaygunPayload extends js.Object {
  var details: Client
  var occurredOn: Date
}

object RaygunPayload {
  @scala.inline
  def apply(details: Client, occurredOn: Date): RaygunPayload = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], occurredOn = occurredOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaygunPayload]
  }
}

