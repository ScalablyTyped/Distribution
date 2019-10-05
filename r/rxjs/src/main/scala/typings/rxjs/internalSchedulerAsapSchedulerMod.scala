package typings.rxjs

import typings.rxjs.internalSchedulerAsyncSchedulerMod.AsyncScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/scheduler/AsapScheduler", JSImport.Namespace)
@js.native
object internalSchedulerAsapSchedulerMod extends js.Object {
  @js.native
  class AsapScheduler () extends AsyncScheduler {
    def flush(): Unit = js.native
  }
  
}

