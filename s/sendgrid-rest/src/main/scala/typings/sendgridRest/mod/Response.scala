package typings.sendgridRest.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var body: js.Object | String
  var headers: StringDictionary[js.Any]
  var statusCode: String
}

object Response {
  @scala.inline
  def apply(body: js.Object | String, headers: StringDictionary[js.Any], statusCode: String): Response = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Response]
  }
}

