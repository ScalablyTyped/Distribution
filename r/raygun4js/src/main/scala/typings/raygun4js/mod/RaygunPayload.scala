package typings.raygun4js.mod

import typings.raygun4js.anon.Client
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaygunPayload extends js.Object {
  var Details: Client = js.native
  var OccurredOn: Date = js.native
}

object RaygunPayload {
  @scala.inline
  def apply(Details: Client, OccurredOn: Date): RaygunPayload = {
    val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], OccurredOn = OccurredOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaygunPayload]
  }
  @scala.inline
  implicit class RaygunPayloadOps[Self <: RaygunPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDetails(value: Client): Self = this.set("Details", value.asInstanceOf[js.Any])
    @scala.inline
    def setOccurredOn(value: Date): Self = this.set("OccurredOn", value.asInstanceOf[js.Any])
  }
  
}

