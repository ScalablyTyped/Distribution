package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.codebuild.ProjectArtifacts
import typings.pulumiAws.outputMod.codebuild.ProjectCache
import typings.pulumiAws.outputMod.codebuild.ProjectEnvironment
import typings.pulumiAws.outputMod.codebuild.ProjectLogsConfig
import typings.pulumiAws.outputMod.codebuild.ProjectSecondaryArtifact
import typings.pulumiAws.outputMod.codebuild.ProjectSecondarySource
import typings.pulumiAws.outputMod.codebuild.ProjectSource
import typings.pulumiAws.outputMod.codebuild.ProjectVpcConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectMod {
  
  @JSImport("@pulumi/aws/codebuild/project", "Project")
  @js.native
  class Project protected () extends CustomResource {
    /**
      * Create a Project resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ProjectArgs) = this()
    def this(name: String, args: ProjectArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the CodeBuild project.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Information about the project's build output artifacts. Artifact blocks are documented below.
      */
    val artifacts: Output_[ProjectArtifacts] = js.native
    
    /**
      * Generates a publicly-accessible URL for the projects build badge. Available as `badgeUrl` attribute when enabled.
      */
    val badgeEnabled: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The URL of the build badge when `badgeEnabled` is enabled.
      */
    val badgeUrl: Output_[String] = js.native
    
    /**
      * How long in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait until timing out any related build that does not get marked as completed. The default is 60 minutes.
      */
    val buildTimeout: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * Information about the cache storage for the project. Cache blocks are documented below.
      */
    val cache: Output_[js.UndefOr[ProjectCache]] = js.native
    
    /**
      * A short description of the project.
      */
    val description: Output_[String] = js.native
    
    /**
      * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build project's build output artifacts.
      */
    val encryptionKey: Output_[String] = js.native
    
    /**
      * Information about the project's build environment. Environment blocks are documented below.
      */
    val environment: Output_[ProjectEnvironment] = js.native
    
    /**
      * Configuration for the builds to store log data to CloudWatch or S3.
      */
    val logsConfig: Output_[js.UndefOr[ProjectLogsConfig]] = js.native
    
    /**
      * The projects name.
      */
    val name: Output_[String] = js.native
    
    /**
      * How long in minutes, from 5 to 480 (8 hours), a build is allowed to be queued before it times out. The default is 8 hours.
      */
    val queuedTimeout: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * A set of secondary artifacts to be used inside the build. Secondary artifacts blocks are documented below.
      */
    val secondaryArtifacts: Output_[js.UndefOr[js.Array[ProjectSecondaryArtifact]]] = js.native
    
    /**
      * A set of secondary sources to be used inside the build. Secondary sources blocks are documented below.
      */
    val secondarySources: Output_[js.UndefOr[js.Array[ProjectSecondarySource]]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact with dependent AWS services on behalf of the AWS account.
      */
    val serviceRole: Output_[String] = js.native
    
    /**
      * Information about the project's input source code. Source blocks are documented below.
      */
    val source: Output_[ProjectSource] = js.native
    
    /**
      * A version of the build input to be built for this project. If not specified, the latest version is used.
      */
    val sourceVersion: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Configuration for the builds to run inside a VPC. VPC config blocks are documented below.
      */
    val vpcConfig: Output_[js.UndefOr[ProjectVpcConfig]] = js.native
  }
  /* static members */
  object Project {
    
    @JSImport("@pulumi/aws/codebuild/project", "Project")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Project resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Project = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Project]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Project = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Project]
    inline def get(name: String, id: Input[ID], state: ProjectState): Project = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Project]
    inline def get(name: String, id: Input[ID], state: ProjectState, opts: CustomResourceOptions): Project = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Project]
    
    /**
      * Returns true if the given object is an instance of Project.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codebuild/project.Project */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/codebuild/project.Project */ Boolean]
  }
  
  trait ProjectArgs extends StObject {
    
    /**
      * Information about the project's build output artifacts. Artifact blocks are documented below.
      */
    val artifacts: Input[typings.pulumiAws.inputMod.codebuild.ProjectArtifacts]
    
    /**
      * Generates a publicly-accessible URL for the projects build badge. Available as `badgeUrl` attribute when enabled.
      */
    val badgeEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * How long in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait until timing out any related build that does not get marked as completed. The default is 60 minutes.
      */
    val buildTimeout: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Information about the cache storage for the project. Cache blocks are documented below.
      */
    val cache: js.UndefOr[Input[typings.pulumiAws.inputMod.codebuild.ProjectCache]] = js.undefined
    
    /**
      * A short description of the project.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build project's build output artifacts.
      */
    val encryptionKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Information about the project's build environment. Environment blocks are documented below.
      */
    val environment: Input[typings.pulumiAws.inputMod.codebuild.ProjectEnvironment]
    
    /**
      * Configuration for the builds to store log data to CloudWatch or S3.
      */
    val logsConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.codebuild.ProjectLogsConfig]] = js.undefined
    
    /**
      * The projects name.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * How long in minutes, from 5 to 480 (8 hours), a build is allowed to be queued before it times out. The default is 8 hours.
      */
    val queuedTimeout: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * A set of secondary artifacts to be used inside the build. Secondary artifacts blocks are documented below.
      */
    val secondaryArtifacts: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.codebuild.ProjectSecondaryArtifact]]]
      ] = js.undefined
    
    /**
      * A set of secondary sources to be used inside the build. Secondary sources blocks are documented below.
      */
    val secondarySources: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.codebuild.ProjectSecondarySource]]]
      ] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact with dependent AWS services on behalf of the AWS account.
      */
    val serviceRole: Input[String]
    
    /**
      * Information about the project's input source code. Source blocks are documented below.
      */
    val source: Input[typings.pulumiAws.inputMod.codebuild.ProjectSource]
    
    /**
      * A version of the build input to be built for this project. If not specified, the latest version is used.
      */
    val sourceVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Configuration for the builds to run inside a VPC. VPC config blocks are documented below.
      */
    val vpcConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.codebuild.ProjectVpcConfig]] = js.undefined
  }
  object ProjectArgs {
    
    inline def apply(
      artifacts: Input[typings.pulumiAws.inputMod.codebuild.ProjectArtifacts],
      environment: Input[typings.pulumiAws.inputMod.codebuild.ProjectEnvironment],
      serviceRole: Input[String],
      source: Input[typings.pulumiAws.inputMod.codebuild.ProjectSource]
    ): ProjectArgs = {
      val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], serviceRole = serviceRole.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectArgs]
    }
    
    extension [Self <: ProjectArgs](x: Self) {
      
      inline def setArtifacts(value: Input[typings.pulumiAws.inputMod.codebuild.ProjectArtifacts]): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
      
      inline def setBadgeEnabled(value: Input[Boolean]): Self = StObject.set(x, "badgeEnabled", value.asInstanceOf[js.Any])
      
      inline def setBadgeEnabledUndefined: Self = StObject.set(x, "badgeEnabled", js.undefined)
      
      inline def setBuildTimeout(value: Input[Double]): Self = StObject.set(x, "buildTimeout", value.asInstanceOf[js.Any])
      
      inline def setBuildTimeoutUndefined: Self = StObject.set(x, "buildTimeout", js.undefined)
      
      inline def setCache(value: Input[typings.pulumiAws.inputMod.codebuild.ProjectCache]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEncryptionKey(value: Input[String]): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
      
      inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
      
      inline def setEnvironment(value: Input[typings.pulumiAws.inputMod.codebuild.ProjectEnvironment]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setLogsConfig(value: Input[typings.pulumiAws.inputMod.codebuild.ProjectLogsConfig]): Self = StObject.set(x, "logsConfig", value.asInstanceOf[js.Any])
      
      inline def setLogsConfigUndefined: Self = StObject.set(x, "logsConfig", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setQueuedTimeout(value: Input[Double]): Self = StObject.set(x, "queuedTimeout", value.asInstanceOf[js.Any])
      
      inline def setQueuedTimeoutUndefined: Self = StObject.set(x, "queuedTimeout", js.undefined)
      
      inline def setSecondaryArtifacts(value: Input[js.Array[Input[typings.pulumiAws.inputMod.codebuild.ProjectSecondaryArtifact]]]): Self = StObject.set(x, "secondaryArtifacts", value.asInstanceOf[js.Any])
      
      inline def setSecondaryArtifactsUndefined: Self = StObject.set(x, "secondaryArtifacts", js.undefined)
      
      inline def setSecondaryArtifactsVarargs(value: Input[typings.pulumiAws.inputMod.codebuild.ProjectSecondaryArtifact]*): Self = StObject.set(x, "secondaryArtifacts", js.Array(value :_*))
      
      inline def setSecondarySources(value: Input[js.Array[Input[typings.pulumiAws.inputMod.codebuild.ProjectSecondarySource]]]): Self = StObject.set(x, "secondarySources", value.asInstanceOf[js.Any])
      
      inline def setSecondarySourcesUndefined: Self = StObject.set(x, "secondarySources", js.undefined)
      
      inline def setSecondarySourcesVarargs(value: Input[typings.pulumiAws.inputMod.codebuild.ProjectSecondarySource]*): Self = StObject.set(x, "secondarySources", js.Array(value :_*))
      
      inline def setServiceRole(value: Input[String]): Self = StObject.set(x, "serviceRole", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Input[typings.pulumiAws.inputMod.codebuild.ProjectSource]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceVersion(value: Input[String]): Self = StObject.set(x, "sourceVersion", value.asInstanceOf[js.Any])
      
      inline def setSourceVersionUndefined: Self = StObject.set(x, "sourceVersion", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVpcConfig(value: Input[typings.pulumiAws.inputMod.codebuild.ProjectVpcConfig]): Self = StObject.set(x, "vpcConfig", value.asInstanceOf[js.Any])
      
      inline def setVpcConfigUndefined: Self = StObject.set(x, "vpcConfig", js.undefined)
    }
  }
  
  trait ProjectState extends StObject {
    
    /**
      * The ARN of the CodeBuild project.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Information about the project's build output artifacts. Artifact blocks are documented below.
      */
    val artifacts: js.UndefOr[Input[typings.pulumiAws.inputMod.codebuild.ProjectArtifacts]] = js.undefined
    
    /**
      * Generates a publicly-accessible URL for the projects build badge. Available as `badgeUrl` attribute when enabled.
      */
    val badgeEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The URL of the build badge when `badgeEnabled` is enabled.
      */
    val badgeUrl: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * How long in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait until timing out any related build that does not get marked as completed. The default is 60 minutes.
      */
    val buildTimeout: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Information about the cache storage for the project. Cache blocks are documented below.
      */
    val cache: js.UndefOr[Input[typings.pulumiAws.inputMod.codebuild.ProjectCache]] = js.undefined
    
    /**
      * A short description of the project.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build project's build output artifacts.
      */
    val encryptionKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Information about the project's build environment. Environment blocks are documented below.
      */
    val environment: js.UndefOr[Input[typings.pulumiAws.inputMod.codebuild.ProjectEnvironment]] = js.undefined
    
    /**
      * Configuration for the builds to store log data to CloudWatch or S3.
      */
    val logsConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.codebuild.ProjectLogsConfig]] = js.undefined
    
    /**
      * The projects name.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * How long in minutes, from 5 to 480 (8 hours), a build is allowed to be queued before it times out. The default is 8 hours.
      */
    val queuedTimeout: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * A set of secondary artifacts to be used inside the build. Secondary artifacts blocks are documented below.
      */
    val secondaryArtifacts: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.codebuild.ProjectSecondaryArtifact]]]
      ] = js.undefined
    
    /**
      * A set of secondary sources to be used inside the build. Secondary sources blocks are documented below.
      */
    val secondarySources: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.codebuild.ProjectSecondarySource]]]
      ] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact with dependent AWS services on behalf of the AWS account.
      */
    val serviceRole: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Information about the project's input source code. Source blocks are documented below.
      */
    val source: js.UndefOr[Input[typings.pulumiAws.inputMod.codebuild.ProjectSource]] = js.undefined
    
    /**
      * A version of the build input to be built for this project. If not specified, the latest version is used.
      */
    val sourceVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Configuration for the builds to run inside a VPC. VPC config blocks are documented below.
      */
    val vpcConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.codebuild.ProjectVpcConfig]] = js.undefined
  }
  object ProjectState {
    
    inline def apply(): ProjectState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProjectState]
    }
    
    extension [Self <: ProjectState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setArtifacts(value: Input[typings.pulumiAws.inputMod.codebuild.ProjectArtifacts]): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
      
      inline def setArtifactsUndefined: Self = StObject.set(x, "artifacts", js.undefined)
      
      inline def setBadgeEnabled(value: Input[Boolean]): Self = StObject.set(x, "badgeEnabled", value.asInstanceOf[js.Any])
      
      inline def setBadgeEnabledUndefined: Self = StObject.set(x, "badgeEnabled", js.undefined)
      
      inline def setBadgeUrl(value: Input[String]): Self = StObject.set(x, "badgeUrl", value.asInstanceOf[js.Any])
      
      inline def setBadgeUrlUndefined: Self = StObject.set(x, "badgeUrl", js.undefined)
      
      inline def setBuildTimeout(value: Input[Double]): Self = StObject.set(x, "buildTimeout", value.asInstanceOf[js.Any])
      
      inline def setBuildTimeoutUndefined: Self = StObject.set(x, "buildTimeout", js.undefined)
      
      inline def setCache(value: Input[typings.pulumiAws.inputMod.codebuild.ProjectCache]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEncryptionKey(value: Input[String]): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
      
      inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
      
      inline def setEnvironment(value: Input[typings.pulumiAws.inputMod.codebuild.ProjectEnvironment]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      inline def setLogsConfig(value: Input[typings.pulumiAws.inputMod.codebuild.ProjectLogsConfig]): Self = StObject.set(x, "logsConfig", value.asInstanceOf[js.Any])
      
      inline def setLogsConfigUndefined: Self = StObject.set(x, "logsConfig", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setQueuedTimeout(value: Input[Double]): Self = StObject.set(x, "queuedTimeout", value.asInstanceOf[js.Any])
      
      inline def setQueuedTimeoutUndefined: Self = StObject.set(x, "queuedTimeout", js.undefined)
      
      inline def setSecondaryArtifacts(value: Input[js.Array[Input[typings.pulumiAws.inputMod.codebuild.ProjectSecondaryArtifact]]]): Self = StObject.set(x, "secondaryArtifacts", value.asInstanceOf[js.Any])
      
      inline def setSecondaryArtifactsUndefined: Self = StObject.set(x, "secondaryArtifacts", js.undefined)
      
      inline def setSecondaryArtifactsVarargs(value: Input[typings.pulumiAws.inputMod.codebuild.ProjectSecondaryArtifact]*): Self = StObject.set(x, "secondaryArtifacts", js.Array(value :_*))
      
      inline def setSecondarySources(value: Input[js.Array[Input[typings.pulumiAws.inputMod.codebuild.ProjectSecondarySource]]]): Self = StObject.set(x, "secondarySources", value.asInstanceOf[js.Any])
      
      inline def setSecondarySourcesUndefined: Self = StObject.set(x, "secondarySources", js.undefined)
      
      inline def setSecondarySourcesVarargs(value: Input[typings.pulumiAws.inputMod.codebuild.ProjectSecondarySource]*): Self = StObject.set(x, "secondarySources", js.Array(value :_*))
      
      inline def setServiceRole(value: Input[String]): Self = StObject.set(x, "serviceRole", value.asInstanceOf[js.Any])
      
      inline def setServiceRoleUndefined: Self = StObject.set(x, "serviceRole", js.undefined)
      
      inline def setSource(value: Input[typings.pulumiAws.inputMod.codebuild.ProjectSource]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setSourceVersion(value: Input[String]): Self = StObject.set(x, "sourceVersion", value.asInstanceOf[js.Any])
      
      inline def setSourceVersionUndefined: Self = StObject.set(x, "sourceVersion", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVpcConfig(value: Input[typings.pulumiAws.inputMod.codebuild.ProjectVpcConfig]): Self = StObject.set(x, "vpcConfig", value.asInstanceOf[js.Any])
      
      inline def setVpcConfigUndefined: Self = StObject.set(x, "vpcConfig", js.undefined)
    }
  }
}
