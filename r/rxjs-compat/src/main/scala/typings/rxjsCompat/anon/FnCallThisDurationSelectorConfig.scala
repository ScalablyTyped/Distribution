package typings.rxjsCompat.anon

import typings.rxjs.distTypesInternalTypesMod.SubscribableOrPromise
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisDurationSelectorConfig extends StObject {
  
  def apply[T](durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[Any]]): Observable_[T] = js.native
  def apply[T](
    durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[Any]],
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThrottleConfig */ Any
  ): Observable_[T] = js.native
}
