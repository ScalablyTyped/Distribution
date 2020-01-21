package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.MonoTypeOperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/takeUntil", JSImport.Namespace)
@js.native
object takeUntilMod extends js.Object {
  def takeUntil[T](notifier: Observable[_]): MonoTypeOperatorFunction[T] = js.native
}

