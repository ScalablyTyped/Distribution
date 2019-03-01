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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accountId")(accountId)
    __obj.updateDynamic("apiId")(apiId)
    __obj.updateDynamic("httpMethod")(httpMethod)
    __obj.updateDynamic("identity")(identity)
    __obj.updateDynamic("requestId")(requestId)
    __obj.updateDynamic("resourceId")(resourceId)
    __obj.updateDynamic("resourcePath")(resourcePath)
    __obj.updateDynamic("stage")(stage)
    __obj.asInstanceOf[RequestContext]
  }
}

