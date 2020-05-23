package typings.serverless.awsProviderMod

import typings.serverless.serverlessStrings.aws
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Provider extends js.Object {
  var alb: js.UndefOr[Alb] = js.undefined
  var apiGateway: js.UndefOr[ApiGateway] = js.undefined
  var apiKeys: js.UndefOr[js.Array[String]] = js.undefined
  var apiName: js.UndefOr[String] = js.undefined
  var cfnRole: js.UndefOr[String] = js.undefined
  var deploymentBucket: js.UndefOr[DeploymentBucket] = js.undefined
  var deploymentPrefix: js.UndefOr[String] = js.undefined
  var endpointType: js.UndefOr[String] = js.undefined
  var environment: js.UndefOr[Environment] = js.undefined
  var httpApi: js.UndefOr[HttpApi] = js.undefined
  var iamManagedPolicies: js.UndefOr[js.Array[String]] = js.undefined
  var iamRoleStatements: js.UndefOr[js.Array[IamRoleStatement]] = js.undefined
  var logRetentionInDays: js.UndefOr[Double | String] = js.undefined
  var logs: js.UndefOr[Logs] = js.undefined
  var memorySize: js.UndefOr[Double | String] = js.undefined
  var name: aws
  var notificationArns: js.UndefOr[js.Array[String]] = js.undefined
  var profile: js.UndefOr[String] = js.undefined
  var region: js.UndefOr[String] = js.undefined
  var reservedConcurrency: js.UndefOr[Double | String] = js.undefined
  var resourcePolicy: js.UndefOr[js.Array[ResourcePolicy]] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var rolePermissionsBoundary: js.UndefOr[String] = js.undefined
  var rollbackConfiguration: js.UndefOr[RollbackConfiguration] = js.undefined
  var runtime: String
  var stackName: js.UndefOr[String] = js.undefined
  var stackParameters: js.UndefOr[js.Array[StackParameters]] = js.undefined
  var stackPolicy: js.UndefOr[js.Array[ResourcePolicy]] = js.undefined
  var stackTags: js.UndefOr[Tags] = js.undefined
  var stage: js.UndefOr[String] = js.undefined
  var tags: js.UndefOr[Tags] = js.undefined
  var timeout: js.UndefOr[Double | String] = js.undefined
  var tracing: js.UndefOr[Tracing] = js.undefined
  var usagePlan: js.UndefOr[UsagePlan] = js.undefined
  var versionFunctions: js.UndefOr[Boolean] = js.undefined
  var vpc: js.UndefOr[Vpc] = js.undefined
  var websocketsApiName: js.UndefOr[String] = js.undefined
  var websocketsApiRouteSelectionExpression: js.UndefOr[String] = js.undefined
}

object Provider {
  @scala.inline
  def apply(
    name: aws,
    runtime: String,
    alb: Alb = null,
    apiGateway: ApiGateway = null,
    apiKeys: js.Array[String] = null,
    apiName: String = null,
    cfnRole: String = null,
    deploymentBucket: DeploymentBucket = null,
    deploymentPrefix: String = null,
    endpointType: String = null,
    environment: Environment = null,
    httpApi: HttpApi = null,
    iamManagedPolicies: js.Array[String] = null,
    iamRoleStatements: js.Array[IamRoleStatement] = null,
    logRetentionInDays: Double | String = null,
    logs: Logs = null,
    memorySize: Double | String = null,
    notificationArns: js.Array[String] = null,
    profile: String = null,
    region: String = null,
    reservedConcurrency: Double | String = null,
    resourcePolicy: js.Array[ResourcePolicy] = null,
    role: String = null,
    rolePermissionsBoundary: String = null,
    rollbackConfiguration: RollbackConfiguration = null,
    stackName: String = null,
    stackParameters: js.Array[StackParameters] = null,
    stackPolicy: js.Array[ResourcePolicy] = null,
    stackTags: Tags = null,
    stage: String = null,
    tags: Tags = null,
    timeout: Double | String = null,
    tracing: Tracing = null,
    usagePlan: UsagePlan = null,
    versionFunctions: js.UndefOr[Boolean] = js.undefined,
    vpc: Vpc = null,
    websocketsApiName: String = null,
    websocketsApiRouteSelectionExpression: String = null
  ): Provider = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any])
    if (alb != null) __obj.updateDynamic("alb")(alb.asInstanceOf[js.Any])
    if (apiGateway != null) __obj.updateDynamic("apiGateway")(apiGateway.asInstanceOf[js.Any])
    if (apiKeys != null) __obj.updateDynamic("apiKeys")(apiKeys.asInstanceOf[js.Any])
    if (apiName != null) __obj.updateDynamic("apiName")(apiName.asInstanceOf[js.Any])
    if (cfnRole != null) __obj.updateDynamic("cfnRole")(cfnRole.asInstanceOf[js.Any])
    if (deploymentBucket != null) __obj.updateDynamic("deploymentBucket")(deploymentBucket.asInstanceOf[js.Any])
    if (deploymentPrefix != null) __obj.updateDynamic("deploymentPrefix")(deploymentPrefix.asInstanceOf[js.Any])
    if (endpointType != null) __obj.updateDynamic("endpointType")(endpointType.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (httpApi != null) __obj.updateDynamic("httpApi")(httpApi.asInstanceOf[js.Any])
    if (iamManagedPolicies != null) __obj.updateDynamic("iamManagedPolicies")(iamManagedPolicies.asInstanceOf[js.Any])
    if (iamRoleStatements != null) __obj.updateDynamic("iamRoleStatements")(iamRoleStatements.asInstanceOf[js.Any])
    if (logRetentionInDays != null) __obj.updateDynamic("logRetentionInDays")(logRetentionInDays.asInstanceOf[js.Any])
    if (logs != null) __obj.updateDynamic("logs")(logs.asInstanceOf[js.Any])
    if (memorySize != null) __obj.updateDynamic("memorySize")(memorySize.asInstanceOf[js.Any])
    if (notificationArns != null) __obj.updateDynamic("notificationArns")(notificationArns.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (reservedConcurrency != null) __obj.updateDynamic("reservedConcurrency")(reservedConcurrency.asInstanceOf[js.Any])
    if (resourcePolicy != null) __obj.updateDynamic("resourcePolicy")(resourcePolicy.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (rolePermissionsBoundary != null) __obj.updateDynamic("rolePermissionsBoundary")(rolePermissionsBoundary.asInstanceOf[js.Any])
    if (rollbackConfiguration != null) __obj.updateDynamic("rollbackConfiguration")(rollbackConfiguration.asInstanceOf[js.Any])
    if (stackName != null) __obj.updateDynamic("stackName")(stackName.asInstanceOf[js.Any])
    if (stackParameters != null) __obj.updateDynamic("stackParameters")(stackParameters.asInstanceOf[js.Any])
    if (stackPolicy != null) __obj.updateDynamic("stackPolicy")(stackPolicy.asInstanceOf[js.Any])
    if (stackTags != null) __obj.updateDynamic("stackTags")(stackTags.asInstanceOf[js.Any])
    if (stage != null) __obj.updateDynamic("stage")(stage.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (tracing != null) __obj.updateDynamic("tracing")(tracing.asInstanceOf[js.Any])
    if (usagePlan != null) __obj.updateDynamic("usagePlan")(usagePlan.asInstanceOf[js.Any])
    if (!js.isUndefined(versionFunctions)) __obj.updateDynamic("versionFunctions")(versionFunctions.get.asInstanceOf[js.Any])
    if (vpc != null) __obj.updateDynamic("vpc")(vpc.asInstanceOf[js.Any])
    if (websocketsApiName != null) __obj.updateDynamic("websocketsApiName")(websocketsApiName.asInstanceOf[js.Any])
    if (websocketsApiRouteSelectionExpression != null) __obj.updateDynamic("websocketsApiRouteSelectionExpression")(websocketsApiRouteSelectionExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[Provider]
  }
}

