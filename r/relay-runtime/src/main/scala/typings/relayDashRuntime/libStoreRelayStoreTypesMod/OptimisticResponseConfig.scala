package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.PayloadData
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
    response: PayloadData = null,
    updater: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit = null
  ): OptimisticResponseConfig = {
    val __obj = js.Dynamic.literal(operation = operation)
    if (response != null) __obj.updateDynamic("response")(response)
    if (updater != null) __obj.updateDynamic("updater")(js.Any.fromFunction2(updater))
    __obj.asInstanceOf[OptimisticResponseConfig]
  }
}

