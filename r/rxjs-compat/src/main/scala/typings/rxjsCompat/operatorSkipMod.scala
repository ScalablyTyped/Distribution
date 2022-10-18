package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorSkipMod {
  
  @JSImport("rxjs-compat/operator/skip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def skip[T](count: Double): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("skip")(count.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
}
