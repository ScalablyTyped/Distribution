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
  def useAsync[T](opts: reactDashAsyncLib.PromiseFn[T]): reactDashAsyncLib.reactDashAsyncMod.AsyncState[T] = js.native
  def useAsync[T](opts: reactDashAsyncLib.PromiseFn[T], init: T): reactDashAsyncLib.reactDashAsyncMod.AsyncState[T] = js.native
  def useAsync[T](opts: reactDashAsyncLib.reactDashAsyncMod.AsyncOptions[T]): reactDashAsyncLib.reactDashAsyncMod.AsyncState[T] = js.native
  def useAsync[T](opts: reactDashAsyncLib.reactDashAsyncMod.AsyncOptions[T], init: T): reactDashAsyncLib.reactDashAsyncMod.AsyncState[T] = js.native
}

