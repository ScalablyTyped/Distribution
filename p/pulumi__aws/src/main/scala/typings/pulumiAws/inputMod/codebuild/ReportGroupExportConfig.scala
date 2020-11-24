package typings.pulumiAws.inputMod.codebuild

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportGroupExportConfig extends js.Object {
  
  /**
    * contains information about the S3 bucket where the run of a report is exported. see S3 Destination documented below.
    */
  var s3Destination: js.UndefOr[Input[ReportGroupExportConfigS3Destination]] = js.native
  
  /**
    * The export configuration type. Valid values are `S3` and `NO_EXPORT`.
    */
  var `type`: Input[String] = js.native
}
object ReportGroupExportConfig {
  
  @scala.inline
  def apply(`type`: Input[String]): ReportGroupExportConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportGroupExportConfig]
  }
  
  @scala.inline
  implicit class ReportGroupExportConfigOps[Self <: ReportGroupExportConfig] (val x: Self) extends AnyVal {
    
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
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Destination(value: Input[ReportGroupExportConfigS3Destination]): Self = this.set("s3Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Destination: Self = this.set("s3Destination", js.undefined)
  }
}
