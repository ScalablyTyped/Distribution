package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/window", JSImport.Namespace)
@js.native
object windowMod extends js.Object {
  def window[T](windowBoundaries: Observable[_]): OperatorFunction[T, Observable[T]] = js.native
}

