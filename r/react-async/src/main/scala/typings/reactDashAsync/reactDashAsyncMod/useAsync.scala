package typings.reactDashAsync.reactDashAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-async", "useAsync")
@js.native
object useAsync extends js.Object {
  def apply[T](arg1: AsyncOptions[T]): AsyncState[T] = js.native
  def apply[T](arg1: AsyncOptions[T], arg2: AsyncOptions[T]): AsyncState[T] = js.native
  def apply[T](arg1: PromiseFn[T]): AsyncState[T] = js.native
  def apply[T](arg1: PromiseFn[T], arg2: AsyncOptions[T]): AsyncState[T] = js.native
}

