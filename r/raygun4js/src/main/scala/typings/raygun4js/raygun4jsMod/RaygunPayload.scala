package typings.raygun4js.raygun4jsMod

import typings.raygun4js.Anon_Client
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaygunPayload extends js.Object {
  var Details: Anon_Client
  var OccurredOn: Date
}

object RaygunPayload {
  @scala.inline
  def apply(Details: Anon_Client, OccurredOn: Date): RaygunPayload = {
    val __obj = js.Dynamic.literal(Details = Details, OccurredOn = OccurredOn)
  
    __obj.asInstanceOf[RaygunPayload]
  }
}

