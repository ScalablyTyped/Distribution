package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/every", JSImport.Namespace)
@js.native
object everyMod extends js.Object {
  def every[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): OperatorFunction[T, Boolean] = js.native
  def every[T](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
    thisArg: js.Any
  ): OperatorFunction[T, Boolean] = js.native
}

