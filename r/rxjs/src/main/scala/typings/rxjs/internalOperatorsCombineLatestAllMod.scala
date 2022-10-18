package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalOperatorsCombineLatestAllMod {
  
  @JSImport("rxjs/internal/operators/combineLatestAll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combineLatestAll[T](): OperatorFunction[ObservableInput[T], js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatestAll")().asInstanceOf[OperatorFunction[ObservableInput[T], js.Array[T]]]
  inline def combineLatestAll[R](project: js.Function1[/* repeated */ Any, R]): OperatorFunction[Any, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatestAll")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, R]]
  
  inline def combineLatestAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): OperatorFunction[ObservableInput[T], R] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatestAll")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[ObservableInput[T], R]]
}
