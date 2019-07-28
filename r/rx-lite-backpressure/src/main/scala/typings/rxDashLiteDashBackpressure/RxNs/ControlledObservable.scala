package typings.rxDashLiteDashBackpressure.RxNs

import typings.rxDashCore.RxNs.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControlledObservable[T] extends Observable[T] {
  def request(): IDisposable = js.native
  def request(numberOfItems: Double): IDisposable = js.native
}

