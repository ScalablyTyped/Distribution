package typings.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebResponse extends js.Object {
  /**
    * The body of the response.
    */
  var body: js.UndefOr[ArtifactContent] = js.undefined
  /**
    * The response headers.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * The index within the run.webResponses array of the response object associated with this result.
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * Specifies whether a response was received from the server.
    */
  var noResponseReceived: js.UndefOr[Boolean] = js.undefined
  /**
    * Key/value pairs that provide additional information about the response.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * The response protocol. Example: 'http'.
    */
  var protocol: js.UndefOr[String] = js.undefined
  /**
    * The response reason. Example: 'Not found'.
    */
  var reasonPhrase: js.UndefOr[String] = js.undefined
  /**
    * The response status code. Example: 451.
    */
  var statusCode: js.UndefOr[Double] = js.undefined
  /**
    * The response version. Example: '1.1'.
    */
  var version: js.UndefOr[String] = js.undefined
}

object WebResponse {
  @scala.inline
  def apply(
    body: ArtifactContent = null,
    headers: StringDictionary[String] = null,
    index: Int | Double = null,
    noResponseReceived: js.UndefOr[Boolean] = js.undefined,
    properties: PropertyBag = null,
    protocol: String = null,
    reasonPhrase: String = null,
    statusCode: Int | Double = null,
    version: String = null
  ): WebResponse = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(noResponseReceived)) __obj.updateDynamic("noResponseReceived")(noResponseReceived.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (reasonPhrase != null) __obj.updateDynamic("reasonPhrase")(reasonPhrase.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebResponse]
  }
}

