package typings.pulumiAws.outputMod.codebuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectSecondarySource extends js.Object {
  /**
    * Information about the authorization settings for AWS CodeBuild to access the source code to be built. Auth blocks are documented below.
    */
  var auths: js.UndefOr[js.Array[ProjectSecondarySourceAuth]] = js.native
  /**
    * The build spec declaration to use for this build project's related builds.
    */
  var buildspec: js.UndefOr[String] = js.native
  /**
    * Truncate git history to this many commits.
    */
  var gitCloneDepth: js.UndefOr[Double] = js.native
  /**
    * Information about the Git submodules configuration for an AWS CodeBuild build project. Git submodules config blocks are documented below. This option is only valid when the `type` is `CODECOMMIT`.
    */
  var gitSubmodulesConfig: js.UndefOr[ProjectSecondarySourceGitSubmodulesConfig] = js.native
  /**
    * Ignore SSL warnings when connecting to source control.
    */
  var insecureSsl: js.UndefOr[Boolean] = js.native
  /**
    * The location of the source code from git or s3.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Set to `true` to report the status of a build's start and finish to your source provider. This option is only valid when your source provider is `GITHUB`, `BITBUCKET`, or `GITHUB_ENTERPRISE`.
    */
  var reportBuildStatus: js.UndefOr[Boolean] = js.native
  /**
    * The source identifier. Source data will be put inside a folder named as this parameter inside AWS CodeBuild source directory
    */
  var sourceIdentifier: String = js.native
  /**
    * The type of repository that contains the source code to be built. Valid values for this parameter are: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET` or `S3`.
    */
  var `type`: String = js.native
}

object ProjectSecondarySource {
  @scala.inline
  def apply(
    sourceIdentifier: String,
    `type`: String,
    auths: js.Array[ProjectSecondarySourceAuth] = null,
    buildspec: String = null,
    gitCloneDepth: js.UndefOr[Double] = js.undefined,
    gitSubmodulesConfig: ProjectSecondarySourceGitSubmodulesConfig = null,
    insecureSsl: js.UndefOr[Boolean] = js.undefined,
    location: String = null,
    reportBuildStatus: js.UndefOr[Boolean] = js.undefined
  ): ProjectSecondarySource = {
    val __obj = js.Dynamic.literal(sourceIdentifier = sourceIdentifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (auths != null) __obj.updateDynamic("auths")(auths.asInstanceOf[js.Any])
    if (buildspec != null) __obj.updateDynamic("buildspec")(buildspec.asInstanceOf[js.Any])
    if (!js.isUndefined(gitCloneDepth)) __obj.updateDynamic("gitCloneDepth")(gitCloneDepth.get.asInstanceOf[js.Any])
    if (gitSubmodulesConfig != null) __obj.updateDynamic("gitSubmodulesConfig")(gitSubmodulesConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(insecureSsl)) __obj.updateDynamic("insecureSsl")(insecureSsl.get.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(reportBuildStatus)) __obj.updateDynamic("reportBuildStatus")(reportBuildStatus.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSecondarySource]
  }
}

