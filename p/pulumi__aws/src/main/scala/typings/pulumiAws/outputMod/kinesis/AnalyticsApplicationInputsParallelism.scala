package typings.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationInputsParallelism extends js.Object {
  /**
    * The Count of streams.
    */
  var count: Double = js.native
}

object AnalyticsApplicationInputsParallelism {
  @scala.inline
  def apply(count: Double): AnalyticsApplicationInputsParallelism = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputsParallelism]
  }
}

