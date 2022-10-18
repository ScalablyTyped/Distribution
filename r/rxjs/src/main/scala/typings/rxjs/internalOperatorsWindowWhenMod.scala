package typings.rxjs

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalOperatorsWindowWhenMod {
  
  @JSImport("rxjs/internal/operators/windowWhen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def windowWhen[T](closingSelector: js.Function0[ObservableInput[Any]]): OperatorFunction[T, Observable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("windowWhen")(closingSelector.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Observable[T]]]
}
