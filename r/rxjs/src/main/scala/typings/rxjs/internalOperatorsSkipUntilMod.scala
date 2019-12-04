package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.internalTypesMod.MonoTypeOperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/skipUntil", JSImport.Namespace)
@js.native
object internalOperatorsSkipUntilMod extends js.Object {
  def skipUntil[T](notifier: Observable[_]): MonoTypeOperatorFunction[T] = js.native
}

