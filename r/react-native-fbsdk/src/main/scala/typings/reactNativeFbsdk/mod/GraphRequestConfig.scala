package typings.reactNativeFbsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphRequestConfig extends js.Object {
  /**
    * The access token used by the request.
    */
  var accessToken: js.UndefOr[String] = js.native
  /**
    * The httpMethod to use for the request, for example "GET" or "POST".
    */
  var httpMethod: js.UndefOr[String] = js.native
  /**
    * The request parameters.
    */
  var parameters: js.UndefOr[GraphRequestParameters] = js.native
  /**
    * The Graph API version to use (e.g., "v2.0")
    */
  var version: js.UndefOr[String] = js.native
}

object GraphRequestConfig {
  @scala.inline
  def apply(): GraphRequestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphRequestConfig]
  }
  @scala.inline
  implicit class GraphRequestConfigOps[Self <: GraphRequestConfig] (val x: Self) extends AnyVal {
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
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
    @scala.inline
    def setHttpMethod(value: String): Self = this.set("httpMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpMethod: Self = this.set("httpMethod", js.undefined)
    @scala.inline
    def setParameters(value: GraphRequestParameters): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

