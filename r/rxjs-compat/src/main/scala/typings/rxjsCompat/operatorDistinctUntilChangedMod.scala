package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorDistinctUntilChangedMod {
  
  @JSImport("rxjs-compat/operator/distinctUntilChanged", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def distinctUntilChanged[T](): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("distinctUntilChanged")().asInstanceOf[Observable_[T]]
  inline def distinctUntilChanged[T](compare: js.Function2[/* x */ T, /* y */ T, Boolean]): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("distinctUntilChanged")(compare.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  inline def distinctUntilChanged[T, K](compare: js.Function2[/* x */ K, /* y */ K, Boolean], keySelector: js.Function1[/* x */ T, K]): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("distinctUntilChanged")(compare.asInstanceOf[js.Any], keySelector.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
}
