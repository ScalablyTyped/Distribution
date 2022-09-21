package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.internalTypesMod.ObservedValueOf
import typings.rxjs.internalTypesMod.Unsubscribable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usingMod {
  
  @JSImport("rxjs/dist/types/internal/observable/using", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def `using`[T /* <: ObservableInput[Any] */](
    resourceFactory: js.Function0[Unsubscribable | Unit],
    observableFactory: js.Function1[/* resource */ Unsubscribable | Unit, T | Unit]
  ): Observable[ObservedValueOf[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("using")(resourceFactory.asInstanceOf[js.Any], observableFactory.asInstanceOf[js.Any])).asInstanceOf[Observable[ObservedValueOf[T]]]
}
