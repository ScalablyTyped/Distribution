package typings.socketclusterServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBatch extends js.Object {
  var batch: js.UndefOr[Boolean] = js.undefined
}

object AnonBatch {
  @scala.inline
  def apply(batch: js.UndefOr[Boolean] = js.undefined): AnonBatch = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batch)) __obj.updateDynamic("batch")(batch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBatch]
  }
}

