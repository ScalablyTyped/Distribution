package typings
package reactDashAsyncLib.reactDashAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-async", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default[T](): Async[T] = js.native
  def default[T](defaultProps: AsyncProps[T]): Async[T] = js.native
  def useAsync[T](arg1: reactDashAsyncLib.PromiseFn[T]): AsyncState[T] = js.native
  def useAsync[T](arg1: reactDashAsyncLib.PromiseFn[T], arg2: AsyncOptions[T]): AsyncState[T] = js.native
  def useAsync[T](arg1: AsyncOptions[T]): AsyncState[T] = js.native
  def useAsync[T](arg1: AsyncOptions[T], arg2: AsyncOptions[T]): AsyncState[T] = js.native
  def useFetch[T](input: java.lang.String): AsyncState[T] = js.native
  def useFetch[T](input: java.lang.String, init: FetchInit): AsyncState[T] = js.native
  def useFetch[T](input: java.lang.String, init: FetchInit, options: FetchOptions[T]): AsyncState[T] = js.native
  def useFetch[T](input: stdLib.Request): AsyncState[T] = js.native
  def useFetch[T](input: stdLib.Request, init: FetchInit): AsyncState[T] = js.native
  def useFetch[T](input: stdLib.Request, init: FetchInit, options: FetchOptions[T]): AsyncState[T] = js.native
}

