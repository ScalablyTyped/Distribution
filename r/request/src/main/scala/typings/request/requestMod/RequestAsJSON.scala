package typings.request.requestMod

import typings.node.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestAsJSON extends js.Object {
  var headers: Headers
  var method: String
  var uri: Url
}

object RequestAsJSON {
  @scala.inline
  def apply(headers: Headers, method: String, uri: Url): RequestAsJSON = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RequestAsJSON]
  }
}

