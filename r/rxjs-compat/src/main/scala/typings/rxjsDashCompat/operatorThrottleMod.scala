package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.SubscribableOrPromise
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/throttle", JSImport.Namespace)
@js.native
object operatorThrottleMod extends js.Object {
  def throttle[T](`this`: Observable[T], durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[_]]): Observable[T] = js.native
  def throttle[T](
    `this`: Observable[T],
    durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[_]],
    config: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ThrottleConfig */ js.Any
  ): Observable[T] = js.native
}

