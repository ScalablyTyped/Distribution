package typings.rxjs

import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exhaustMod {
  
  @JSImport("rxjs/internal/operators/exhaust", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exhaust[T](): OperatorFunction[ObservableInput[T], T] = ^.asInstanceOf[js.Dynamic].applyDynamic("exhaust")().asInstanceOf[OperatorFunction[ObservableInput[T], T]]
  
  inline def exhaust_R[R](): OperatorFunction[js.Any, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("exhaust")().asInstanceOf[OperatorFunction[js.Any, R]]
}
