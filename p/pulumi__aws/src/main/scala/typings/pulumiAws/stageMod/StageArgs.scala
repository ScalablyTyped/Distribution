package typings.pulumiAws.stageMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.deploymentMod.Deployment
import typings.pulumiAws.inputMod.apigateway.StageAccessLogSettings
import typings.pulumiAws.restApiMod.RestApi
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StageArgs extends js.Object {
  /**
    * Enables access logs for the API stage. Detailed below.
    */
  val accessLogSettings: js.UndefOr[Input[StageAccessLogSettings]] = js.native
  /**
    * Specifies whether a cache cluster is enabled for the stage
    */
  val cacheClusterEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The size of the cache cluster for the stage, if enabled.
    * Allowed values include `0.5`, `1.6`, `6.1`, `13.5`, `28.4`, `58.2`, `118` and `237`.
    */
  val cacheClusterSize: js.UndefOr[Input[String]] = js.native
  /**
    * The identifier of a client certificate for the stage.
    */
  val clientCertificateId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the deployment that the stage points to
    */
  val deployment: Input[String | Deployment] = js.native
  /**
    * The description of the stage
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The version of the associated API documentation
    */
  val documentationVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the associated REST API
    */
  val restApi: Input[String | RestApi] = js.native
  /**
    * The name of the stage
    */
  val stageName: Input[String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * A map that defines the stage variables
    */
  val variables: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Whether active tracing with X-ray is enabled. Defaults to `false`.
    */
  val xrayTracingEnabled: js.UndefOr[Input[Boolean]] = js.native
}

object StageArgs {
  @scala.inline
  def apply(
    deployment: Input[String | Deployment],
    restApi: Input[String | RestApi],
    stageName: Input[String],
    accessLogSettings: Input[StageAccessLogSettings] = null,
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

