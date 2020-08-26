package typings.rxLite.Rx

import typings.rxCore.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Single assignment
@js.native
trait SingleAssignmentDisposable extends IDisposable {
  var current: IDisposable = js.native
  var isDisposed: Boolean = js.native
  def getDisposable(): IDisposable = js.native
  def setDisposable(value: IDisposable): Unit = js.native
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
  @scala.inline
  implicit class SingleAssignmentDisposableOps[Self <: SingleAssignmentDisposable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrent(value: IDisposable): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDisposable(value: () => IDisposable): Self = this.set("getDisposable", js.Any.fromFunction0(value))
    @scala.inline
    def setIsDisposed(value: Boolean): Self = this.set("isDisposed", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetDisposable(value: IDisposable => Unit): Self = this.set("setDisposable", js.Any.fromFunction1(value))
  }
  
}

