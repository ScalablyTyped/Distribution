package typings.atPulumiKubernetes.typesInputMod.policy.v1beta1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HostPortRange defines a range of host ports that will be enabled by a policy for pods to use.
  * It requires both the start and end to be defined.
  */
trait HostPortRange extends js.Object {
  /**
    * max is the end of the range, inclusive.
    */
  var max: Input[Double]
  /**
    * min is the start of the range, inclusive.
    */
  var min: Input[Double]
}

object HostPortRange {
  @scala.inline
  def apply(max: Input[Double], min: Input[Double]): HostPortRange = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HostPortRange]
  }
}

