package typings.rx.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerialDisposable extends js.Object {
  /** Is this value disposed. */
  var isDisposed: Boolean = js.native
  /** Performs the task of cleaning up resources. */
  def dispose(): Unit = js.native
  def getDisposable(): IDisposable = js.native
  def setDisposable(value: IDisposable): Unit = js.native
}

object SerialDisposable {
  @scala.inline
  def apply(
    dispose: () => Unit,
    getDisposable: () => IDisposable,
    isDisposed: Boolean,
    setDisposable: IDisposable => Unit
  ): SerialDisposable = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), getDisposable = js.Any.fromFunction0(getDisposable), isDisposed = isDisposed.asInstanceOf[js.Any], setDisposable = js.Any.fromFunction1(setDisposable))
    __obj.asInstanceOf[SerialDisposable]
  }
  @scala.inline
  implicit class SerialDisposableOps[Self <: SerialDisposable] (val x: Self) extends AnyVal {
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
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDisposable(value: () => IDisposable): Self = this.set("getDisposable", js.Any.fromFunction0(value))
    @scala.inline
    def setIsDisposed(value: Boolean): Self = this.set("isDisposed", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetDisposable(value: IDisposable => Unit): Self = this.set("setDisposable", js.Any.fromFunction1(value))
  }
  
}

