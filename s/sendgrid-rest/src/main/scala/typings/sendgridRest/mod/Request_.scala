package typings.sendgridRest.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request_ extends js.Object {
  var body: js.Object | String
  var headers: StringDictionary[js.Any]
  var host: String
  var method: String
  var path: String
  var port: String
  var queryParams: StringDictionary[js.Any]
  var test: Boolean
}

object Request_ {
  @scala.inline
  def apply(
    body: js.Object | String,
    headers: StringDictionary[js.Any],
    host: String,
    method: String,
    path: String,
    port: String,
    queryParams: StringDictionary[js.Any],
    test: Boolean
  ): Request_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], queryParams = queryParams.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request_]
  }
}

