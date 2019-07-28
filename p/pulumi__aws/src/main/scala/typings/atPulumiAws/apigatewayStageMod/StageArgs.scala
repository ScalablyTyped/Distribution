package typings.atPulumiAws.apigatewayStageMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_DestinationArnFormat
import typings.atPulumiAws.apigatewayDeploymentMod.Deployment
import typings.atPulumiAws.apigatewayRestApiMod.RestApi
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StageArgs extends js.Object {
  /**
    * Enables access logs for the API stage. Detailed below.
    */
  val accessLogSettings: js.UndefOr[Input[Anon_DestinationArnFormat]] = js.undefined
  /**
    * Specifies whether a cache cluster is enabled for the stage
    */
  val cacheClusterEnabled: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The size of the cache cluster for the stage, if enabled.
    * Allowed values include `0.5`, `1.6`, `6.1`, `13.5`, `28.4`, `58.2`, `118` and `237`.
    */
  val cacheClusterSize: js.UndefOr[Input[String]] = js.undefined
  /**
    * The identifier of a client certificate for the stage.
    */
  val clientCertificateId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ID of the deployment that the stage points to
    */
  val deployment: Input[Deployment]
  /**
    * The description of the stage
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * The version of the associated API documentation
    */
  val documentationVersion: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ID of the associated REST API
    */
  val restApi: Input[RestApi]
  /**
    * The name of the stage
    */
  val stageName: Input[String]
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * A map that defines the stage variables
    */
  val variables: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * Whether active tracing with X-ray is enabled. Defaults to `false`.
    */
  val xrayTracingEnabled: js.UndefOr[Input[Boolean]] = js.undefined
}

object StageArgs {
  @scala.inline
  def apply(
    deployment: Input[Deployment],
    restApi: Input[RestApi],
    stageName: Input[String],
    accessLogSettings: Input[Anon_DestinationArnFormat] = null,
    cacheClusterEnabled: Input[Boolean] = null,
    cacheClusterSize: Input[String] = null,
    clientCertificateId: Input[String] = null,
    description: Input[String] = null,
    documentationVersion: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    variables: Input[StringDictionary[_]] = null,
    xrayTracingEnabled: Input[Boolean] = null
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

