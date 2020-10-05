package typings.rxjs

import typings.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/pairwise", JSImport.Namespace)
@js.native
object pairwiseMod extends js.Object {
  def pairwise[T](): OperatorFunction[T, js.Tuple2[T, T]] = js.native
}

