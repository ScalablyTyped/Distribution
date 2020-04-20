package typings.pulumiAws

import typings.pulumiAws.documentsMod.Principal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam/principals", JSImport.Namespace)
@js.native
object principalsMod extends js.Object {
  val AcmServicePrincipal: Principal = js.native
  val ApiGatewayPrincipal: Principal = js.native
  val AthenaPrincipal: Principal = js.native
  val AutoscalingPrincipal: Principal = js.native
  val CloudDirectoryPrincipal: Principal = js.native
  val CloudSearchPrincipal: Principal = js.native
  val CloudformationPrincipal: Principal = js.native
  val CloudfrontPrincipal: Principal = js.native
  val CloudtrailPrincipal: Principal = js.native
  val CodeCommitPrincipal: Principal = js.native
  val CodeDeployPrincipal: Principal = js.native
  val CodePipelinePrincipal: Principal = js.native
  val ConfigPrincipal: Principal = js.native
  val DataPipelinePrincipal: Principal = js.native
  val DirectConnectPrincipal: Principal = js.native
  val DirectoryServicesPrincipal: Principal = js.native
  val DynamoDbPrincipal: Principal = js.native
  val Ec2Principal: Principal = js.native
  val EcrPrincipal: Principal = js.native
  val EcsPrincipal: Principal = js.native
  val EdgeLambdaPrincipal: Principal = js.native
  val ElasticBeanstalkPrincipal: Principal = js.native
  val ElasticFileSystemPrincipal: Principal = js.native
  val ElasticLoadBalancingPrincipal: Principal = js.native
  val ElasticMapReducePrincipal: Principal = js.native
  val ElasticachePrincipal: Principal = js.native
  val EventsPrincipal: Principal = js.native
  val HealthPrincipal: Principal = js.native
  val IamPrincipal: Principal = js.native
  val InspectorPrincipal: Principal = js.native
  val KinesisPrincipal: Principal = js.native
  val KmsPrincipal: Principal = js.native
  val LambdaPrincipal: Principal = js.native
  val LightsailPrincipal: Principal = js.native
  val LogsPrincipal: Principal = js.native
  val MonitoringPrincipal: Principal = js.native
  val OpsworksPrincipal: Principal = js.native
  val OrganizationsPrincipal: Principal = js.native
  val RdsPrincipal: Principal = js.native
  val RedshiftPrincipal: Principal = js.native
  val Route53Principal: Principal = js.native
  val S3Principal: Principal = js.native
  val ServiceCatalogPrincipal: Principal = js.native
  val SesPrincipal: Principal = js.native
  val SigninPrincipal: Principal = js.native
  val SnsPrincipal: Principal = js.native
  val SqsPrincipal: Principal = js.native
  val SsmPrincipal: Principal = js.native
  val StorageGatewayPrincipal: Principal = js.native
  val StsPrincipal: Principal = js.native
  val SupportPrincipal: Principal = js.native
  val VmiePrincipal: Principal = js.native
  val VpcFlowLogsPrincipal: Principal = js.native
  val WafPrincipal: Principal = js.native
  val WorkDocsPrincipal: Principal = js.native
  val WorkspacesPrincipal: Principal = js.native
  @js.native
  object Principals extends js.Object {
    /**
      * Service Principal for Amazon Certificate Manager
      */
    val AcmServicePrincipal: Principal = js.native
    /**
      * Service Principal for API Gateway
      */
    val ApiGatewayPrincipal: Principal = js.native
    /**
      * Service Principal for Athena
      */
    val AthenaPrincipal: Principal = js.native
    /**
      * Service Principal for Autoscaling
      */
    val AutoscalingPrincipal: Principal = js.native
    /**
      * Service Principal for Cloud Directory
      */
    val CloudDirectoryPrincipal: Principal = js.native
    /**
      * Service Principal for Cloud Search
      */
    val CloudSearchPrincipal: Principal = js.native
    /**
      * Service Principal for Cloudformation
      */
    val CloudformationPrincipal: Principal = js.native
    /**
      * Service Principal for Cloudfront
      */
    val CloudfrontPrincipal: Principal = js.native
    /**
      * Service Principal for Cloudtrail
      */
    val CloudtrailPrincipal: Principal = js.native
    /**
      * Service Principal for CodeBuild
      */
    val CodeBuildPrincipal: Principal = js.native
    /**
      * Service Principal for CodeCommit
      */
    val CodeCommitPrincipal: Principal = js.native
    /**
      * Service Principal for CodeDeploy
      */
    val CodeDeployPrincipal: Principal = js.native
    /**
      * Service Principal for CodePipeline
      */
    val CodePipelinePrincipal: Principal = js.native
    /**
      * Service Principal for EC2 Config Service
      */
    val ConfigPrincipal: Principal = js.native
    /**
      * Service Principal for Data Pipeline
      */
    val DataPipelinePrincipal: Principal = js.native
    /**
      * Service Principal for DirectConnect
      */
    val DirectConnectPrincipal: Principal = js.native
    /**
      * Service Principal for Directory Services
      */
    val DirectoryServicesPrincipal: Principal = js.native
    /**
      * Service Principal for DynamoDB
      */
    val DynamoDbPrincipal: Principal = js.native
    /**
      * Service Principal for EC2
      */
    val Ec2Principal: Principal = js.native
    /**
      * Service Principal for Elastic Container Registry
      */
    val EcrPrincipal: Principal = js.native
    /**
      * Service Principal for Elastic Container Service
      */
    val EcsPrincipal: Principal = js.native
    /**
      * Service Principal for Elastic Container Service Tasks
      * Usage: https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html
      */
    val EcsTasksPrincipal: Principal = js.native
    /**
      * Service Principal for Edge Lambda
      */
    val EdgeLambdaPrincipal: Principal = js.native
    /**
      * Service Principal for Elastic Beanstalk
      */
    val ElasticBeanstalkPrincipal: Principal = js.native
    /**
      * Service Principal for Elastic File System
      */
    val ElasticFileSystemPrincipal: Principal = js.native
    /**
      * Service Principal for Elastic Load Balancing
      */
    val ElasticLoadBalancingPrincipal: Principal = js.native
    /**
      * Service Principal for Elastic MapReduce
      */
    val ElasticMapReducePrincipal: Principal = js.native
    /**
      * Service Principal for Elasticache
      */
    val ElasticachePrincipal: Principal = js.native
    /**
      * Service Principal for Events
      */
    val EventsPrincipal: Principal = js.native
    /**
      * Service Principal for Health
      */
    val HealthPrincipal: Principal = js.native
    /**
      * Service Principal for IAM
      */
    val IamPrincipal: Principal = js.native
    /**
      * Service Principal for AWS Inspector
      */
    val InspectorPrincipal: Principal = js.native
    /**
      * Service Principal for Kinesis
      */
    val KinesisPrincipal: Principal = js.native
    /**
      * Service Principal for Key Mangaement Service
      */
    val KmsPrincipal: Principal = js.native
    /**
      * Service Principal for Lambda
      */
    val LambdaPrincipal: Principal = js.native
    /**
      * Service Principal for Lightsail
      */
    val LightsailPrincipal: Principal = js.native
    /**
      * Service Principal for Cloudwatch Logs
      */
    val LogsPrincipal: Principal = js.native
    /**
      * Service Principal for Cloudwatch Monitoring
      */
    val MonitoringPrincipal: Principal = js.native
    /**
      * Service Principal for Opsworks
      */
    val OpsworksPrincipal: Principal = js.native
    /**
      * Service Principal for Organizations
      */
    val OrganizationsPrincipal: Principal = js.native
    /**
      * Service Principal for Relational Database Service
      */
    val RdsPrincipal: Principal = js.native
    /**
      * Service Principal for Redshift
      */
    val RedshiftPrincipal: Principal = js.native
    /**
      * Service Principal for Route 53
      */
    val Route53Principal: Principal = js.native
    /**
      * Service Principal for S3
      */
    val S3Principal: Principal = js.native
    /**
      * Service Principal for Service Catalog
      */
    val ServiceCatalogPrincipal: Principal = js.native
    /**
      * Service Principal for Simple Email Service
      */
    val SesPrincipal: Principal = js.native
    /**
      * Service Principal for Signin Service
      */
    val SigninPrincipal: Principal = js.native
    /**
      * Service Principal for Simple Notification Service
      */
    val SnsPrincipal: Principal = js.native
    /**
      * Service Principal for Simple Queue Service
      */
    val SqsPrincipal: Principal = js.native
    /**
      * Service Principal for Systems Manager
      */
    val SsmPrincipal: Principal = js.native
    /**
      * Service Principal for Storage Gateway
      */
    val StorageGatewayPrincipal: Principal = js.native
    /**
      * Service Principal for Security Token Service
      */
    val StsPrincipal: Principal = js.native
    /**
      * Service Principal for AWS Support
      */
    val SupportPrincipal: Principal = js.native
    /**
      * Service Principal for VM Import/Export
      */
    val VmiePrincipal: Principal = js.native
    /**
      * Service Principal for VPC Flow Logs
      */
    val VpcFlowLogsPrincipal: Principal = js.native
    /**
      * Service Principal for Web Application Firewall
      */
    val WafPrincipal: Principal = js.native
    /**
      * Service Principal for WorkDocs
      */
    val WorkDocsPrincipal: Principal = js.native
    /**
      * Service Principal for Workspaces
      */
    val WorkspacesPrincipal: Principal = js.native
  }
  
}

