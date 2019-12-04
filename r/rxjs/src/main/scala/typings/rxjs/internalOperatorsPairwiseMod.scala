package typings.rxjs

import typings.rxjs.internalTypesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/pairwise", JSImport.Namespace)
@js.native
object internalOperatorsPairwiseMod extends js.Object {
  def pairwise[T](): OperatorFunction[T, js.Tuple2[T, T]] = js.native
}

