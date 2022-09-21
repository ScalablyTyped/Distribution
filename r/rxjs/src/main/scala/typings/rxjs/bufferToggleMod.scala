package typings.rxjs

import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.internalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferToggleMod {
  
  @JSImport("rxjs/dist/types/internal/operators/bufferToggle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bufferToggle[T, O](openings: ObservableInput[O], closingSelector: js.Function1[/* value */ O, ObservableInput[Any]]): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferToggle")(openings.asInstanceOf[js.Any], closingSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
}
