package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.internalTypesMod.ObservedValueOf
import typings.rxjs.internalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromMod {
  
  @JSImport("rxjs/dist/types/internal/observable/from", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def from[O /* <: ObservableInput[Any] */](input: O): Observable[ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(input.asInstanceOf[js.Any]).asInstanceOf[Observable[ObservedValueOf[O]]]
  inline def from[O /* <: ObservableInput[Any] */](input: O, scheduler: SchedulerLike): Observable[ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(input.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[ObservedValueOf[O]]]
}
