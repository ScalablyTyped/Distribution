package typings.rxjs

import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/mergeAll", JSImport.Namespace)
@js.native
object mergeAllMod extends js.Object {
  def mergeAll[T](): OperatorFunction[ObservableInput[T], T] = js.native
  def mergeAll[T](concurrent: Double): OperatorFunction[ObservableInput[T], T] = js.native
}

