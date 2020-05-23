package typings.rxLite.anon

import typings.rxCore.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDisposable extends js.Object {
  def getDisposable(): IDisposable
}

object GetDisposable {
  @scala.inline
  def apply(getDisposable: () => IDisposable): GetDisposable = {
    val __obj = js.Dynamic.literal(getDisposable = js.Any.fromFunction0(getDisposable))
    __obj.asInstanceOf[GetDisposable]
  }
}

