package typings
package atPulumiAwsLib.apigatewayStageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StageState extends js.Object {
  /**
    * Enables access logs for the API stage. Detailed below.
    */
  val accessLogSettings: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DestinationArnFormat]] = js.undefined
  /**
    * Specifies whether a cache cluster is enabled for the stage
    */
  val cacheClusterEnabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The size of the cache cluster for the stage, if enabled.
    * Allowed values include `0.5`, `1.6`, `6.1`, `13.5`, `28.4`, `58.2`, `118` and `237`.
    */
  val cacheClusterSize: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The identifier of a client certificate for the stage.
    */
  val clientCertificateId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the deployment that the stage points to
    */
  val deployment: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.apigatewayDeploymentMod.Deployment]
  ] = js.undefined
  /**
    * The description of the stage
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The version of the associated API documentation
    */
  val documentationVersion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The execution ARN to be used in [`lambda_permission`](https://www.terraform.io/docs/providers/aws/r/lambda_permission.html)'s `source_arn`
    * when allowing API Gateway to invoke a Lambda function,
    * e.g. `arn:aws:execute-api:eu-west-2:123456789012:z4675bid1j/prod`
    */
  val executionArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The URL to invoke the API pointing to the stage,
    * e.g. `https://z4675bid1j.execute-api.eu-west-2.amazonaws.com/prod`
    */
  val invokeUrl: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the associated REST API
    */
  val restApi: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi]] = js.undefined
  /**
    * The name of the stage
    */
  val stageName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * A map that defines the stage variables
    */
  val variables: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * Whether active tracing with X-ray is enabled. Defaults to `false`.
    */
  val xrayTracingEnabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

object StageState {
  @scala.inline
  def apply(
    accessLogSettings: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DestinationArnFormat] = null,
    cacheClusterEnabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    cacheClusterSize: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    clientCertificateId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    deployment: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.apigatewayDeploymentMod.Deployment] = null,
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    documentationVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    executionArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    invokeUrl: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    restApi: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi] = null,
    stageName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    variables: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    xrayTracingEnabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): StageState = {
    val __obj = js.Dynamic.literal()
    if (accessLogSettings != null) __obj.updateDynamic("accessLogSettings")(accessLogSettings.asInstanceOf[js.Any])
    if (cacheClusterEnabled != null) __obj.updateDynamic("cacheClusterEnabled")(cacheClusterEnabled.asInstanceOf[js.Any])
    if (cacheClusterSize != null) __obj.updateDynamic("cacheClusterSize")(cacheClusterSize.asInstanceOf[js.Any])
    if (clientCertificateId != null) __obj.updateDynamic("clientCertificateId")(clientCertificateId.asInstanceOf[js.Any])
    if (deployment != null) __obj.updateDynamic("deployment")(deployment.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (documentationVersion != null) __obj.updateDynamic("documentationVersion")(documentationVersion.asInstanceOf[js.Any])
    if (executionArn != null) __obj.updateDynamic("executionArn")(executionArn.asInstanceOf[js.Any])
    if (invokeUrl != null) __obj.updateDynamic("invokeUrl")(invokeUrl.asInstanceOf[js.Any])
    if (restApi != null) __obj.updateDynamic("restApi")(restApi.asInstanceOf[js.Any])
    if (stageName != null) __obj.updateDynamic("stageName")(stageName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    if (xrayTracingEnabled != null) __obj.updateDynamic("xrayTracingEnabled")(xrayTracingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[StageState]
  }
}

