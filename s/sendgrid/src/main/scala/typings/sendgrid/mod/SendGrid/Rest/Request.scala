package typings.sendgrid.mod.SendGrid.Rest

import org.scalablytyped.runtime.StringDictionary
import typings.sendgrid.sendgridStrings.DELETE
import typings.sendgrid.sendgridStrings.GET
import typings.sendgrid.sendgridStrings.PATCH
import typings.sendgrid.sendgridStrings.POST
import typings.sendgrid.sendgridStrings.PUT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var body: js.UndefOr[String | js.Object] = js.undefined
  var headers: js.UndefOr[StringDictionary[String | Double]] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var method: GET | PATCH | POST | PUT | DELETE
  var path: String
  var port: js.UndefOr[String | Double] = js.undefined
  var queryParams: js.UndefOr[StringDictionary[String]] = js.undefined
  var test: js.UndefOr[Boolean] = js.undefined
}

object Request {
  @scala.inline
  def apply(
    method: GET | PATCH | POST | PUT | DELETE,
    path: String,
    body: String | js.Object = null,
    headers: StringDictionary[String | Double] = null,
    host: String = null,
    port: String | Double = null,
    queryParams: StringDictionary[String] = null,
    test: js.UndefOr[Boolean] = js.undefined
  ): Request = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    if (!js.isUndefined(test)) __obj.updateDynamic("test")(test.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

