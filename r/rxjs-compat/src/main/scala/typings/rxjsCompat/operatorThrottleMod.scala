package typings.rxjsCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs-compat/operator/throttle", JSImport.Namespace)
@js.native
object operatorThrottleMod extends js.Object {
  def throttle[T](
    durationSelector: js.Function1[
      /* value */ T, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<any> */ _
    ]
  ): js.Any = js.native
  def throttle[T](
    durationSelector: js.Function1[
      /* value */ T, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<any> */ _
    ],
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThrottleConfig */ js.Any
  ): js.Any = js.native
}

