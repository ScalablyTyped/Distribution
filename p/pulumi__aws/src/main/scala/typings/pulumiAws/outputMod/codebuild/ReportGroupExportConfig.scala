package typings.pulumiAws.outputMod.codebuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportGroupExportConfig extends StObject {
  
  /**
    * contains information about the S3 bucket where the run of a report is exported. see S3 Destination documented below.
    */
  var s3Destination: js.UndefOr[ReportGroupExportConfigS3Destination] = js.undefined
  
  /**
    * The export configuration type. Valid values are `S3` and `NO_EXPORT`.
    */
  var `type`: String
}
object ReportGroupExportConfig {
  
  inline def apply(`type`: String): ReportGroupExportConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportGroupExportConfig]
  }
  
  extension [Self <: ReportGroupExportConfig](x: Self) {
    
    inline def setS3Destination(value: ReportGroupExportConfigS3Destination): Self = StObject.set(x, "s3Destination", value.asInstanceOf[js.Any])
    
    inline def setS3DestinationUndefined: Self = StObject.set(x, "s3Destination", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
