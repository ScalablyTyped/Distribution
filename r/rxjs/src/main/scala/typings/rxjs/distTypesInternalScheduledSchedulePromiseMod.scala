package typings.rxjs

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalScheduledSchedulePromiseMod {
  
  @JSImport("rxjs/dist/types/internal/scheduled/schedulePromise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def schedulePromise[T](input: PromiseLike[T], scheduler: SchedulerLike): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("schedulePromise")(input.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
}
