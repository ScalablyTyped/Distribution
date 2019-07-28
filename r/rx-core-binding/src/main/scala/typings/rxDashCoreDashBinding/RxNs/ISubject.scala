package typings.rxDashCoreDashBinding.RxNs

import typings.rxDashCore.RxNs.IDisposable
import typings.rxDashCore.RxNs.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISubject[T]
  extends Observable[T]
     with Observer[T]
     with IDisposable {
  def hasObservers(): Boolean = js.native
}

