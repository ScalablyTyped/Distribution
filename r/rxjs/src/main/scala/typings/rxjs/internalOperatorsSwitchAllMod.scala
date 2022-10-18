package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.ObservedValueOf
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalOperatorsSwitchAllMod {
  
  @JSImport("rxjs/internal/operators/switchAll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def switchAll[O /* <: ObservableInput[Any] */](): OperatorFunction[O, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchAll")().asInstanceOf[OperatorFunction[O, ObservedValueOf[O]]]
}
