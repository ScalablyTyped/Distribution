package typings.rxjs

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.ReadableStreamLike
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalScheduledScheduleReadableStreamLikeMod {
  
  @JSImport("rxjs/internal/scheduled/scheduleReadableStreamLike", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scheduleReadableStreamLike[T](input: ReadableStreamLike[T], scheduler: SchedulerLike): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleReadableStreamLike")(input.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
}
