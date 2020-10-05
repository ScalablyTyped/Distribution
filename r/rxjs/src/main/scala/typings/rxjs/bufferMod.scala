package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/buffer", JSImport.Namespace)
@js.native
object bufferMod extends js.Object {
  def buffer[T](closingNotifier: Observable[_]): OperatorFunction[T, js.Array[T]] = js.native
}

