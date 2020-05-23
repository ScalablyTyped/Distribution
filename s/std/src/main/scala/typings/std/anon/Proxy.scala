package typings.std.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Proxy[T /* <: js.Object */] extends js.Object {
  var proxy: T
  def revoke(): Unit
}

object Proxy {
  @scala.inline
  def apply[T](proxy: T, revoke: () => Unit): Proxy[T] = {
    val __obj = js.Dynamic.literal(proxy = proxy.asInstanceOf[js.Any], revoke = js.Any.fromFunction0(revoke))
    __obj.asInstanceOf[Proxy[T]]
  }
}

