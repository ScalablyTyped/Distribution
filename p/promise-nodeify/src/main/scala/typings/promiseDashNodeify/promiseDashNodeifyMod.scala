package typings.promiseDashNodeify

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-nodeify", JSImport.Namespace)
@js.native
object promiseDashNodeifyMod extends js.Object {
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

