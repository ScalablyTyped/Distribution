package typings.rxjs

import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/combineAll", JSImport.Namespace)
@js.native
object combineAllMod extends js.Object {
  def combineAll[T](): OperatorFunction[ObservableInput[T], js.Array[T]] = js.native
  def combineAll[R](project: js.Function1[/* repeated */ js.Any, R]): OperatorFunction[_, R] = js.native
  @JSName("combineAll")
  def combineAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): OperatorFunction[ObservableInput[T], R] = js.native
}

