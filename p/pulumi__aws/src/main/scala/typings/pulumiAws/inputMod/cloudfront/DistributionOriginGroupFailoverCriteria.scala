package typings.pulumiAws.inputMod.cloudfront

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionOriginGroupFailoverCriteria extends js.Object {
  /**
    * A list of HTTP status codes for the origin group
    */
  var statusCodes: Input[js.Array[Input[Double]]] = js.native
}

object DistributionOriginGroupFailoverCriteria {
  @scala.inline
  def apply(statusCodes: Input[js.Array[Input[Double]]]): DistributionOriginGroupFailoverCriteria = {
    val __obj = js.Dynamic.literal(statusCodes = statusCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionOriginGroupFailoverCriteria]
  }
  @scala.inline
  implicit class DistributionOriginGroupFailoverCriteriaOps[Self <: DistributionOriginGroupFailoverCriteria] (val x: Self) extends AnyVal {
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
    def setStatusCodesVarargs(value: Input[Double]*): Self = this.set("statusCodes", js.Array(value :_*))
    @scala.inline
    def setStatusCodes(value: Input[js.Array[Input[Double]]]): Self = this.set("statusCodes", value.asInstanceOf[js.Any])
  }
  
}

