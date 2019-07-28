package typings.atPulumiAws.curGetReportDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReportDefinitionResult extends js.Object {
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
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val reportName: String
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
  @scala.inline
  def apply(
    additionalArtifacts: js.Array[String],
    additionalSchemaElements: js.Array[String],
    compression: String,
    format: String,
    id: String,
    reportName: String,
    s3Bucket: String,
    s3Prefix: String,
    s3Region: String,
    timeUnit: String
  ): GetReportDefinitionResult = {
    val __obj = js.Dynamic.literal(additionalArtifacts = additionalArtifacts, additionalSchemaElements = additionalSchemaElements, compression = compression, format = format, id = id, reportName = reportName, s3Bucket = s3Bucket, s3Prefix = s3Prefix, s3Region = s3Region, timeUnit = timeUnit)
  
    __obj.asInstanceOf[GetReportDefinitionResult]
  }
}

