package typings.serverless.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OriginProtocolPolicy extends js.Object {
  var OriginProtocolPolicy: String = js.native
}

object OriginProtocolPolicy {
  @scala.inline
  def apply(OriginProtocolPolicy: String): OriginProtocolPolicy = {
    val __obj = js.Dynamic.literal(OriginProtocolPolicy = OriginProtocolPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginProtocolPolicy]
  }
  @scala.inline
  implicit class OriginProtocolPolicyOps[Self <: OriginProtocolPolicy] (val x: Self) extends AnyVal {
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
    def setOriginProtocolPolicy(value: String): Self = this.set("OriginProtocolPolicy", value.asInstanceOf[js.Any])
  }
  
}

