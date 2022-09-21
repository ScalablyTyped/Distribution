package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.internalTypesMod.ReadableStreamLike
import typings.rxjs.internalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scheduleReadableStreamLikeMod {
  
  @JSImport("rxjs/dist/types/internal/scheduled/scheduleReadableStreamLike", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scheduleReadableStreamLike[T](input: ReadableStreamLike[T], scheduler: SchedulerLike): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleReadableStreamLike")(input.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
}
