package typings
package rxDashLiteLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectableObservable[T] extends Observable[T] {
  def connect(): Disposable = js.native
}

