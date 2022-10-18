package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsCombineAllMod {
  
  @JSImport("rxjs-compat/operators/combineAll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combineAll[T](): OperatorFunction[Any, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineAll")().asInstanceOf[OperatorFunction[Any, js.Array[T]]]
  inline def combineAll[R](project: js.Function1[/* repeated */ Any, R]): OperatorFunction[Any, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineAll")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, R]]
  
  inline def combineAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): OperatorFunction[ObservableInput[T], R] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineAll")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[ObservableInput[T], R]]
}
