package typings.recurlyRecurlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataCollector extends js.Object {
  var dataCollector: js.UndefOr[Boolean] = js.undefined
}

object AnonDataCollector {
  @scala.inline
  def apply(dataCollector: js.UndefOr[Boolean] = js.undefined): AnonDataCollector = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dataCollector)) __obj.updateDynamic("dataCollector")(dataCollector.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataCollector]
  }
}

