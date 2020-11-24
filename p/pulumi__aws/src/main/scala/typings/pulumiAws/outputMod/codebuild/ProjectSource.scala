package typings.pulumiAws.outputMod.codebuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectSource extends js.Object {
  
  /**
    * Information about the authorization settings for AWS CodeBuild to access the source code to be built. Auth blocks are documented below.
    */
  var auths: js.UndefOr[js.Array[ProjectSourceAuth]] = js.native
  
  /**
    * The build spec declaration to use for this build project's related builds. This must be set when `type` is `NO_SOURCE`.
    */
  var buildspec: js.UndefOr[String] = js.native
  
  /**
    * Truncate git history to this many commits.
    */
  var gitCloneDepth: js.UndefOr[Double] = js.native
  
  /**
    * Information about the Git submodules configuration for an AWS CodeBuild build project. Git submodules config blocks are documented below. This option is only valid when the `type` is `CODECOMMIT`, `GITHUB` or `GITHUB_ENTERPRISE`.
    */
  var gitSubmodulesConfig: js.UndefOr[ProjectSourceGitSubmodulesConfig] = js.native
  
  /**
    * Ignore SSL warnings when connecting to source control.
    */
  var insecureSsl: js.UndefOr[Boolean] = js.native
  
  /**
    * The location of the source code from git or s3.
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    * Set to `true` to report the status of a build's start and finish to your source provider. This option is only valid when the `type` is `BITBUCKET` or `GITHUB`.
    */
  var reportBuildStatus: js.UndefOr[Boolean] = js.native
  
  /**
    * The type of repository that contains the source code to be built. Valid values for this parameter are: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3` or `NO_SOURCE`.
    */
  var `type`: String = js.native
}
object ProjectSource {
  
  @scala.inline
  def apply(`type`: String): ProjectSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSource]
  }
  
  @scala.inline
  implicit class ProjectSourceOps[Self <: ProjectSource] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthsVarargs(value: ProjectSourceAuth*): Self = this.set("auths", js.Array(value :_*))
    
    @scala.inline
    def setAuths(value: js.Array[ProjectSourceAuth]): Self = this.set("auths", value.asInstanceOf[js.Any])
    
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
    def setGitSubmodulesConfig(value: ProjectSourceGitSubmodulesConfig): Self = this.set("gitSubmodulesConfig", value.asInstanceOf[js.Any])
    
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
