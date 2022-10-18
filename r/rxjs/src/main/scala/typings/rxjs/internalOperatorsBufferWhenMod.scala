package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalOperatorsBufferWhenMod {
  
  @JSImport("rxjs/internal/operators/bufferWhen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bufferWhen[T](closingSelector: js.Function0[ObservableInput[Any]]): OperatorFunction[T, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferWhen")(closingSelector.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.Array[T]]]
}
