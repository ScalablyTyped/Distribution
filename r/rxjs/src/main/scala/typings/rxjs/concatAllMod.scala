package typings.rxjs

import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/concatAll", JSImport.Namespace)
@js.native
object concatAllMod extends js.Object {
  def concatAll[T](): OperatorFunction[ObservableInput[T], T] = js.native
  @JSName("concatAll")
  def concatAll_R[R](): OperatorFunction[_, R] = js.native
}

