package typings.rxjsCompat

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.ObservedValueOf
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsCatchErrorMod {
  
  @JSImport("rxjs-compat/operators/catchError", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def catchError[T, O /* <: ObservableInput[Any] */](selector: js.Function2[/* err */ Any, /* caught */ Observable[T], O]): OperatorFunction[T, T | ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("catchError")(selector.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | ObservedValueOf[O]]]
}
