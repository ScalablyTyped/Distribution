package typings.rxjs

import typings.rxjs.internalTypesMod.MonoTypeOperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/min", JSImport.Namespace)
@js.native
object internalOperatorsMinMod extends js.Object {
  def min[T](): MonoTypeOperatorFunction[T] = js.native
  def min[T](comparer: js.Function2[/* x */ T, /* y */ T, Double]): MonoTypeOperatorFunction[T] = js.native
}

