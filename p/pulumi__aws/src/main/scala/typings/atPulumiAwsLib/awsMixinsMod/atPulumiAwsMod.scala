package typings
package atPulumiAwsLib.awsMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/awsMixins", "@pulumi/aws")
@js.native
object atPulumiAwsMod extends js.Object {
  /**
    * Provides quick access to the "aws-sdk" SDK (https://github.com/aws/aws-sdk-js) within a
    * javascript callback function that is serialized into an AWS Lambda.  Inside a Pulumi app
    * a program can be written like so:
    *
    * ```ts
    *    import * as aws from "@pulumi/aws";
    *
    *    // ...
    *
    *    // inside the callback function for an AWS Lambda:
    *    const client = new aws.sdk.DynamoDB.DocumentClient(...opt-args...);
    * ```
    *
    * Note: this property will give you the aws-sdk module that AWS automatically includes
    * with any javascript Lambda.
    */
  @js.native
  object sdk extends js.Object {
    var ACM: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ACM] = js.native
    val ACMNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var ACMPCA: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ACMPCA] = js.native
    val ACMPCANs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var APIGateway: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.APIGateway] = js.native
    val APIGatewayNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var AWSError: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.AWSError] = js.native
    var AlexaForBusiness: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.AlexaForBusiness] = js.native
    val AlexaForBusinessNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Amplify: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Amplify] = js.native
    val AmplifyNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var ApiGatewayManagementApi: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ApiGatewayManagementApi] = js.native
    val ApiGatewayManagementApiNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var ApiGatewayV2: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ApiGatewayV2] = js.native
    val ApiGatewayV2Ns: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var AppMesh: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.AppMesh] = js.native
    val AppMeshNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var AppStream: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.AppStream] = js.native
    val AppStreamNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var AppSync: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.AppSync] = js.native
    val AppSyncNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var ApplicationAutoScaling: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ApplicationAutoScaling] = js.native
    val ApplicationAutoScalingNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Athena: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Athena] = js.native
    val AthenaNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var AutoScaling: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.AutoScaling] = js.native
    val AutoScalingNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var AutoScalingPlans: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.AutoScalingPlans] = js.native
    val AutoScalingPlansNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Backup: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Backup] = js.native
    val BackupNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Batch: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Batch] = js.native
    val BatchNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Budgets: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.clientsBudgetsMod.Budgets] = js.native
    val BudgetsNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var CUR: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CUR] = js.native
    val CURNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var ChainableTemporaryCredentials: org.scalablytyped.runtime.Instantiable1[
        /* options */ awsDashSdkLib.libCredentialsChainableUnderscoreTemporaryUnderscoreCredentialsMod.ChainableTemporaryCredentialsNs.ChainableTemporaryCredentialsOptions, 
        awsDashSdkLib.awsDashSdkMod.ChainableTemporaryCredentials
      ] = js.native
    // Needed to expose interfaces on the class
    val ChainableTemporaryCredentialsNs: js.Any = js.native
    var Chime: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Chime] = js.native
    val ChimeNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Cloud9: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Cloud9] = js.native
    val Cloud9Ns: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var CloudDirectory: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CloudDirectory] = js.native
    val CloudDirectoryNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var CloudFormation: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CloudFormation] = js.native
    val CloudFormationNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var CloudFront: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CloudFront] = js.native
    val CloudFrontNs: atPulumiAwsLib.Anon_KeyPairId = js.native
    var CloudHSM: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CloudHSM] = js.native
    val CloudHSMNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var CloudHSMV2: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CloudHSMV2] = js.native
    val CloudHSMV2Ns: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var CloudSearch: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CloudSearch] = js.native
    var CloudSearchDomain: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CloudSearchDomain] = js.native
    val CloudSearchDomainNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    val CloudSearchNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var CloudTrail: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CloudTrail] = js.native
    val CloudTrailNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var CloudWatch: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CloudWatch] = js.native
    var CloudWatchEvents: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CloudWatchEvents] = js.native
    val CloudWatchEventsNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var CloudWatchLogs: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CloudWatchLogs] = js.native
    val CloudWatchLogsNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    val CloudWatchNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var CodeBuild: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CodeBuild] = js.native
    val CodeBuildNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var CodeCommit: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CodeCommit] = js.native
    val CodeCommitNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var CodeDeploy: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CodeDeploy] = js.native
    val CodeDeployNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var CodePipeline: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CodePipeline] = js.native
    val CodePipelineNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var CodeStar: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CodeStar] = js.native
    val CodeStarNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var CognitoIdentity: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CognitoIdentity] = js.native
    var CognitoIdentityCredentials: org.scalablytyped.runtime.Instantiable1[
        /* options */ awsDashSdkLib.libCredentialsCognitoUnderscoreIdentityUnderscoreCredentialsMod.CognitoIdentityCredentialsNs.CognitoIdentityOptions, 
        awsDashSdkLib.awsDashSdkMod.CognitoIdentityCredentials
      ] = js.native
    // Needed to expose interfaces on the class
    val CognitoIdentityCredentialsNs: js.Any = js.native
    val CognitoIdentityNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var CognitoIdentityServiceProvider: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CognitoIdentityServiceProvider] = js.native
    val CognitoIdentityServiceProviderNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var CognitoSync: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CognitoSync] = js.native
    val CognitoSyncNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Comprehend: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Comprehend] = js.native
    var ComprehendMedical: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ComprehendMedical] = js.native
    val ComprehendMedicalNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    val ComprehendNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Config: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Config] = js.native
    var ConfigService: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ConfigService] = js.native
    val ConfigServiceNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Connect: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Connect] = js.native
    val ConnectNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var CostExplorer: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CostExplorer] = js.native
    val CostExplorerNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var CredentialProviderChain: atPulumiAwsLib.Anon_DefaultProviders = js.native
    var Credentials: atPulumiAwsLib.Anon_ExpiryWindow = js.native
    var DAX: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.DAX] = js.native
    val DAXNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var DLM: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.DLM] = js.native
    val DLMNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var DMS: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.DMS] = js.native
    val DMSNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var DataPipeline: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.DataPipeline] = js.native
    val DataPipelineNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var DataSync: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.DataSync] = js.native
    val DataSyncNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var DeviceFarm: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.DeviceFarm] = js.native
    val DeviceFarmNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var DirectConnect: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.DirectConnect] = js.native
    val DirectConnectNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var DirectoryService: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.DirectoryService] = js.native
    val DirectoryServiceNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Discovery: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Discovery] = js.native
    val DiscoveryNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var DocDB: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.DocDB] = js.native
    val DocDBNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var DynamoDB: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.DynamoDB] = js.native
    val DynamoDBNs: atPulumiAwsLib.Anon_Converter = js.native
    var DynamoDBStreams: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.DynamoDBStreams] = js.native
    val DynamoDBStreamsNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var EC2: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.EC2] = js.native
    var EC2MetadataCredentials: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.EC2MetadataCredentials] = js.native
    val EC2Ns: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var ECR: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ECR] = js.native
    val ECRNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var ECS: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ECS] = js.native
    var ECSCredentials: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ECSCredentials] = js.native
    val ECSNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var EFS: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.EFS] = js.native
    val EFSNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var EKS: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.EKS] = js.native
    val EKSNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var ELB: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ELB] = js.native
    val ELBNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var ELBv2: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ELBv2] = js.native
    val ELBv2Ns: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var EMR: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.EMR] = js.native
    val EMRNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var ES: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ES] = js.native
    val ESNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var ElastiCache: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ElastiCache] = js.native
    val ElastiCacheNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var ElasticBeanstalk: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ElasticBeanstalk] = js.native
    val ElasticBeanstalkNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var ElasticTranscoder: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ElasticTranscoder] = js.native
    val ElasticTranscoderNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Endpoint: org.scalablytyped.runtime.Instantiable1[/* url */ java.lang.String, awsDashSdkLib.awsDashSdkMod.Endpoint] = js.native
    var EnvironmentCredentials: org.scalablytyped.runtime.Instantiable1[
        /* envPrefix */ java.lang.String, 
        awsDashSdkLib.awsDashSdkMod.EnvironmentCredentials
      ] = js.native
    val EventListenersNs: atPulumiAwsLib.Anon_Core = js.native
    var FMS: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.FMS] = js.native
    val FMSNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var FSx: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.FSx] = js.native
    val FSxNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var FileSystemCredentials: org.scalablytyped.runtime.Instantiable1[/* filename */ java.lang.String, awsDashSdkLib.awsDashSdkMod.FileSystemCredentials] = js.native
    var Firehose: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Firehose] = js.native
    val FirehoseNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var GameLift: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.GameLift] = js.native
    val GameLiftNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Glacier: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Glacier] = js.native
    val GlacierNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var GlobalAccelerator: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.GlobalAccelerator] = js.native
    val GlobalAcceleratorNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Glue: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Glue] = js.native
    val GlueNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Greengrass: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Greengrass] = js.native
    val GreengrassNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var GuardDuty: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.GuardDuty] = js.native
    val GuardDutyNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Health: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Health] = js.native
    val HealthNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var HttpRequest: org.scalablytyped.runtime.Instantiable2[
        /* endpoint */ awsDashSdkLib.libEndpointMod.Endpoint, 
        /* region */ java.lang.String, 
        awsDashSdkLib.awsDashSdkMod.HttpRequest
      ] = js.native
    var HttpResponse: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.HttpResponse] = js.native
    var IAM: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.IAM] = js.native
    val IAMNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var ImportExport: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ImportExport] = js.native
    val ImportExportNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var IniLoader: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.IniLoader] = js.native
    var Inspector: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Inspector] = js.native
    val InspectorNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var IoT1ClickDevicesService: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.IoT1ClickDevicesService] = js.native
    val IoT1ClickDevicesServiceNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var IoT1ClickProjects: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.IoT1ClickProjects] = js.native
    val IoT1ClickProjectsNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var IoTAnalytics: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.IoTAnalytics] = js.native
    val IoTAnalyticsNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var IoTJobsDataPlane: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.IoTJobsDataPlane] = js.native
    val IoTJobsDataPlaneNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Iot: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Iot] = js.native
    var IotData: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.IotData] = js.native
    val IotDataNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    val IotNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var KMS: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.KMS] = js.native
    val KMSNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Kafka: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Kafka] = js.native
    val KafkaNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Kinesis: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Kinesis] = js.native
    var KinesisAnalytics: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.KinesisAnalytics] = js.native
    val KinesisAnalyticsNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var KinesisAnalyticsV2: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.KinesisAnalyticsV2] = js.native
    val KinesisAnalyticsV2Ns: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    val KinesisNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var KinesisVideo: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.KinesisVideo] = js.native
    var KinesisVideoArchivedMedia: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.KinesisVideoArchivedMedia] = js.native
    val KinesisVideoArchivedMediaNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var KinesisVideoMedia: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.KinesisVideoMedia] = js.native
    val KinesisVideoMediaNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    val KinesisVideoNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Lambda: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Lambda] = js.native
    val LambdaNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var LexModelBuildingService: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.LexModelBuildingService] = js.native
    val LexModelBuildingServiceNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var LexRuntime: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.LexRuntime] = js.native
    val LexRuntimeNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var LicenseManager: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.LicenseManager] = js.native
    val LicenseManagerNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Lightsail: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Lightsail] = js.native
    val LightsailNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var MQ: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.MQ] = js.native
    val MQNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var MTurk: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.MTurk] = js.native
    val MTurkNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var MachineLearning: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.MachineLearning] = js.native
    val MachineLearningNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Macie: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Macie] = js.native
    val MacieNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var ManagedBlockchain: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ManagedBlockchain] = js.native
    val ManagedBlockchainNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var MarketplaceCommerceAnalytics: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.MarketplaceCommerceAnalytics] = js.native
    val MarketplaceCommerceAnalyticsNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var MarketplaceEntitlementService: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.MarketplaceEntitlementService] = js.native
    val MarketplaceEntitlementServiceNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var MarketplaceMetering: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.MarketplaceMetering] = js.native
    val MarketplaceMeteringNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var MediaConnect: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.MediaConnect] = js.native
    val MediaConnectNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var MediaConvert: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.MediaConvert] = js.native
    val MediaConvertNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var MediaLive: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.MediaLive] = js.native
    val MediaLiveNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var MediaPackage: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.MediaPackage] = js.native
    val MediaPackageNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var MediaPackageVod: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.MediaPackageVod] = js.native
    val MediaPackageVodNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var MediaStore: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.MediaStore] = js.native
    var MediaStoreData: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.MediaStoreData] = js.native
    val MediaStoreDataNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    val MediaStoreNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var MediaTailor: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.MediaTailor] = js.native
    val MediaTailorNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var MetadataService: atPulumiAwsLib.Anon_HostMetadataService = js.native
    var MigrationHub: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.MigrationHub] = js.native
    val MigrationHubNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Mobile: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Mobile] = js.native
    var MobileAnalytics: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.MobileAnalytics] = js.native
    val MobileAnalyticsNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    val MobileNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Neptune: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Neptune] = js.native
    val NeptuneNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var OpsWorks: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.OpsWorks] = js.native
    var OpsWorksCM: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.OpsWorksCM] = js.native
    val OpsWorksCMNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    val OpsWorksNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Organizations: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Organizations] = js.native
    val OrganizationsNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var PI: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.PI] = js.native
    val PINs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Pinpoint: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Pinpoint] = js.native
    var PinpointEmail: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.PinpointEmail] = js.native
    val PinpointEmailNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    val PinpointNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var PinpointSMSVoice: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.PinpointSMSVoice] = js.native
    val PinpointSMSVoiceNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Polly: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Polly] = js.native
    val PollyNs: atPulumiAwsLib.Anon_Presigner = js.native
    var Pricing: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Pricing] = js.native
    val PricingNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var ProcessCredentials: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ProcessCredentials] = js.native
    var QuickSight: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.QuickSight] = js.native
    val QuickSightNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var RAM: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.RAM] = js.native
    val RAMNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var RDS: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.RDS] = js.native
    var RDSDataService: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.RDSDataService] = js.native
    val RDSDataServiceNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    val RDSNs: atPulumiAwsLib.Anon_Signer = js.native
    var Redshift: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Redshift] = js.native
    val RedshiftNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Rekognition: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Rekognition] = js.native
    val RekognitionNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var RemoteCredentials: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.RemoteCredentials] = js.native
    var Request: org.scalablytyped.runtime.Instantiable2[
        /* service */ awsDashSdkLib.libServiceMod.Service, 
        /* operation */ java.lang.String, 
        awsDashSdkLib.awsDashSdkMod.Request[js.Object, js.Object]
      ] = js.native
    var ResourceGroups: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ResourceGroups] = js.native
    val ResourceGroupsNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var ResourceGroupsTaggingAPI: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ResourceGroupsTaggingAPI] = js.native
    val ResourceGroupsTaggingAPINs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Response: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Response[js.Object, js.Object]] = js.native
    var RoboMaker: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.RoboMaker] = js.native
    val RoboMakerNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Route53: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Route53] = js.native
    var Route53Domains: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Route53Domains] = js.native
    val Route53DomainsNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    val Route53Ns: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Route53Resolver: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Route53Resolver] = js.native
    val Route53ResolverNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var S3: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.S3] = js.native
    var S3Control: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.S3Control] = js.native
    val S3ControlNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    val S3Ns: atPulumiAwsLib.Anon_ManagedUpload = js.native
    var SAMLCredentials: org.scalablytyped.runtime.Instantiable1[
        /* params */ awsDashSdkLib.libCredentialsSamlUnderscoreCredentialsMod.SAMLCredentialsParams, 
        awsDashSdkLib.awsDashSdkMod.SAMLCredentials
      ] = js.native
    var SES: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.SES] = js.native
    val SESNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var SMS: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.SMS] = js.native
    val SMSNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var SNS: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.SNS] = js.native
    val SNSNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var SQS: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.SQS] = js.native
    val SQSNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var SSM: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.SSM] = js.native
    val SSMNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var STS: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.STS] = js.native
    val STSNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var SWF: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.SWF] = js.native
    val SWFNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var SageMaker: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.SageMaker] = js.native
    val SageMakerNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var SageMakerRuntime: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.SageMakerRuntime] = js.native
    val SageMakerRuntimeNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var SecretsManager: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.SecretsManager] = js.native
    val SecretsManagerNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var SecurityHub: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.SecurityHub] = js.native
    val SecurityHubNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var ServerlessApplicationRepository: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ServerlessApplicationRepository] = js.native
    val ServerlessApplicationRepositoryNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Service: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Service] = js.native
    var ServiceCatalog: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ServiceCatalog] = js.native
    val ServiceCatalogNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var ServiceDiscovery: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ServiceDiscovery] = js.native
    val ServiceDiscoveryNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var SharedIniFileCredentials: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.SharedIniFileCredentials] = js.native
    var Shield: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Shield] = js.native
    val ShieldNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Signer: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Signer] = js.native
    val SignerNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var SimpleDB: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.SimpleDB] = js.native
    val SimpleDBNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Snowball: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Snowball] = js.native
    val SnowballNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var StepFunctions: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.StepFunctions] = js.native
    val StepFunctionsNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var StorageGateway: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.StorageGateway] = js.native
    val StorageGatewayNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Support: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Support] = js.native
    val SupportNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var TemporaryCredentials: org.scalablytyped.runtime.Instantiable1[
        /* options */ awsDashSdkLib.libCredentialsTemporaryUnderscoreCredentialsMod.TemporaryCredentialsNs.TemporaryCredentialsOptions, 
        awsDashSdkLib.awsDashSdkMod.TemporaryCredentials
      ] = js.native
    // Needed to expose interfaces on the class
    val TemporaryCredentialsNs: js.Any = js.native
    var Textract: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Textract] = js.native
    val TextractNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var TranscribeService: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.TranscribeService] = js.native
    val TranscribeServiceNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Transfer: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Transfer] = js.native
    val TransferNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var Translate: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Translate] = js.native
    val TranslateNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var WAF: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.WAF] = js.native
    val WAFNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var WAFRegional: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.WAFRegional] = js.native
    val WAFRegionalNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var WebIdentityCredentials: org.scalablytyped.runtime.Instantiable1[
        /* options */ awsDashSdkLib.libCredentialsWebUnderscoreIdentityUnderscoreCredentialsMod.WebIdentityCredentialsNs.WebIdentityCredentialsOptions, 
        awsDashSdkLib.awsDashSdkMod.WebIdentityCredentials
      ] = js.native
    // Needed to expose interfaces on the class
    val WebIdentityCredentialsNs: js.Any = js.native
    var WorkDocs: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.WorkDocs] = js.native
    val WorkDocsNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var WorkLink: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.WorkLink] = js.native
    val WorkLinkNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var WorkMail: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.WorkMail] = js.native
    val WorkMailNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var WorkSpaces: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.WorkSpaces] = js.native
    val WorkSpacesNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var XRay: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.XRay] = js.native
    val XRayNs: atPulumiAwsLib.Anon_TypesReadOnly = js.native
    var config: awsDashSdkLib.libConfigMod.GlobalConfigInstance = js.native
  }
  
}

