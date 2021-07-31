package typings.rxjs

import typings.rxjs.typesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pairwiseMod {
  
  @JSImport("rxjs/internal/operators/pairwise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def pairwise[T](): OperatorFunction[T, js.Tuple2[T, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairwise")().asInstanceOf[OperatorFunction[T, js.Tuple2[T, T]]]
}
