package typings.recurlyRecurlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataCollector extends js.Object {
  var dataCollector: js.UndefOr[Boolean] = js.undefined
}

object DataCollector {
  @scala.inline
  def apply(dataCollector: js.UndefOr[Boolean] = js.undefined): DataCollector = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dataCollector)) __obj.updateDynamic("dataCollector")(dataCollector.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCollector]
  }
}

