package typings.reactDashAsync.reactDashAsyncMod

import org.scalablytyped.runtime.Instantiable0
import typings.react.reactMod.Global.JSXNs.Element
import typings.reactDashAsync.Anon_ChildrenInitialState
import typings.reactDashAsync.Anon_ChildrenPersistState
import typings.reactDashAsync.Anon_ChildrenPersistStateAsyncState
import typings.reactDashAsync.Anon_ChildrenPersistStateAsyncStateBoolean
import typings.reactDashAsync.Anon_ChildrenPersistStateAsyncStateBooleanSettledChildren
import typings.reactDashAsync.Anon_Fulfilled
import typings.reactDashAsync.reactDashAsyncStrings.run
import typings.std.RequestInfo
import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-async", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def IfFulfilled[T](props: Anon_ChildrenPersistStateAsyncState[T]): Element = js.native
  def IfInitial[T](props: Anon_ChildrenPersistState[T]): Element = js.native
  def IfLoading[T](props: Anon_ChildrenInitialState[T]): Element = js.native
  def IfPending[T](props: Anon_ChildrenInitialState[T]): Element = js.native
  def IfRejected[T](props: Anon_ChildrenPersistStateAsyncStateBoolean[T]): Element = js.native
  def IfResolved[T](props: Anon_ChildrenPersistStateAsyncState[T]): Element = js.native
  def IfSettled[T](props: Anon_ChildrenPersistStateAsyncStateBooleanSettledChildren[T]): Element = js.native
  def createInstance[T](): Instantiable0[Async[T]] with Anon_Fulfilled = js.native
  def createInstance[T](defaultProps: AsyncProps[T]): Instantiable0[Async[T]] with Anon_Fulfilled = js.native
  def useAsync[T](arg1: AsyncOptions[T]): AsyncState[T] = js.native
  def useAsync[T](arg1: AsyncOptions[T], arg2: AsyncOptions[T]): AsyncState[T] = js.native
  def useAsync[T](arg1: PromiseFn[T]): AsyncState[T] = js.native
  def useAsync[T](arg1: PromiseFn[T], arg2: AsyncOptions[T]): AsyncState[T] = js.native
  def useFetch[T](input: RequestInfo): (AsyncInitialWithout[run, T]) with FetchRun[T] = js.native
  def useFetch[T](input: RequestInfo, init: RequestInit): (AsyncInitialWithout[run, T]) with FetchRun[T] = js.native
  def useFetch[T](input: RequestInfo, init: RequestInit, options: FetchOptions[T]): (AsyncInitialWithout[run, T]) with FetchRun[T] = js.native
}

