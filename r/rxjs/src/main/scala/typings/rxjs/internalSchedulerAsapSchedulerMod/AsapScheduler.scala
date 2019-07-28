package typings.rxjs.internalSchedulerAsapSchedulerMod

import typings.rxjs.internalSchedulerAsyncSchedulerMod.AsyncScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/scheduler/AsapScheduler", "AsapScheduler")
@js.native
class AsapScheduler () extends AsyncScheduler {
  def flush(): Unit = js.native
}

