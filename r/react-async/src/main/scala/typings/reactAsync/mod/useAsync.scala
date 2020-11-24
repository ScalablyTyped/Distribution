package typings.reactAsync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-async", "useAsync")
@js.native
object useAsync extends js.Object {
  
  def apply[T](options: AsyncOptions[T]): AsyncState[T, AbstractState[T]] = js.native
  def apply[T](promiseFn: PromiseFn[T]): AsyncState[T, AbstractState[T]] = js.native
  def apply[T](promiseFn: PromiseFn[T], options: AsyncOptions[T]): AsyncState[T, AbstractState[T]] = js.native
}
