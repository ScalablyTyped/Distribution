package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorDelayWhenMod {
  
  @JSImport("rxjs-compat/operator/delayWhen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def delayWhen[T](delayDurationSelector: js.Function1[/* value */ T, Observable_[Any]]): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("delayWhen")(delayDurationSelector.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  inline def delayWhen[T](
    delayDurationSelector: js.Function1[/* value */ T, Observable_[Any]],
    subscriptionDelay: Observable_[Any]
  ): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("delayWhen")(delayDurationSelector.asInstanceOf[js.Any], subscriptionDelay.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
}
