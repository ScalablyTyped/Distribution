package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Proxy[T /* <: js.Object */] extends js.Object {
  var proxy: T
  def revoke(): Unit
}

object Anon_Proxy {
  @scala.inline
  def apply[T /* <: js.Object */](proxy: T, revoke: () => Unit): Anon_Proxy[T] = {
    val __obj = js.Dynamic.literal(proxy = proxy.asInstanceOf[js.Any], revoke = js.Any.fromFunction0(revoke))
  
    __obj.asInstanceOf[Anon_Proxy[T]]
  }
}

