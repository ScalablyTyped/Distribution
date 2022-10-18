package typings.serverless.pluginsAwsProviderAwsProviderMod

import typings.serverless.serverlessStrings.`private`
import typings.serverless.serverlessStrings.arm64
import typings.serverless.serverlessStrings.aws
import typings.serverless.serverlessStrings.edge
import typings.serverless.serverlessStrings.regional
import typings.serverless.serverlessStrings.x86_64
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Provider extends StObject {
  
  var alb: js.UndefOr[Alb] = js.undefined
  
  var apiGateway: js.UndefOr[ApiGateway] = js.undefined
  
  var apiKeys: js.UndefOr[js.Array[String]] = js.undefined
  
  var apiName: js.UndefOr[String] = js.undefined
  
  var architecture: js.UndefOr[x86_64 | arm64] = js.undefined
  
  /** @deprecated in favor of `iam.deploymentRole` */
  var cfnRole: js.UndefOr[String] = js.undefined
  
  var deploymentBucket: js.UndefOr[DeploymentBucket] = js.undefined
  
  var deploymentPrefix: js.UndefOr[String] = js.undefined
  
  var endpointType: js.UndefOr[regional | edge | `private`] = js.undefined
  
  var environment: js.UndefOr[Environment | String] = js.undefined
  
  var eventBridge: js.UndefOr[EventBridge] = js.undefined
  
  var httpApi: js.UndefOr[HttpApi] = js.undefined
  
  var iam: js.UndefOr[IamSettings] = js.undefined
  
  /** @deprecated in favor of `iam.role.managedPolicies` */
  var iamManagedPolicies: js.UndefOr[js.Array[String]] = js.undefined
  
  /** @deprecated in favor of `iam.role.statements` */
  var iamRoleStatements: js.UndefOr[js.Array[IamRoleStatement]] = js.undefined
  
  var kmsKeyArn: js.UndefOr[String] = js.undefined
  
  var lambdaHashingVersion: js.UndefOr[Double] = js.undefined
  
  var layers: js.UndefOr[js.Array[String | (Record[String, String])]] = js.undefined
  
  var logRetentionInDays: js.UndefOr[Double | String] = js.undefined
  
  var logs: js.UndefOr[Logs] = js.undefined
  
  var memorySize: js.UndefOr[Double | String] = js.undefined
  
  var name: aws
  
  var notificationArns: js.UndefOr[js.Array[String]] = js.undefined
  
  var profile: js.UndefOr[String] = js.undefined
  
  var region: js.UndefOr[String] = js.undefined
  
  var reservedConcurrency: js.UndefOr[Double | String] = js.undefined
  
  var resourcePolicy: js.UndefOr[js.Array[ResourcePolicy]] = js.undefined
  
  /** @deprecated in favor of `iam.role` */
  var role: js.UndefOr[String] = js.undefined
  
  /** @deprecated in favor of `iam.role.permissionsBoundary` */
  var rolePermissionsBoundary: js.UndefOr[String] = js.undefined
  
  var rollbackConfiguration: js.UndefOr[RollbackConfiguration] = js.undefined
  
  var runtime: js.UndefOr[String] = js.undefined
  
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
  
  var vpc: js.UndefOr[String | Vpc] = js.undefined
  
  var websocketsApiName: js.UndefOr[String] = js.undefined
  
  var websocketsApiRouteSelectionExpression: js.UndefOr[String] = js.undefined
}
object Provider {
  
  inline def apply(): Provider = {
    val __obj = js.Dynamic.literal(name = "aws")
    __obj.asInstanceOf[Provider]
  }
  
  extension [Self <: Provider](x: Self) {
    
    inline def setAlb(value: Alb): Self = StObject.set(x, "alb", value.asInstanceOf[js.Any])
    
    inline def setAlbUndefined: Self = StObject.set(x, "alb", js.undefined)
    
    inline def setApiGateway(value: ApiGateway): Self = StObject.set(x, "apiGateway", value.asInstanceOf[js.Any])
    
    inline def setApiGatewayUndefined: Self = StObject.set(x, "apiGateway", js.undefined)
    
    inline def setApiKeys(value: js.Array[String]): Self = StObject.set(x, "apiKeys", value.asInstanceOf[js.Any])
    
    inline def setApiKeysUndefined: Self = StObject.set(x, "apiKeys", js.undefined)
    
    inline def setApiKeysVarargs(value: String*): Self = StObject.set(x, "apiKeys", js.Array(value*))
    
    inline def setApiName(value: String): Self = StObject.set(x, "apiName", value.asInstanceOf[js.Any])
    
    inline def setApiNameUndefined: Self = StObject.set(x, "apiName", js.undefined)
    
    inline def setArchitecture(value: x86_64 | arm64): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    
    inline def setCfnRole(value: String): Self = StObject.set(x, "cfnRole", value.asInstanceOf[js.Any])
    
    inline def setCfnRoleUndefined: Self = StObject.set(x, "cfnRole", js.undefined)
    
    inline def setDeploymentBucket(value: DeploymentBucket): Self = StObject.set(x, "deploymentBucket", value.asInstanceOf[js.Any])
    
    inline def setDeploymentBucketUndefined: Self = StObject.set(x, "deploymentBucket", js.undefined)
    
    inline def setDeploymentPrefix(value: String): Self = StObject.set(x, "deploymentPrefix", value.asInstanceOf[js.Any])
    
    inline def setDeploymentPrefixUndefined: Self = StObject.set(x, "deploymentPrefix", js.undefined)
    
    inline def setEndpointType(value: regional | edge | `private`): Self = StObject.set(x, "endpointType", value.asInstanceOf[js.Any])
    
    inline def setEndpointTypeUndefined: Self = StObject.set(x, "endpointType", js.undefined)
    
    inline def setEnvironment(value: Environment | String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setEventBridge(value: EventBridge): Self = StObject.set(x, "eventBridge", value.asInstanceOf[js.Any])
    
    inline def setEventBridgeUndefined: Self = StObject.set(x, "eventBridge", js.undefined)
    
    inline def setHttpApi(value: HttpApi): Self = StObject.set(x, "httpApi", value.asInstanceOf[js.Any])
    
    inline def setHttpApiUndefined: Self = StObject.set(x, "httpApi", js.undefined)
    
    inline def setIam(value: IamSettings): Self = StObject.set(x, "iam", value.asInstanceOf[js.Any])
    
    inline def setIamManagedPolicies(value: js.Array[String]): Self = StObject.set(x, "iamManagedPolicies", value.asInstanceOf[js.Any])
    
    inline def setIamManagedPoliciesUndefined: Self = StObject.set(x, "iamManagedPolicies", js.undefined)
    
    inline def setIamManagedPoliciesVarargs(value: String*): Self = StObject.set(x, "iamManagedPolicies", js.Array(value*))
    
    inline def setIamRoleStatements(value: js.Array[IamRoleStatement]): Self = StObject.set(x, "iamRoleStatements", value.asInstanceOf[js.Any])
    
    inline def setIamRoleStatementsUndefined: Self = StObject.set(x, "iamRoleStatements", js.undefined)
    
    inline def setIamRoleStatementsVarargs(value: IamRoleStatement*): Self = StObject.set(x, "iamRoleStatements", js.Array(value*))
    
    inline def setIamUndefined: Self = StObject.set(x, "iam", js.undefined)
    
    inline def setKmsKeyArn(value: String): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
    
    inline def setLambdaHashingVersion(value: Double): Self = StObject.set(x, "lambdaHashingVersion", value.asInstanceOf[js.Any])
    
    inline def setLambdaHashingVersionUndefined: Self = StObject.set(x, "lambdaHashingVersion", js.undefined)
    
    inline def setLayers(value: js.Array[String | (Record[String, String])]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: (String | (Record[String, String]))*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setLogRetentionInDays(value: Double | String): Self = StObject.set(x, "logRetentionInDays", value.asInstanceOf[js.Any])
    
    inline def setLogRetentionInDaysUndefined: Self = StObject.set(x, "logRetentionInDays", js.undefined)
    
    inline def setLogs(value: Logs): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
    
    inline def setLogsUndefined: Self = StObject.set(x, "logs", js.undefined)
    
    inline def setMemorySize(value: Double | String): Self = StObject.set(x, "memorySize", value.asInstanceOf[js.Any])
    
    inline def setMemorySizeUndefined: Self = StObject.set(x, "memorySize", js.undefined)
    
    inline def setName(value: aws): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNotificationArns(value: js.Array[String]): Self = StObject.set(x, "notificationArns", value.asInstanceOf[js.Any])
    
    inline def setNotificationArnsUndefined: Self = StObject.set(x, "notificationArns", js.undefined)
    
    inline def setNotificationArnsVarargs(value: String*): Self = StObject.set(x, "notificationArns", js.Array(value*))
    
    inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setReservedConcurrency(value: Double | String): Self = StObject.set(x, "reservedConcurrency", value.asInstanceOf[js.Any])
    
    inline def setReservedConcurrencyUndefined: Self = StObject.set(x, "reservedConcurrency", js.undefined)
    
    inline def setResourcePolicy(value: js.Array[ResourcePolicy]): Self = StObject.set(x, "resourcePolicy", value.asInstanceOf[js.Any])
    
    inline def setResourcePolicyUndefined: Self = StObject.set(x, "resourcePolicy", js.undefined)
    
    inline def setResourcePolicyVarargs(value: ResourcePolicy*): Self = StObject.set(x, "resourcePolicy", js.Array(value*))
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRolePermissionsBoundary(value: String): Self = StObject.set(x, "rolePermissionsBoundary", value.asInstanceOf[js.Any])
    
    inline def setRolePermissionsBoundaryUndefined: Self = StObject.set(x, "rolePermissionsBoundary", js.undefined)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setRollbackConfiguration(value: RollbackConfiguration): Self = StObject.set(x, "rollbackConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRollbackConfigurationUndefined: Self = StObject.set(x, "rollbackConfiguration", js.undefined)
    
    inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setStackName(value: String): Self = StObject.set(x, "stackName", value.asInstanceOf[js.Any])
    
    inline def setStackNameUndefined: Self = StObject.set(x, "stackName", js.undefined)
    
    inline def setStackParameters(value: js.Array[StackParameters]): Self = StObject.set(x, "stackParameters", value.asInstanceOf[js.Any])
    
    inline def setStackParametersUndefined: Self = StObject.set(x, "stackParameters", js.undefined)
    
    inline def setStackParametersVarargs(value: StackParameters*): Self = StObject.set(x, "stackParameters", js.Array(value*))
    
    inline def setStackPolicy(value: js.Array[ResourcePolicy]): Self = StObject.set(x, "stackPolicy", value.asInstanceOf[js.Any])
    
    inline def setStackPolicyUndefined: Self = StObject.set(x, "stackPolicy", js.undefined)
    
    inline def setStackPolicyVarargs(value: ResourcePolicy*): Self = StObject.set(x, "stackPolicy", js.Array(value*))
    
    inline def setStackTags(value: Tags): Self = StObject.set(x, "stackTags", value.asInstanceOf[js.Any])
    
    inline def setStackTagsUndefined: Self = StObject.set(x, "stackTags", js.undefined)
    
    inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTimeout(value: Double | String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTracing(value: Tracing): Self = StObject.set(x, "tracing", value.asInstanceOf[js.Any])
    
    inline def setTracingUndefined: Self = StObject.set(x, "tracing", js.undefined)
    
    inline def setUsagePlan(value: UsagePlan): Self = StObject.set(x, "usagePlan", value.asInstanceOf[js.Any])
    
    inline def setUsagePlanUndefined: Self = StObject.set(x, "usagePlan", js.undefined)
    
    inline def setVersionFunctions(value: Boolean): Self = StObject.set(x, "versionFunctions", value.asInstanceOf[js.Any])
    
    inline def setVersionFunctionsUndefined: Self = StObject.set(x, "versionFunctions", js.undefined)
    
    inline def setVpc(value: String | Vpc): Self = StObject.set(x, "vpc", value.asInstanceOf[js.Any])
    
    inline def setVpcUndefined: Self = StObject.set(x, "vpc", js.undefined)
    
    inline def setWebsocketsApiName(value: String): Self = StObject.set(x, "websocketsApiName", value.asInstanceOf[js.Any])
    
    inline def setWebsocketsApiNameUndefined: Self = StObject.set(x, "websocketsApiName", js.undefined)
    
    inline def setWebsocketsApiRouteSelectionExpression(value: String): Self = StObject.set(x, "websocketsApiRouteSelectionExpression", value.asInstanceOf[js.Any])
    
    inline def setWebsocketsApiRouteSelectionExpressionUndefined: Self = StObject.set(x, "websocketsApiRouteSelectionExpression", js.undefined)
  }
}
