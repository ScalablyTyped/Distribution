package typings.raygun4js.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Headers extends js.Object {
  var Headers: Host
  var QueryString: String
  var Url: String
}

object Headers {
  @scala.inline
  def apply(Headers: Host, QueryString: String, Url: String): Headers = {
    val __obj = js.Dynamic.literal(Headers = Headers.asInstanceOf[js.Any], QueryString = QueryString.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
}

