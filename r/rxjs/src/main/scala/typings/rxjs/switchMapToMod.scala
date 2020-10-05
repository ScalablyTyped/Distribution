package typings.rxjs

import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/switchMapTo", JSImport.Namespace)
@js.native
object switchMapToMod extends js.Object {
  def switchMapTo[R](observable: ObservableInput[R]): OperatorFunction[_, R] = js.native
  def switchMapTo[T, R](observable: ObservableInput[R], resultSelector: js.UndefOr[scala.Nothing]): OperatorFunction[T, R] = js.native
  def switchMapTo[T, I, R](
    observable: ObservableInput[I],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ I, 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = js.native
}

