package typings
package atPulumiAwsLib.codebuildProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/codebuild/project", "Project")
@js.native
class Project protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a Project resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ProjectArgs) = this()
  def this(name: java.lang.String, args: ProjectArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN of the CodeBuild project.
    */
  val arn: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Information about the project's build output artifacts. Artifact blocks are documented below.
    */
  val artifacts: atPulumiPulumiLib.pulumiMod.Output[atPulumiAwsLib.Anon_Packaging] = js.native
  /**
    * Generates a publicly-accessible URL for the projects build badge. Available as `badge_url` attribute when enabled.
    */
  val badgeEnabled: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The URL of the build badge when `badge_enabled` is enabled.
    */
  val badgeUrl: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * How long in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait until timing out any related build that does not get marked as completed. The default is 60 minutes.
    */
  val buildTimeout: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * Information about the cache storage for the project. Cache blocks are documented below.
    */
  val cache: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_LocationType]] = js.native
  /**
    * A short description of the project.
    */
  val description: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build project's build output artifacts.
    */
  val encryptionKey: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Information about the project's build environment. Environment blocks are documented below.
    */
  val environment: atPulumiPulumiLib.pulumiMod.Output[atPulumiAwsLib.Anon_PrivilegedMode] = js.native
  /**
    * The name of the project. If `type` is set to `S3`, this is the name of the output artifact object
    */
  val name: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * A set of secondary artifacts to be used inside the build. Secondary artifacts blocks are documented below.
    */
  val secondaryArtifacts: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_PackagingName]]] = js.native
  /**
    * A set of secondary sources to be used inside the build. Secondary sources blocks are documented below.
    */
  val secondarySources: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_LocationReportBuildStatus]]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact with dependent AWS services on behalf of the AWS account.
    */
  val serviceRole: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Information about the project's input source code. Source blocks are documented below.
    */
  val source: atPulumiPulumiLib.pulumiMod.Output[atPulumiAwsLib.Anon_Location] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * Configuration for the builds to run inside a VPC. VPC config blocks are documented below.
    */
  val vpcConfig: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_SubnetsVpcId]] = js.native
}

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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.codebuildProjectMod.Project = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.codebuildProjectMod.ProjectState
  ): atPulumiAwsLib.codebuildProjectMod.Project = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.codebuildProjectMod.ProjectState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.codebuildProjectMod.Project = js.native
}

