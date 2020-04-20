package typings.rxLite

import typings.rxCore.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetDisposable extends js.Object {
  def getDisposable(): IDisposable
}

object AnonGetDisposable {
  @scala.inline
  def apply(getDisposable: () => IDisposable): AnonGetDisposable = {
    val __obj = js.Dynamic.literal(getDisposable = js.Any.fromFunction0(getDisposable))
    __obj.asInstanceOf[AnonGetDisposable]
  }
}

