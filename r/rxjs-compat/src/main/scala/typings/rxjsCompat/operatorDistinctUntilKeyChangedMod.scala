package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorDistinctUntilKeyChangedMod {
  
  @JSImport("rxjs-compat/operator/distinctUntilKeyChanged", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def distinctUntilKeyChanged[T](key: /* keyof T */ String): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("distinctUntilKeyChanged")(key.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  inline def distinctUntilKeyChanged[T, K /* <: /* keyof T */ String */](
    key: K,
    compare: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* x */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* y */ js.Any, 
      Boolean
    ]
  ): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("distinctUntilKeyChanged")(key.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
}
