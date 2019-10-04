package typings.atPulumiAws.typesOutputMod.codebuildNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectSource extends js.Object {
  /**
    * Information about the authorization settings for AWS CodeBuild to access the source code to be built. Auth blocks are documented below.
    */
  var auths: js.UndefOr[js.Array[ProjectSourceAuth]] = js.undefined
  /**
    * The build spec declaration to use for this build project's related builds.
    */
  var buildspec: js.UndefOr[String] = js.undefined
  /**
    * Truncate git history to this many commits.
    */
  var gitCloneDepth: js.UndefOr[Double] = js.undefined
  /**
    * Ignore SSL warnings when connecting to source control.
    */
  var insecureSsl: js.UndefOr[Boolean] = js.undefined
  /**
    * The location of the source code from git or s3.
    */
  var location: js.UndefOr[String] = js.undefined
  /**
    * Set to `true` to report the status of a build's start and finish to your source provider. This option is only valid when your source provider is `GITHUB`, `BITBUCKET`, or `GITHUB_ENTERPRISE`.
    */
  var reportBuildStatus: js.UndefOr[Boolean] = js.undefined
  /**
    * The type of repository that contains the source code to be built. Valid values for this parameter are: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET` or `S3`.
    */
  var `type`: String
}

object ProjectSource {
  @scala.inline
  def apply(
    `type`: String,
    auths: js.Array[ProjectSourceAuth] = null,
    buildspec: String = null,
    gitCloneDepth: Int | Double = null,
    insecureSsl: js.UndefOr[Boolean] = js.undefined,
    location: String = null,
    reportBuildStatus: js.UndefOr[Boolean] = js.undefined
  ): ProjectSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (auths != null) __obj.updateDynamic("auths")(auths)
    if (buildspec != null) __obj.updateDynamic("buildspec")(buildspec)
    if (gitCloneDepth != null) __obj.updateDynamic("gitCloneDepth")(gitCloneDepth.asInstanceOf[js.Any])
    if (!js.isUndefined(insecureSsl)) __obj.updateDynamic("insecureSsl")(insecureSsl)
    if (location != null) __obj.updateDynamic("location")(location)
    if (!js.isUndefined(reportBuildStatus)) __obj.updateDynamic("reportBuildStatus")(reportBuildStatus)
    __obj.asInstanceOf[ProjectSource]
  }
}

