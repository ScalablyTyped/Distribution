package typings.rx.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompositeDisposable extends Disposable {
  /**
    * Adds a disposable to the CompositeDisposable or disposes the disposable if the CompositeDisposable is disposed.
    * @param {Mixed} item Disposable to add.
    */
  def add(item: IDisposable): Unit = js.native
  /**
    * Removes and disposes the first occurrence of a disposable from the CompositeDisposable.
    * @param {Mixed} item Disposable to remove.
    * @returns {Boolean} true if found; false otherwise.
    */
  def remove(item: IDisposable): Unit = js.native
}

object CompositeDisposable {
  @scala.inline
  def apply(add: IDisposable => Unit, dispose: () => Unit, remove: IDisposable => Unit): CompositeDisposable = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), dispose = js.Any.fromFunction0(dispose), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[CompositeDisposable]
  }
  @scala.inline
  implicit class CompositeDisposableOps[Self <: CompositeDisposable] (val x: Self) extends AnyVal {
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
    def setAdd(value: IDisposable => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: IDisposable => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
  }
  
}

