package typings.relayRuntime

import typings.relayRuntime.relayStoreTypesMod.OperationLoader
import typings.relayRuntime.relayStoreTypesMod.Scheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGcReleaseBufferSize extends js.Object {
  var gcReleaseBufferSize: js.UndefOr[Double | Null] = js.undefined
  var gcScheduler: js.UndefOr[Scheduler | Null] = js.undefined
  var operationLoader: js.UndefOr[OperationLoader | Null] = js.undefined
}

object AnonGcReleaseBufferSize {
  @scala.inline
  def apply(
    gcReleaseBufferSize: Int | Double = null,
    gcScheduler: /* callback */ js.Function0[Unit] => Unit = null,
    operationLoader: OperationLoader = null
  ): AnonGcReleaseBufferSize = {
    val __obj = js.Dynamic.literal()
    if (gcReleaseBufferSize != null) __obj.updateDynamic("gcReleaseBufferSize")(gcReleaseBufferSize.asInstanceOf[js.Any])
    if (gcScheduler != null) __obj.updateDynamic("gcScheduler")(js.Any.fromFunction1(gcScheduler))
    if (operationLoader != null) __obj.updateDynamic("operationLoader")(operationLoader.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGcReleaseBufferSize]
  }
}

