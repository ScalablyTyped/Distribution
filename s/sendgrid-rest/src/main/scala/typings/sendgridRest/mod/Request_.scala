package typings.sendgridRest.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request_ extends js.Object {
  var body: js.Object | String = js.native
  var headers: StringDictionary[js.Any] = js.native
  var host: String = js.native
  var method: String = js.native
  var path: String = js.native
  var port: String = js.native
  var queryParams: StringDictionary[js.Any] = js.native
  var test: Boolean = js.native
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
  @scala.inline
  implicit class Request_Ops[Self <: Request_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBody(value: js.Object | String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: StringDictionary[js.Any]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryParams(value: StringDictionary[js.Any]): Self = this.set("queryParams", value.asInstanceOf[js.Any])
    @scala.inline
    def setTest(value: Boolean): Self = this.set("test", value.asInstanceOf[js.Any])
  }
  
}

