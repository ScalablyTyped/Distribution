package typings.rxjs

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalOperatorsWindowToggleMod {
  
  @JSImport("rxjs/internal/operators/windowToggle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def windowToggle[T, O](
    openings: ObservableInput[O],
    closingSelector: js.Function1[/* openValue */ O, ObservableInput[Any]]
  ): OperatorFunction[T, Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowToggle")(openings.asInstanceOf[js.Any], closingSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Observable[T]]]
}
