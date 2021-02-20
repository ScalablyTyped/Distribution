package typings.rxjs

import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object switchMapToMod {
  
  @JSImport("rxjs/internal/operators/switchMapTo", "switchMapTo")
  @js.native
  def switchMapTo[R](observable: ObservableInput[R]): OperatorFunction[_, R] = js.native
  @JSImport("rxjs/internal/operators/switchMapTo", "switchMapTo")
  @js.native
  def switchMapTo[T, R](observable: ObservableInput[R], resultSelector: js.UndefOr[scala.Nothing]): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators/switchMapTo", "switchMapTo")
  @js.native
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
