package typings.serverless.awsProviderMod

import typings.serverless.serverlessStrings.`private`
import typings.serverless.serverlessStrings.aws
import typings.serverless.serverlessStrings.edge
import typings.serverless.serverlessStrings.regional
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Provider extends js.Object {
  var alb: js.UndefOr[Alb] = js.native
  var apiGateway: js.UndefOr[ApiGateway] = js.native
  var apiKeys: js.UndefOr[js.Array[String]] = js.native
  var apiName: js.UndefOr[String] = js.native
  var cfnRole: js.UndefOr[String] = js.native
  var deploymentBucket: js.UndefOr[DeploymentBucket] = js.native
  var deploymentPrefix: js.UndefOr[String] = js.native
  var endpointType: js.UndefOr[regional | edge | `private`] = js.native
  var environment: js.UndefOr[Environment] = js.native
  var httpApi: js.UndefOr[HttpApi] = js.native
  var iamManagedPolicies: js.UndefOr[js.Array[String]] = js.native
  var iamRoleStatements: js.UndefOr[js.Array[IamRoleStatement]] = js.native
  var logRetentionInDays: js.UndefOr[Double | String] = js.native
  var logs: js.UndefOr[Logs] = js.native
  var memorySize: js.UndefOr[Double | String] = js.native
  var name: aws = js.native
  var notificationArns: js.UndefOr[js.Array[String]] = js.native
  var profile: js.UndefOr[String] = js.native
  var region: js.UndefOr[String] = js.native
  var reservedConcurrency: js.UndefOr[Double | String] = js.native
  var resourcePolicy: js.UndefOr[js.Array[ResourcePolicy]] = js.native
  var role: js.UndefOr[String] = js.native
  var rolePermissionsBoundary: js.UndefOr[String] = js.native
  var rollbackConfiguration: js.UndefOr[RollbackConfiguration] = js.native
  var runtime: String = js.native
  var stackName: js.UndefOr[String] = js.native
  var stackParameters: js.UndefOr[js.Array[StackParameters]] = js.native
  var stackPolicy: js.UndefOr[js.Array[ResourcePolicy]] = js.native
  var stackTags: js.UndefOr[Tags] = js.native
  var stage: js.UndefOr[String] = js.native
  var tags: js.UndefOr[Tags] = js.native
  var timeout: js.UndefOr[Double | String] = js.native
  var tracing: js.UndefOr[Tracing] = js.native
  var usagePlan: js.UndefOr[UsagePlan] = js.native
  var versionFunctions: js.UndefOr[Boolean] = js.native
  var vpc: js.UndefOr[Vpc] = js.native
  var websocketsApiName: js.UndefOr[String] = js.native
  var websocketsApiRouteSelectionExpression: js.UndefOr[String] = js.native
}

object Provider {
  @scala.inline
  def apply(name: aws, runtime: String): Provider = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Provider]
  }
  @scala.inline
  implicit class ProviderOps[Self <: Provider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: aws): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuntime(value: String): Self = this.set("runtime", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlb(value: Alb): Self = this.set("alb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlb: Self = this.set("alb", js.undefined)
    @scala.inline
    def setApiGateway(value: ApiGateway): Self = this.set("apiGateway", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiGateway: Self = this.set("apiGateway", js.undefined)
    @scala.inline
    def setApiKeysVarargs(value: String*): Self = this.set("apiKeys", js.Array(value :_*))
    @scala.inline
    def setApiKeys(value: js.Array[String]): Self = this.set("apiKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiKeys: Self = this.set("apiKeys", js.undefined)
    @scala.inline
    def setApiName(value: String): Self = this.set("apiName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiName: Self = this.set("apiName", js.undefined)
    @scala.inline
    def setCfnRole(value: String): Self = this.set("cfnRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCfnRole: Self = this.set("cfnRole", js.undefined)
    @scala.inline
    def setDeploymentBucket(value: DeploymentBucket): Self = this.set("deploymentBucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentBucket: Self = this.set("deploymentBucket", js.undefined)
    @scala.inline
    def setDeploymentPrefix(value: String): Self = this.set("deploymentPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentPrefix: Self = this.set("deploymentPrefix", js.undefined)
    @scala.inline
    def setEndpointType(value: regional | edge | `private`): Self = this.set("endpointType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointType: Self = this.set("endpointType", js.undefined)
    @scala.inline
    def setEnvironment(value: Environment): Self = this.set("environment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    @scala.inline
    def setHttpApi(value: HttpApi): Self = this.set("httpApi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpApi: Self = this.set("httpApi", js.undefined)
    @scala.inline
    def setIamManagedPoliciesVarargs(value: String*): Self = this.set("iamManagedPolicies", js.Array(value :_*))
    @scala.inline
    def setIamManagedPolicies(value: js.Array[String]): Self = this.set("iamManagedPolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamManagedPolicies: Self = this.set("iamManagedPolicies", js.undefined)
    @scala.inline
    def setIamRoleStatementsVarargs(value: IamRoleStatement*): Self = this.set("iamRoleStatements", js.Array(value :_*))
    @scala.inline
    def setIamRoleStatements(value: js.Array[IamRoleStatement]): Self = this.set("iamRoleStatements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamRoleStatements: Self = this.set("iamRoleStatements", js.undefined)
    @scala.inline
    def setLogRetentionInDays(value: Double | String): Self = this.set("logRetentionInDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogRetentionInDays: Self = this.set("logRetentionInDays", js.undefined)
    @scala.inline
    def setLogs(value: Logs): Self = this.set("logs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogs: Self = this.set("logs", js.undefined)
    @scala.inline
    def setMemorySize(value: Double | String): Self = this.set("memorySize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemorySize: Self = this.set("memorySize", js.undefined)
    @scala.inline
    def setNotificationArnsVarargs(value: String*): Self = this.set("notificationArns", js.Array(value :_*))
    @scala.inline
    def setNotificationArns(value: js.Array[String]): Self = this.set("notificationArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationArns: Self = this.set("notificationArns", js.undefined)
    @scala.inline
    def setProfile(value: String): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setReservedConcurrency(value: Double | String): Self = this.set("reservedConcurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReservedConcurrency: Self = this.set("reservedConcurrency", js.undefined)
    @scala.inline
    def setResourcePolicyVarargs(value: ResourcePolicy*): Self = this.set("resourcePolicy", js.Array(value :_*))
    @scala.inline
    def setResourcePolicy(value: js.Array[ResourcePolicy]): Self = this.set("resourcePolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourcePolicy: Self = this.set("resourcePolicy", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setRolePermissionsBoundary(value: String): Self = this.set("rolePermissionsBoundary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRolePermissionsBoundary: Self = this.set("rolePermissionsBoundary", js.undefined)
    @scala.inline
    def setRollbackConfiguration(value: RollbackConfiguration): Self = this.set("rollbackConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRollbackConfiguration: Self = this.set("rollbackConfiguration", js.undefined)
    @scala.inline
    def setStackName(value: String): Self = this.set("stackName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackName: Self = this.set("stackName", js.undefined)
    @scala.inline
    def setStackParametersVarargs(value: StackParameters*): Self = this.set("stackParameters", js.Array(value :_*))
    @scala.inline
    def setStackParameters(value: js.Array[StackParameters]): Self = this.set("stackParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackParameters: Self = this.set("stackParameters", js.undefined)
    @scala.inline
    def setStackPolicyVarargs(value: ResourcePolicy*): Self = this.set("stackPolicy", js.Array(value :_*))
    @scala.inline
    def setStackPolicy(value: js.Array[ResourcePolicy]): Self = this.set("stackPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackPolicy: Self = this.set("stackPolicy", js.undefined)
    @scala.inline
    def setStackTags(value: Tags): Self = this.set("stackTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackTags: Self = this.set("stackTags", js.undefined)
    @scala.inline
    def setStage(value: String): Self = this.set("stage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStage: Self = this.set("stage", js.undefined)
    @scala.inline
    def setTags(value: Tags): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTimeout(value: Double | String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setTracing(value: Tracing): Self = this.set("tracing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTracing: Self = this.set("tracing", js.undefined)
    @scala.inline
    def setUsagePlan(value: UsagePlan): Self = this.set("usagePlan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsagePlan: Self = this.set("usagePlan", js.undefined)
    @scala.inline
    def setVersionFunctions(value: Boolean): Self = this.set("versionFunctions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionFunctions: Self = this.set("versionFunctions", js.undefined)
    @scala.inline
    def setVpc(value: Vpc): Self = this.set("vpc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpc: Self = this.set("vpc", js.undefined)
    @scala.inline
    def setWebsocketsApiName(value: String): Self = this.set("websocketsApiName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsocketsApiName: Self = this.set("websocketsApiName", js.undefined)
    @scala.inline
    def setWebsocketsApiRouteSelectionExpression(value: String): Self = this.set("websocketsApiRouteSelectionExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsocketsApiRouteSelectionExpression: Self = this.set("websocketsApiRouteSelectionExpression", js.undefined)
  }
  
}

