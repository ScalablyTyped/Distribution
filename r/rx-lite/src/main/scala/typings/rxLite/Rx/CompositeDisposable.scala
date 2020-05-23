package typings.rxLite.Rx

import typings.rxCore.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompositeDisposable extends IDisposable {
  var isDisposed: Boolean
  var length: Double
  def add(item: IDisposable): Unit
  def remove(item: IDisposable): Boolean
  def toArray(): js.Array[IDisposable]
}

object CompositeDisposable {
  @scala.inline
  def apply(
    add: IDisposable => Unit,
    dispose: () => Unit,
    isDisposed: Boolean,
    length: Double,
    remove: IDisposable => Boolean,
    toArray: () => js.Array[IDisposable]
  ): CompositeDisposable = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), toArray = js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[CompositeDisposable]
  }
}

