package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.available
import typings.relayRuntime.relayStoreTypesMod.OperationAvailability
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchTime extends OperationAvailability {
  var fetchTime: js.UndefOr[Double | Null] = js.undefined
  var status: available
}

object FetchTime {
  @scala.inline
  def apply(status: available, fetchTime: js.UndefOr[Null | Double] = js.undefined): FetchTime = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchTime)) __obj.updateDynamic("fetchTime")(fetchTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchTime]
  }
}

