package typings.rx.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subject[T]
  extends Observable[T]
     with Observer[T]
     with IDisposable {
  /** Is this value disposed. */
  var isDisposed: Boolean = js.native
  def hasObservers(): Boolean = js.native
}

