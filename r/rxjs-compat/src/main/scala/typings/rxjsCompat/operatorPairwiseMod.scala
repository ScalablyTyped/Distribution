package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorPairwiseMod {
  
  @JSImport("rxjs-compat/operator/pairwise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pairwise[T](): Observable_[js.Tuple2[T, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairwise")().asInstanceOf[Observable_[js.Tuple2[T, T]]]
}
