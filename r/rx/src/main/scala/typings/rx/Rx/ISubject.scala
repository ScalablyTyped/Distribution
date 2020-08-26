package typings.rx.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISubject[T]
  extends IObservable[T]
     with IObserver[T]
     with IDisposable {
  def hasObservers(): Boolean = js.native
}

