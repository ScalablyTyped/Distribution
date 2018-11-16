package typings
package rxDashCoreDashBindingLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectableObservable[T] extends Observable[T] {
  def connect(): rxDashCoreLib.RxNs.IDisposable = js.native
  def refCount(): Observable[T] = js.native
}

