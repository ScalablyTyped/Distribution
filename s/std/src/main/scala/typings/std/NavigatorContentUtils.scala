package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigatorContentUtils extends js.Object {
  def registerProtocolHandler(scheme: java.lang.String, url: java.lang.String, title: java.lang.String): Unit = js.native
  def unregisterProtocolHandler(scheme: java.lang.String, url: java.lang.String): Unit = js.native
}

object NavigatorContentUtils {
  @scala.inline
  def apply(
    registerProtocolHandler: (java.lang.String, java.lang.String, java.lang.String) => Unit,
    unregisterProtocolHandler: (java.lang.String, java.lang.String) => Unit
  ): NavigatorContentUtils = {
    val __obj = js.Dynamic.literal(registerProtocolHandler = js.Any.fromFunction3(registerProtocolHandler), unregisterProtocolHandler = js.Any.fromFunction2(unregisterProtocolHandler))
    __obj.asInstanceOf[NavigatorContentUtils]
  }
  @scala.inline
  implicit class NavigatorContentUtilsOps[Self <: NavigatorContentUtils] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRegisterProtocolHandler(value: (java.lang.String, java.lang.String, java.lang.String) => Unit): Self = this.set("registerProtocolHandler", js.Any.fromFunction3(value))
    @scala.inline
    def setUnregisterProtocolHandler(value: (java.lang.String, java.lang.String) => Unit): Self = this.set("unregisterProtocolHandler", js.Any.fromFunction2(value))
  }
  
}

