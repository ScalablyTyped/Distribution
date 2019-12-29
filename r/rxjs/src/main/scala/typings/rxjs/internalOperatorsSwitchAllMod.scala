package typings.rxjs

import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.internalTypesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/switchAll", JSImport.Namespace)
@js.native
object internalOperatorsSwitchAllMod extends js.Object {
  def switchAll[R](): OperatorFunction[_, R] = js.native
  @JSName("switchAll")
  def switchAll_T[T](): OperatorFunction[ObservableInput[T], T] = js.native
}

