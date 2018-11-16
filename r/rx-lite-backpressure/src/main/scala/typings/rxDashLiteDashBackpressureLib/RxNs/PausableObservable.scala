package typings
package rxDashLiteDashBackpressureLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PausableObservable[T] extends Observable[T] {
  def pause(): scala.Unit = js.native
  def resume(): scala.Unit = js.native
}

