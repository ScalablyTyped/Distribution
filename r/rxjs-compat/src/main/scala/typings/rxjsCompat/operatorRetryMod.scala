package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorRetryMod {
  
  @JSImport("rxjs-compat/operator/retry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def retry[T](): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("retry")().asInstanceOf[Observable_[T]]
  inline def retry[T](count: Double): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("retry")(count.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
}
