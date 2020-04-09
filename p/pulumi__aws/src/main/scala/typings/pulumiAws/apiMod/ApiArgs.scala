package typings.pulumiAws.apiMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiArgs extends js.Object {
  /**
    * An [API key selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions).
    * Valid values: `$context.authorizer.usageIdentifierKey`, `$request.header.x-api-key`. Defaults to `$request.header.x-api-key`.
    * Applicable for WebSocket APIs.
    */
  val apiKeySelectionExpression: js.UndefOr[Input[String]] = js.native
  /**
    * The description of the API.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the API.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The API protocol. Valid values: `HTTP`, `WEBSOCKET`.
    */
  val protocolType: Input[String] = js.native
  /**
    * The [route selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-route-selection-expressions) for the API.
    * Defaults to `$request.method $request.path`.
    */
  val routeSelectionExpression: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the API.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * A version identifier for the API.
    */
  val version: js.UndefOr[Input[String]] = js.native
}

object ApiArgs {
  @scala.inline
  def apply(
    protocolType: Input[String],
    apiKeySelectionExpression: Input[String] = null,
    description: Input[String] = null,
    name: Input[String] = null,
    routeSelectionExpression: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    version: Input[String] = null
  ): ApiArgs = {
    val __obj = js.Dynamic.literal(protocolType = protocolType.asInstanceOf[js.Any])
    if (apiKeySelectionExpression != null) __obj.updateDynamic("apiKeySelectionExpression")(apiKeySelectionExpression.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (routeSelectionExpression != null) __obj.updateDynamic("routeSelectionExpression")(routeSelectionExpression.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiArgs]
  }
}

