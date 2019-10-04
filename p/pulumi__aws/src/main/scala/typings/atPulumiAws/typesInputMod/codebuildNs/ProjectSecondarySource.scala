package typings.atPulumiAws.typesInputMod.codebuildNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectSecondarySource extends js.Object {
  /**
    * Information about the authorization settings for AWS CodeBuild to access the source code to be built. Auth blocks are documented below.
    */
  var auths: js.UndefOr[Input[js.Array[Input[ProjectSecondarySourceAuth]]]] = js.undefined
  /**
    * The build spec declaration to use for this build project's related builds.
    */
  var buildspec: js.UndefOr[Input[String]] = js.undefined
  /**
    * Truncate git history to this many commits.
    */
  var gitCloneDepth: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Ignore SSL warnings when connecting to source control.
    */
  var insecureSsl: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The location of the source code from git or s3.
    */
  var location: js.UndefOr[Input[String]] = js.undefined
  /**
    * Set to `true` to report the status of a build's start and finish to your source provider. This option is only valid when your source provider is `GITHUB`, `BITBUCKET`, or `GITHUB_ENTERPRISE`.
    */
  var reportBuildStatus: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The source identifier. Source data will be put inside a folder named as this parameter inside AWS CodeBuild source directory
    */
  var sourceIdentifier: Input[String]
  /**
    * The type of repository that contains the source code to be built. Valid values for this parameter are: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET` or `S3`.
    */
  var `type`: Input[String]
}

object ProjectSecondarySource {
  @scala.inline
  def apply(
    sourceIdentifier: Input[String],
    `type`: Input[String],
    auths: Input[js.Array[Input[ProjectSecondarySourceAuth]]] = null,
    buildspec: Input[String] = null,
    gitCloneDepth: Input[Double] = null,
    insecureSsl: Input[Boolean] = null,
    location: Input[String] = null,
    reportBuildStatus: Input[Boolean] = null
  ): ProjectSecondarySource = {
    val __obj = js.Dynamic.literal(sourceIdentifier = sourceIdentifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (auths != null) __obj.updateDynamic("auths")(auths.asInstanceOf[js.Any])
    if (buildspec != null) __obj.updateDynamic("buildspec")(buildspec.asInstanceOf[js.Any])
    if (gitCloneDepth != null) __obj.updateDynamic("gitCloneDepth")(gitCloneDepth.asInstanceOf[js.Any])
    if (insecureSsl != null) __obj.updateDynamic("insecureSsl")(insecureSsl.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (reportBuildStatus != null) __obj.updateDynamic("reportBuildStatus")(reportBuildStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSecondarySource]
  }
}

