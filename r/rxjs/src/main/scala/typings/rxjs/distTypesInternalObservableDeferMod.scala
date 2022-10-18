package typings.rxjs

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.ObservedValueOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalObservableDeferMod {
  
  @JSImport("rxjs/dist/types/internal/observable/defer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defer[R /* <: ObservableInput[Any] */](observableFactory: js.Function0[R]): Observable[ObservedValueOf[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")(observableFactory.asInstanceOf[js.Any]).asInstanceOf[Observable[ObservedValueOf[R]]]
}
