package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsIsEmptyMod {
  
  @JSImport("rxjs-compat/operators/isEmpty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isEmpty[T](): OperatorFunction[T, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")().asInstanceOf[OperatorFunction[T, Boolean]]
}
