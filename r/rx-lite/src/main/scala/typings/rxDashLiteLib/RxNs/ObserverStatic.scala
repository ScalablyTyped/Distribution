package typings
package rxDashLiteLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObserverStatic extends js.Object {
  def create[T](): Observer[T] = js.native
  def create[T](onNext: js.Function1[/* value */ T, scala.Unit]): Observer[T] = js.native
  def create[T](
    onNext: js.Function1[/* value */ T, scala.Unit],
    onError: js.Function1[/* exception */ js.Any, scala.Unit]
  ): Observer[T] = js.native
  def create[T](
    onNext: js.Function1[/* value */ T, scala.Unit],
    onError: js.Function1[/* exception */ js.Any, scala.Unit],
    onCompleted: js.Function0[scala.Unit]
  ): Observer[T] = js.native
  def fromNotifier[T](
    handler: js.Function2[/* notification */ Notification[T], /* thisArg */ js.UndefOr[js.Any], scala.Unit]
  ): Observer[T] = js.native
}

