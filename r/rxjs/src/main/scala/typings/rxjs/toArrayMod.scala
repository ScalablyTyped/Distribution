package typings.rxjs

import typings.rxjs.internalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toArrayMod {
  
  @JSImport("rxjs/dist/types/internal/operators/toArray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toArray[T](): OperatorFunction[T, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")().asInstanceOf[OperatorFunction[T, js.Array[T]]]
}
