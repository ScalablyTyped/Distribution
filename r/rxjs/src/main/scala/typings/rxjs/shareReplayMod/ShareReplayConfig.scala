package typings.rxjs.shareReplayMod

import typings.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShareReplayConfig extends js.Object {
  var bufferSize: js.UndefOr[Double] = js.native
  var refCount: Boolean = js.native
  var scheduler: js.UndefOr[SchedulerLike] = js.native
  var windowTime: js.UndefOr[Double] = js.native
}

object ShareReplayConfig {
  @scala.inline
  def apply(refCount: Boolean): ShareReplayConfig = {
    val __obj = js.Dynamic.literal(refCount = refCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareReplayConfig]
  }
  @scala.inline
  implicit class ShareReplayConfigOps[Self <: ShareReplayConfig] (val x: Self) extends AnyVal {
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
    def setRefCount(value: Boolean): Self = this.set("refCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setBufferSize(value: Double): Self = this.set("bufferSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBufferSize: Self = this.set("bufferSize", js.undefined)
    @scala.inline
    def setScheduler(value: SchedulerLike): Self = this.set("scheduler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduler: Self = this.set("scheduler", js.undefined)
    @scala.inline
    def setWindowTime(value: Double): Self = this.set("windowTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowTime: Self = this.set("windowTime", js.undefined)
  }
  
}

