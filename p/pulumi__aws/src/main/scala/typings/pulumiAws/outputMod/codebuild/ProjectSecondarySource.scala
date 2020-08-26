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
    * Information about the Git submodules configuration for an AWS CodeBuild build project. Git submodules config blocks are documented below. This option is only valid when the `type` is `CODECOMMIT`, `GITHUB` or `GITHUB_ENTERPRISE`.
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
  def apply(sourceIdentifier: String, `type`: String): ProjectSecondarySource = {
    val __obj = js.Dynamic.literal(sourceIdentifier = sourceIdentifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSecondarySource]
  }
  @scala.inline
  implicit class ProjectSecondarySourceOps[Self <: ProjectSecondarySource] (val x: Self) extends AnyVal {
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
    def setSourceIdentifier(value: String): Self = this.set("sourceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthsVarargs(value: ProjectSecondarySourceAuth*): Self = this.set("auths", js.Array(value :_*))
    @scala.inline
    def setAuths(value: js.Array[ProjectSecondarySourceAuth]): Self = this.set("auths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuths: Self = this.set("auths", js.undefined)
    @scala.inline
    def setBuildspec(value: String): Self = this.set("buildspec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuildspec: Self = this.set("buildspec", js.undefined)
    @scala.inline
    def setGitCloneDepth(value: Double): Self = this.set("gitCloneDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGitCloneDepth: Self = this.set("gitCloneDepth", js.undefined)
    @scala.inline
    def setGitSubmodulesConfig(value: ProjectSecondarySourceGitSubmodulesConfig): Self = this.set("gitSubmodulesConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGitSubmodulesConfig: Self = this.set("gitSubmodulesConfig", js.undefined)
    @scala.inline
    def setInsecureSsl(value: Boolean): Self = this.set("insecureSsl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsecureSsl: Self = this.set("insecureSsl", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setReportBuildStatus(value: Boolean): Self = this.set("reportBuildStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportBuildStatus: Self = this.set("reportBuildStatus", js.undefined)
  }
  
}

