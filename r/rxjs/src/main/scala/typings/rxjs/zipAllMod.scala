package typings.rxjs

import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zipAllMod {
  
  @JSImport("rxjs/internal/operators/zipAll", "zipAll")
  @js.native
  def zipAll[T](): OperatorFunction[ObservableInput[T], js.Array[T]] = js.native
  @JSImport("rxjs/internal/operators/zipAll", "zipAll")
  @js.native
  def zipAll[R](project: js.Function1[/* repeated */ js.Any, R]): OperatorFunction[_, R] = js.native
  @JSImport("rxjs/internal/operators/zipAll", "zipAll")
  @js.native
  def zipAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): OperatorFunction[ObservableInput[T], R] = js.native
}
