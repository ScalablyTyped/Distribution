package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayRuntimeStrings.available
import typings.relayRuntime.relayRuntimeStrings.missing
import typings.relayRuntime.relayRuntimeStrings.stale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.anon.FetchTime
  - typings.relayRuntime.anon.Status
  - typings.relayRuntime.anon.`0`
*/
trait OperationAvailability extends js.Object

object OperationAvailability {
  @scala.inline
  def FetchTime(status: available, fetchTime: js.UndefOr[Null | Double] = js.undefined): OperationAvailability = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchTime)) __obj.updateDynamic("fetchTime")(fetchTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationAvailability]
  }
  @scala.inline
  def Status(status: stale): OperationAvailability = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationAvailability]
  }
  @scala.inline
  def `0`(status: missing): OperationAvailability = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationAvailability]
  }
}

