package typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphRequestConfig extends js.Object {
  /**
    * The access token used by the request.
    */
  var accessToken: js.UndefOr[String] = js.undefined
  /**
    * The httpMethod to use for the request, for example "GET" or "POST".
    */
  var httpMethod: js.UndefOr[String] = js.undefined
  /**
    * The request parameters.
    */
  var parameters: js.UndefOr[GraphRequestParameters] = js.undefined
  /**
    * The Graph API version to use (e.g., "v2.0")
    */
  var version: js.UndefOr[String] = js.undefined
}

object GraphRequestConfig {
  @scala.inline
  def apply(
    accessToken: String = null,
    httpMethod: String = null,
    parameters: GraphRequestParameters = null,
    version: String = null
  ): GraphRequestConfig = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken)
    if (httpMethod != null) __obj.updateDynamic("httpMethod")(httpMethod)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[GraphRequestConfig]
  }
}

