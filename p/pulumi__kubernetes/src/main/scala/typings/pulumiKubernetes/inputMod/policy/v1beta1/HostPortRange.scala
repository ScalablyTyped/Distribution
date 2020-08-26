package typings.pulumiKubernetes.inputMod.policy.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HostPortRange defines a range of host ports that will be enabled by a policy for pods to use.  It requires both the start and end to be defined.
  */
@js.native
trait HostPortRange extends js.Object {
  /**
    * max is the end of the range, inclusive.
    */
  var max: Input[Double] = js.native
  /**
    * min is the start of the range, inclusive.
    */
  var min: Input[Double] = js.native
}

object HostPortRange {
  @scala.inline
  def apply(max: Input[Double], min: Input[Double]): HostPortRange = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostPortRange]
  }
  @scala.inline
  implicit class HostPortRangeOps[Self <: HostPortRange] (val x: Self) extends AnyVal {
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
    def setMax(value: Input[Double]): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Input[Double]): Self = this.set("min", value.asInstanceOf[js.Any])
  }
  
}

