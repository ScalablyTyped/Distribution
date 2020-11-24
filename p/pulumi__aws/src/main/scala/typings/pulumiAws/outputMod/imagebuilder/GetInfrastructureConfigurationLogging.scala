package typings.pulumiAws.outputMod.imagebuilder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInfrastructureConfigurationLogging extends js.Object {
  
  /**
    * Nested list of S3 logs settings.
    */
  var s3Logs: js.Array[GetInfrastructureConfigurationLoggingS3Log] = js.native
}
object GetInfrastructureConfigurationLogging {
  
  @scala.inline
  def apply(s3Logs: js.Array[GetInfrastructureConfigurationLoggingS3Log]): GetInfrastructureConfigurationLogging = {
    val __obj = js.Dynamic.literal(s3Logs = s3Logs.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInfrastructureConfigurationLogging]
  }
  
  @scala.inline
  implicit class GetInfrastructureConfigurationLoggingOps[Self <: GetInfrastructureConfigurationLogging] (val x: Self) extends AnyVal {
    
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
    def setS3LogsVarargs(value: GetInfrastructureConfigurationLoggingS3Log*): Self = this.set("s3Logs", js.Array(value :_*))
    
    @scala.inline
    def setS3Logs(value: js.Array[GetInfrastructureConfigurationLoggingS3Log]): Self = this.set("s3Logs", value.asInstanceOf[js.Any])
  }
}
