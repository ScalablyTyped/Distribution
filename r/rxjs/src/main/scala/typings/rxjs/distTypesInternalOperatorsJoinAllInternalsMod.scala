package typings.rxjs

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalOperatorsJoinAllInternalsMod {
  
  @JSImport("rxjs/dist/types/internal/operators/joinAllInternals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def joinAllInternals[T, R](joinFn: js.Function1[/* sources */ js.Array[ObservableInput[T]], Observable[T]]): UnaryFunction[Observable[ObservableInput[T]], Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("joinAllInternals")(joinFn.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction[Observable[ObservableInput[T]], Any]]
  inline def joinAllInternals[T, R](
    joinFn: js.Function1[/* sources */ js.Array[ObservableInput[T]], Observable[T]],
    project: js.Function1[/* repeated */ Any, R]
  ): UnaryFunction[Observable[ObservableInput[T]], Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("joinAllInternals")(joinFn.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction[Observable[ObservableInput[T]], Any]]
}
