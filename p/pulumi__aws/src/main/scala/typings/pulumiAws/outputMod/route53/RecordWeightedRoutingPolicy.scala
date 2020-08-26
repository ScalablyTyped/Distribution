package typings.pulumiAws.outputMod.route53

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordWeightedRoutingPolicy extends js.Object {
  /**
    * A numeric value indicating the relative weight of the record. See http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-weighted.
    */
  var weight: Double = js.native
}

object RecordWeightedRoutingPolicy {
  @scala.inline
  def apply(weight: Double): RecordWeightedRoutingPolicy = {
    val __obj = js.Dynamic.literal(weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordWeightedRoutingPolicy]
  }
  @scala.inline
  implicit class RecordWeightedRoutingPolicyOps[Self <: RecordWeightedRoutingPolicy] (val x: Self) extends AnyVal {
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
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
  }
  
}

