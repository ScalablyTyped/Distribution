package typings.rxjs

import typings.rxjs.typesMod.MonoTypeOperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/throwIfEmpty", JSImport.Namespace)
@js.native
object throwIfEmptyMod extends js.Object {
  
  def throwIfEmpty[T](): MonoTypeOperatorFunction[T] = js.native
  def throwIfEmpty[T](errorFactory: js.Function0[_]): MonoTypeOperatorFunction[T] = js.native
}
