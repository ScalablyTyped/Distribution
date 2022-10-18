package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorTakeUntilMod {
  
  @JSImport("rxjs-compat/operator/takeUntil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def takeUntil[T](notifier: Observable_[Any]): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeUntil")(notifier.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
}
