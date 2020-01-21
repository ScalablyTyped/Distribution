package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/bufferWhen", JSImport.Namespace)
@js.native
object bufferWhenMod extends js.Object {
  def bufferWhen[T](closingSelector: js.Function0[Observable[_]]): OperatorFunction[T, js.Array[T]] = js.native
}

