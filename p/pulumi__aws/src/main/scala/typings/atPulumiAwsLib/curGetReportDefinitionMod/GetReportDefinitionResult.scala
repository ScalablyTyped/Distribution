package typings
package atPulumiAwsLib.curGetReportDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReportDefinitionResult extends js.Object {
  /**
    * A list of additional artifacts.
    */
  val additionalArtifacts: js.Array[java.lang.String]
  /**
    * A list of schema elements.
    */
  val additionalSchemaElements: js.Array[java.lang.String]
  /**
    * Preferred format for report.
    */
  val compression: java.lang.String
  /**
    * Preferred compression format for report.
    */
  val format: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * Name of customer S3 bucket.
    */
  val s3Bucket: java.lang.String
  /**
    * Preferred report path prefix.
    */
  val s3Prefix: java.lang.String
  /**
    * Region of customer S3 bucket.
    */
  val s3Region: java.lang.String
  /**
    * The frequency on which report data are measured and displayed.
    */
  val timeUnit: java.lang.String
}

object GetReportDefinitionResult {
  @scala.inline
  def apply(
    additionalArtifacts: js.Array[java.lang.String],
    additionalSchemaElements: js.Array[java.lang.String],
    compression: java.lang.String,
    format: java.lang.String,
    id: java.lang.String,
    s3Bucket: java.lang.String,
    s3Prefix: java.lang.String,
    s3Region: java.lang.String,
    timeUnit: java.lang.String
  ): GetReportDefinitionResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("additionalArtifacts")(additionalArtifacts)
    __obj.updateDynamic("additionalSchemaElements")(additionalSchemaElements)
    __obj.updateDynamic("compression")(compression)
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("s3Bucket")(s3Bucket)
    __obj.updateDynamic("s3Prefix")(s3Prefix)
    __obj.updateDynamic("s3Region")(s3Region)
    __obj.updateDynamic("timeUnit")(timeUnit)
    __obj.asInstanceOf[GetReportDefinitionResult]
  }
}

