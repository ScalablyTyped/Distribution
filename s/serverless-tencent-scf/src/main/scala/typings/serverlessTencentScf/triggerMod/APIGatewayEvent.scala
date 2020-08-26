package typings.serverlessTencentScf.triggerMod

import org.scalablytyped.runtime.StringDictionary
import typings.serverlessTencentScf.anon.Stage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APIGatewayEvent extends js.Object {
  var body: js.UndefOr[String | Null] = js.native
  var headerParameters: StringDictionary[String] | Null = js.native
  var headers: StringDictionary[String] = js.native
  var httpMethod: String = js.native
  var path: String = js.native
  var pathParameters: StringDictionary[String] | Null = js.native
  var queryString: StringDictionary[String] | Null = js.native
  var queryStringParameters: StringDictionary[String] | Null = js.native
  var requestContext: APIGatewayRequestContext = js.native
  var stageVariables: Stage = js.native
}

object APIGatewayEvent {
  @scala.inline
  def apply(
    headers: StringDictionary[String],
    httpMethod: String,
    path: String,
    requestContext: APIGatewayRequestContext,
    stageVariables: Stage
  ): APIGatewayEvent = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any], stageVariables = stageVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayEvent]
  }
  @scala.inline
  implicit class APIGatewayEventOps[Self <: APIGatewayEvent] (val x: Self) extends AnyVal {
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
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttpMethod(value: String): Self = this.set("httpMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestContext(value: APIGatewayRequestContext): Self = this.set("requestContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setStageVariables(value: Stage): Self = this.set("stageVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setBodyNull: Self = this.set("body", null)
    @scala.inline
    def setHeaderParameters(value: StringDictionary[String]): Self = this.set("headerParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderParametersNull: Self = this.set("headerParameters", null)
    @scala.inline
    def setPathParameters(value: StringDictionary[String]): Self = this.set("pathParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathParametersNull: Self = this.set("pathParameters", null)
    @scala.inline
    def setQueryString(value: StringDictionary[String]): Self = this.set("queryString", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryStringNull: Self = this.set("queryString", null)
    @scala.inline
    def setQueryStringParameters(value: StringDictionary[String]): Self = this.set("queryStringParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryStringParametersNull: Self = this.set("queryStringParameters", null)
  }
  
}

