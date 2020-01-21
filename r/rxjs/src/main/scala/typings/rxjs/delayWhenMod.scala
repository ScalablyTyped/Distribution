package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.MonoTypeOperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/delayWhen", JSImport.Namespace)
@js.native
object delayWhenMod extends js.Object {
  def delayWhen[T](
    delayDurationSelector: js.Function2[/* value */ T, /* index */ Double, Observable[_ | scala.Nothing]]
  ): MonoTypeOperatorFunction[T] = js.native
  def delayWhen[T](
    delayDurationSelector: js.Function2[/* value */ T, /* index */ Double, Observable[_ | scala.Nothing]],
    subscriptionDelay: Observable[_]
  ): MonoTypeOperatorFunction[T] = js.native
}

