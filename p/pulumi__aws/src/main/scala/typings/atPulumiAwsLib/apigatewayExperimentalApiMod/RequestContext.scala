package typings
package atPulumiAwsLib.apigatewayExperimentalApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestContext extends js.Object {
  var accountId: java.lang.String
  var apiId: java.lang.String
  var httpMethod: java.lang.String
  var identity: RequestIdentity
  var requestId: java.lang.String
  var resourceId: java.lang.String
  var resourcePath: java.lang.String
  var stage: java.lang.String
}

object RequestContext {
  @scala.inline
  def apply(
    accountId: java.lang.String,
    apiId: java.lang.String,
    httpMethod: java.lang.String,
    identity: RequestIdentity,
    requestId: java.lang.String,
    resourceId: java.lang.String,
    resourcePath: java.lang.String,
    stage: java.lang.String
  ): RequestContext = {
    val __obj = js.Dynamic.literal(accountId = accountId, apiId = apiId, httpMethod = httpMethod, identity = identity, requestId = requestId, resourceId = resourceId, resourcePath = resourcePath, stage = stage)
  
    __obj.asInstanceOf[RequestContext]
  }
}

