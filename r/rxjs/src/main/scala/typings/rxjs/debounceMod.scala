package typings.rxjs

import typings.rxjs.typesMod.MonoTypeOperatorFunction
import typings.rxjs.typesMod.SubscribableOrPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/debounce", JSImport.Namespace)
@js.native
object debounceMod extends js.Object {
  def debounce[T](durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[_]]): MonoTypeOperatorFunction[T] = js.native
}

