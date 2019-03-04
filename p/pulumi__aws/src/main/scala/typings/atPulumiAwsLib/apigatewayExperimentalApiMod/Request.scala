package typings
package atPulumiAwsLib.apigatewayExperimentalApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var body: java.lang.String
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var httpMethod: java.lang.String
  var isBase64Encoded: scala.Boolean
  var path: java.lang.String
  var pathParameters: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var queryStringParameters: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var requestContext: RequestContext
  var resource: java.lang.String
  var stageVariables: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object Request {
  @scala.inline
  def apply(
    body: java.lang.String,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    httpMethod: java.lang.String,
    isBase64Encoded: scala.Boolean,
    path: java.lang.String,
    pathParameters: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    queryStringParameters: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    requestContext: RequestContext,
    resource: java.lang.String,
    stageVariables: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): Request = {
    val __obj = js.Dynamic.literal(body = body, headers = headers, httpMethod = httpMethod, isBase64Encoded = isBase64Encoded, path = path, pathParameters = pathParameters, queryStringParameters = queryStringParameters, requestContext = requestContext, resource = resource, stageVariables = stageVariables)
  
    __obj.asInstanceOf[Request]
  }
}

