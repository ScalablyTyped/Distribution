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
trait StageState extends js.Object {
  /**
    * Enables access logs for the API stage. Detailed below.
    */
  val accessLogSettings: js.UndefOr[Input[StageAccessLogSettings]] = js.native
  /**
    * Amazon Resource Name (ARN)
    */
  val arn: js.UndefOr[Input[String]] = js.native
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
  val deployment: js.UndefOr[Input[String | Deployment]] = js.native
  /**
    * The description of the stage
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The version of the associated API documentation
    */
  val documentationVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The execution ARN to be used in [`lambdaPermission`](https://www.terraform.io/docs/providers/aws/r/lambda_permission.html)'s `sourceArn`
    * when allowing API Gateway to invoke a Lambda function,
    * e.g. `arn:aws:execute-api:eu-west-2:123456789012:z4675bid1j/prod`
    */
  val executionArn: js.UndefOr[Input[String]] = js.native
  /**
    * The URL to invoke the API pointing to the stage,
    * e.g. `https://z4675bid1j.execute-api.eu-west-2.amazonaws.com/prod`
    */
  val invokeUrl: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the associated REST API
    */
  val restApi: js.UndefOr[Input[String | RestApi]] = js.native
  /**
    * The name of the stage
    */
  val stageName: js.UndefOr[Input[String]] = js.native
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

object StageState {
  @scala.inline
  def apply(
    accessLogSettings: Input[StageAccessLogSettings] = null,
    arn: Input[String] = null,
    cacheClusterEnabled: Input[Boolean] = null,
    cacheClusterSize: Input[String] = null,
    clientCertificateId: Input[String] = null,
    deployment: Input[String | Deployment] = null,
    description: Input[String] = null,
    documentationVersion: Input[String] = null,
    executionArn: Input[String] = null,
    invokeUrl: Input[String] = null,
    restApi: Input[String | RestApi] = null,
    stageName: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    variables: Input[StringDictionary[_]] = null,
    xrayTracingEnabled: Input[Boolean] = null
  ): StageState = {
    val __obj = js.Dynamic.literal()
    if (accessLogSettings != null) __obj.updateDynamic("accessLogSettings")(accessLogSettings.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
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

