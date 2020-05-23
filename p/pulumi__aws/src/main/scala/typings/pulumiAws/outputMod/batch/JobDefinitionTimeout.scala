package typings.pulumiAws.outputMod.batch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobDefinitionTimeout extends js.Object {
  var attemptDurationSeconds: js.UndefOr[Double] = js.native
}

object JobDefinitionTimeout {
  @scala.inline
  def apply(attemptDurationSeconds: js.UndefOr[Double] = js.undefined): JobDefinitionTimeout = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attemptDurationSeconds)) __obj.updateDynamic("attemptDurationSeconds")(attemptDurationSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobDefinitionTimeout]
  }
}

