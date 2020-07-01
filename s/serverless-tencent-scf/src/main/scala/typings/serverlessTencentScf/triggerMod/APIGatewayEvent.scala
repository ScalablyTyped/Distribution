package typings.serverlessTencentScf.triggerMod

import org.scalablytyped.runtime.StringDictionary
import typings.serverlessTencentScf.anon.Stage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIGatewayEvent extends js.Object {
  var body: js.UndefOr[String | Null] = js.undefined
  var headerParameters: StringDictionary[String] | Null
  var headers: StringDictionary[String]
  var httpMethod: String
  var path: String
  var pathParameters: StringDictionary[String] | Null
  var queryString: StringDictionary[String] | Null
  var queryStringParameters: StringDictionary[String] | Null
  var requestContext: APIGatewayRequestContext
  var stageVariables: Stage
}

object APIGatewayEvent {
  @scala.inline
  def apply(
    headers: StringDictionary[String],
    httpMethod: String,
    path: String,
    requestContext: APIGatewayRequestContext,
    stageVariables: Stage,
    body: js.UndefOr[Null | String] = js.undefined,
    headerParameters: StringDictionary[String] = null,
    pathParameters: StringDictionary[String] = null,
    queryString: StringDictionary[String] = null,
    queryStringParameters: StringDictionary[String] = null
  ): APIGatewayEvent = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any], stageVariables = stageVariables.asInstanceOf[js.Any], headerParameters = headerParameters.asInstanceOf[js.Any], pathParameters = pathParameters.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], queryStringParameters = queryStringParameters.asInstanceOf[js.Any])
    if (!js.isUndefined(body)) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayEvent]
  }
}

