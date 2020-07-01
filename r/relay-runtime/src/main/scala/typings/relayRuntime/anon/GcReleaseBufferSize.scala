package typings.relayRuntime.anon

import typings.relayRuntime.relayStoreTypesMod.OperationLoader
import typings.relayRuntime.relayStoreTypesMod.Scheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GcReleaseBufferSize extends js.Object {
  var gcReleaseBufferSize: js.UndefOr[Double | Null] = js.undefined
  var gcScheduler: js.UndefOr[Scheduler | Null] = js.undefined
  var operationLoader: js.UndefOr[OperationLoader | Null] = js.undefined
  var queryCacheExpirationTime: js.UndefOr[Double | Null] = js.undefined
}

object GcReleaseBufferSize {
  @scala.inline
  def apply(
    gcReleaseBufferSize: js.UndefOr[Null | Double] = js.undefined,
    gcScheduler: js.UndefOr[Null | (/* callback */ js.Function0[Unit] => Unit)] = js.undefined,
    operationLoader: js.UndefOr[Null | OperationLoader] = js.undefined,
    queryCacheExpirationTime: js.UndefOr[Null | Double] = js.undefined
  ): GcReleaseBufferSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gcReleaseBufferSize)) __obj.updateDynamic("gcReleaseBufferSize")(gcReleaseBufferSize.asInstanceOf[js.Any])
    if (!js.isUndefined(gcScheduler)) __obj.updateDynamic("gcScheduler")(if (gcScheduler != null) js.Any.fromFunction1(gcScheduler.asInstanceOf[/* callback */ js.Function0[Unit] => Unit]) else null)
    if (!js.isUndefined(operationLoader)) __obj.updateDynamic("operationLoader")(operationLoader.asInstanceOf[js.Any])
    if (!js.isUndefined(queryCacheExpirationTime)) __obj.updateDynamic("queryCacheExpirationTime")(queryCacheExpirationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GcReleaseBufferSize]
  }
}

