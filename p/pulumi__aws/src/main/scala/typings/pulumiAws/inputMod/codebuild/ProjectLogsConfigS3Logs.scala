package typings.pulumiAws.inputMod.codebuild

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectLogsConfigS3Logs extends StObject {
  
  /**
    * If set to true, output artifacts will not be encrypted. If `type` is set to `NO_ARTIFACTS` then this value will be ignored. Defaults to `false`.
    */
  var encryptionDisabled: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Information about the build output artifact location. If `type` is set to `CODEPIPELINE` or `NO_ARTIFACTS` then this value will be ignored. If `type` is set to `S3`, this is the name of the output bucket.
    */
  var location: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Current status of logs in CloudWatch Logs for a build project. Valid values: `ENABLED`, `DISABLED`. Defaults to `ENABLED`.
    */
  var status: js.UndefOr[Input[String]] = js.undefined
}
object ProjectLogsConfigS3Logs {
  
  @scala.inline
  def apply(): ProjectLogsConfigS3Logs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectLogsConfigS3Logs]
  }
  
  @scala.inline
  implicit class ProjectLogsConfigS3LogsMutableBuilder[Self <: ProjectLogsConfigS3Logs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptionDisabled(value: Input[Boolean]): Self = StObject.set(x, "encryptionDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionDisabledUndefined: Self = StObject.set(x, "encryptionDisabled", js.undefined)
    
    @scala.inline
    def setLocation(value: Input[String]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
