package typings.rxjs

import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/switchAll", JSImport.Namespace)
@js.native
object switchAllMod extends js.Object {
  def switchAll[T](): OperatorFunction[ObservableInput[T], T] = js.native
  @JSName("switchAll")
  def switchAll_R[R](): OperatorFunction[_, R] = js.native
}

