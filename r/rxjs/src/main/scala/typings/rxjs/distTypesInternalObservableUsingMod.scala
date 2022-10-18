package typings.rxjs

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.ObservedValueOf
import typings.rxjs.distTypesInternalTypesMod.Unsubscribable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalObservableUsingMod {
  
  @JSImport("rxjs/dist/types/internal/observable/using", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def `using`[T /* <: ObservableInput[Any] */](
    resourceFactory: js.Function0[Unsubscribable | Unit],
    observableFactory: js.Function1[/* resource */ Unsubscribable | Unit, T | Unit]
  ): Observable[ObservedValueOf[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("using")(resourceFactory.asInstanceOf[js.Any], observableFactory.asInstanceOf[js.Any])).asInstanceOf[Observable[ObservedValueOf[T]]]
}
