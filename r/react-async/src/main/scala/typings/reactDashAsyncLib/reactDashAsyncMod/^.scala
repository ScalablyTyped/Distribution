package typings
package reactDashAsyncLib.reactDashAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-async", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createInstance[T](): org.scalablytyped.runtime.Instantiable0[Async[T]] with reactDashAsyncLib.Anon_Fulfilled = js.native
  def createInstance[T](defaultProps: AsyncProps[T]): org.scalablytyped.runtime.Instantiable0[Async[T]] with reactDashAsyncLib.Anon_Fulfilled = js.native
  def useAsync[T](arg1: AsyncOptions[T]): AsyncState[T] = js.native
  def useAsync[T](arg1: AsyncOptions[T], arg2: AsyncOptions[T]): AsyncState[T] = js.native
  def useAsync[T](arg1: PromiseFn[T]): AsyncState[T] = js.native
  def useAsync[T](arg1: PromiseFn[T], arg2: AsyncOptions[T]): AsyncState[T] = js.native
  def useFetch[T](input: stdLib.RequestInfo): AsyncState[T] = js.native
  def useFetch[T](input: stdLib.RequestInfo, init: stdLib.RequestInit): AsyncState[T] = js.native
  def useFetch[T](input: stdLib.RequestInfo, init: stdLib.RequestInit, options: FetchOptions[T]): AsyncState[T] = js.native
}

