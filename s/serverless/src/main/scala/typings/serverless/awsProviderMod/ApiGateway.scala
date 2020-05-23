package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiGateway extends js.Object {
  var apiKeySourceType: js.UndefOr[String] = js.undefined
  var binaryMediaTypes: js.UndefOr[js.Array[String]] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var minimumCompressionSize: js.UndefOr[Double | String] = js.undefined
  var restApiId: js.UndefOr[String] = js.undefined
  var restApiResources: js.UndefOr[StringDictionary[String]] = js.undefined
  var restApiRootResourceId: js.UndefOr[String] = js.undefined
  var websocketApiId: js.UndefOr[js.Any] = js.undefined
}

object ApiGateway {
  @scala.inline
  def apply(
    apiKeySourceType: String = null,
    binaryMediaTypes: js.Array[String] = null,
    description: String = null,
    minimumCompressionSize: Double | String = null,
    restApiId: String = null,
    restApiResources: StringDictionary[String] = null,
    restApiRootResourceId: String = null,
    websocketApiId: js.Any = null
  ): ApiGateway = {
    val __obj = js.Dynamic.literal()
    if (apiKeySourceType != null) __obj.updateDynamic("apiKeySourceType")(apiKeySourceType.asInstanceOf[js.Any])
    if (binaryMediaTypes != null) __obj.updateDynamic("binaryMediaTypes")(binaryMediaTypes.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (minimumCompressionSize != null) __obj.updateDynamic("minimumCompressionSize")(minimumCompressionSize.asInstanceOf[js.Any])
    if (restApiId != null) __obj.updateDynamic("restApiId")(restApiId.asInstanceOf[js.Any])
    if (restApiResources != null) __obj.updateDynamic("restApiResources")(restApiResources.asInstanceOf[js.Any])
    if (restApiRootResourceId != null) __obj.updateDynamic("restApiRootResourceId")(restApiRootResourceId.asInstanceOf[js.Any])
    if (websocketApiId != null) __obj.updateDynamic("websocketApiId")(websocketApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiGateway]
  }
}

