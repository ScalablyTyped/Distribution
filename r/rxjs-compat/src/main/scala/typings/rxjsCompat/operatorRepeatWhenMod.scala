package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorRepeatWhenMod {
  
  @JSImport("rxjs-compat/operator/repeatWhen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def repeatWhen[T](notifier: js.Function1[/* notifications */ Observable_[Any], Observable_[Any]]): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeatWhen")(notifier.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
}
