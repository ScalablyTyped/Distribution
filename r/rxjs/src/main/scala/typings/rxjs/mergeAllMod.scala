package typings.rxjs

import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeAllMod {
  
  @JSImport("rxjs/internal/operators/mergeAll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeAll[T](): OperatorFunction[ObservableInput[T], T] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeAll")().asInstanceOf[OperatorFunction[ObservableInput[T], T]]
  inline def mergeAll[T](concurrent: Double): OperatorFunction[ObservableInput[T], T] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeAll")(concurrent.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[ObservableInput[T], T]]
}
