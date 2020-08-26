package typings.pulumiAws.projectMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.codebuild.ProjectArtifacts
import typings.pulumiAws.inputMod.codebuild.ProjectCache
import typings.pulumiAws.inputMod.codebuild.ProjectEnvironment
import typings.pulumiAws.inputMod.codebuild.ProjectLogsConfig
import typings.pulumiAws.inputMod.codebuild.ProjectSecondaryArtifact
import typings.pulumiAws.inputMod.codebuild.ProjectSecondarySource
import typings.pulumiAws.inputMod.codebuild.ProjectSource
import typings.pulumiAws.inputMod.codebuild.ProjectVpcConfig
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectArgs extends js.Object {
  /**
    * Information about the project's build output artifacts. Artifact blocks are documented below.
    */
  val artifacts: Input[ProjectArtifacts] = js.native
  /**
    * Generates a publicly-accessible URL for the projects build badge. Available as `badgeUrl` attribute when enabled.
    */
  val badgeEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * How long in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait until timing out any related build that does not get marked as completed. The default is 60 minutes.
    */
  val buildTimeout: js.UndefOr[Input[Double]] = js.native
  /**
    * Information about the cache storage for the project. Cache blocks are documented below.
    */
  val cache: js.UndefOr[Input[ProjectCache]] = js.native
  /**
    * A short description of the project.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build project's build output artifacts.
    */
  val encryptionKey: js.UndefOr[Input[String]] = js.native
  /**
    * Information about the project's build environment. Environment blocks are documented below.
    */
  val environment: Input[ProjectEnvironment] = js.native
  /**
    * Configuration for the builds to store log data to CloudWatch or S3.
    */
  val logsConfig: js.UndefOr[Input[ProjectLogsConfig]] = js.native
  /**
    * The projects name.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * How long in minutes, from 5 to 480 (8 hours), a build is allowed to be queued before it times out. The default is 8 hours.
    */
  val queuedTimeout: js.UndefOr[Input[Double]] = js.native
  /**
    * A set of secondary artifacts to be used inside the build. Secondary artifacts blocks are documented below.
    */
  val secondaryArtifacts: js.UndefOr[Input[js.Array[Input[ProjectSecondaryArtifact]]]] = js.native
  /**
    * A set of secondary sources to be used inside the build. Secondary sources blocks are documented below.
    */
  val secondarySources: js.UndefOr[Input[js.Array[Input[ProjectSecondarySource]]]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact with dependent AWS services on behalf of the AWS account.
    */
  val serviceRole: Input[String] = js.native
  /**
    * Information about the project's input source code. Source blocks are documented below.
    */
  val source: Input[ProjectSource] = js.native
  /**
    * A version of the build input to be built for this project. If not specified, the latest version is used.
    */
  val sourceVersion: js.UndefOr[Input[String]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Configuration for the builds to run inside a VPC. VPC config blocks are documented below.
    */
  val vpcConfig: js.UndefOr[Input[ProjectVpcConfig]] = js.native
}

object ProjectArgs {
  @scala.inline
  def apply(
    artifacts: Input[ProjectArtifacts],
    environment: Input[ProjectEnvironment],
    serviceRole: Input[String],
    source: Input[ProjectSource]
  ): ProjectArgs = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], serviceRole = serviceRole.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectArgs]
  }
  @scala.inline
  implicit class ProjectArgsOps[Self <: ProjectArgs] (val x: Self) extends AnyVal {
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
    def setArtifacts(value: Input[ProjectArtifacts]): Self = this.set("artifacts", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironment(value: Input[ProjectEnvironment]): Self = this.set("environment", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceRole(value: Input[String]): Self = this.set("serviceRole", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: Input[ProjectSource]): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setBadgeEnabled(value: Input[Boolean]): Self = this.set("badgeEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadgeEnabled: Self = this.set("badgeEnabled", js.undefined)
    @scala.inline
    def setBuildTimeout(value: Input[Double]): Self = this.set("buildTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuildTimeout: Self = this.set("buildTimeout", js.undefined)
    @scala.inline
    def setCache(value: Input[ProjectCache]): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEncryptionKey(value: Input[String]): Self = this.set("encryptionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionKey: Self = this.set("encryptionKey", js.undefined)
    @scala.inline
    def setLogsConfig(value: Input[ProjectLogsConfig]): Self = this.set("logsConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogsConfig: Self = this.set("logsConfig", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setQueuedTimeout(value: Input[Double]): Self = this.set("queuedTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueuedTimeout: Self = this.set("queuedTimeout", js.undefined)
    @scala.inline
    def setSecondaryArtifactsVarargs(value: Input[ProjectSecondaryArtifact]*): Self = this.set("secondaryArtifacts", js.Array(value :_*))
    @scala.inline
    def setSecondaryArtifacts(value: Input[js.Array[Input[ProjectSecondaryArtifact]]]): Self = this.set("secondaryArtifacts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryArtifacts: Self = this.set("secondaryArtifacts", js.undefined)
    @scala.inline
    def setSecondarySourcesVarargs(value: Input[ProjectSecondarySource]*): Self = this.set("secondarySources", js.Array(value :_*))
    @scala.inline
    def setSecondarySources(value: Input[js.Array[Input[ProjectSecondarySource]]]): Self = this.set("secondarySources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondarySources: Self = this.set("secondarySources", js.undefined)
    @scala.inline
    def setSourceVersion(value: Input[String]): Self = this.set("sourceVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceVersion: Self = this.set("sourceVersion", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setVpcConfig(value: Input[ProjectVpcConfig]): Self = this.set("vpcConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcConfig: Self = this.set("vpcConfig", js.undefined)
  }
  
}

