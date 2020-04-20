package typings.raygun4js.mod

import typings.raygun4js.AnonClient
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaygunPayload extends js.Object {
  var Details: AnonClient
  var OccurredOn: Date
}

object RaygunPayload {
  @scala.inline
  def apply(Details: AnonClient, OccurredOn: Date): RaygunPayload = {
    val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], OccurredOn = OccurredOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaygunPayload]
  }
}

