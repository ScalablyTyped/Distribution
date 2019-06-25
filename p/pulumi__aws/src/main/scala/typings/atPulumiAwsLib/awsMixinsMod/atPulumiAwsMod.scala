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
    val ACMNs: atPulumiAwsLib.TypeofACM = js.native
    var ACMPCA: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ACMPCA] = js.native
    val ACMPCANs: atPulumiAwsLib.TypeofACMPCA = js.native
    var APIGateway: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.APIGateway] = js.native
    val APIGatewayNs: atPulumiAwsLib.TypeofAPIGateway = js.native
    var AWSError: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.AWSError] = js.native
    var AlexaForBusiness: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.AlexaForBusiness] = js.native
    val AlexaForBusinessNs: atPulumiAwsLib.TypeofAlexaForBusiness = js.native
    var Amplify: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Amplify] = js.native
    val AmplifyNs: atPulumiAwsLib.TypeofAmplify = js.native
    var ApiGatewayManagementApi: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ApiGatewayManagementApi] = js.native
    val ApiGatewayManagementApiNs: atPulumiAwsLib.TypeofApiGatewayManagementApi = js.native
    var ApiGatewayV2: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ApiGatewayV2] = js.native
    val ApiGatewayV2Ns: atPulumiAwsLib.TypeofApiGatewayV2 = js.native
    var AppMesh: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.AppMesh] = js.native
    val AppMeshNs: atPulumiAwsLib.TypeofAppMesh = js.native
    var AppStream: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.AppStream] = js.native
    val AppStreamNs: atPulumiAwsLib.TypeofAppStream = js.native
    var AppSync: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.AppSync] = js.native
    val AppSyncNs: atPulumiAwsLib.TypeofAppSync = js.native
    var ApplicationAutoScaling: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ApplicationAutoScaling] = js.native
    val ApplicationAutoScalingNs: atPulumiAwsLib.TypeofApplicationAutoScaling = js.native
    var ApplicationInsights: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ApplicationInsights] = js.native
    val ApplicationInsightsNs: atPulumiAwsLib.TypeofApplicationInsights = js.native
    var Athena: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Athena] = js.native
    val AthenaNs: atPulumiAwsLib.TypeofAthena = js.native
    var AutoScaling: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.AutoScaling] = js.native
    val AutoScalingNs: atPulumiAwsLib.TypeofAutoScaling = js.native
    var AutoScalingPlans: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.AutoScalingPlans] = js.native
    val AutoScalingPlansNs: atPulumiAwsLib.TypeofAutoScalingPlans = js.native
    var Backup: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Backup] = js.native
    val BackupNs: atPulumiAwsLib.TypeofBackup = js.native
    var Batch: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Batch] = js.native
    val BatchNs: atPulumiAwsLib.TypeofBatch = js.native
    var Budgets: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.clientsBudgetsMod.Budgets] = js.native
    val BudgetsNs: atPulumiAwsLib.TypeofBudgets = js.native
    var CUR: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CUR] = js.native
    val CURNs: atPulumiAwsLib.TypeofCUR = js.native
    var ChainableTemporaryCredentials: org.scalablytyped.runtime.Instantiable1[
        /* options */ awsDashSdkLib.libCredentialsChainableUnderscoreTemporaryUnderscoreCredentialsMod.ChainableTemporaryCredentialsNs.ChainableTemporaryCredentialsOptions, 
        awsDashSdkLib.awsDashSdkMod.ChainableTemporaryCredentials
      ] = js.native
    // Needed to expose interfaces on the class
    val ChainableTemporaryCredentialsNs: js.Any = js.native
    var Chime: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Chime] = js.native
    val ChimeNs: atPulumiAwsLib.TypeofChime = js.native
    var Cloud9: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Cloud9] = js.native
    val Cloud9Ns: atPulumiAwsLib.TypeofCloud9 = js.native
    var CloudDirectory: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CloudDirectory] = js.native
    val CloudDirectoryNs: atPulumiAwsLib.TypeofCloudDirectory = js.native
    var CloudFormation: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CloudFormation] = js.native
    val CloudFormationNs: atPulumiAwsLib.TypeofCloudFormation = js.native
    var CloudFront: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CloudFront] = js.native
    val CloudFrontNs: atPulumiAwsLib.TypeofCloudFront = js.native
    var CloudHSM: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CloudHSM] = js.native
    val CloudHSMNs: atPulumiAwsLib.TypeofCloudHSM = js.native
    var CloudHSMV2: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CloudHSMV2] = js.native
    val CloudHSMV2Ns: atPulumiAwsLib.TypeofCloudHSMV2 = js.native
    var CloudSearch: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CloudSearch] = js.native
    var CloudSearchDomain: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CloudSearchDomain] = js.native
    val CloudSearchDomainNs: atPulumiAwsLib.TypeofCloudSearchDomain = js.native
    val CloudSearchNs: atPulumiAwsLib.TypeofCloudSearch = js.native
    var CloudTrail: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CloudTrail] = js.native
    val CloudTrailNs: atPulumiAwsLib.TypeofCloudTrail = js.native
    var CloudWatch: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CloudWatch] = js.native
    var CloudWatchEvents: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CloudWatchEvents] = js.native
    val CloudWatchEventsNs: atPulumiAwsLib.TypeofCloudWatchEvents = js.native
    var CloudWatchLogs: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CloudWatchLogs] = js.native
    val CloudWatchLogsNs: atPulumiAwsLib.TypeofCloudWatchLogs = js.native
    val CloudWatchNs: atPulumiAwsLib.TypeofCloudWatch = js.native
    var CodeBuild: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CodeBuild] = js.native
    val CodeBuildNs: atPulumiAwsLib.TypeofCodeBuild = js.native
    var CodeCommit: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CodeCommit] = js.native
    val CodeCommitNs: atPulumiAwsLib.TypeofCodeCommit = js.native
    var CodeDeploy: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CodeDeploy] = js.native
    val CodeDeployNs: atPulumiAwsLib.TypeofCodeDeploy = js.native
    var CodePipeline: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CodePipeline] = js.native
    val CodePipelineNs: atPulumiAwsLib.TypeofCodePipeline = js.native
    var CodeStar: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CodeStar] = js.native
    val CodeStarNs: atPulumiAwsLib.TypeofCodeStar = js.native
    var CognitoIdentity: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CognitoIdentity] = js.native
    var CognitoIdentityCredentials: org.scalablytyped.runtime.Instantiable1[
        /* options */ awsDashSdkLib.libCredentialsCognitoUnderscoreIdentityUnderscoreCredentialsMod.CognitoIdentityCredentialsNs.CognitoIdentityOptions, 
        awsDashSdkLib.awsDashSdkMod.CognitoIdentityCredentials
      ] = js.native
    // Needed to expose interfaces on the class
    val CognitoIdentityCredentialsNs: js.Any = js.native
    val CognitoIdentityNs: atPulumiAwsLib.TypeofCognitoIdentity = js.native
    var CognitoIdentityServiceProvider: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CognitoIdentityServiceProvider] = js.native
    val CognitoIdentityServiceProviderNs: atPulumiAwsLib.TypeofCognitoIdentityServiceProvider = js.native
    var CognitoSync: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CognitoSync] = js.native
    val CognitoSyncNs: atPulumiAwsLib.TypeofCognitoSync = js.native
    var Comprehend: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Comprehend] = js.native
    var ComprehendMedical: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ComprehendMedical] = js.native
    val ComprehendMedicalNs: atPulumiAwsLib.TypeofComprehendMedical = js.native
    val ComprehendNs: atPulumiAwsLib.TypeofComprehend = js.native
    var Config: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Config] = js.native
    var ConfigService: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ConfigService] = js.native
    val ConfigServiceNs: atPulumiAwsLib.TypeofConfigService = js.native
    var Connect: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Connect] = js.native
    val ConnectNs: atPulumiAwsLib.TypeofConnect = js.native
    var CostExplorer: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.CostExplorer] = js.native
    val CostExplorerNs: atPulumiAwsLib.TypeofCostExplorer = js.native
    var CredentialProviderChain: atPulumiAwsLib.TypeofClassCredentialProviderChain = js.native
    var Credentials: atPulumiAwsLib.TypeofClassCredentials = js.native
    var DAX: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.DAX] = js.native
    val DAXNs: atPulumiAwsLib.TypeofDAX = js.native
    var DLM: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.DLM] = js.native
    val DLMNs: atPulumiAwsLib.TypeofDLM = js.native
    var DMS: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.DMS] = js.native
    val DMSNs: atPulumiAwsLib.TypeofDMS = js.native
    var DataPipeline: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.DataPipeline] = js.native
    val DataPipelineNs: atPulumiAwsLib.TypeofDataPipeline = js.native
    var DataSync: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.DataSync] = js.native
    val DataSyncNs: atPulumiAwsLib.TypeofDataSync = js.native
    var DeviceFarm: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.DeviceFarm] = js.native
    val DeviceFarmNs: atPulumiAwsLib.TypeofDeviceFarm = js.native
    var DirectConnect: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.DirectConnect] = js.native
    val DirectConnectNs: atPulumiAwsLib.TypeofDirectConnect = js.native
    var DirectoryService: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.DirectoryService] = js.native
    val DirectoryServiceNs: atPulumiAwsLib.TypeofDirectoryService = js.native
    var Discovery: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Discovery] = js.native
    val DiscoveryNs: atPulumiAwsLib.TypeofDiscovery = js.native
    var DocDB: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.DocDB] = js.native
    val DocDBNs: atPulumiAwsLib.TypeofDocDB = js.native
    var DynamoDB: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.DynamoDB] = js.native
    val DynamoDBNs: atPulumiAwsLib.TypeofDynamoDB = js.native
    var DynamoDBStreams: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.DynamoDBStreams] = js.native
    val DynamoDBStreamsNs: atPulumiAwsLib.TypeofDynamoDBStreams = js.native
    var EC2: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.EC2] = js.native
    var EC2MetadataCredentials: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.EC2MetadataCredentials] = js.native
    val EC2Ns: atPulumiAwsLib.TypeofEC2 = js.native
    var ECR: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ECR] = js.native
    val ECRNs: atPulumiAwsLib.TypeofECR = js.native
    var ECS: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ECS] = js.native
    var ECSCredentials: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ECSCredentials] = js.native
    val ECSNs: atPulumiAwsLib.TypeofECS = js.native
    var EFS: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.EFS] = js.native
    val EFSNs: atPulumiAwsLib.TypeofEFS = js.native
    var EKS: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.EKS] = js.native
    val EKSNs: atPulumiAwsLib.TypeofEKS = js.native
    var ELB: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ELB] = js.native
    val ELBNs: atPulumiAwsLib.TypeofELB = js.native
    var ELBv2: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ELBv2] = js.native
    val ELBv2Ns: atPulumiAwsLib.TypeofELBv2 = js.native
    var EMR: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.EMR] = js.native
    val EMRNs: atPulumiAwsLib.TypeofEMR = js.native
    var ES: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ES] = js.native
    val ESNs: atPulumiAwsLib.TypeofES = js.native
    var ElastiCache: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ElastiCache] = js.native
    val ElastiCacheNs: atPulumiAwsLib.TypeofElastiCache = js.native
    var ElasticBeanstalk: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ElasticBeanstalk] = js.native
    val ElasticBeanstalkNs: atPulumiAwsLib.TypeofElasticBeanstalk = js.native
    var ElasticTranscoder: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ElasticTranscoder] = js.native
    val ElasticTranscoderNs: atPulumiAwsLib.TypeofElasticTranscoder = js.native
    var Endpoint: org.scalablytyped.runtime.Instantiable1[/* url */ java.lang.String, awsDashSdkLib.awsDashSdkMod.Endpoint] = js.native
    var EnvironmentCredentials: org.scalablytyped.runtime.Instantiable1[
        /* envPrefix */ java.lang.String, 
        awsDashSdkLib.awsDashSdkMod.EnvironmentCredentials
      ] = js.native
    val EventListenersNs: atPulumiAwsLib.TypeofEventListeners = js.native
    var FMS: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.FMS] = js.native
    val FMSNs: atPulumiAwsLib.TypeofFMS = js.native
    var FSx: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.FSx] = js.native
    val FSxNs: atPulumiAwsLib.TypeofFSx = js.native
    var FileSystemCredentials: org.scalablytyped.runtime.Instantiable1[/* filename */ java.lang.String, awsDashSdkLib.awsDashSdkMod.FileSystemCredentials] = js.native
    var Firehose: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Firehose] = js.native
    val FirehoseNs: atPulumiAwsLib.TypeofFirehose = js.native
    var GameLift: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.GameLift] = js.native
    val GameLiftNs: atPulumiAwsLib.TypeofGameLift = js.native
    var Glacier: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Glacier] = js.native
    val GlacierNs: atPulumiAwsLib.TypeofGlacier = js.native
    var GlobalAccelerator: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.GlobalAccelerator] = js.native
    val GlobalAcceleratorNs: atPulumiAwsLib.TypeofGlobalAccelerator = js.native
    var Glue: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Glue] = js.native
    val GlueNs: atPulumiAwsLib.TypeofGlue = js.native
    var Greengrass: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Greengrass] = js.native
    val GreengrassNs: atPulumiAwsLib.TypeofGreengrass = js.native
    var GroundStation: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.GroundStation] = js.native
    val GroundStationNs: atPulumiAwsLib.TypeofGroundStation = js.native
    var GuardDuty: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.GuardDuty] = js.native
    val GuardDutyNs: atPulumiAwsLib.TypeofGuardDuty = js.native
    var Health: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Health] = js.native
    val HealthNs: atPulumiAwsLib.TypeofHealth = js.native
    var HttpRequest: org.scalablytyped.runtime.Instantiable2[
        /* endpoint */ awsDashSdkLib.libEndpointMod.Endpoint, 
        /* region */ java.lang.String, 
        awsDashSdkLib.awsDashSdkMod.HttpRequest
      ] = js.native
    var HttpResponse: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.HttpResponse] = js.native
    var IAM: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.IAM] = js.native
    val IAMNs: atPulumiAwsLib.TypeofIAM = js.native
    var ImportExport: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ImportExport] = js.native
    val ImportExportNs: atPulumiAwsLib.TypeofImportExport = js.native
    var IniLoader: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.IniLoader] = js.native
    var Inspector: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Inspector] = js.native
    val InspectorNs: atPulumiAwsLib.TypeofInspector = js.native
    var IoT1ClickDevicesService: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.IoT1ClickDevicesService] = js.native
    val IoT1ClickDevicesServiceNs: atPulumiAwsLib.TypeofIoT1ClickDevicesService = js.native
    var IoT1ClickProjects: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.IoT1ClickProjects] = js.native
    val IoT1ClickProjectsNs: atPulumiAwsLib.TypeofIoT1ClickProjects = js.native
    var IoTAnalytics: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.IoTAnalytics] = js.native
    val IoTAnalyticsNs: atPulumiAwsLib.TypeofIoTAnalytics = js.native
    var IoTEvents: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.IoTEvents] = js.native
    var IoTEventsData: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.IoTEventsData] = js.native
    val IoTEventsDataNs: atPulumiAwsLib.TypeofIoTEventsData = js.native
    val IoTEventsNs: atPulumiAwsLib.TypeofIoTEvents = js.native
    var IoTJobsDataPlane: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.IoTJobsDataPlane] = js.native
    val IoTJobsDataPlaneNs: atPulumiAwsLib.TypeofIoTJobsDataPlane = js.native
    var IoTThingsGraph: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.IoTThingsGraph] = js.native
    val IoTThingsGraphNs: atPulumiAwsLib.TypeofIoTThingsGraph = js.native
    var Iot: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Iot] = js.native
    var IotData: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.IotData] = js.native
    val IotDataNs: atPulumiAwsLib.TypeofIotData = js.native
    val IotNs: atPulumiAwsLib.TypeofIot = js.native
    var KMS: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.KMS] = js.native
    val KMSNs: atPulumiAwsLib.TypeofKMS = js.native
    var Kafka: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Kafka] = js.native
    val KafkaNs: atPulumiAwsLib.TypeofKafka = js.native
    var Kinesis: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Kinesis] = js.native
    var KinesisAnalytics: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.KinesisAnalytics] = js.native
    val KinesisAnalyticsNs: atPulumiAwsLib.TypeofKinesisAnalytics = js.native
    var KinesisAnalyticsV2: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.KinesisAnalyticsV2] = js.native
    val KinesisAnalyticsV2Ns: atPulumiAwsLib.TypeofKinesisAnalyticsV2 = js.native
    val KinesisNs: atPulumiAwsLib.TypeofKinesis = js.native
    var KinesisVideo: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.KinesisVideo] = js.native
    var KinesisVideoArchivedMedia: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.KinesisVideoArchivedMedia] = js.native
    val KinesisVideoArchivedMediaNs: atPulumiAwsLib.TypeofKinesisVideoArchivedMedia = js.native
    var KinesisVideoMedia: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.KinesisVideoMedia] = js.native
    val KinesisVideoMediaNs: atPulumiAwsLib.TypeofKinesisVideoMedia = js.native
    val KinesisVideoNs: atPulumiAwsLib.TypeofKinesisVideo = js.native
    var Lambda: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Lambda] = js.native
    val LambdaNs: atPulumiAwsLib.TypeofLambda = js.native
    var LexModelBuildingService: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.LexModelBuildingService] = js.native
    val LexModelBuildingServiceNs: atPulumiAwsLib.TypeofLexModelBuildingService = js.native
    var LexRuntime: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.LexRuntime] = js.native
    val LexRuntimeNs: atPulumiAwsLib.TypeofLexRuntime = js.native
    var LicenseManager: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.LicenseManager] = js.native
    val LicenseManagerNs: atPulumiAwsLib.TypeofLicenseManager = js.native
    var Lightsail: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Lightsail] = js.native
    val LightsailNs: atPulumiAwsLib.TypeofLightsail = js.native
    var MQ: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.MQ] = js.native
    val MQNs: atPulumiAwsLib.TypeofMQ = js.native
    var MTurk: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.MTurk] = js.native
    val MTurkNs: atPulumiAwsLib.TypeofMTurk = js.native
    var MachineLearning: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.MachineLearning] = js.native
    val MachineLearningNs: atPulumiAwsLib.TypeofMachineLearning = js.native
    var Macie: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Macie] = js.native
    val MacieNs: atPulumiAwsLib.TypeofMacie = js.native
    var ManagedBlockchain: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ManagedBlockchain] = js.native
    val ManagedBlockchainNs: atPulumiAwsLib.TypeofManagedBlockchain = js.native
    var MarketplaceCommerceAnalytics: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.MarketplaceCommerceAnalytics] = js.native
    val MarketplaceCommerceAnalyticsNs: atPulumiAwsLib.TypeofMarketplaceCommerceAnalytics = js.native
    var MarketplaceEntitlementService: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.MarketplaceEntitlementService] = js.native
    val MarketplaceEntitlementServiceNs: atPulumiAwsLib.TypeofMarketplaceEntitlementService = js.native
    var MarketplaceMetering: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.MarketplaceMetering] = js.native
    val MarketplaceMeteringNs: atPulumiAwsLib.TypeofMarketplaceMetering = js.native
    var MediaConnect: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.MediaConnect] = js.native
    val MediaConnectNs: atPulumiAwsLib.TypeofMediaConnect = js.native
    var MediaConvert: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.MediaConvert] = js.native
    val MediaConvertNs: atPulumiAwsLib.TypeofMediaConvert = js.native
    var MediaLive: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.MediaLive] = js.native
    val MediaLiveNs: atPulumiAwsLib.TypeofMediaLive = js.native
    var MediaPackage: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.MediaPackage] = js.native
    val MediaPackageNs: atPulumiAwsLib.TypeofMediaPackage = js.native
    var MediaPackageVod: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.MediaPackageVod] = js.native
    val MediaPackageVodNs: atPulumiAwsLib.TypeofMediaPackageVod = js.native
    var MediaStore: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.MediaStore] = js.native
    var MediaStoreData: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.MediaStoreData] = js.native
    val MediaStoreDataNs: atPulumiAwsLib.TypeofMediaStoreData = js.native
    val MediaStoreNs: atPulumiAwsLib.TypeofMediaStore = js.native
    var MediaTailor: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.MediaTailor] = js.native
    val MediaTailorNs: atPulumiAwsLib.TypeofMediaTailor = js.native
    var MetadataService: atPulumiAwsLib.TypeofClassMetadataService = js.native
    var MigrationHub: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.MigrationHub] = js.native
    val MigrationHubNs: atPulumiAwsLib.TypeofMigrationHub = js.native
    var Mobile: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Mobile] = js.native
    var MobileAnalytics: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.MobileAnalytics] = js.native
    val MobileAnalyticsNs: atPulumiAwsLib.TypeofMobileAnalytics = js.native
    val MobileNs: atPulumiAwsLib.TypeofMobile = js.native
    var Neptune: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Neptune] = js.native
    val NeptuneNs: atPulumiAwsLib.TypeofNeptune = js.native
    var OpsWorks: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.OpsWorks] = js.native
    var OpsWorksCM: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.OpsWorksCM] = js.native
    val OpsWorksCMNs: atPulumiAwsLib.TypeofOpsWorksCM = js.native
    val OpsWorksNs: atPulumiAwsLib.TypeofOpsWorks = js.native
    var Organizations: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Organizations] = js.native
    val OrganizationsNs: atPulumiAwsLib.TypeofOrganizations = js.native
    var PI: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.PI] = js.native
    val PINs: atPulumiAwsLib.TypeofPI = js.native
    var Personalize: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Personalize] = js.native
    var PersonalizeEvents: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.PersonalizeEvents] = js.native
    val PersonalizeEventsNs: atPulumiAwsLib.TypeofPersonalizeEvents = js.native
    val PersonalizeNs: atPulumiAwsLib.TypeofPersonalize = js.native
    var PersonalizeRuntime: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.PersonalizeRuntime] = js.native
    val PersonalizeRuntimeNs: atPulumiAwsLib.TypeofPersonalizeRuntime = js.native
    var Pinpoint: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Pinpoint] = js.native
    var PinpointEmail: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.PinpointEmail] = js.native
    val PinpointEmailNs: atPulumiAwsLib.TypeofPinpointEmail = js.native
    val PinpointNs: atPulumiAwsLib.TypeofPinpoint = js.native
    var PinpointSMSVoice: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.PinpointSMSVoice] = js.native
    val PinpointSMSVoiceNs: atPulumiAwsLib.TypeofPinpointSMSVoice = js.native
    var Polly: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Polly] = js.native
    val PollyNs: atPulumiAwsLib.TypeofPolly = js.native
    var Pricing: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Pricing] = js.native
    val PricingNs: atPulumiAwsLib.TypeofPricing = js.native
    var ProcessCredentials: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ProcessCredentials] = js.native
    var QuickSight: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.QuickSight] = js.native
    val QuickSightNs: atPulumiAwsLib.TypeofQuickSight = js.native
    var RAM: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.RAM] = js.native
    val RAMNs: atPulumiAwsLib.TypeofRAM = js.native
    var RDS: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.RDS] = js.native
    var RDSDataService: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.RDSDataService] = js.native
    val RDSDataServiceNs: atPulumiAwsLib.TypeofRDSDataService = js.native
    val RDSNs: atPulumiAwsLib.TypeofRDS = js.native
    var Redshift: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Redshift] = js.native
    val RedshiftNs: atPulumiAwsLib.TypeofRedshift = js.native
    var Rekognition: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Rekognition] = js.native
    val RekognitionNs: atPulumiAwsLib.TypeofRekognition = js.native
    var RemoteCredentials: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.RemoteCredentials] = js.native
    var Request: org.scalablytyped.runtime.Instantiable2[
        /* service */ awsDashSdkLib.libServiceMod.Service, 
        /* operation */ java.lang.String, 
        awsDashSdkLib.awsDashSdkMod.Request[js.Object, js.Object]
      ] = js.native
    var ResourceGroups: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ResourceGroups] = js.native
    val ResourceGroupsNs: atPulumiAwsLib.TypeofResourceGroups = js.native
    var ResourceGroupsTaggingAPI: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ResourceGroupsTaggingAPI] = js.native
    val ResourceGroupsTaggingAPINs: atPulumiAwsLib.TypeofResourceGroupsTaggingAPI = js.native
    var Response: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Response[js.Object, js.Object]] = js.native
    var RoboMaker: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.RoboMaker] = js.native
    val RoboMakerNs: atPulumiAwsLib.TypeofRoboMaker = js.native
    var Route53: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Route53] = js.native
    var Route53Domains: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Route53Domains] = js.native
    val Route53DomainsNs: atPulumiAwsLib.TypeofRoute53Domains = js.native
    val Route53Ns: atPulumiAwsLib.TypeofRoute53 = js.native
    var Route53Resolver: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Route53Resolver] = js.native
    val Route53ResolverNs: atPulumiAwsLib.TypeofRoute53Resolver = js.native
    var S3: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.S3] = js.native
    var S3Control: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.S3Control] = js.native
    val S3ControlNs: atPulumiAwsLib.TypeofS3Control = js.native
    val S3Ns: atPulumiAwsLib.TypeofS3 = js.native
    var SAMLCredentials: org.scalablytyped.runtime.Instantiable1[
        /* params */ awsDashSdkLib.libCredentialsSamlUnderscoreCredentialsMod.SAMLCredentialsParams, 
        awsDashSdkLib.awsDashSdkMod.SAMLCredentials
      ] = js.native
    var SES: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.SES] = js.native
    val SESNs: atPulumiAwsLib.TypeofSES = js.native
    var SMS: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.SMS] = js.native
    val SMSNs: atPulumiAwsLib.TypeofSMS = js.native
    var SNS: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.SNS] = js.native
    val SNSNs: atPulumiAwsLib.TypeofSNS = js.native
    var SQS: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.SQS] = js.native
    val SQSNs: atPulumiAwsLib.TypeofSQS = js.native
    var SSM: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.SSM] = js.native
    val SSMNs: atPulumiAwsLib.TypeofSSM = js.native
    var STS: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.STS] = js.native
    val STSNs: atPulumiAwsLib.TypeofSTS = js.native
    var SWF: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.SWF] = js.native
    val SWFNs: atPulumiAwsLib.TypeofSWF = js.native
    var SageMaker: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.SageMaker] = js.native
    val SageMakerNs: atPulumiAwsLib.TypeofSageMaker = js.native
    var SageMakerRuntime: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.SageMakerRuntime] = js.native
    val SageMakerRuntimeNs: atPulumiAwsLib.TypeofSageMakerRuntime = js.native
    var SecretsManager: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.SecretsManager] = js.native
    val SecretsManagerNs: atPulumiAwsLib.TypeofSecretsManager = js.native
    var SecurityHub: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.SecurityHub] = js.native
    val SecurityHubNs: atPulumiAwsLib.TypeofSecurityHub = js.native
    var ServerlessApplicationRepository: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ServerlessApplicationRepository] = js.native
    val ServerlessApplicationRepositoryNs: atPulumiAwsLib.TypeofServerlessApplicationRepository = js.native
    var Service: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Service] = js.native
    var ServiceCatalog: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ServiceCatalog] = js.native
    val ServiceCatalogNs: atPulumiAwsLib.TypeofServiceCatalog = js.native
    var ServiceDiscovery: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ServiceDiscovery] = js.native
    val ServiceDiscoveryNs: atPulumiAwsLib.TypeofServiceDiscovery = js.native
    var ServiceQuotas: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.ServiceQuotas] = js.native
    val ServiceQuotasNs: atPulumiAwsLib.TypeofServiceQuotas = js.native
    var SharedIniFileCredentials: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.SharedIniFileCredentials] = js.native
    var Shield: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Shield] = js.native
    val ShieldNs: atPulumiAwsLib.TypeofShield = js.native
    var Signer: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Signer] = js.native
    val SignerNs: atPulumiAwsLib.TypeofSigner = js.native
    var SimpleDB: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.SimpleDB] = js.native
    val SimpleDBNs: atPulumiAwsLib.TypeofSimpleDB = js.native
    var Snowball: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Snowball] = js.native
    val SnowballNs: atPulumiAwsLib.TypeofSnowball = js.native
    var StepFunctions: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.StepFunctions] = js.native
    val StepFunctionsNs: atPulumiAwsLib.TypeofStepFunctions = js.native
    var StorageGateway: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.StorageGateway] = js.native
    val StorageGatewayNs: atPulumiAwsLib.TypeofStorageGateway = js.native
    var Support: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Support] = js.native
    val SupportNs: atPulumiAwsLib.TypeofSupport = js.native
    var TemporaryCredentials: org.scalablytyped.runtime.Instantiable1[
        /* options */ awsDashSdkLib.libCredentialsTemporaryUnderscoreCredentialsMod.TemporaryCredentialsNs.TemporaryCredentialsOptions, 
        awsDashSdkLib.awsDashSdkMod.TemporaryCredentials
      ] = js.native
    // Needed to expose interfaces on the class
    val TemporaryCredentialsNs: js.Any = js.native
    var Textract: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Textract] = js.native
    val TextractNs: atPulumiAwsLib.TypeofTextract = js.native
    var TranscribeService: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.TranscribeService] = js.native
    val TranscribeServiceNs: atPulumiAwsLib.TypeofTranscribeService = js.native
    var Transfer: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Transfer] = js.native
    val TransferNs: atPulumiAwsLib.TypeofTransfer = js.native
    var Translate: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.Translate] = js.native
    val TranslateNs: atPulumiAwsLib.TypeofTranslate = js.native
    var WAF: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.WAF] = js.native
    val WAFNs: atPulumiAwsLib.TypeofWAF = js.native
    var WAFRegional: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.WAFRegional] = js.native
    val WAFRegionalNs: atPulumiAwsLib.TypeofWAFRegional = js.native
    var WebIdentityCredentials: org.scalablytyped.runtime.Instantiable1[
        /* options */ awsDashSdkLib.libCredentialsWebUnderscoreIdentityUnderscoreCredentialsMod.WebIdentityCredentialsNs.WebIdentityCredentialsOptions, 
        awsDashSdkLib.awsDashSdkMod.WebIdentityCredentials
      ] = js.native
    // Needed to expose interfaces on the class
    val WebIdentityCredentialsNs: js.Any = js.native
    var WorkDocs: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.WorkDocs] = js.native
    val WorkDocsNs: atPulumiAwsLib.TypeofWorkDocs = js.native
    var WorkLink: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.WorkLink] = js.native
    val WorkLinkNs: atPulumiAwsLib.TypeofWorkLink = js.native
    var WorkMail: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.WorkMail] = js.native
    val WorkMailNs: atPulumiAwsLib.TypeofWorkMail = js.native
    var WorkSpaces: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.WorkSpaces] = js.native
    val WorkSpacesNs: atPulumiAwsLib.TypeofWorkSpaces = js.native
    var XRay: org.scalablytyped.runtime.Instantiable0[awsDashSdkLib.awsDashSdkMod.XRay] = js.native
    val XRayNs: atPulumiAwsLib.TypeofXRay = js.native
    var config: awsDashSdkLib.libConfigMod.GlobalConfigInstance = js.native
  }
  
}

