package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reportDefinitionMod {
  
  @JSImport("@pulumi/aws/cur/reportDefinition", "ReportDefinition")
  @js.native
  class ReportDefinition protected () extends CustomResource {
    /**
      * Create a ReportDefinition resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReportDefinitionArgs) = this()
    def this(name: String, args: ReportDefinitionArgs, opts: CustomResourceOptions) = this()
    
    /**
      * A list of additional artifacts. Valid values are: REDSHIFT, QUICKSIGHT, ATHENA. When ATHENA exists within additional_artifacts, no other artifact type can be declared and reportVersioning must be OVERWRITE_REPORT.
      */
    val additionalArtifacts: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * A list of schema elements. Valid values are: RESOURCES.
      */
    val additionalSchemaElements: Output_[js.Array[String]] = js.native
    
    /**
      * Compression format for report. Valid values are: GZIP, ZIP, Parquet. If Parquet is used, then format must also be Parquet.
      */
    val compression: Output_[String] = js.native
    
    /**
      * Format for report. Valid values are: textORcsv, Parquet. If Parquet is used, then Compression must also be Parquet.
      */
    val format: Output_[String] = js.native
    
    /**
      * Set to true to update your reports after they have been finalized if AWS detects charges related to previous months.
      */
    val refreshClosedReports: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Unique name for the report. Must start with a number/letter and is case sensitive. Limited to 256 characters.
      */
    val reportName: Output_[String] = js.native
    
    /**
      * Overwrite the previous version of each report or to deliver the report in addition to the previous versions. Valid values are: CREATE_NEW_REPORT, OVERWRITE_REPORT
      */
    val reportVersioning: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Name of the existing S3 bucket to hold generated reports.
      */
    val s3Bucket: Output_[String] = js.native
    
    /**
      * Report path prefix. Limited to 256 characters.
      */
    val s3Prefix: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Region of the existing S3 bucket to hold generated reports.
      */
    val s3Region: Output_[String] = js.native
    
    /**
      * The frequency on which report data are measured and displayed.  Valid values are: HOURLY, DAILY.
      */
    val timeUnit: Output_[String] = js.native
  }
  /* static members */
  object ReportDefinition {
    
    @JSImport("@pulumi/aws/cur/reportDefinition", "ReportDefinition")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ReportDefinition resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): ReportDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ReportDefinition]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ReportDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ReportDefinition]
    inline def get(name: String, id: Input[ID], state: ReportDefinitionState): ReportDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ReportDefinition]
    inline def get(name: String, id: Input[ID], state: ReportDefinitionState, opts: CustomResourceOptions): ReportDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ReportDefinition]
    
    /**
      * Returns true if the given object is an instance of ReportDefinition.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cur/reportDefinition.ReportDefinition */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cur/reportDefinition.ReportDefinition */ Boolean]
  }
  
  trait ReportDefinitionArgs extends StObject {
    
    /**
      * A list of additional artifacts. Valid values are: REDSHIFT, QUICKSIGHT, ATHENA. When ATHENA exists within additional_artifacts, no other artifact type can be declared and reportVersioning must be OVERWRITE_REPORT.
      */
    val additionalArtifacts: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A list of schema elements. Valid values are: RESOURCES.
      */
    val additionalSchemaElements: Input[js.Array[Input[String]]]
    
    /**
      * Compression format for report. Valid values are: GZIP, ZIP, Parquet. If Parquet is used, then format must also be Parquet.
      */
    val compression: Input[String]
    
    /**
      * Format for report. Valid values are: textORcsv, Parquet. If Parquet is used, then Compression must also be Parquet.
      */
    val format: Input[String]
    
    /**
      * Set to true to update your reports after they have been finalized if AWS detects charges related to previous months.
      */
    val refreshClosedReports: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Unique name for the report. Must start with a number/letter and is case sensitive. Limited to 256 characters.
      */
    val reportName: Input[String]
    
    /**
      * Overwrite the previous version of each report or to deliver the report in addition to the previous versions. Valid values are: CREATE_NEW_REPORT, OVERWRITE_REPORT
      */
    val reportVersioning: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the existing S3 bucket to hold generated reports.
      */
    val s3Bucket: Input[String]
    
    /**
      * Report path prefix. Limited to 256 characters.
      */
    val s3Prefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Region of the existing S3 bucket to hold generated reports.
      */
    val s3Region: Input[String]
    
    /**
      * The frequency on which report data are measured and displayed.  Valid values are: HOURLY, DAILY.
      */
    val timeUnit: Input[String]
  }
  object ReportDefinitionArgs {
    
    inline def apply(
      additionalSchemaElements: Input[js.Array[Input[String]]],
      compression: Input[String],
      format: Input[String],
      reportName: Input[String],
      s3Bucket: Input[String],
      s3Region: Input[String],
      timeUnit: Input[String]
    ): ReportDefinitionArgs = {
      val __obj = js.Dynamic.literal(additionalSchemaElements = additionalSchemaElements.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], reportName = reportName.asInstanceOf[js.Any], s3Bucket = s3Bucket.asInstanceOf[js.Any], s3Region = s3Region.asInstanceOf[js.Any], timeUnit = timeUnit.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReportDefinitionArgs]
    }
    
    extension [Self <: ReportDefinitionArgs](x: Self) {
      
      inline def setAdditionalArtifacts(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "additionalArtifacts", value.asInstanceOf[js.Any])
      
      inline def setAdditionalArtifactsUndefined: Self = StObject.set(x, "additionalArtifacts", js.undefined)
      
      inline def setAdditionalArtifactsVarargs(value: Input[String]*): Self = StObject.set(x, "additionalArtifacts", js.Array(value :_*))
      
      inline def setAdditionalSchemaElements(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "additionalSchemaElements", value.asInstanceOf[js.Any])
      
      inline def setAdditionalSchemaElementsVarargs(value: Input[String]*): Self = StObject.set(x, "additionalSchemaElements", js.Array(value :_*))
      
      inline def setCompression(value: Input[String]): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: Input[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setRefreshClosedReports(value: Input[Boolean]): Self = StObject.set(x, "refreshClosedReports", value.asInstanceOf[js.Any])
      
      inline def setRefreshClosedReportsUndefined: Self = StObject.set(x, "refreshClosedReports", js.undefined)
      
      inline def setReportName(value: Input[String]): Self = StObject.set(x, "reportName", value.asInstanceOf[js.Any])
      
      inline def setReportVersioning(value: Input[String]): Self = StObject.set(x, "reportVersioning", value.asInstanceOf[js.Any])
      
      inline def setReportVersioningUndefined: Self = StObject.set(x, "reportVersioning", js.undefined)
      
      inline def setS3Bucket(value: Input[String]): Self = StObject.set(x, "s3Bucket", value.asInstanceOf[js.Any])
      
      inline def setS3Prefix(value: Input[String]): Self = StObject.set(x, "s3Prefix", value.asInstanceOf[js.Any])
      
      inline def setS3PrefixUndefined: Self = StObject.set(x, "s3Prefix", js.undefined)
      
      inline def setS3Region(value: Input[String]): Self = StObject.set(x, "s3Region", value.asInstanceOf[js.Any])
      
      inline def setTimeUnit(value: Input[String]): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReportDefinitionState extends StObject {
    
    /**
      * A list of additional artifacts. Valid values are: REDSHIFT, QUICKSIGHT, ATHENA. When ATHENA exists within additional_artifacts, no other artifact type can be declared and reportVersioning must be OVERWRITE_REPORT.
      */
    val additionalArtifacts: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A list of schema elements. Valid values are: RESOURCES.
      */
    val additionalSchemaElements: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Compression format for report. Valid values are: GZIP, ZIP, Parquet. If Parquet is used, then format must also be Parquet.
      */
    val compression: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Format for report. Valid values are: textORcsv, Parquet. If Parquet is used, then Compression must also be Parquet.
      */
    val format: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Set to true to update your reports after they have been finalized if AWS detects charges related to previous months.
      */
    val refreshClosedReports: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Unique name for the report. Must start with a number/letter and is case sensitive. Limited to 256 characters.
      */
    val reportName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Overwrite the previous version of each report or to deliver the report in addition to the previous versions. Valid values are: CREATE_NEW_REPORT, OVERWRITE_REPORT
      */
    val reportVersioning: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the existing S3 bucket to hold generated reports.
      */
    val s3Bucket: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Report path prefix. Limited to 256 characters.
      */
    val s3Prefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Region of the existing S3 bucket to hold generated reports.
      */
    val s3Region: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The frequency on which report data are measured and displayed.  Valid values are: HOURLY, DAILY.
      */
    val timeUnit: js.UndefOr[Input[String]] = js.undefined
  }
  object ReportDefinitionState {
    
    inline def apply(): ReportDefinitionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReportDefinitionState]
    }
    
    extension [Self <: ReportDefinitionState](x: Self) {
      
      inline def setAdditionalArtifacts(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "additionalArtifacts", value.asInstanceOf[js.Any])
      
      inline def setAdditionalArtifactsUndefined: Self = StObject.set(x, "additionalArtifacts", js.undefined)
      
      inline def setAdditionalArtifactsVarargs(value: Input[String]*): Self = StObject.set(x, "additionalArtifacts", js.Array(value :_*))
      
      inline def setAdditionalSchemaElements(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "additionalSchemaElements", value.asInstanceOf[js.Any])
      
      inline def setAdditionalSchemaElementsUndefined: Self = StObject.set(x, "additionalSchemaElements", js.undefined)
      
      inline def setAdditionalSchemaElementsVarargs(value: Input[String]*): Self = StObject.set(x, "additionalSchemaElements", js.Array(value :_*))
      
      inline def setCompression(value: Input[String]): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setFormat(value: Input[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setRefreshClosedReports(value: Input[Boolean]): Self = StObject.set(x, "refreshClosedReports", value.asInstanceOf[js.Any])
      
      inline def setRefreshClosedReportsUndefined: Self = StObject.set(x, "refreshClosedReports", js.undefined)
      
      inline def setReportName(value: Input[String]): Self = StObject.set(x, "reportName", value.asInstanceOf[js.Any])
      
      inline def setReportNameUndefined: Self = StObject.set(x, "reportName", js.undefined)
      
      inline def setReportVersioning(value: Input[String]): Self = StObject.set(x, "reportVersioning", value.asInstanceOf[js.Any])
      
      inline def setReportVersioningUndefined: Self = StObject.set(x, "reportVersioning", js.undefined)
      
      inline def setS3Bucket(value: Input[String]): Self = StObject.set(x, "s3Bucket", value.asInstanceOf[js.Any])
      
      inline def setS3BucketUndefined: Self = StObject.set(x, "s3Bucket", js.undefined)
      
      inline def setS3Prefix(value: Input[String]): Self = StObject.set(x, "s3Prefix", value.asInstanceOf[js.Any])
      
      inline def setS3PrefixUndefined: Self = StObject.set(x, "s3Prefix", js.undefined)
      
      inline def setS3Region(value: Input[String]): Self = StObject.set(x, "s3Region", value.asInstanceOf[js.Any])
      
      inline def setS3RegionUndefined: Self = StObject.set(x, "s3Region", js.undefined)
      
      inline def setTimeUnit(value: Input[String]): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
      
      inline def setTimeUnitUndefined: Self = StObject.set(x, "timeUnit", js.undefined)
    }
  }
}
