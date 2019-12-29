package typings.rxjs

import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.internalTypesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/concatAll", JSImport.Namespace)
@js.native
object internalOperatorsConcatAllMod extends js.Object {
  def concatAll[R](): OperatorFunction[_, R] = js.native
  @JSName("concatAll")
  def concatAll_T[T](): OperatorFunction[ObservableInput[T], T] = js.native
}

