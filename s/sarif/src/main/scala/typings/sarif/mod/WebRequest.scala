package typings.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebRequest extends js.Object {
  /**
    * The body of the request.
    */
  var body: js.UndefOr[ArtifactContent] = js.undefined
  /**
    * The request headers.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * The index within the run.webRequests array of the request object associated with this result.
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * The HTTP method. Well-known values are 'GET', 'PUT', 'POST', 'DELETE', 'PATCH', 'HEAD', 'OPTIONS', 'TRACE',
    * 'CONNECT'.
    */
  var method: js.UndefOr[String] = js.undefined
  /**
    * The request parameters.
    */
  var parameters: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * Key/value pairs that provide additional information about the request.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * The request protocol. Example: 'http'.
    */
  var protocol: js.UndefOr[String] = js.undefined
  /**
    * The target of the request.
    */
  var target: js.UndefOr[String] = js.undefined
  /**
    * The request version. Example: '1.1'.
    */
  var version: js.UndefOr[String] = js.undefined
}

object WebRequest {
  @scala.inline
  def apply(
    body: ArtifactContent = null,
    headers: StringDictionary[String] = null,
    index: Int | Double = null,
    method: String = null,
    parameters: StringDictionary[String] = null,
    properties: PropertyBag = null,
    protocol: String = null,
    target: String = null,
    version: String = null
  ): WebRequest = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebRequest]
  }
}

