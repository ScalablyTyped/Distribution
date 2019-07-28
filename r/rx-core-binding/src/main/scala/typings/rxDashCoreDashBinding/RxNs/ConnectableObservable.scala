package typings.rxDashCoreDashBinding.RxNs

import typings.rxDashCore.RxNs.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectableObservable[T] extends Observable[T] {
  def connect(): IDisposable = js.native
  def refCount(): Observable[T] = js.native
}

@JSGlobal("Rx.ConnectableObservable")
@js.native
class ConnectableObservableCls[T] () extends ConnectableObservable[T]

