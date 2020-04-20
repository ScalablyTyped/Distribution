package typings.raygun4js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeaders extends js.Object {
  var Headers: AnonHost
  var QueryString: String
  var Url: String
}

object AnonHeaders {
  @scala.inline
  def apply(Headers: AnonHost, QueryString: String, Url: String): AnonHeaders = {
    val __obj = js.Dynamic.literal(Headers = Headers.asInstanceOf[js.Any], QueryString = QueryString.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeaders]
  }
}

