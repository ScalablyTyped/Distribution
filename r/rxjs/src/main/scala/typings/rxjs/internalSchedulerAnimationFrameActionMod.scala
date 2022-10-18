package typings.rxjs

import typings.rxjs.distTypesInternalSchedulerAnimationFrameSchedulerMod.AnimationFrameScheduler
import typings.rxjs.distTypesInternalTypesMod.SchedulerAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalSchedulerAnimationFrameActionMod {
  
  @JSImport("rxjs/internal/scheduler/AnimationFrameAction", "AnimationFrameAction")
  @js.native
  open class AnimationFrameAction[T] protected ()
    extends typings.rxjs.distTypesInternalSchedulerAnimationFrameActionMod.AnimationFrameAction[T] {
    def this(
      scheduler: AnimationFrameScheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
    ) = this()
  }
}
