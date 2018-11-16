package typings
package rxDashLiteLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Observer

trait IObserver[T] extends js.Object {
  def onCompleted(): scala.Unit
  def onError(exception: js.Any): scala.Unit
  def onNext(value: T): scala.Unit
}

