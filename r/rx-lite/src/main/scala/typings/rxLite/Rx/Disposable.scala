package typings.rxLite.Rx

import typings.rxCore.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Disposable extends IDisposable

object Disposable {
  @scala.inline
  def apply(dispose: () => Unit): Disposable = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[Disposable]
  }
}

