package typings
package reactDashAsyncLib.reactDashAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-async", JSImport.Namespace)
@js.native
object reactDashAsyncModMembers extends js.Object {
  def default[T](): Async[T] = js.native
  def default[T](defaultProps: AsyncProps[T]): Async[T] = js.native
  def useAsync[T](
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AsyncOptions<T> */ js.Any
  ): AsyncState[T] = js.native
  def useAsync[T](
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AsyncOptions<T> */ js.Any,
    init: T
  ): AsyncState[T] = js.native
  def useAsync[T](opts: reactDashAsyncLib.PromiseFn[T]): AsyncState[T] = js.native
  def useAsync[T](opts: reactDashAsyncLib.PromiseFn[T], init: T): AsyncState[T] = js.native
}

