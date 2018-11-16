package typings
package rxDashLiteLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObservable[T] extends js.Object {
  def subscribe(): rxDashCoreLib.RxNs.IDisposable = js.native
  def subscribe(observer: Observer[T]): rxDashCoreLib.RxNs.IDisposable = js.native
  def subscribe(onNext: js.Function1[/* value */ T, scala.Unit]): rxDashCoreLib.RxNs.IDisposable = js.native
  def subscribe(
    onNext: js.Function1[/* value */ T, scala.Unit],
    onError: js.Function1[/* exception */ js.Any, scala.Unit]
  ): rxDashCoreLib.RxNs.IDisposable = js.native
  def subscribe(
    onNext: js.Function1[/* value */ T, scala.Unit],
    onError: js.Function1[/* exception */ js.Any, scala.Unit],
    onCompleted: js.Function0[scala.Unit]
  ): rxDashCoreLib.RxNs.IDisposable = js.native
  def subscribeOnCompleted(onCompleted: js.Function0[scala.Unit]): rxDashCoreLib.RxNs.IDisposable = js.native
  def subscribeOnCompleted(onCompleted: js.Function0[scala.Unit], thisArg: js.Any): rxDashCoreLib.RxNs.IDisposable = js.native
  def subscribeOnError(onError: js.Function1[/* exception */ js.Any, scala.Unit]): rxDashCoreLib.RxNs.IDisposable = js.native
  def subscribeOnError(onError: js.Function1[/* exception */ js.Any, scala.Unit], thisArg: js.Any): rxDashCoreLib.RxNs.IDisposable = js.native
  def subscribeOnNext(onNext: js.Function1[/* value */ T, scala.Unit]): rxDashCoreLib.RxNs.IDisposable = js.native
  def subscribeOnNext(onNext: js.Function1[/* value */ T, scala.Unit], thisArg: js.Any): rxDashCoreLib.RxNs.IDisposable = js.native
}

