package typings.pulumiAws.projectMod

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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Project = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Project = js.native
  def get(name: String, id: Input[ID], state: ProjectState): Project = js.native
  def get(name: String, id: Input[ID], state: ProjectState, opts: CustomResourceOptions): Project = js.native
  /**
    * Returns true if the given object is an instance of Project.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codebuild/project.Project */ Boolean = js.native
}

