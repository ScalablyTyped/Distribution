package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.PartialObserver
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorDoMod {
  
  @JSImport("rxjs-compat/operator/do", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def `do`[T](next: js.Function1[/* x */ T, Unit]): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("_do")(next.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  inline def `do`[T](next: js.Function1[/* x */ T, Unit], error: js.Function1[/* e */ Any, Unit]): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("_do")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def `do`[T](
    next: js.Function1[/* x */ T, Unit],
    error: js.Function1[/* e */ Any, Unit],
    complete: js.Function0[Unit]
  ): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("_do")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def `do`[T](next: js.Function1[/* x */ T, Unit], error: Unit, complete: js.Function0[Unit]): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("_do")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def `do`[T](observer: PartialObserver[T]): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("_do")(observer.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
}
