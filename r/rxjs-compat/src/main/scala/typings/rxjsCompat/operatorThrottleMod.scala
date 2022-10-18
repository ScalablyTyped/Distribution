package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.SubscribableOrPromise
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorThrottleMod {
  
  @JSImport("rxjs-compat/operator/throttle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def throttle[T](durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[Any]]): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(durationSelector.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  inline def throttle[T](
    durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[Any]],
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThrottleConfig */ Any
  ): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(durationSelector.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
}
