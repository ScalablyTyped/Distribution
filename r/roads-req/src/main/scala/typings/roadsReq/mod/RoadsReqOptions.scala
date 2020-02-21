package typings.roadsReq.mod

import typings.node.httpMod.RequestOptions
import typings.roadsReq.AnonEncoding
import typings.roadsReq.AnonPw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoadsReqOptions extends js.Object {
  var basicAuth: js.UndefOr[AnonPw] = js.undefined
  var followRedirects: js.UndefOr[Boolean] = js.undefined
  var request: RequestOptions | typings.node.httpsMod.RequestOptions
  var requestBody: js.UndefOr[String] = js.undefined
  var response: js.UndefOr[AnonEncoding] = js.undefined
}

object RoadsReqOptions {
  @scala.inline
  def apply(
    request: RequestOptions | typings.node.httpsMod.RequestOptions,
    basicAuth: AnonPw = null,
    followRedirects: js.UndefOr[Boolean] = js.undefined,
    requestBody: String = null,
    response: AnonEncoding = null
  ): RoadsReqOptions = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    if (basicAuth != null) __obj.updateDynamic("basicAuth")(basicAuth.asInstanceOf[js.Any])
    if (!js.isUndefined(followRedirects)) __obj.updateDynamic("followRedirects")(followRedirects.asInstanceOf[js.Any])
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoadsReqOptions]
  }
}

