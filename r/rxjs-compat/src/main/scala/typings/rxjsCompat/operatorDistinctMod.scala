package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorDistinctMod {
  
  @JSImport("rxjs-compat/operator/distinct", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def distinct[T, K](): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("distinct")().asInstanceOf[Observable_[T]]
  inline def distinct[T, K](keySelector: js.Function1[/* value */ T, K]): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("distinct")(keySelector.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  inline def distinct[T, K](keySelector: js.Function1[/* value */ T, K], flushes: Observable_[Any]): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("distinct")(keySelector.asInstanceOf[js.Any], flushes.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def distinct[T, K](keySelector: Unit, flushes: Observable_[Any]): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("distinct")(keySelector.asInstanceOf[js.Any], flushes.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
}
