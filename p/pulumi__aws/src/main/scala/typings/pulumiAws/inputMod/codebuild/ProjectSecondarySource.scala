package typings.pulumiAws.inputMod.codebuild

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectSecondarySource extends StObject {
  
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
    * Information about the Git submodules configuration for an AWS CodeBuild build project. Git submodules config blocks are documented below. This option is only valid when the `type` is `CODECOMMIT`, `GITHUB` or `GITHUB_ENTERPRISE`.
    */
  var gitSubmodulesConfig: js.UndefOr[Input[ProjectSecondarySourceGitSubmodulesConfig]] = js.undefined
  
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
  
  inline def apply(sourceIdentifier: Input[String], `type`: Input[String]): ProjectSecondarySource = {
    val __obj = js.Dynamic.literal(sourceIdentifier = sourceIdentifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSecondarySource]
  }
  
  extension [Self <: ProjectSecondarySource](x: Self) {
    
    inline def setAuths(value: Input[js.Array[Input[ProjectSecondarySourceAuth]]]): Self = StObject.set(x, "auths", value.asInstanceOf[js.Any])
    
    inline def setAuthsUndefined: Self = StObject.set(x, "auths", js.undefined)
    
    inline def setAuthsVarargs(value: Input[ProjectSecondarySourceAuth]*): Self = StObject.set(x, "auths", js.Array(value :_*))
    
    inline def setBuildspec(value: Input[String]): Self = StObject.set(x, "buildspec", value.asInstanceOf[js.Any])
    
    inline def setBuildspecUndefined: Self = StObject.set(x, "buildspec", js.undefined)
    
    inline def setGitCloneDepth(value: Input[Double]): Self = StObject.set(x, "gitCloneDepth", value.asInstanceOf[js.Any])
    
    inline def setGitCloneDepthUndefined: Self = StObject.set(x, "gitCloneDepth", js.undefined)
    
    inline def setGitSubmodulesConfig(value: Input[ProjectSecondarySourceGitSubmodulesConfig]): Self = StObject.set(x, "gitSubmodulesConfig", value.asInstanceOf[js.Any])
    
    inline def setGitSubmodulesConfigUndefined: Self = StObject.set(x, "gitSubmodulesConfig", js.undefined)
    
    inline def setInsecureSsl(value: Input[Boolean]): Self = StObject.set(x, "insecureSsl", value.asInstanceOf[js.Any])
    
    inline def setInsecureSslUndefined: Self = StObject.set(x, "insecureSsl", js.undefined)
    
    inline def setLocation(value: Input[String]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setReportBuildStatus(value: Input[Boolean]): Self = StObject.set(x, "reportBuildStatus", value.asInstanceOf[js.Any])
    
    inline def setReportBuildStatusUndefined: Self = StObject.set(x, "reportBuildStatus", js.undefined)
    
    inline def setSourceIdentifier(value: Input[String]): Self = StObject.set(x, "sourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
