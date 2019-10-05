package typings.raygun.raygunMod.raygun

import typings.raygun.Anon_Client
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaygunPayload extends js.Object {
  var details: Anon_Client
  var occurredOn: Date
}

object RaygunPayload {
  @scala.inline
  def apply(details: Anon_Client, occurredOn: Date): RaygunPayload = {
    val __obj = js.Dynamic.literal(details = details, occurredOn = occurredOn)
  
    __obj.asInstanceOf[RaygunPayload]
  }
}

