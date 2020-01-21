package typings.rxjs

import typings.rxjs.typesMod.MonoTypeOperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/max", JSImport.Namespace)
@js.native
object maxMod extends js.Object {
  def max[T](): MonoTypeOperatorFunction[T] = js.native
  def max[T](comparer: js.Function2[/* x */ T, /* y */ T, Double]): MonoTypeOperatorFunction[T] = js.native
}

