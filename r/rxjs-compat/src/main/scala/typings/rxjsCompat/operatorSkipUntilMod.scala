package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorSkipUntilMod {
  
  @JSImport("rxjs-compat/operator/skipUntil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def skipUntil[T](notifier: Observable_[Any]): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("skipUntil")(notifier.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
}
