package typings.rxjsCompat

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.ObservedValueOf
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableFromPromiseMod {
  
  @JSImport("rxjs-compat/observable/fromPromise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromPromise[O /* <: ObservableInput[Any] */](input: O): Observable[ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPromise")(input.asInstanceOf[js.Any]).asInstanceOf[Observable[ObservedValueOf[O]]]
  inline def fromPromise[O /* <: ObservableInput[Any] */](input: O, scheduler: SchedulerLike): Observable[ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPromise")(input.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[ObservedValueOf[O]]]
}
