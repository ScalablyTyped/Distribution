package typings
package rxDashLiteDashBackpressureLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControlledObservable[T] extends Observable[T] {
  def request(): rxDashCoreLib.RxNs.IDisposable = js.native
  def request(numberOfItems: scala.Double): rxDashCoreLib.RxNs.IDisposable = js.native
}

