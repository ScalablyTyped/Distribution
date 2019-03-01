package typings
package requestLib.requestMod.requestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestAsJSON extends js.Object {
  var headers: Headers
  var method: java.lang.String
  var uri: nodeLib.urlMod.Url
}

object RequestAsJSON {
  @scala.inline
  def apply(headers: Headers, method: java.lang.String, uri: nodeLib.urlMod.Url): RequestAsJSON = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[RequestAsJSON]
  }
}

