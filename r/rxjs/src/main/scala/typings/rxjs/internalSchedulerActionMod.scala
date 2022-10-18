package typings.rxjs

import typings.rxjs.distTypesInternalSchedulerMod.Scheduler
import typings.rxjs.distTypesInternalTypesMod.SchedulerAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalSchedulerActionMod {
  
  @JSImport("rxjs/internal/scheduler/Action", "Action")
  @js.native
  open class Action[T] protected ()
    extends typings.rxjs.distTypesInternalSchedulerActionMod.Action[T] {
    def this(
      scheduler: Scheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
    ) = this()
  }
}
