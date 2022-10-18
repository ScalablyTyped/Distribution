package typings.rxjs

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalScheduledScheduledMod {
  
  @JSImport("rxjs/dist/types/internal/scheduled/scheduled", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scheduled[T](input: ObservableInput[T], scheduler: SchedulerLike): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduled")(input.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
}
