package typings.reactDashAsync.reactDashAsyncMod

import org.scalablytyped.runtime.Instantiable0
import typings.reactDashAsync.Anon_Fulfilled
import typings.std.RequestInfo
import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-async", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createInstance[T](): Instantiable0[Async[T]] with Anon_Fulfilled = js.native
  def createInstance[T](defaultProps: AsyncProps[T]): Instantiable0[Async[T]] with Anon_Fulfilled = js.native
  def useAsync[T](arg1: AsyncOptions[T]): AsyncState[T] = js.native
  def useAsync[T](arg1: AsyncOptions[T], arg2: AsyncOptions[T]): AsyncState[T] = js.native
  def useAsync[T](arg1: PromiseFn[T]): AsyncState[T] = js.native
  def useAsync[T](arg1: PromiseFn[T], arg2: AsyncOptions[T]): AsyncState[T] = js.native
  def useFetch[T](input: RequestInfo): AsyncState[T] = js.native
  def useFetch[T](input: RequestInfo, init: RequestInit): AsyncState[T] = js.native
  def useFetch[T](input: RequestInfo, init: RequestInit, options: FetchOptions[T]): AsyncState[T] = js.native
}

