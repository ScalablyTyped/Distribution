package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationInputsParallelism extends js.Object {
  var count: Input[Double] = js.native
}

object AnalyticsApplicationInputsParallelism {
  @scala.inline
  def apply(count: Input[Double]): AnalyticsApplicationInputsParallelism = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnalyticsApplicationInputsParallelism]
  }
}

