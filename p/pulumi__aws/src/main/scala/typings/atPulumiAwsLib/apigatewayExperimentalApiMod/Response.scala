package typings
package atPulumiAwsLib.apigatewayExperimentalApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var body: java.lang.String
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var isBase64Encoded: js.UndefOr[scala.Boolean] = js.undefined
  var statusCode: scala.Double
}

object Response {
  @scala.inline
  def apply(
    body: java.lang.String,
    statusCode: scala.Double,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    isBase64Encoded: js.UndefOr[scala.Boolean] = js.undefined
  ): Response = {
    val __obj = js.Dynamic.literal(body = body, statusCode = statusCode)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(isBase64Encoded)) __obj.updateDynamic("isBase64Encoded")(isBase64Encoded)
    __obj.asInstanceOf[Response]
  }
}

