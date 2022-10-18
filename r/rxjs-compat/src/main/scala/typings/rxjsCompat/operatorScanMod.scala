package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorScanMod {
  
  @JSImport("rxjs-compat/operator/scan", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scan[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T]): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("scan")(accumulator.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  inline def scan[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T], seed: T): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  
  inline def scan_TR[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R]): Observable_[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("scan")(accumulator.asInstanceOf[js.Any]).asInstanceOf[Observable_[R]]
  inline def scan_TR[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R], seed: R): Observable_[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Observable_[R]]
}
