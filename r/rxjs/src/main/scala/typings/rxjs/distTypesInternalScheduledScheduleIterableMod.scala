package typings.rxjs

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalScheduledScheduleIterableMod {
  
  @JSImport("rxjs/dist/types/internal/scheduled/scheduleIterable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scheduleIterable[T](input: js.Iterable[T], scheduler: SchedulerLike): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleIterable")(input.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
}
