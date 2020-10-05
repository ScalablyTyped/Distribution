package typings.std.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Proxy[T /* <: js.Object */] extends js.Object {
  var proxy: T = js.native
  def revoke(): Unit = js.native
}

object Proxy {
  @scala.inline
  def apply[/* <: js.Object */ T](proxy: T, revoke: () => Unit): Proxy[T] = {
    val __obj = js.Dynamic.literal(proxy = proxy.asInstanceOf[js.Any], revoke = js.Any.fromFunction0(revoke))
    __obj.asInstanceOf[Proxy[T]]
  }
  @scala.inline
  implicit class ProxyOps[Self <: Proxy[_], /* <: js.Object */ T] (val x: Self with Proxy[T]) extends AnyVal {
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
    def setProxy(value: T): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevoke(value: () => Unit): Self = this.set("revoke", js.Any.fromFunction0(value))
  }
  
}

