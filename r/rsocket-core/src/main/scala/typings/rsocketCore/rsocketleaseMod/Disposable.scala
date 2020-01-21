package typings.rsocketCore.rsocketleaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disposable extends js.Object {
  def dispose(): Unit
  def isDisposed(): Boolean
}

object Disposable {
  @scala.inline
  def apply(dispose: () => Unit, isDisposed: () => Boolean): Disposable = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isDisposed = js.Any.fromFunction0(isDisposed))
  
    __obj.asInstanceOf[Disposable]
  }
}

