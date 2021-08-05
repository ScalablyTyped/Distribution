package typings.rxjs

import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zipAllMod {
  
  @JSImport("rxjs/internal/operators/zipAll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def zipAll[T](): OperatorFunction[ObservableInput[T], js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zipAll")().asInstanceOf[OperatorFunction[ObservableInput[T], js.Array[T]]]
  inline def zipAll[R](project: js.Function1[/* repeated */ js.Any, R]): OperatorFunction[js.Any, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("zipAll")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[js.Any, R]]
  
  inline def zipAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): OperatorFunction[ObservableInput[T], R] = ^.asInstanceOf[js.Dynamic].applyDynamic("zipAll")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[ObservableInput[T], R]]
}
