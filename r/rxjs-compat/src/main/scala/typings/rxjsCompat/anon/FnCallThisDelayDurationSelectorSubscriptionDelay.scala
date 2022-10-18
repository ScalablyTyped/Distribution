package typings.rxjsCompat.anon

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisDelayDurationSelectorSubscriptionDelay extends StObject {
  
  def apply[T](delayDurationSelector: js.Function1[/* value */ T, Observable_[Any]]): Observable_[T] = js.native
  def apply[T](
    delayDurationSelector: js.Function1[/* value */ T, Observable_[Any]],
    subscriptionDelay: Observable_[Any]
  ): Observable_[T] = js.native
}
