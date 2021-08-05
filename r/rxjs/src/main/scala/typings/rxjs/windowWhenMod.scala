package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windowWhenMod {
  
  @JSImport("rxjs/internal/operators/windowWhen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def windowWhen[T](closingSelector: js.Function0[Observable[js.Any]]): OperatorFunction[T, Observable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("windowWhen")(closingSelector.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Observable[T]]]
}
