package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/windowWhen", JSImport.Namespace)
@js.native
object windowWhenMod extends js.Object {
  
  def windowWhen[T](closingSelector: js.Function0[Observable[_]]): OperatorFunction[T, Observable[T]] = js.native
}
