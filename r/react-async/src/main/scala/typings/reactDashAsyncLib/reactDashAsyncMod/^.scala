package typings
package reactDashAsyncLib.reactDashAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-async", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default[T](): reactDashAsyncLib.reactDashAsyncMod.Async[T] = js.native
  def default[T](defaultProps: reactDashAsyncLib.reactDashAsyncMod.AsyncProps[T]): reactDashAsyncLib.reactDashAsyncMod.Async[T] = js.native
  def useAsync[T](arg1: reactDashAsyncLib.PromiseFn[T]): reactDashAsyncLib.reactDashAsyncMod.AsyncState[T] = js.native
  def useAsync[T](arg1: reactDashAsyncLib.PromiseFn[T], arg2: reactDashAsyncLib.reactDashAsyncMod.AsyncOptions[T]): reactDashAsyncLib.reactDashAsyncMod.AsyncState[T] = js.native
  def useAsync[T](arg1: reactDashAsyncLib.reactDashAsyncMod.AsyncOptions[T]): reactDashAsyncLib.reactDashAsyncMod.AsyncState[T] = js.native
  def useAsync[T](
    arg1: reactDashAsyncLib.reactDashAsyncMod.AsyncOptions[T],
    arg2: reactDashAsyncLib.reactDashAsyncMod.AsyncOptions[T]
  ): reactDashAsyncLib.reactDashAsyncMod.AsyncState[T] = js.native
  def useFetch[T](input: java.lang.String): reactDashAsyncLib.reactDashAsyncMod.AsyncState[T] = js.native
  def useFetch[T](input: java.lang.String, init: reactDashAsyncLib.reactDashAsyncMod.FetchInit): reactDashAsyncLib.reactDashAsyncMod.AsyncState[T] = js.native
  def useFetch[T](
    input: java.lang.String,
    init: reactDashAsyncLib.reactDashAsyncMod.FetchInit,
    options: reactDashAsyncLib.reactDashAsyncMod.AsyncOptions[T]
  ): reactDashAsyncLib.reactDashAsyncMod.AsyncState[T] = js.native
  def useFetch[T](input: stdLib.Request): reactDashAsyncLib.reactDashAsyncMod.AsyncState[T] = js.native
  def useFetch[T](input: stdLib.Request, init: reactDashAsyncLib.reactDashAsyncMod.FetchInit): reactDashAsyncLib.reactDashAsyncMod.AsyncState[T] = js.native
  def useFetch[T](
    input: stdLib.Request,
    init: reactDashAsyncLib.reactDashAsyncMod.FetchInit,
    options: reactDashAsyncLib.reactDashAsyncMod.AsyncOptions[T]
  ): reactDashAsyncLib.reactDashAsyncMod.AsyncState[T] = js.native
}

