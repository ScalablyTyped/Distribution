package typings.pulumiAws.outputMod.batch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobDefinitionRetryStrategy extends js.Object {
  var attempts: js.UndefOr[Double] = js.native
}

object JobDefinitionRetryStrategy {
  @scala.inline
  def apply(attempts: js.UndefOr[Double] = js.undefined): JobDefinitionRetryStrategy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attempts)) __obj.updateDynamic("attempts")(attempts.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobDefinitionRetryStrategy]
  }
}

