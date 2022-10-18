package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorConcatMapToMod {
  
  @JSImport("rxjs-compat/operator/concatMapTo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concatMapTo[T, R](innerObservable: Observable_[R]): Observable_[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(innerObservable.asInstanceOf[js.Any]).asInstanceOf[Observable_[R]]
}
