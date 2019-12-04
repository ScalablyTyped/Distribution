package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.internalTypesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/windowToggle", JSImport.Namespace)
@js.native
object internalOperatorsWindowToggleMod extends js.Object {
  def windowToggle[T, O](openings: Observable[O], closingSelector: js.Function1[/* openValue */ O, Observable[_]]): OperatorFunction[T, Observable[T]] = js.native
}

