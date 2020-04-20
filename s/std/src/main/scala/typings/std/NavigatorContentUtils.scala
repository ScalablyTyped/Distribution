package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorContentUtils extends js.Object {
  def registerProtocolHandler(scheme: java.lang.String, url: java.lang.String, title: java.lang.String): Unit
  def unregisterProtocolHandler(scheme: java.lang.String, url: java.lang.String): Unit
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
}

