package typings.ravenJs

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Error & {  request ? :std.XMLHttpRequest} */
trait ErrorrequestXMLHttpReques extends js.Object {
  var message: String
  var name: String
  var request: js.UndefOr[XMLHttpRequest] = js.undefined
  var stack: js.UndefOr[String] = js.undefined
}

object ErrorrequestXMLHttpReques {
  @scala.inline
  def apply(message: String, name: String, request: XMLHttpRequest = null, stack: String = null): ErrorrequestXMLHttpReques = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorrequestXMLHttpReques]
  }
}

