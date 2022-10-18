package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalOperatorsPairwiseMod {
  
  @JSImport("rxjs/dist/types/internal/operators/pairwise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pairwise[T](): OperatorFunction[T, js.Tuple2[T, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairwise")().asInstanceOf[OperatorFunction[T, js.Tuple2[T, T]]]
}
