package typings.pulumiKubernetes.inputMod.extensions.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IDRange provides a min/max of an allowed range of IDs. Deprecated: use IDRange from policy
  * API Group instead.
  */
trait IDRange extends js.Object {
  /**
    * max is the end of the range, inclusive.
    */
  var max: Input[Double]
  /**
    * min is the start of the range, inclusive.
    */
  var min: Input[Double]
}

object IDRange {
  @scala.inline
  def apply(max: Input[Double], min: Input[Double]): IDRange = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDRange]
  }
}

