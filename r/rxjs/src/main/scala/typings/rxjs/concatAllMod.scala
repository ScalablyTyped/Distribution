package typings.rxjs

import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concatAllMod {
  
  @JSImport("rxjs/internal/operators/concatAll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concatAll[T](): OperatorFunction[ObservableInput[T], T] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatAll")().asInstanceOf[OperatorFunction[ObservableInput[T], T]]
  
  inline def concatAll_R[R](): OperatorFunction[js.Any, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatAll")().asInstanceOf[OperatorFunction[js.Any, R]]
}
