package typings.rxCoreBinding.Rx

import typings.rxCore.Rx.IDisposable
import typings.rxCore.Rx.Observer
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

