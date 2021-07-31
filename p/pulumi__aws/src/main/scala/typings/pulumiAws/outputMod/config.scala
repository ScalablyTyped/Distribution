package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object config {
  
  trait AssumeRole extends StObject {
    
    var durationSeconds: js.UndefOr[Double] = js.undefined
    
    var externalId: js.UndefOr[String] = js.undefined
    
    var policy: js.UndefOr[String] = js.undefined
    
    var policyArns: js.UndefOr[js.Array[String]] = js.undefined
    
    var roleArn: js.UndefOr[String] = js.undefined
    
    var sessionName: js.UndefOr[String] = js.undefined
    
    var tags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var transitiveTagKeys: js.UndefOr[js.Array[String]] = js.undefined
  }
  object AssumeRole {
    
    @scala.inline
    def apply(): AssumeRole = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssumeRole]
    }
    
    @scala.inline
    implicit class AssumeRoleMutableBuilder[Self <: AssumeRole] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDurationSeconds(value: Double): Self = StObject.set(x, "durationSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationSecondsUndefined: Self = StObject.set(x, "durationSeconds", js.undefined)
      
      @scala.inline
      def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
      
      @scala.inline
      def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyArns(value: js.Array[String]): Self = StObject.set(x, "policyArns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyArnsUndefined: Self = StObject.set(x, "policyArns", js.undefined)
      
      @scala.inline
      def setPolicyArnsVarargs(value: String*): Self = StObject.set(x, "policyArns", js.Array(value :_*))
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      @scala.inline
      def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
      
      @scala.inline
      def setSessionName(value: String): Self = StObject.set(x, "sessionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionNameUndefined: Self = StObject.set(x, "sessionName", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTransitiveTagKeys(value: js.Array[String]): Self = StObject.set(x, "transitiveTagKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitiveTagKeysUndefined: Self = StObject.set(x, "transitiveTagKeys", js.undefined)
      
      @scala.inline
      def setTransitiveTagKeysVarargs(value: String*): Self = StObject.set(x, "transitiveTagKeys", js.Array(value :_*))
    }
  }
  
  trait Endpoints extends StObject {
    
    var accessanalyzer: js.UndefOr[String] = js.undefined
    
    var acm: js.UndefOr[String] = js.undefined
    
    var acmpca: js.UndefOr[String] = js.undefined
    
    var amplify: js.UndefOr[String] = js.undefined
    
    var apigateway: js.UndefOr[String] = js.undefined
    
    var applicationautoscaling: js.UndefOr[String] = js.undefined
    
    var applicationinsights: js.UndefOr[String] = js.undefined
    
    var appmesh: js.UndefOr[String] = js.undefined
    
    var appstream: js.UndefOr[String] = js.undefined
    
    var appsync: js.UndefOr[String] = js.undefined
    
    var athena: js.UndefOr[String] = js.undefined
    
    var autoscaling: js.UndefOr[String] = js.undefined
    
    var autoscalingplans: js.UndefOr[String] = js.undefined
    
    var backup: js.UndefOr[String] = js.undefined
    
    var batch: js.UndefOr[String] = js.undefined
    
    var budgets: js.UndefOr[String] = js.undefined
    
    var cloud9: js.UndefOr[String] = js.undefined
    
    var cloudformation: js.UndefOr[String] = js.undefined
    
    var cloudfront: js.UndefOr[String] = js.undefined
    
    var cloudhsm: js.UndefOr[String] = js.undefined
    
    var cloudsearch: js.UndefOr[String] = js.undefined
    
    var cloudtrail: js.UndefOr[String] = js.undefined
    
    var cloudwatch: js.UndefOr[String] = js.undefined
    
    var cloudwatchevents: js.UndefOr[String] = js.undefined
    
    var cloudwatchlogs: js.UndefOr[String] = js.undefined
    
    var codeartifact: js.UndefOr[String] = js.undefined
    
    var codebuild: js.UndefOr[String] = js.undefined
    
    var codecommit: js.UndefOr[String] = js.undefined
    
    var codedeploy: js.UndefOr[String] = js.undefined
    
    var codepipeline: js.UndefOr[String] = js.undefined
    
    var codestarconnections: js.UndefOr[String] = js.undefined
    
    var cognitoidentity: js.UndefOr[String] = js.undefined
    
    var cognitoidp: js.UndefOr[String] = js.undefined
    
    var configservice: js.UndefOr[String] = js.undefined
    
    var cur: js.UndefOr[String] = js.undefined
    
    var dataexchange: js.UndefOr[String] = js.undefined
    
    var datapipeline: js.UndefOr[String] = js.undefined
    
    var datasync: js.UndefOr[String] = js.undefined
    
    var dax: js.UndefOr[String] = js.undefined
    
    var devicefarm: js.UndefOr[String] = js.undefined
    
    var directconnect: js.UndefOr[String] = js.undefined
    
    var dlm: js.UndefOr[String] = js.undefined
    
    var dms: js.UndefOr[String] = js.undefined
    
    var docdb: js.UndefOr[String] = js.undefined
    
    var ds: js.UndefOr[String] = js.undefined
    
    var dynamodb: js.UndefOr[String] = js.undefined
    
    var ec2: js.UndefOr[String] = js.undefined
    
    var ecr: js.UndefOr[String] = js.undefined
    
    var ecs: js.UndefOr[String] = js.undefined
    
    var efs: js.UndefOr[String] = js.undefined
    
    var eks: js.UndefOr[String] = js.undefined
    
    var elasticache: js.UndefOr[String] = js.undefined
    
    var elasticbeanstalk: js.UndefOr[String] = js.undefined
    
    var elastictranscoder: js.UndefOr[String] = js.undefined
    
    var elb: js.UndefOr[String] = js.undefined
    
    var emr: js.UndefOr[String] = js.undefined
    
    var es: js.UndefOr[String] = js.undefined
    
    var firehose: js.UndefOr[String] = js.undefined
    
    var fms: js.UndefOr[String] = js.undefined
    
    var forecast: js.UndefOr[String] = js.undefined
    
    var fsx: js.UndefOr[String] = js.undefined
    
    var gamelift: js.UndefOr[String] = js.undefined
    
    var glacier: js.UndefOr[String] = js.undefined
    
    var globalaccelerator: js.UndefOr[String] = js.undefined
    
    var glue: js.UndefOr[String] = js.undefined
    
    var greengrass: js.UndefOr[String] = js.undefined
    
    var guardduty: js.UndefOr[String] = js.undefined
    
    var iam: js.UndefOr[String] = js.undefined
    
    var identitystore: js.UndefOr[String] = js.undefined
    
    var imagebuilder: js.UndefOr[String] = js.undefined
    
    var inspector: js.UndefOr[String] = js.undefined
    
    var iot: js.UndefOr[String] = js.undefined
    
    var iotanalytics: js.UndefOr[String] = js.undefined
    
    var iotevents: js.UndefOr[String] = js.undefined
    
    var kafka: js.UndefOr[String] = js.undefined
    
    var kinesis: js.UndefOr[String] = js.undefined
    
    var kinesisanalytics: js.UndefOr[String] = js.undefined
    
    var kinesisanalyticsv2: js.UndefOr[String] = js.undefined
    
    var kinesisvideo: js.UndefOr[String] = js.undefined
    
    var kms: js.UndefOr[String] = js.undefined
    
    var lakeformation: js.UndefOr[String] = js.undefined
    
    var lambda: js.UndefOr[String] = js.undefined
    
    var lexmodels: js.UndefOr[String] = js.undefined
    
    var licensemanager: js.UndefOr[String] = js.undefined
    
    var lightsail: js.UndefOr[String] = js.undefined
    
    var macie: js.UndefOr[String] = js.undefined
    
    var macie2: js.UndefOr[String] = js.undefined
    
    var managedblockchain: js.UndefOr[String] = js.undefined
    
    var marketplacecatalog: js.UndefOr[String] = js.undefined
    
    var mediaconnect: js.UndefOr[String] = js.undefined
    
    var mediaconvert: js.UndefOr[String] = js.undefined
    
    var medialive: js.UndefOr[String] = js.undefined
    
    var mediapackage: js.UndefOr[String] = js.undefined
    
    var mediastore: js.UndefOr[String] = js.undefined
    
    var mediastoredata: js.UndefOr[String] = js.undefined
    
    var mq: js.UndefOr[String] = js.undefined
    
    var neptune: js.UndefOr[String] = js.undefined
    
    var networkfirewall: js.UndefOr[String] = js.undefined
    
    var networkmanager: js.UndefOr[String] = js.undefined
    
    var opsworks: js.UndefOr[String] = js.undefined
    
    var organizations: js.UndefOr[String] = js.undefined
    
    var outposts: js.UndefOr[String] = js.undefined
    
    var personalize: js.UndefOr[String] = js.undefined
    
    var pinpoint: js.UndefOr[String] = js.undefined
    
    var pricing: js.UndefOr[String] = js.undefined
    
    var qldb: js.UndefOr[String] = js.undefined
    
    var quicksight: js.UndefOr[String] = js.undefined
    
    var ram: js.UndefOr[String] = js.undefined
    
    var rds: js.UndefOr[String] = js.undefined
    
    var redshift: js.UndefOr[String] = js.undefined
    
    var resourcegroups: js.UndefOr[String] = js.undefined
    
    var resourcegroupstaggingapi: js.UndefOr[String] = js.undefined
    
    var route53: js.UndefOr[String] = js.undefined
    
    var route53domains: js.UndefOr[String] = js.undefined
    
    var route53resolver: js.UndefOr[String] = js.undefined
    
    var s3: js.UndefOr[String] = js.undefined
    
    var s3control: js.UndefOr[String] = js.undefined
    
    var s3outposts: js.UndefOr[String] = js.undefined
    
    var sagemaker: js.UndefOr[String] = js.undefined
    
    var sdb: js.UndefOr[String] = js.undefined
    
    var secretsmanager: js.UndefOr[String] = js.undefined
    
    var securityhub: js.UndefOr[String] = js.undefined
    
    var serverlessrepo: js.UndefOr[String] = js.undefined
    
    var servicecatalog: js.UndefOr[String] = js.undefined
    
    var servicediscovery: js.UndefOr[String] = js.undefined
    
    var servicequotas: js.UndefOr[String] = js.undefined
    
    var ses: js.UndefOr[String] = js.undefined
    
    var shield: js.UndefOr[String] = js.undefined
    
    var sns: js.UndefOr[String] = js.undefined
    
    var sqs: js.UndefOr[String] = js.undefined
    
    var ssm: js.UndefOr[String] = js.undefined
    
    var ssoadmin: js.UndefOr[String] = js.undefined
    
    var stepfunctions: js.UndefOr[String] = js.undefined
    
    var storagegateway: js.UndefOr[String] = js.undefined
    
    var sts: js.UndefOr[String] = js.undefined
    
    var swf: js.UndefOr[String] = js.undefined
    
    var synthetics: js.UndefOr[String] = js.undefined
    
    var timestreamwrite: js.UndefOr[String] = js.undefined
    
    var transfer: js.UndefOr[String] = js.undefined
    
    var waf: js.UndefOr[String] = js.undefined
    
    var wafregional: js.UndefOr[String] = js.undefined
    
    var wafv2: js.UndefOr[String] = js.undefined
    
    var worklink: js.UndefOr[String] = js.undefined
    
    var workmail: js.UndefOr[String] = js.undefined
    
    var workspaces: js.UndefOr[String] = js.undefined
    
    var xray: js.UndefOr[String] = js.undefined
  }
  object Endpoints {
    
    @scala.inline
    def apply(): Endpoints = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Endpoints]
    }
    
    @scala.inline
    implicit class EndpointsMutableBuilder[Self <: Endpoints] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessanalyzer(value: String): Self = StObject.set(x, "accessanalyzer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessanalyzerUndefined: Self = StObject.set(x, "accessanalyzer", js.undefined)
      
      @scala.inline
      def setAcm(value: String): Self = StObject.set(x, "acm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcmUndefined: Self = StObject.set(x, "acm", js.undefined)
      
      @scala.inline
      def setAcmpca(value: String): Self = StObject.set(x, "acmpca", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcmpcaUndefined: Self = StObject.set(x, "acmpca", js.undefined)
      
      @scala.inline
      def setAmplify(value: String): Self = StObject.set(x, "amplify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmplifyUndefined: Self = StObject.set(x, "amplify", js.undefined)
      
      @scala.inline
      def setApigateway(value: String): Self = StObject.set(x, "apigateway", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApigatewayUndefined: Self = StObject.set(x, "apigateway", js.undefined)
      
      @scala.inline
      def setApplicationautoscaling(value: String): Self = StObject.set(x, "applicationautoscaling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationautoscalingUndefined: Self = StObject.set(x, "applicationautoscaling", js.undefined)
      
      @scala.inline
      def setApplicationinsights(value: String): Self = StObject.set(x, "applicationinsights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationinsightsUndefined: Self = StObject.set(x, "applicationinsights", js.undefined)
      
      @scala.inline
      def setAppmesh(value: String): Self = StObject.set(x, "appmesh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppmeshUndefined: Self = StObject.set(x, "appmesh", js.undefined)
      
      @scala.inline
      def setAppstream(value: String): Self = StObject.set(x, "appstream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppstreamUndefined: Self = StObject.set(x, "appstream", js.undefined)
      
      @scala.inline
      def setAppsync(value: String): Self = StObject.set(x, "appsync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppsyncUndefined: Self = StObject.set(x, "appsync", js.undefined)
      
      @scala.inline
      def setAthena(value: String): Self = StObject.set(x, "athena", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAthenaUndefined: Self = StObject.set(x, "athena", js.undefined)
      
      @scala.inline
      def setAutoscaling(value: String): Self = StObject.set(x, "autoscaling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoscalingUndefined: Self = StObject.set(x, "autoscaling", js.undefined)
      
      @scala.inline
      def setAutoscalingplans(value: String): Self = StObject.set(x, "autoscalingplans", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoscalingplansUndefined: Self = StObject.set(x, "autoscalingplans", js.undefined)
      
      @scala.inline
      def setBackup(value: String): Self = StObject.set(x, "backup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupUndefined: Self = StObject.set(x, "backup", js.undefined)
      
      @scala.inline
      def setBatch(value: String): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
      
      @scala.inline
      def setBudgets(value: String): Self = StObject.set(x, "budgets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBudgetsUndefined: Self = StObject.set(x, "budgets", js.undefined)
      
      @scala.inline
      def setCloud9(value: String): Self = StObject.set(x, "cloud9", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloud9Undefined: Self = StObject.set(x, "cloud9", js.undefined)
      
      @scala.inline
      def setCloudformation(value: String): Self = StObject.set(x, "cloudformation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudformationUndefined: Self = StObject.set(x, "cloudformation", js.undefined)
      
      @scala.inline
      def setCloudfront(value: String): Self = StObject.set(x, "cloudfront", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudfrontUndefined: Self = StObject.set(x, "cloudfront", js.undefined)
      
      @scala.inline
      def setCloudhsm(value: String): Self = StObject.set(x, "cloudhsm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudhsmUndefined: Self = StObject.set(x, "cloudhsm", js.undefined)
      
      @scala.inline
      def setCloudsearch(value: String): Self = StObject.set(x, "cloudsearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudsearchUndefined: Self = StObject.set(x, "cloudsearch", js.undefined)
      
      @scala.inline
      def setCloudtrail(value: String): Self = StObject.set(x, "cloudtrail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudtrailUndefined: Self = StObject.set(x, "cloudtrail", js.undefined)
      
      @scala.inline
      def setCloudwatch(value: String): Self = StObject.set(x, "cloudwatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudwatchUndefined: Self = StObject.set(x, "cloudwatch", js.undefined)
      
      @scala.inline
      def setCloudwatchevents(value: String): Self = StObject.set(x, "cloudwatchevents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudwatcheventsUndefined: Self = StObject.set(x, "cloudwatchevents", js.undefined)
      
      @scala.inline
      def setCloudwatchlogs(value: String): Self = StObject.set(x, "cloudwatchlogs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudwatchlogsUndefined: Self = StObject.set(x, "cloudwatchlogs", js.undefined)
      
      @scala.inline
      def setCodeartifact(value: String): Self = StObject.set(x, "codeartifact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeartifactUndefined: Self = StObject.set(x, "codeartifact", js.undefined)
      
      @scala.inline
      def setCodebuild(value: String): Self = StObject.set(x, "codebuild", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodebuildUndefined: Self = StObject.set(x, "codebuild", js.undefined)
      
      @scala.inline
      def setCodecommit(value: String): Self = StObject.set(x, "codecommit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodecommitUndefined: Self = StObject.set(x, "codecommit", js.undefined)
      
      @scala.inline
      def setCodedeploy(value: String): Self = StObject.set(x, "codedeploy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodedeployUndefined: Self = StObject.set(x, "codedeploy", js.undefined)
      
      @scala.inline
      def setCodepipeline(value: String): Self = StObject.set(x, "codepipeline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodepipelineUndefined: Self = StObject.set(x, "codepipeline", js.undefined)
      
      @scala.inline
      def setCodestarconnections(value: String): Self = StObject.set(x, "codestarconnections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodestarconnectionsUndefined: Self = StObject.set(x, "codestarconnections", js.undefined)
      
      @scala.inline
      def setCognitoidentity(value: String): Self = StObject.set(x, "cognitoidentity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCognitoidentityUndefined: Self = StObject.set(x, "cognitoidentity", js.undefined)
      
      @scala.inline
      def setCognitoidp(value: String): Self = StObject.set(x, "cognitoidp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCognitoidpUndefined: Self = StObject.set(x, "cognitoidp", js.undefined)
      
      @scala.inline
      def setConfigservice(value: String): Self = StObject.set(x, "configservice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigserviceUndefined: Self = StObject.set(x, "configservice", js.undefined)
      
      @scala.inline
      def setCur(value: String): Self = StObject.set(x, "cur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurUndefined: Self = StObject.set(x, "cur", js.undefined)
      
      @scala.inline
      def setDataexchange(value: String): Self = StObject.set(x, "dataexchange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataexchangeUndefined: Self = StObject.set(x, "dataexchange", js.undefined)
      
      @scala.inline
      def setDatapipeline(value: String): Self = StObject.set(x, "datapipeline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatapipelineUndefined: Self = StObject.set(x, "datapipeline", js.undefined)
      
      @scala.inline
      def setDatasync(value: String): Self = StObject.set(x, "datasync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatasyncUndefined: Self = StObject.set(x, "datasync", js.undefined)
      
      @scala.inline
      def setDax(value: String): Self = StObject.set(x, "dax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaxUndefined: Self = StObject.set(x, "dax", js.undefined)
      
      @scala.inline
      def setDevicefarm(value: String): Self = StObject.set(x, "devicefarm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevicefarmUndefined: Self = StObject.set(x, "devicefarm", js.undefined)
      
      @scala.inline
      def setDirectconnect(value: String): Self = StObject.set(x, "directconnect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectconnectUndefined: Self = StObject.set(x, "directconnect", js.undefined)
      
      @scala.inline
      def setDlm(value: String): Self = StObject.set(x, "dlm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDlmUndefined: Self = StObject.set(x, "dlm", js.undefined)
      
      @scala.inline
      def setDms(value: String): Self = StObject.set(x, "dms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDmsUndefined: Self = StObject.set(x, "dms", js.undefined)
      
      @scala.inline
      def setDocdb(value: String): Self = StObject.set(x, "docdb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocdbUndefined: Self = StObject.set(x, "docdb", js.undefined)
      
      @scala.inline
      def setDs(value: String): Self = StObject.set(x, "ds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDsUndefined: Self = StObject.set(x, "ds", js.undefined)
      
      @scala.inline
      def setDynamodb(value: String): Self = StObject.set(x, "dynamodb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamodbUndefined: Self = StObject.set(x, "dynamodb", js.undefined)
      
      @scala.inline
      def setEc2(value: String): Self = StObject.set(x, "ec2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEc2Undefined: Self = StObject.set(x, "ec2", js.undefined)
      
      @scala.inline
      def setEcr(value: String): Self = StObject.set(x, "ecr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEcrUndefined: Self = StObject.set(x, "ecr", js.undefined)
      
      @scala.inline
      def setEcs(value: String): Self = StObject.set(x, "ecs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEcsUndefined: Self = StObject.set(x, "ecs", js.undefined)
      
      @scala.inline
      def setEfs(value: String): Self = StObject.set(x, "efs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEfsUndefined: Self = StObject.set(x, "efs", js.undefined)
      
      @scala.inline
      def setEks(value: String): Self = StObject.set(x, "eks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEksUndefined: Self = StObject.set(x, "eks", js.undefined)
      
      @scala.inline
      def setElasticache(value: String): Self = StObject.set(x, "elasticache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElasticacheUndefined: Self = StObject.set(x, "elasticache", js.undefined)
      
      @scala.inline
      def setElasticbeanstalk(value: String): Self = StObject.set(x, "elasticbeanstalk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElasticbeanstalkUndefined: Self = StObject.set(x, "elasticbeanstalk", js.undefined)
      
      @scala.inline
      def setElastictranscoder(value: String): Self = StObject.set(x, "elastictranscoder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElastictranscoderUndefined: Self = StObject.set(x, "elastictranscoder", js.undefined)
      
      @scala.inline
      def setElb(value: String): Self = StObject.set(x, "elb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElbUndefined: Self = StObject.set(x, "elb", js.undefined)
      
      @scala.inline
      def setEmr(value: String): Self = StObject.set(x, "emr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmrUndefined: Self = StObject.set(x, "emr", js.undefined)
      
      @scala.inline
      def setEs(value: String): Self = StObject.set(x, "es", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEsUndefined: Self = StObject.set(x, "es", js.undefined)
      
      @scala.inline
      def setFirehose(value: String): Self = StObject.set(x, "firehose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirehoseUndefined: Self = StObject.set(x, "firehose", js.undefined)
      
      @scala.inline
      def setFms(value: String): Self = StObject.set(x, "fms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFmsUndefined: Self = StObject.set(x, "fms", js.undefined)
      
      @scala.inline
      def setForecast(value: String): Self = StObject.set(x, "forecast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForecastUndefined: Self = StObject.set(x, "forecast", js.undefined)
      
      @scala.inline
      def setFsx(value: String): Self = StObject.set(x, "fsx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsxUndefined: Self = StObject.set(x, "fsx", js.undefined)
      
      @scala.inline
      def setGamelift(value: String): Self = StObject.set(x, "gamelift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGameliftUndefined: Self = StObject.set(x, "gamelift", js.undefined)
      
      @scala.inline
      def setGlacier(value: String): Self = StObject.set(x, "glacier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlacierUndefined: Self = StObject.set(x, "glacier", js.undefined)
      
      @scala.inline
      def setGlobalaccelerator(value: String): Self = StObject.set(x, "globalaccelerator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalacceleratorUndefined: Self = StObject.set(x, "globalaccelerator", js.undefined)
      
      @scala.inline
      def setGlue(value: String): Self = StObject.set(x, "glue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlueUndefined: Self = StObject.set(x, "glue", js.undefined)
      
      @scala.inline
      def setGreengrass(value: String): Self = StObject.set(x, "greengrass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreengrassUndefined: Self = StObject.set(x, "greengrass", js.undefined)
      
      @scala.inline
      def setGuardduty(value: String): Self = StObject.set(x, "guardduty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuarddutyUndefined: Self = StObject.set(x, "guardduty", js.undefined)
      
      @scala.inline
      def setIam(value: String): Self = StObject.set(x, "iam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamUndefined: Self = StObject.set(x, "iam", js.undefined)
      
      @scala.inline
      def setIdentitystore(value: String): Self = StObject.set(x, "identitystore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentitystoreUndefined: Self = StObject.set(x, "identitystore", js.undefined)
      
      @scala.inline
      def setImagebuilder(value: String): Self = StObject.set(x, "imagebuilder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagebuilderUndefined: Self = StObject.set(x, "imagebuilder", js.undefined)
      
      @scala.inline
      def setInspector(value: String): Self = StObject.set(x, "inspector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInspectorUndefined: Self = StObject.set(x, "inspector", js.undefined)
      
      @scala.inline
      def setIot(value: String): Self = StObject.set(x, "iot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIotUndefined: Self = StObject.set(x, "iot", js.undefined)
      
      @scala.inline
      def setIotanalytics(value: String): Self = StObject.set(x, "iotanalytics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIotanalyticsUndefined: Self = StObject.set(x, "iotanalytics", js.undefined)
      
      @scala.inline
      def setIotevents(value: String): Self = StObject.set(x, "iotevents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIoteventsUndefined: Self = StObject.set(x, "iotevents", js.undefined)
      
      @scala.inline
      def setKafka(value: String): Self = StObject.set(x, "kafka", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKafkaUndefined: Self = StObject.set(x, "kafka", js.undefined)
      
      @scala.inline
      def setKinesis(value: String): Self = StObject.set(x, "kinesis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKinesisUndefined: Self = StObject.set(x, "kinesis", js.undefined)
      
      @scala.inline
      def setKinesisanalytics(value: String): Self = StObject.set(x, "kinesisanalytics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKinesisanalyticsUndefined: Self = StObject.set(x, "kinesisanalytics", js.undefined)
      
      @scala.inline
      def setKinesisanalyticsv2(value: String): Self = StObject.set(x, "kinesisanalyticsv2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKinesisanalyticsv2Undefined: Self = StObject.set(x, "kinesisanalyticsv2", js.undefined)
      
      @scala.inline
      def setKinesisvideo(value: String): Self = StObject.set(x, "kinesisvideo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKinesisvideoUndefined: Self = StObject.set(x, "kinesisvideo", js.undefined)
      
      @scala.inline
      def setKms(value: String): Self = StObject.set(x, "kms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsUndefined: Self = StObject.set(x, "kms", js.undefined)
      
      @scala.inline
      def setLakeformation(value: String): Self = StObject.set(x, "lakeformation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLakeformationUndefined: Self = StObject.set(x, "lakeformation", js.undefined)
      
      @scala.inline
      def setLambda(value: String): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
      
      @scala.inline
      def setLexmodels(value: String): Self = StObject.set(x, "lexmodels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLexmodelsUndefined: Self = StObject.set(x, "lexmodels", js.undefined)
      
      @scala.inline
      def setLicensemanager(value: String): Self = StObject.set(x, "licensemanager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicensemanagerUndefined: Self = StObject.set(x, "licensemanager", js.undefined)
      
      @scala.inline
      def setLightsail(value: String): Self = StObject.set(x, "lightsail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightsailUndefined: Self = StObject.set(x, "lightsail", js.undefined)
      
      @scala.inline
      def setMacie(value: String): Self = StObject.set(x, "macie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMacie2(value: String): Self = StObject.set(x, "macie2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMacie2Undefined: Self = StObject.set(x, "macie2", js.undefined)
      
      @scala.inline
      def setMacieUndefined: Self = StObject.set(x, "macie", js.undefined)
      
      @scala.inline
      def setManagedblockchain(value: String): Self = StObject.set(x, "managedblockchain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManagedblockchainUndefined: Self = StObject.set(x, "managedblockchain", js.undefined)
      
      @scala.inline
      def setMarketplacecatalog(value: String): Self = StObject.set(x, "marketplacecatalog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarketplacecatalogUndefined: Self = StObject.set(x, "marketplacecatalog", js.undefined)
      
      @scala.inline
      def setMediaconnect(value: String): Self = StObject.set(x, "mediaconnect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaconnectUndefined: Self = StObject.set(x, "mediaconnect", js.undefined)
      
      @scala.inline
      def setMediaconvert(value: String): Self = StObject.set(x, "mediaconvert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaconvertUndefined: Self = StObject.set(x, "mediaconvert", js.undefined)
      
      @scala.inline
      def setMedialive(value: String): Self = StObject.set(x, "medialive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedialiveUndefined: Self = StObject.set(x, "medialive", js.undefined)
      
      @scala.inline
      def setMediapackage(value: String): Self = StObject.set(x, "mediapackage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediapackageUndefined: Self = StObject.set(x, "mediapackage", js.undefined)
      
      @scala.inline
      def setMediastore(value: String): Self = StObject.set(x, "mediastore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediastoreUndefined: Self = StObject.set(x, "mediastore", js.undefined)
      
      @scala.inline
      def setMediastoredata(value: String): Self = StObject.set(x, "mediastoredata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediastoredataUndefined: Self = StObject.set(x, "mediastoredata", js.undefined)
      
      @scala.inline
      def setMq(value: String): Self = StObject.set(x, "mq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMqUndefined: Self = StObject.set(x, "mq", js.undefined)
      
      @scala.inline
      def setNeptune(value: String): Self = StObject.set(x, "neptune", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeptuneUndefined: Self = StObject.set(x, "neptune", js.undefined)
      
      @scala.inline
      def setNetworkfirewall(value: String): Self = StObject.set(x, "networkfirewall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkfirewallUndefined: Self = StObject.set(x, "networkfirewall", js.undefined)
      
      @scala.inline
      def setNetworkmanager(value: String): Self = StObject.set(x, "networkmanager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkmanagerUndefined: Self = StObject.set(x, "networkmanager", js.undefined)
      
      @scala.inline
      def setOpsworks(value: String): Self = StObject.set(x, "opsworks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpsworksUndefined: Self = StObject.set(x, "opsworks", js.undefined)
      
      @scala.inline
      def setOrganizations(value: String): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrganizationsUndefined: Self = StObject.set(x, "organizations", js.undefined)
      
      @scala.inline
      def setOutposts(value: String): Self = StObject.set(x, "outposts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutpostsUndefined: Self = StObject.set(x, "outposts", js.undefined)
      
      @scala.inline
      def setPersonalize(value: String): Self = StObject.set(x, "personalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersonalizeUndefined: Self = StObject.set(x, "personalize", js.undefined)
      
      @scala.inline
      def setPinpoint(value: String): Self = StObject.set(x, "pinpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinpointUndefined: Self = StObject.set(x, "pinpoint", js.undefined)
      
      @scala.inline
      def setPricing(value: String): Self = StObject.set(x, "pricing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPricingUndefined: Self = StObject.set(x, "pricing", js.undefined)
      
      @scala.inline
      def setQldb(value: String): Self = StObject.set(x, "qldb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQldbUndefined: Self = StObject.set(x, "qldb", js.undefined)
      
      @scala.inline
      def setQuicksight(value: String): Self = StObject.set(x, "quicksight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuicksightUndefined: Self = StObject.set(x, "quicksight", js.undefined)
      
      @scala.inline
      def setRam(value: String): Self = StObject.set(x, "ram", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRamUndefined: Self = StObject.set(x, "ram", js.undefined)
      
      @scala.inline
      def setRds(value: String): Self = StObject.set(x, "rds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRdsUndefined: Self = StObject.set(x, "rds", js.undefined)
      
      @scala.inline
      def setRedshift(value: String): Self = StObject.set(x, "redshift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedshiftUndefined: Self = StObject.set(x, "redshift", js.undefined)
      
      @scala.inline
      def setResourcegroups(value: String): Self = StObject.set(x, "resourcegroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourcegroupsUndefined: Self = StObject.set(x, "resourcegroups", js.undefined)
      
      @scala.inline
      def setResourcegroupstaggingapi(value: String): Self = StObject.set(x, "resourcegroupstaggingapi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourcegroupstaggingapiUndefined: Self = StObject.set(x, "resourcegroupstaggingapi", js.undefined)
      
      @scala.inline
      def setRoute53(value: String): Self = StObject.set(x, "route53", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoute53Undefined: Self = StObject.set(x, "route53", js.undefined)
      
      @scala.inline
      def setRoute53domains(value: String): Self = StObject.set(x, "route53domains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoute53domainsUndefined: Self = StObject.set(x, "route53domains", js.undefined)
      
      @scala.inline
      def setRoute53resolver(value: String): Self = StObject.set(x, "route53resolver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoute53resolverUndefined: Self = StObject.set(x, "route53resolver", js.undefined)
      
      @scala.inline
      def setS3(value: String): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
      
      @scala.inline
      def setS3control(value: String): Self = StObject.set(x, "s3control", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3controlUndefined: Self = StObject.set(x, "s3control", js.undefined)
      
      @scala.inline
      def setS3outposts(value: String): Self = StObject.set(x, "s3outposts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3outpostsUndefined: Self = StObject.set(x, "s3outposts", js.undefined)
      
      @scala.inline
      def setSagemaker(value: String): Self = StObject.set(x, "sagemaker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSagemakerUndefined: Self = StObject.set(x, "sagemaker", js.undefined)
      
      @scala.inline
      def setSdb(value: String): Self = StObject.set(x, "sdb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSdbUndefined: Self = StObject.set(x, "sdb", js.undefined)
      
      @scala.inline
      def setSecretsmanager(value: String): Self = StObject.set(x, "secretsmanager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretsmanagerUndefined: Self = StObject.set(x, "secretsmanager", js.undefined)
      
      @scala.inline
      def setSecurityhub(value: String): Self = StObject.set(x, "securityhub", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityhubUndefined: Self = StObject.set(x, "securityhub", js.undefined)
      
      @scala.inline
      def setServerlessrepo(value: String): Self = StObject.set(x, "serverlessrepo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerlessrepoUndefined: Self = StObject.set(x, "serverlessrepo", js.undefined)
      
      @scala.inline
      def setServicecatalog(value: String): Self = StObject.set(x, "servicecatalog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServicecatalogUndefined: Self = StObject.set(x, "servicecatalog", js.undefined)
      
      @scala.inline
      def setServicediscovery(value: String): Self = StObject.set(x, "servicediscovery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServicediscoveryUndefined: Self = StObject.set(x, "servicediscovery", js.undefined)
      
      @scala.inline
      def setServicequotas(value: String): Self = StObject.set(x, "servicequotas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServicequotasUndefined: Self = StObject.set(x, "servicequotas", js.undefined)
      
      @scala.inline
      def setSes(value: String): Self = StObject.set(x, "ses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSesUndefined: Self = StObject.set(x, "ses", js.undefined)
      
      @scala.inline
      def setShield(value: String): Self = StObject.set(x, "shield", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShieldUndefined: Self = StObject.set(x, "shield", js.undefined)
      
      @scala.inline
      def setSns(value: String): Self = StObject.set(x, "sns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnsUndefined: Self = StObject.set(x, "sns", js.undefined)
      
      @scala.inline
      def setSqs(value: String): Self = StObject.set(x, "sqs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSqsUndefined: Self = StObject.set(x, "sqs", js.undefined)
      
      @scala.inline
      def setSsm(value: String): Self = StObject.set(x, "ssm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSsmUndefined: Self = StObject.set(x, "ssm", js.undefined)
      
      @scala.inline
      def setSsoadmin(value: String): Self = StObject.set(x, "ssoadmin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSsoadminUndefined: Self = StObject.set(x, "ssoadmin", js.undefined)
      
      @scala.inline
      def setStepfunctions(value: String): Self = StObject.set(x, "stepfunctions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepfunctionsUndefined: Self = StObject.set(x, "stepfunctions", js.undefined)
      
      @scala.inline
      def setStoragegateway(value: String): Self = StObject.set(x, "storagegateway", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoragegatewayUndefined: Self = StObject.set(x, "storagegateway", js.undefined)
      
      @scala.inline
      def setSts(value: String): Self = StObject.set(x, "sts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStsUndefined: Self = StObject.set(x, "sts", js.undefined)
      
      @scala.inline
      def setSwf(value: String): Self = StObject.set(x, "swf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwfUndefined: Self = StObject.set(x, "swf", js.undefined)
      
      @scala.inline
      def setSynthetics(value: String): Self = StObject.set(x, "synthetics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyntheticsUndefined: Self = StObject.set(x, "synthetics", js.undefined)
      
      @scala.inline
      def setTimestreamwrite(value: String): Self = StObject.set(x, "timestreamwrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestreamwriteUndefined: Self = StObject.set(x, "timestreamwrite", js.undefined)
      
      @scala.inline
      def setTransfer(value: String): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransferUndefined: Self = StObject.set(x, "transfer", js.undefined)
      
      @scala.inline
      def setWaf(value: String): Self = StObject.set(x, "waf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWafUndefined: Self = StObject.set(x, "waf", js.undefined)
      
      @scala.inline
      def setWafregional(value: String): Self = StObject.set(x, "wafregional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWafregionalUndefined: Self = StObject.set(x, "wafregional", js.undefined)
      
      @scala.inline
      def setWafv2(value: String): Self = StObject.set(x, "wafv2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWafv2Undefined: Self = StObject.set(x, "wafv2", js.undefined)
      
      @scala.inline
      def setWorklink(value: String): Self = StObject.set(x, "worklink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorklinkUndefined: Self = StObject.set(x, "worklink", js.undefined)
      
      @scala.inline
      def setWorkmail(value: String): Self = StObject.set(x, "workmail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkmailUndefined: Self = StObject.set(x, "workmail", js.undefined)
      
      @scala.inline
      def setWorkspaces(value: String): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkspacesUndefined: Self = StObject.set(x, "workspaces", js.undefined)
      
      @scala.inline
      def setXray(value: String): Self = StObject.set(x, "xray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXrayUndefined: Self = StObject.set(x, "xray", js.undefined)
    }
  }
  
  trait IgnoreTags extends StObject {
    
    var keyPrefixes: js.UndefOr[js.Array[String]] = js.undefined
    
    var keys: js.UndefOr[js.Array[String]] = js.undefined
  }
  object IgnoreTags {
    
    @scala.inline
    def apply(): IgnoreTags = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IgnoreTags]
    }
    
    @scala.inline
    implicit class IgnoreTagsMutableBuilder[Self <: IgnoreTags] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeyPrefixes(value: js.Array[String]): Self = StObject.set(x, "keyPrefixes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyPrefixesUndefined: Self = StObject.set(x, "keyPrefixes", js.undefined)
      
      @scala.inline
      def setKeyPrefixesVarargs(value: String*): Self = StObject.set(x, "keyPrefixes", js.Array(value :_*))
      
      @scala.inline
      def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      @scala.inline
      def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value :_*))
    }
  }
}
