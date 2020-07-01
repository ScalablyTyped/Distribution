package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpCors extends js.Object {
  var allowCredentials: js.UndefOr[Boolean] = js.undefined
  var cacheControl: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[String | js.Array[String]] = js.undefined
  var maxAge: js.UndefOr[Double] = js.undefined
  var origins: js.UndefOr[String | js.Array[String]] = js.undefined
}

object HttpCors {
  @scala.inline
  def apply(
    allowCredentials: js.UndefOr[Boolean] = js.undefined,
    cacheControl: String = null,
    headers: String | js.Array[String] = null,
    maxAge: js.UndefOr[Double] = js.undefined,
    origins: String | js.Array[String] = null
  ): HttpCors = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowCredentials)) __obj.updateDynamic("allowCredentials")(allowCredentials.get.asInstanceOf[js.Any])
    if (cacheControl != null) __obj.updateDynamic("cacheControl")(cacheControl.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAge)) __obj.updateDynamic("maxAge")(maxAge.get.asInstanceOf[js.Any])
    if (origins != null) __obj.updateDynamic("origins")(origins.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpCors]
  }
}

