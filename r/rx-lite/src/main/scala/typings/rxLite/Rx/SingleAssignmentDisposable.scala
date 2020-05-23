package typings.rxLite.Rx

import typings.rxCore.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Single assignment
trait SingleAssignmentDisposable extends IDisposable {
  var current: IDisposable
  var isDisposed: Boolean
  def getDisposable(): IDisposable
  def setDisposable(value: IDisposable): Unit
}

object SingleAssignmentDisposable {
  @scala.inline
  def apply(
    current: IDisposable,
    dispose: () => Unit,
    getDisposable: () => IDisposable,
    isDisposed: Boolean,
    setDisposable: IDisposable => Unit
  ): SingleAssignmentDisposable = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), getDisposable = js.Any.fromFunction0(getDisposable), isDisposed = isDisposed.asInstanceOf[js.Any], setDisposable = js.Any.fromFunction1(setDisposable))
    __obj.asInstanceOf[SingleAssignmentDisposable]
  }
}

