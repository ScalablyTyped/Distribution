package typings.rxjs

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalScheduledScheduleAsyncIterableMod {
  
  @JSImport("rxjs/internal/scheduled/scheduleAsyncIterable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scheduleAsyncIterable[T](input: AsyncIterable[T], scheduler: SchedulerLike): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleAsyncIterable")(input.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
}
