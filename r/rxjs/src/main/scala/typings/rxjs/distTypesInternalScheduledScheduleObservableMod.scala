package typings.rxjs

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.InteropObservable
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalScheduledScheduleObservableMod {
  
  @JSImport("rxjs/dist/types/internal/scheduled/scheduleObservable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scheduleObservable[T](input: InteropObservable[T], scheduler: SchedulerLike): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleObservable")(input.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
}
