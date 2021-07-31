package typings.pulumiAws.inputMod.codebuild

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportGroupExportConfig extends StObject {
  
  /**
    * contains information about the S3 bucket where the run of a report is exported. see S3 Destination documented below.
    */
  var s3Destination: js.UndefOr[Input[ReportGroupExportConfigS3Destination]] = js.undefined
  
  /**
    * The export configuration type. Valid values are `S3` and `NO_EXPORT`.
    */
  var `type`: Input[String]
}
object ReportGroupExportConfig {
  
  @scala.inline
  def apply(`type`: Input[String]): ReportGroupExportConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportGroupExportConfig]
  }
  
  @scala.inline
  implicit class ReportGroupExportConfigMutableBuilder[Self <: ReportGroupExportConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3Destination(value: Input[ReportGroupExportConfigS3Destination]): Self = StObject.set(x, "s3Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3DestinationUndefined: Self = StObject.set(x, "s3Destination", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
