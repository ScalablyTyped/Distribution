package typings.promiseNodeify

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("promise-nodeify", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply[T](
    promise: js.Promise[T],
    callback: js.Function2[/* error */ js.UndefOr[Error], /* value */ js.UndefOr[T], _]
  ): js.UndefOr[js.Promise[T]] = js.native
  
  def delegated[T](
    promise: js.Promise[T],
    callback: js.Function2[/* error */ js.UndefOr[Error], /* value */ js.UndefOr[T], _]
  ): js.UndefOr[js.Promise[T]] = js.native
  
  def nodeifyThis[T](callback: js.Function2[/* error */ js.UndefOr[Error], /* value */ js.UndefOr[T], _]): js.UndefOr[js.Promise[T]] = js.native
}
