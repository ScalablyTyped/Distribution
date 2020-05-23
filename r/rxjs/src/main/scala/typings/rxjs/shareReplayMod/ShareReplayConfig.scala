package typings.rxjs.shareReplayMod

import typings.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareReplayConfig extends js.Object {
  var bufferSize: js.UndefOr[Double] = js.undefined
  var refCount: Boolean
  var scheduler: js.UndefOr[SchedulerLike] = js.undefined
  var windowTime: js.UndefOr[Double] = js.undefined
}

object ShareReplayConfig {
  @scala.inline
  def apply(
    refCount: Boolean,
    bufferSize: js.UndefOr[Double] = js.undefined,
    scheduler: SchedulerLike = null,
    windowTime: js.UndefOr[Double] = js.undefined
  ): ShareReplayConfig = {
    val __obj = js.Dynamic.literal(refCount = refCount.asInstanceOf[js.Any])
    if (!js.isUndefined(bufferSize)) __obj.updateDynamic("bufferSize")(bufferSize.get.asInstanceOf[js.Any])
    if (scheduler != null) __obj.updateDynamic("scheduler")(scheduler.asInstanceOf[js.Any])
    if (!js.isUndefined(windowTime)) __obj.updateDynamic("windowTime")(windowTime.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareReplayConfig]
  }
}

