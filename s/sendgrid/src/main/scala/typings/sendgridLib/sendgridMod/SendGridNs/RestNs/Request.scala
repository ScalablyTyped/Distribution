package typings
package sendgridLib.sendgridMod.SendGridNs.RestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var body: js.UndefOr[java.lang.String | js.Object] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var method: sendgridLib.sendgridLibStrings.GET | sendgridLib.sendgridLibStrings.PATCH | sendgridLib.sendgridLibStrings.POST | sendgridLib.sendgridLibStrings.PUT | sendgridLib.sendgridLibStrings.DELETE
  var path: java.lang.String
  var port: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var queryParams: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var test: js.UndefOr[scala.Boolean] = js.undefined
}

object Request {
  @scala.inline
  def apply(
    method: sendgridLib.sendgridLibStrings.GET | sendgridLib.sendgridLibStrings.PATCH | sendgridLib.sendgridLibStrings.POST | sendgridLib.sendgridLibStrings.PUT | sendgridLib.sendgridLibStrings.DELETE,
    path: java.lang.String,
    body: java.lang.String | js.Object = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double] = null,
    host: java.lang.String = null,
    port: java.lang.String | scala.Double = null,
    queryParams: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    test: js.UndefOr[scala.Boolean] = js.undefined
  ): Request = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (host != null) __obj.updateDynamic("host")(host)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams)
    if (!js.isUndefined(test)) __obj.updateDynamic("test")(test)
    __obj.asInstanceOf[Request]
  }
}

