package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getReportDefinitionMod {
  
  @JSImport("@pulumi/aws/cur/getReportDefinition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getReportDefinition(args: GetReportDefinitionArgs): js.Promise[GetReportDefinitionResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getReportDefinition")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetReportDefinitionResult]]
  inline def getReportDefinition(args: GetReportDefinitionArgs, opts: InvokeOptions): js.Promise[GetReportDefinitionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getReportDefinition")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetReportDefinitionResult]]
  
  trait GetReportDefinitionArgs extends StObject {
    
    /**
      * The name of the report definition to match.
      */
    val reportName: String
  }
  object GetReportDefinitionArgs {
    
    inline def apply(reportName: String): GetReportDefinitionArgs = {
      val __obj = js.Dynamic.literal(reportName = reportName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetReportDefinitionArgs]
    }
    
    extension [Self <: GetReportDefinitionArgs](x: Self) {
      
      inline def setReportName(value: String): Self = StObject.set(x, "reportName", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetReportDefinitionResult extends StObject {
    
    /**
      * A list of additional artifacts.
      */
    val additionalArtifacts: js.Array[String]
    
    /**
      * A list of schema elements.
      */
    val additionalSchemaElements: js.Array[String]
    
    /**
      * Preferred format for report.
      */
    val compression: String
    
    /**
      * Preferred compression format for report.
      */
    val format: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * If true reports are updated after they have been finalized.
      */
    val refreshClosedReports: Boolean
    
    val reportName: String
    
    /**
      * Overwrite the previous version of each report or to deliver the report in addition to the previous versions.
      */
    val reportVersioning: String
    
    /**
      * Name of customer S3 bucket.
      */
    val s3Bucket: String
    
    /**
      * Preferred report path prefix.
      */
    val s3Prefix: String
    
    /**
      * Region of customer S3 bucket.
      */
    val s3Region: String
    
    /**
      * The frequency on which report data are measured and displayed.
      */
    val timeUnit: String
  }
  object GetReportDefinitionResult {
    
    inline def apply(
      additionalArtifacts: js.Array[String],
      additionalSchemaElements: js.Array[String],
      compression: String,
      format: String,
      id: String,
      refreshClosedReports: Boolean,
      reportName: String,
      reportVersioning: String,
      s3Bucket: String,
      s3Prefix: String,
      s3Region: String,
      timeUnit: String
    ): GetReportDefinitionResult = {
      val __obj = js.Dynamic.literal(additionalArtifacts = additionalArtifacts.asInstanceOf[js.Any], additionalSchemaElements = additionalSchemaElements.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], refreshClosedReports = refreshClosedReports.asInstanceOf[js.Any], reportName = reportName.asInstanceOf[js.Any], reportVersioning = reportVersioning.asInstanceOf[js.Any], s3Bucket = s3Bucket.asInstanceOf[js.Any], s3Prefix = s3Prefix.asInstanceOf[js.Any], s3Region = s3Region.asInstanceOf[js.Any], timeUnit = timeUnit.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetReportDefinitionResult]
    }
    
    extension [Self <: GetReportDefinitionResult](x: Self) {
      
      inline def setAdditionalArtifacts(value: js.Array[String]): Self = StObject.set(x, "additionalArtifacts", value.asInstanceOf[js.Any])
      
      inline def setAdditionalArtifactsVarargs(value: String*): Self = StObject.set(x, "additionalArtifacts", js.Array(value :_*))
      
      inline def setAdditionalSchemaElements(value: js.Array[String]): Self = StObject.set(x, "additionalSchemaElements", value.asInstanceOf[js.Any])
      
      inline def setAdditionalSchemaElementsVarargs(value: String*): Self = StObject.set(x, "additionalSchemaElements", js.Array(value :_*))
      
      inline def setCompression(value: String): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRefreshClosedReports(value: Boolean): Self = StObject.set(x, "refreshClosedReports", value.asInstanceOf[js.Any])
      
      inline def setReportName(value: String): Self = StObject.set(x, "reportName", value.asInstanceOf[js.Any])
      
      inline def setReportVersioning(value: String): Self = StObject.set(x, "reportVersioning", value.asInstanceOf[js.Any])
      
      inline def setS3Bucket(value: String): Self = StObject.set(x, "s3Bucket", value.asInstanceOf[js.Any])
      
      inline def setS3Prefix(value: String): Self = StObject.set(x, "s3Prefix", value.asInstanceOf[js.Any])
      
      inline def setS3Region(value: String): Self = StObject.set(x, "s3Region", value.asInstanceOf[js.Any])
      
      inline def setTimeUnit(value: String): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
    }
  }
}
