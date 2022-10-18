package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsDefaultIfEmptyMod {
  
  @JSImport("rxjs-compat/operators/defaultIfEmpty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultIfEmpty[T, R](defaultValue: R): OperatorFunction[T, T | R] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultIfEmpty")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | R]]
}
