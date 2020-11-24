package typings.pulumiAws.outputMod.imagebuilder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfrastructureConfigurationLogging extends js.Object {
  
  /**
    * Configuration block with S3 logging settings. Detailed below.
    */
  var s3Logs: InfrastructureConfigurationLoggingS3Logs = js.native
}
object InfrastructureConfigurationLogging {
  
  @scala.inline
  def apply(s3Logs: InfrastructureConfigurationLoggingS3Logs): InfrastructureConfigurationLogging = {
    val __obj = js.Dynamic.literal(s3Logs = s3Logs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfrastructureConfigurationLogging]
  }
  
  @scala.inline
  implicit class InfrastructureConfigurationLoggingOps[Self <: InfrastructureConfigurationLogging] (val x: Self) extends AnyVal {
    
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
    def setS3Logs(value: InfrastructureConfigurationLoggingS3Logs): Self = this.set("s3Logs", value.asInstanceOf[js.Any])
  }
}
