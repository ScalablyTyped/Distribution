package typings.atPulumiAws.codebuildProjectMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.codebuildNs.ProjectArtifacts
import typings.atPulumiAws.typesInputMod.codebuildNs.ProjectCache
import typings.atPulumiAws.typesInputMod.codebuildNs.ProjectEnvironment
import typings.atPulumiAws.typesInputMod.codebuildNs.ProjectLogsConfig
import typings.atPulumiAws.typesInputMod.codebuildNs.ProjectSecondaryArtifact
import typings.atPulumiAws.typesInputMod.codebuildNs.ProjectSecondarySource
import typings.atPulumiAws.typesInputMod.codebuildNs.ProjectSource
import typings.atPulumiAws.typesInputMod.codebuildNs.ProjectVpcConfig
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectArgs extends js.Object {
  /**
    * Information about the project's build output artifacts. Artifact blocks are documented below.
    */
  val artifacts: Input[ProjectArtifacts]
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
  val cache: js.UndefOr[Input[ProjectCache]] = js.undefined
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
  val environment: Input[ProjectEnvironment]
  /**
    * Configuration for the builds to store log data to CloudWatch or S3.
    */
  val logsConfig: js.UndefOr[Input[ProjectLogsConfig]] = js.undefined
  /**
    * The name of the project. If `type` is set to `S3`, this is the name of the output artifact object
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * A set of secondary artifacts to be used inside the build. Secondary artifacts blocks are documented below.
    */
  val secondaryArtifacts: js.UndefOr[Input[js.Array[Input[ProjectSecondaryArtifact]]]] = js.undefined
  /**
    * A set of secondary sources to be used inside the build. Secondary sources blocks are documented below.
    */
  val secondarySources: js.UndefOr[Input[js.Array[Input[ProjectSecondarySource]]]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact with dependent AWS services on behalf of the AWS account.
    */
  val serviceRole: Input[String]
  /**
    * Information about the project's input source code. Source blocks are documented below.
    */
  val source: Input[ProjectSource]
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * Configuration for the builds to run inside a VPC. VPC config blocks are documented below.
    */
  val vpcConfig: js.UndefOr[Input[ProjectVpcConfig]] = js.undefined
}

object ProjectArgs {
  @scala.inline
  def apply(
    artifacts: Input[ProjectArtifacts],
    environment: Input[ProjectEnvironment],
    serviceRole: Input[String],
    source: Input[ProjectSource],
    badgeEnabled: Input[Boolean] = null,
    buildTimeout: Input[Double] = null,
    cache: Input[ProjectCache] = null,
    description: Input[String] = null,
    encryptionKey: Input[String] = null,
    logsConfig: Input[ProjectLogsConfig] = null,
    name: Input[String] = null,
    secondaryArtifacts: Input[js.Array[Input[ProjectSecondaryArtifact]]] = null,
    secondarySources: Input[js.Array[Input[ProjectSecondarySource]]] = null,
    tags: Input[StringDictionary[_]] = null,
    vpcConfig: Input[ProjectVpcConfig] = null
  ): ProjectArgs = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], serviceRole = serviceRole.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (badgeEnabled != null) __obj.updateDynamic("badgeEnabled")(badgeEnabled.asInstanceOf[js.Any])
    if (buildTimeout != null) __obj.updateDynamic("buildTimeout")(buildTimeout.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    if (logsConfig != null) __obj.updateDynamic("logsConfig")(logsConfig.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (secondaryArtifacts != null) __obj.updateDynamic("secondaryArtifacts")(secondaryArtifacts.asInstanceOf[js.Any])
    if (secondarySources != null) __obj.updateDynamic("secondarySources")(secondarySources.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcConfig != null) __obj.updateDynamic("vpcConfig")(vpcConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectArgs]
  }
}

