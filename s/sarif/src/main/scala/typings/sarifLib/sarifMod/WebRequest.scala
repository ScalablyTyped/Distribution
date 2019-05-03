package typings
package sarifLib.sarifMod

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
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * The index within the run.webRequests array of the request object associated with this result.
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
    * The HTTP method. Well-known values are 'GET', 'PUT', 'POST', 'DELETE', 'PATCH', 'HEAD', 'OPTIONS', 'TRACE',
    * 'CONNECT'.
    */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The request parameters.
    */
  var parameters: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * Key/value pairs that provide additional information about the request.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * The request protocol. Example: 'http'.
    */
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The target of the request.
    */
  var target: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The request version. Example: '1.1'.
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object WebRequest {
  @scala.inline
  def apply(
    body: ArtifactContent = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    index: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    parameters: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    properties: PropertyBag = null,
    protocol: java.lang.String = null,
    target: java.lang.String = null,
    version: java.lang.String = null
  ): WebRequest = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (target != null) __obj.updateDynamic("target")(target)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[WebRequest]
  }
}

