package typings.rxjs

import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object switchAllMod {
  
  @JSImport("rxjs/internal/operators/switchAll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def switchAll[T](): OperatorFunction[ObservableInput[T], T] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchAll")().asInstanceOf[OperatorFunction[ObservableInput[T], T]]
  
  inline def switchAll_R[R](): OperatorFunction[js.Any, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchAll")().asInstanceOf[OperatorFunction[js.Any, R]]
}
