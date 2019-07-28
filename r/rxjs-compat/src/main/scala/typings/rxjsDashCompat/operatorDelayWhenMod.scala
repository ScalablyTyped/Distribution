package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/delayWhen", JSImport.Namespace)
@js.native
object operatorDelayWhenMod extends js.Object {
  def delayWhen[T](`this`: Observable[T], delayDurationSelector: js.Function1[/* value */ T, Observable[_]]): Observable[T] = js.native
  def delayWhen[T](
    `this`: Observable[T],
    delayDurationSelector: js.Function1[/* value */ T, Observable[_]],
    subscriptionDelay: Observable[_]
  ): Observable[T] = js.native
}

