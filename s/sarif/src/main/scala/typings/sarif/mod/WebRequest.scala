package typings.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebRequest extends js.Object {
  /**
    * The body of the request.
    */
  var body: js.UndefOr[ArtifactContent] = js.native
  /**
    * The request headers.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The index within the run.webRequests array of the request object associated with this result.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * The HTTP method. Well-known values are 'GET', 'PUT', 'POST', 'DELETE', 'PATCH', 'HEAD', 'OPTIONS', 'TRACE',
    * 'CONNECT'.
    */
  var method: js.UndefOr[String] = js.native
  /**
    * The request parameters.
    */
  var parameters: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Key/value pairs that provide additional information about the request.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * The request protocol. Example: 'http'.
    */
  var protocol: js.UndefOr[String] = js.native
  /**
    * The target of the request.
    */
  var target: js.UndefOr[String] = js.native
  /**
    * The request version. Example: '1.1'.
    */
  var version: js.UndefOr[String] = js.native
}

object WebRequest {
  @scala.inline
  def apply(): WebRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebRequest]
  }
  @scala.inline
  implicit class WebRequestOps[Self <: WebRequest] (val x: Self) extends AnyVal {
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
    def setBody(value: ArtifactContent): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setParameters(value: StringDictionary[String]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

