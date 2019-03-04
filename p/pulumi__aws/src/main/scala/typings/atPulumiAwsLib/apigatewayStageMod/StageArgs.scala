package typings
package atPulumiAwsLib.apigatewayStageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StageArgs extends js.Object {
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
  val deployment: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.apigatewayDeploymentMod.Deployment]
  /**
    * The description of the stage
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The version of the associated API documentation
    */
  val documentationVersion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the associated REST API
    */
  val restApi: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi]
  /**
    * The name of the stage
    */
  val stageName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
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

object StageArgs {
  @scala.inline
  def apply(
    deployment: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.apigatewayDeploymentMod.Deployment],
    restApi: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi],
    stageName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    accessLogSettings: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DestinationArnFormat] = null,
    cacheClusterEnabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    cacheClusterSize: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    clientCertificateId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    documentationVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    variables: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    xrayTracingEnabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): StageArgs = {
    val __obj = js.Dynamic.literal(deployment = deployment.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any])
    if (accessLogSettings != null) __obj.updateDynamic("accessLogSettings")(accessLogSettings.asInstanceOf[js.Any])
    if (cacheClusterEnabled != null) __obj.updateDynamic("cacheClusterEnabled")(cacheClusterEnabled.asInstanceOf[js.Any])
    if (cacheClusterSize != null) __obj.updateDynamic("cacheClusterSize")(cacheClusterSize.asInstanceOf[js.Any])
    if (clientCertificateId != null) __obj.updateDynamic("clientCertificateId")(clientCertificateId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (documentationVersion != null) __obj.updateDynamic("documentationVersion")(documentationVersion.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    if (xrayTracingEnabled != null) __obj.updateDynamic("xrayTracingEnabled")(xrayTracingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[StageArgs]
  }
}

