package typings.atPulumiAws.typesInputMod.kinesis

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationInputsParallelism extends js.Object {
  var count: Input[Double]
}

object AnalyticsApplicationInputsParallelism {
  @scala.inline
  def apply(count: Input[Double]): AnalyticsApplicationInputsParallelism = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnalyticsApplicationInputsParallelism]
  }
}

