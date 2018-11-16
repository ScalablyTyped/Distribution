package typings
package rxDashCoreDashBindingLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISubject[T]
  extends Observable[T]
     with rxDashCoreLib.RxNs.Observer[T]
     with rxDashCoreLib.RxNs.IDisposable {
  def hasObservers(): scala.Boolean = js.native
}

