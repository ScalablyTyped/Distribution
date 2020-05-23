package typings.pulumiAws.outputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobExecutionProperty extends js.Object {
  /**
    * The maximum number of concurrent runs allowed for a job. The default is 1.
    */
  var maxConcurrentRuns: js.UndefOr[Double] = js.native
}

object JobExecutionProperty {
  @scala.inline
  def apply(maxConcurrentRuns: js.UndefOr[Double] = js.undefined): JobExecutionProperty = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxConcurrentRuns)) __obj.updateDynamic("maxConcurrentRuns")(maxConcurrentRuns.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobExecutionProperty]
  }
}

