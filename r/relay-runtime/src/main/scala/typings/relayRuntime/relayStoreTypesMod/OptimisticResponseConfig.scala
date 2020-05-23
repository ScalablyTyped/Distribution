package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayNetworkTypesMod.PayloadData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptimisticResponseConfig extends js.Object {
  val operation: OperationDescriptor
  val response: js.UndefOr[PayloadData | Null] = js.undefined
  val updater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.undefined
}

object OptimisticResponseConfig {
  @scala.inline
  def apply(
    operation: OperationDescriptor,
    response: js.UndefOr[Null | PayloadData] = js.undefined,
    updater: js.UndefOr[Null | ((/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit)] = js.undefined
  ): OptimisticResponseConfig = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    if (!js.isUndefined(response)) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (!js.isUndefined(updater)) __obj.updateDynamic("updater")(if (updater != null) js.Any.fromFunction2(updater.asInstanceOf[(/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit]) else null)
    __obj.asInstanceOf[OptimisticResponseConfig]
  }
}

