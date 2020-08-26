package typings.sdpTransform.anon

import typings.sdpTransform.sdpTransformStrings.AS
import typings.sdpTransform.sdpTransformStrings.CT
import typings.sdpTransform.sdpTransformStrings.RR
import typings.sdpTransform.sdpTransformStrings.RS
import typings.sdpTransform.sdpTransformStrings.TIAS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Limit extends js.Object {
  var limit: Double | String = js.native
  var `type`: TIAS | AS | CT | RR | RS = js.native
}

object Limit {
  @scala.inline
  def apply(limit: Double | String, `type`: TIAS | AS | CT | RR | RS): Limit = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limit]
  }
  @scala.inline
  implicit class LimitOps[Self <: Limit] (val x: Self) extends AnyVal {
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
    def setLimit(value: Double | String): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: TIAS | AS | CT | RR | RS): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

