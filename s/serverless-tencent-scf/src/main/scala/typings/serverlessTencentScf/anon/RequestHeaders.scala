package typings.serverlessTencentScf.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestHeaders extends js.Object {
  var requestHeaders: StringDictionary[String]
  var requestSourceIP: String
}

object RequestHeaders {
  @scala.inline
  def apply(requestHeaders: StringDictionary[String], requestSourceIP: String): RequestHeaders = {
    val __obj = js.Dynamic.literal(requestHeaders = requestHeaders.asInstanceOf[js.Any], requestSourceIP = requestSourceIP.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestHeaders]
  }
}

