package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.MonoTypeOperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/skipUntil", JSImport.Namespace)
@js.native
object skipUntilMod extends js.Object {
  def skipUntil[T](notifier: Observable[_]): MonoTypeOperatorFunction[T] = js.native
}

