package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMethod extends js.Object {
  /** Method options */
  var options: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /** Whether requests are streamed */
  var requestStream: js.UndefOr[scala.Boolean] = js.undefined
  /** Request type */
  var requestType: java.lang.String
  /** Whether responses are streamed */
  var responseStream: js.UndefOr[scala.Boolean] = js.undefined
  /** Response type */
  var responseType: java.lang.String
  /** Method type */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object IMethod {
  @scala.inline
  def apply(
    requestType: java.lang.String,
    responseType: java.lang.String,
    options: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    requestStream: js.UndefOr[scala.Boolean] = js.undefined,
    responseStream: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null
  ): IMethod = {
    val __obj = js.Dynamic.literal(requestType = requestType, responseType = responseType)
    if (options != null) __obj.updateDynamic("options")(options)
    if (!js.isUndefined(requestStream)) __obj.updateDynamic("requestStream")(requestStream)
    if (!js.isUndefined(responseStream)) __obj.updateDynamic("responseStream")(responseStream)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IMethod]
  }
}

