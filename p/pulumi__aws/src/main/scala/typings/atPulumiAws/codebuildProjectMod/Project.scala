package typings.atPulumiAws.codebuildProjectMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.codebuildNs.ProjectArtifacts
import typings.atPulumiAws.typesOutputMod.codebuildNs.ProjectCache
import typings.atPulumiAws.typesOutputMod.codebuildNs.ProjectEnvironment
import typings.atPulumiAws.typesOutputMod.codebuildNs.ProjectLogsConfig
import typings.atPulumiAws.typesOutputMod.codebuildNs.ProjectSecondaryArtifact
import typings.atPulumiAws.typesOutputMod.codebuildNs.ProjectSecondarySource
import typings.atPulumiAws.typesOutputMod.codebuildNs.ProjectSource
import typings.atPulumiAws.typesOutputMod.codebuildNs.ProjectVpcConfig
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  val arn: Output[String] = js.native
  /**
    * Information about the project's build output artifacts. Artifact blocks are documented below.
    */
  val artifacts: Output[ProjectArtifacts] = js.native
  /**
    * Generates a publicly-accessible URL for the projects build badge. Available as `badgeUrl` attribute when enabled.
    */
  val badgeEnabled: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The URL of the build badge when `badgeEnabled` is enabled.
    */
  val badgeUrl: Output[String] = js.native
  /**
    * How long in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait until timing out any related build that does not get marked as completed. The default is 60 minutes.
    */
  val buildTimeout: Output[js.UndefOr[Double]] = js.native
  /**
    * Information about the cache storage for the project. Cache blocks are documented below.
    */
  val cache: Output[js.UndefOr[ProjectCache]] = js.native
  /**
    * A short description of the project.
    */
  val description: Output[String] = js.native
  /**
    * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build project's build output artifacts.
    */
  val encryptionKey: Output[String] = js.native
  /**
    * Information about the project's build environment. Environment blocks are documented below.
    */
  val environment: Output[ProjectEnvironment] = js.native
  /**
    * Configuration for the builds to store log data to CloudWatch or S3.
    */
  val logsConfig: Output[js.UndefOr[ProjectLogsConfig]] = js.native
  /**
    * The name of the project. If `type` is set to `S3`, this is the name of the output artifact object
    */
  val name: Output[String] = js.native
  /**
    * A set of secondary artifacts to be used inside the build. Secondary artifacts blocks are documented below.
    */
  val secondaryArtifacts: Output[js.UndefOr[js.Array[ProjectSecondaryArtifact]]] = js.native
  /**
    * A set of secondary sources to be used inside the build. Secondary sources blocks are documented below.
    */
  val secondarySources: Output[js.UndefOr[js.Array[ProjectSecondarySource]]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact with dependent AWS services on behalf of the AWS account.
    */
  val serviceRole: Output[String] = js.native
  /**
    * Information about the project's input source code. Source blocks are documented below.
    */
  val source: Output[ProjectSource] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * Configuration for the builds to run inside a VPC. VPC config blocks are documented below.
    */
  val vpcConfig: Output[js.UndefOr[ProjectVpcConfig]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/codebuild/project", "Project")
@js.native
object Project extends js.Object {
  /**
    * Get an existing Project resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Project = js.native
  def get(name: String, id: Input[ID], state: ProjectState): Project = js.native
  def get(name: String, id: Input[ID], state: ProjectState, opts: CustomResourceOptions): Project = js.native
  /**
    * Returns true if the given object is an instance of Project.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codebuild/project.Project */ Boolean = js.native
}

