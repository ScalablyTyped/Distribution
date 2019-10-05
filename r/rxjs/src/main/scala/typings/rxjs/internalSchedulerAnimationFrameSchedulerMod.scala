package typings.rxjs

import typings.rxjs.internalSchedulerAsyncSchedulerMod.AsyncScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/scheduler/AnimationFrameScheduler", JSImport.Namespace)
@js.native
object internalSchedulerAnimationFrameSchedulerMod extends js.Object {
  @js.native
  class AnimationFrameScheduler () extends AsyncScheduler {
    def flush(): Unit = js.native
  }
  
}

