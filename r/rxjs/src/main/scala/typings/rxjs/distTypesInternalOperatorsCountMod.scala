package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalOperatorsCountMod {
  
  @JSImport("rxjs/dist/types/internal/operators/count", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def count[T](): OperatorFunction[T, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")().asInstanceOf[OperatorFunction[T, Double]]
  inline def count[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): OperatorFunction[T, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Double]]
}
