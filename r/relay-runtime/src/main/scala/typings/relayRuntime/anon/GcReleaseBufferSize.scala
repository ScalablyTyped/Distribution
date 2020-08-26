package typings.relayRuntime.anon

import typings.relayRuntime.relayStoreTypesMod.OperationLoader
import typings.relayRuntime.relayStoreTypesMod.Scheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GcReleaseBufferSize extends js.Object {
  var gcReleaseBufferSize: js.UndefOr[Double | Null] = js.native
  var gcScheduler: js.UndefOr[Scheduler | Null] = js.native
  var operationLoader: js.UndefOr[OperationLoader | Null] = js.native
  var queryCacheExpirationTime: js.UndefOr[Double | Null] = js.native
}

object GcReleaseBufferSize {
  @scala.inline
  def apply(): GcReleaseBufferSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GcReleaseBufferSize]
  }
  @scala.inline
  implicit class GcReleaseBufferSizeOps[Self <: GcReleaseBufferSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGcReleaseBufferSize(value: Double): Self = this.set("gcReleaseBufferSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGcReleaseBufferSize: Self = this.set("gcReleaseBufferSize", js.undefined)
    @scala.inline
    def setGcReleaseBufferSizeNull: Self = this.set("gcReleaseBufferSize", null)
    @scala.inline
    def setGcScheduler(value: /* callback */ js.Function0[Unit] => Unit): Self = this.set("gcScheduler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGcScheduler: Self = this.set("gcScheduler", js.undefined)
    @scala.inline
    def setGcSchedulerNull: Self = this.set("gcScheduler", null)
    @scala.inline
    def setOperationLoader(value: OperationLoader): Self = this.set("operationLoader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationLoader: Self = this.set("operationLoader", js.undefined)
    @scala.inline
    def setOperationLoaderNull: Self = this.set("operationLoader", null)
    @scala.inline
    def setQueryCacheExpirationTime(value: Double): Self = this.set("queryCacheExpirationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryCacheExpirationTime: Self = this.set("queryCacheExpirationTime", js.undefined)
    @scala.inline
    def setQueryCacheExpirationTimeNull: Self = this.set("queryCacheExpirationTime", null)
  }
  
}

