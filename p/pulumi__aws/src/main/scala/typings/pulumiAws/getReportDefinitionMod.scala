package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getReportDefinitionMod {
  
  @JSImport("@pulumi/aws/cur/getReportDefinition", "getReportDefinition")
  @js.native
  def getReportDefinition(args: GetReportDefinitionArgs): js.Promise[GetReportDefinitionResult] = js.native
  @JSImport("@pulumi/aws/cur/getReportDefinition", "getReportDefinition")
  @js.native
  def getReportDefinition(args: GetReportDefinitionArgs, opts: InvokeOptions): js.Promise[GetReportDefinitionResult] = js.native
  
  @js.native
  trait GetReportDefinitionArgs extends StObject {
    
    /**
      * The name of the report definition to match.
      */
    val reportName: String = js.native
  }
  object GetReportDefinitionArgs {
    
    @scala.inline
    def apply(reportName: String): GetReportDefinitionArgs = {
      val __obj = js.Dynamic.literal(reportName = reportName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetReportDefinitionArgs]
    }
    
    @scala.inline
    implicit class GetReportDefinitionArgsMutableBuilder[Self <: GetReportDefinitionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReportName(value: String): Self = StObject.set(x, "reportName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetReportDefinitionResult extends StObject {
    
    /**
      * A list of additional artifacts.
      */
    val additionalArtifacts: js.Array[String] = js.native
    
    /**
      * A list of schema elements.
      */
    val additionalSchemaElements: js.Array[String] = js.native
    
    /**
      * Preferred format for report.
      */
    val compression: String = js.native
    
    /**
      * Preferred compression format for report.
      */
    val format: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * If true reports are updated after they have been finalized.
      */
    val refreshClosedReports: Boolean = js.native
    
    val reportName: String = js.native
    
    /**
      * Overwrite the previous version of each report or to deliver the report in addition to the previous versions.
      */
    val reportVersioning: String = js.native
    
    /**
      * Name of customer S3 bucket.
      */
    val s3Bucket: String = js.native
    
    /**
      * Preferred report path prefix.
      */
    val s3Prefix: String = js.native
    
    /**
      * Region of customer S3 bucket.
      */
    val s3Region: String = js.native
    
    /**
      * The frequency on which report data are measured and displayed.
      */
    val timeUnit: String = js.native
  }
  object GetReportDefinitionResult {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class GetReportDefinitionResultMutableBuilder[Self <: GetReportDefinitionResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalArtifacts(value: js.Array[String]): Self = StObject.set(x, "additionalArtifacts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalArtifactsVarargs(value: String*): Self = StObject.set(x, "additionalArtifacts", js.Array(value :_*))
      
      @scala.inline
      def setAdditionalSchemaElements(value: js.Array[String]): Self = StObject.set(x, "additionalSchemaElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalSchemaElementsVarargs(value: String*): Self = StObject.set(x, "additionalSchemaElements", js.Array(value :_*))
      
      @scala.inline
      def setCompression(value: String): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshClosedReports(value: Boolean): Self = StObject.set(x, "refreshClosedReports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportName(value: String): Self = StObject.set(x, "reportName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportVersioning(value: String): Self = StObject.set(x, "reportVersioning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3Bucket(value: String): Self = StObject.set(x, "s3Bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3Prefix(value: String): Self = StObject.set(x, "s3Prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3Region(value: String): Self = StObject.set(x, "s3Region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUnit(value: String): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
    }
  }
}
